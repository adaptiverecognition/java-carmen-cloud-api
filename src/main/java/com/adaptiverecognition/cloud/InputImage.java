/**
 *
 */
package com.adaptiverecognition.cloud;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author laszlo.toth
 */
public class InputImage {

    static {
        // ha egy jvm crash után újraindul a lambda/docker image, akkor ennek az
        // osztálynak az újratöltésekor az ImageIO-val is újraszkenneljük a plugin-eket,
        // ui. úgy tnűnik, hogy egy ilyen újraindulás után "elvesznek" a korábban
        // használt image reader-ek
        ImageIO.scanForPlugins();
    }

    private static final Logger LOGGER = LogManager.getLogger(InputImage.class);

    private BufferedImage image;

    private byte[] imageSource;

    private byte[] originalImageSource;

    private double imageUpscaleFactor = 1;

    private short imageOrientation = 1;

    private String imageName;

    private String imageMimeType;

    /**
     *
     * @param imageSource image source
     * @param imageName   image name
     * @throws java.io.IOException
     */
    public InputImage(byte[] imageSource, String imageName) throws IOException {
        this(imageSource, imageName, true);
    }

    /**
     *
     * @param imageSource image source
     * @param imageName   image name
     * @param imageName   resize the image
     * @throws java.io.IOException
     */
    public InputImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        setImage(imageSource, imageName, resize);
    }

    /**
     * Get the value of imageSource
     *
     * @return the value of imageSource
     */
    public byte[] getImageSource() {
        return imageSource;
    }

    /**
     * Get the value of originalImageSource
     *
     * @return the value of originalImageSource
     */
    public byte[] getOriginalImageSource() {
        return originalImageSource;
    }

    /**
     * Get the value of image
     *
     * @return the value of image
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * Get the value of imageSize
     *
     * @return the value of imageSize
     */
    public long getImageSize() {
        return imageSource != null ? imageSource.length : 0;
    }

    /**
     * Get the value of originalImageSize
     *
     * @return the value of originalImageSize
     */
    public long getOriginalImageSize() {
        return originalImageSource != null ? originalImageSource.length : 0;
    }

    /**
     * Get the value of imageUpscaleFactor
     *
     * @return the value of imageUpscaleFactor
     */
    public double getImageUpscaleFactor() {
        return imageUpscaleFactor;
    }

    /**
     * Get the value of imageOrientation
     *
     * @return the value of imageOrientation
     */
    public short getImageOrientation() {
        return imageOrientation;
    }

    /**
     * Get the value of imageMimeType
     *
     * @return the value of imageMimeType
     */
    public String getImageMimeType() {
        return imageMimeType;
    }

    /**
     * Get the value of imageName
     *
     * @return the value of imageName
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Returns a string representation of this object. This is useful for
     * testing and debugging. Sensitive data will be redacted from this string
     * using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputImage{");
        if (getImage() != null) {
            sb.append("Image: ").append(getImageName()).append(" (").append(getImageSize()).append(" bytes),");
        }
        if (getImageMimeType() != null) {
            sb.append("Image MimeType: ").append(getImageMimeType()).append(",");
        }
        sb.append("Image AspectRatio: ").append(getImageUpscaleFactor()).append(",");
        sb.append("Image Orientation: ").append(getImageOrientation()).append(",");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof InputImage)) {
            return false;
        }
        InputImage inputImage = (InputImage) o;
        return Objects.equals(originalImageSource, inputImage.originalImageSource)
                && Objects.equals(imageSource, inputImage.imageSource)
                && imageUpscaleFactor == inputImage.imageUpscaleFactor
                && imageOrientation == inputImage.imageOrientation
                && Objects.equals(imageName, inputImage.imageName)
                && Objects.equals(imageMimeType, inputImage.imageMimeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, originalImageSource, imageSource, imageUpscaleFactor, imageOrientation, imageName,
                imageMimeType);
    }

    private void setImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        this.imageUpscaleFactor = 1;
        this.imageOrientation = 1;
        this.originalImageSource = imageSource;
        if (imageSource != null) {
            ImageInputStream iis = ImageIO.createImageInputStream(new ByteArrayInputStream(imageSource));
            Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(iis);
            if (!imageReaders.hasNext()) {
                throw new IOException("Invalid image format");
            }
            ImageReader reader = imageReaders.next();
            reader.setInput(iis);
            BufferedImage img = reader.read(0, reader.getDefaultReadParam());
            this.imageMimeType = reader.getFormatName();
            this.imageName = imageName;
            reader.dispose();
            double q = (img.getWidth() * img.getHeight()) / (double) (1920 * 1080);
            if (q <= 1 || !resize) {
                this.image = img;
                this.imageSource = imageSource;
            } else {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.log(Level.DEBUG, "Original image size: {}x{}", img.getWidth(), img.getHeight());
                }
                this.imageUpscaleFactor = Math.sqrt(q);
                int scaledWidth = (int) Math.round(img.getWidth() / this.imageUpscaleFactor);
                int scaledHeight = (int) Math.round(img.getHeight() / this.imageUpscaleFactor);
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.log(Level.DEBUG, "Resampling image to size: {}x{}", scaledWidth, scaledHeight);
                }
                BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, img.getType());
                Graphics2D graphics2D = outputImage.createGraphics();
                graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING,
                        RenderingHints.VALUE_RENDER_QUALITY);
                graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
                        RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
                graphics2D.drawImage(img, 0, 0, scaledWidth, scaledHeight, null);
                graphics2D.dispose();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(outputImage, reader.getFormatName(), baos);
                this.image = outputImage;
                this.imageSource = baos.toByteArray();
            }
            try {
                ImageMetadata metadata = Imaging.getMetadata(imageSource);
                JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
                if (metadata != null) {
                    TiffField field = jpegMetadata.findEXIFValueWithExactMatch(TiffTagConstants.TIFF_TAG_ORIENTATION);
                    if (field.getValue() instanceof Number) {
                        this.imageOrientation = ((Number) field.getValue()).shortValue();
                    }
                }
            } catch (ImageReadException e) {
                LOGGER.log(Level.ERROR, "", e);
            }
        } else {
            this.image = null;
            this.imageSource = null;
            this.imageName = null;
            this.imageMimeType = null;
        }
    }

}
