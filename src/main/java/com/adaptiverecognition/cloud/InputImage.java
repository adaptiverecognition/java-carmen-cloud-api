/**
 * Cloud API Java reference implementation.

 * License: Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * This file is part of the Adaptive Recognition Hungary Kft. 
 * Vehicle API and Transportation&Cargo API Java reference implementation.
 * 
 * This software is free to use in either commercial or non-commercial applications.
 * 
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 * 
 * Adaptive Recognition Hungary Kft.
 * H-1023 Budapest, Alkotas u. 41. Hungary
 * Web: https://adaptiverecognition.com/contact-us/
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

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to store the image data and the image metadata of the
 * input image which is sent to the APIs to be processed.
 *
 * @author laszlo.toth@arip.hu
 */
public class InputImage {

    static {
        /*
         * This is a workaround for a bug in the ImageIO library after a JVM crash.
         */
        ImageIO.scanForPlugins();
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(InputImage.class);

    private BufferedImage image;

    private byte[] imageSource;

    private byte[] originalImageSource;

    private double imageUpscaleFactor = 1;

    private short imageOrientation = 1;

    private String imageName;

    private String imageMimeType;

    /**
     * <p>
     * Constructor for InputImage. This constructor is used to create an InputImage
     * object and also to resize it.
     * </p>
     *
     * @param imageSource image source
     * @param imageName   image name
     * @throws java.io.IOException thrown if the image cannot be read or resized
     */
    public InputImage(byte[] imageSource, String imageName) throws IOException {
        this(imageSource, imageName, true);
    }

    /**
     * <p>
     * Another constructor for InputImage. The resize parameter can be set (it
     * defaults to true in the other constructor).
     * </p>
     *
     * @param imageSource image source
     * @param imageName   image name
     * @param resize      resize the image
     * @throws java.io.IOException thrown if the image cannot be read or resized
     */
    public InputImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        setImage(imageSource, imageName, resize);
    }

    /**
     * <p>
     * Get the value of imageSource
     * </p>
     *
     * @return the value of imageSource
     */
    public byte[] getImageSource() {
        return imageSource;
    }

    /**
     * <p>
     * Get the value of originalImageSource
     * </p>
     *
     * @return the value of originalImageSource
     */
    public byte[] getOriginalImageSource() {
        return originalImageSource;
    }

    /**
     * <p>
     * Get the value of image as a BufferedImage.
     * </p>
     *
     * @return the value of image
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * <p>
     * Get the value of imageSize
     * </p>
     *
     * @return the value of imageSize
     */
    public long getImageSize() {
        return imageSource != null ? imageSource.length : 0;
    }

    /**
     * <p>
     * Get the value of originalImageSize
     * </p>
     *
     * @return the value of originalImageSize
     */
    public long getOriginalImageSize() {
        return originalImageSource != null ? originalImageSource.length : 0;
    }

    /**
     * <p>
     * Get the value of imageUpscaleFactor
     * </p>
     *
     * @return the value of imageUpscaleFactor
     */
    public double getImageUpscaleFactor() {
        return imageUpscaleFactor;
    }

    /**
     * <p>
     * Get the value of imageOrientation
     * </p>
     *
     * @return the value of imageOrientation
     */
    public short getImageOrientation() {
        return imageOrientation;
    }

    /**
     * <p>
     * Get the value of imageMimeType
     * </p>
     *
     * @return the value of imageMimeType
     */
    public String getImageMimeType() {
        return imageMimeType;
    }

    /**
     * <p>
     * Get the value of imageName
     * </p>
     *
     * @return the value of imageName
     */
    public String getImageName() {
        return imageName;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputImage{");
        if (getImage() != null) {
            sb.append("Image: ").append(getImageName()).append(" (").append(getImageSize()).append(" bytes),");
        }
        if (getImageMimeType() != null) {
            sb.append("Image mime type: ").append(getImageMimeType()).append(",");
        }
        sb.append("Image aspect ratio: ").append(getImageUpscaleFactor()).append(",");
        sb.append("Image orientation: ").append(getImageOrientation()).append(",");
        sb.append("}");
        return sb.toString();
    }

    /** {@inheritDoc} */
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
                && imageOrientation == inputImage.imageOrientation && Objects.equals(imageName, inputImage.imageName)
                && Objects.equals(imageMimeType, inputImage.imageMimeType);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(image, originalImageSource, imageSource, imageUpscaleFactor, imageOrientation, imageName,
                imageMimeType);
    }

    private void setImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        this.image = null;
        this.imageSource = null;
        this.imageName = null;
        this.imageMimeType = null;
        this.imageUpscaleFactor = 1;
        this.imageOrientation = 1;
        this.originalImageSource = imageSource;
        if (imageSource != null) {
            try (ImageInputStream iis = ImageIO.createImageInputStream(new ByteArrayInputStream(imageSource))) {
                Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(iis);
                if (!imageReaders.hasNext()) {
                    throw new IOException("Invalid image format");
                }
                ImageReader reader = imageReaders.next();
                reader.setInput(iis);
                BufferedImage img;
                double q;
                try {
                    img = reader.read(0, reader.getDefaultReadParam());
                    this.imageMimeType = reader.getFormatName();
                    this.imageName = imageName;
                    q = (img.getWidth() * img.getHeight()) / (double) (1920 * 1080);
                } catch (RuntimeException re) {
                    throw new IOException(re.getMessage(), re);
                } finally {
                    reader.dispose();
                }
                if (q <= 1 || !resize) {
                    this.image = img;
                    this.imageSource = imageSource;
                } else {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("Original image size: {}x{}", img.getWidth(), img.getHeight());
                    }
                    this.imageUpscaleFactor = Math.sqrt(q);
                    int scaledWidth = (int) Math.round(img.getWidth() / this.imageUpscaleFactor);
                    int scaledHeight = (int) Math.round(img.getHeight() / this.imageUpscaleFactor);
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("Resampling image to size: {}x{}", scaledWidth, scaledHeight);
                    }
                    BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, img.getType());
                    Graphics2D graphics2D = outputImage.createGraphics();
                    graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                            RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                    graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                    graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
                            RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
                    graphics2D.drawImage(img, 0, 0, scaledWidth, scaledHeight, null);
                    graphics2D.dispose();
                    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                        ImageIO.write(outputImage, reader.getFormatName(), baos);
                        this.image = outputImage;
                        this.imageSource = baos.toByteArray();
                    }
                }
                try {
                    ImageMetadata metadata = Imaging.getMetadata(this.originalImageSource);
                    JpegImageMetadata jpegMetadata = metadata instanceof JpegImageMetadata
                            ? (JpegImageMetadata) metadata
                            : null;
                    TiffImageMetadata tiffMetadata = metadata instanceof TiffImageMetadata
                            ? (TiffImageMetadata) metadata
                            : null;
                    TiffField field = null;
                    if (jpegMetadata != null) {
                        field = jpegMetadata.findExifValueWithExactMatch(TiffTagConstants.TIFF_TAG_ORIENTATION);
                    } else if (tiffMetadata != null) {
                        field = tiffMetadata.findField(TiffTagConstants.TIFF_TAG_ORIENTATION, true);
                    }
                    if (field != null && field.getValue() instanceof Number) {
                        this.imageOrientation = ((Number) field.getValue()).shortValue();
                    }
                } catch (Exception e) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug("Couldn't get metadata of {}: {}", imageName, e);
                    }
                }
            }
        }
    }

}
