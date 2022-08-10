/**
 *
 */
package com.adaptiverecognition.cloud.vehicle;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.adaptiverecognition.cloud.Request;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author laszlo.toth
 */
public class VehicleRequest<S extends Enum> implements Request {

    static {
        // ha egy jvm crash után újraindul a lambda/docker image, akkor ennek az
        // osztálynak az újratöltésekor az ImageIO-val is újraszkenneljük a plugin-eket,
        // ui. úgy tnűnik, hogy egy ilyen újraindulás után "elvesznek" a korábban
        // használt image reader-ek
        ImageIO.scanForPlugins();
    }

    /**
     *
     */
    public enum Service {
        /**
         *
         */
        @SerializedName("anpr")
        ANPR("anpr"),
        /**
         *
         */
        @SerializedName("mmr")
        MMR("mmr"),
        /**
         *
         */
        @SerializedName("adr")
        ADR("adr");

        private final String value;

        /**
         *
         * @param value
         */
        Service(String value) {
            this.value = value;
        }

        /**
         *
         * @return
         */
        public String getValue() {
            return this.value;
        }

        /**
         *
         * @param value
         * @return
         */
        public static Service fromValue(String value) {
            Service[] services = values();
            for (Service service : services) {
                if (service.getValue().equals(value)) {
                    return service;
                }
            }
            return null;
        }
    }

    private static final Logger LOGGER = LogManager.getLogger(VehicleRequest.class);

    private boolean calculateHash;

    private long hashTimestamp;

    private String hashSalt;

    private List<Service> services;

    private BufferedImage image;

    private byte[] imageSource;

    private double imageUpscaleFactor = 1;

    private String imageName;

    private String imageMimeType;

    private String region;

    private String location;

    private Integer maxreads;

    private Map<S, Object> properties;

    /**
     * Get the value of properties
     *
     * @return the value of properties
     */
    public Map<S, Object> getProperties() {
        return properties;
    }

    /**
     * Set the value of properties
     *
     * @param properties new value of properties
     */
    public void setProperties(Map<S, Object> properties) {
        this.properties = properties;
    }

    /**
     *
     * @param key
     * @return
     */
    public Object getProperty(S key) {
        return properties != null ? properties.get(key) : null;
    }

    /**
     *
     * @param key
     * @param value
     */
    public void setProperty(S key, Object value) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, value);
    }

    /**
     *
     * @return
     */
    public boolean isCalculateHash() {
        return calculateHash;
    }

    /**
     *
     * @param calculateHash
     */
    public void setCalculateHash(boolean calculateHash) {
        this.calculateHash = calculateHash;
    }

    /**
     *
     * @return
     */
    public long getHashTimestamp() {
        return hashTimestamp;
    }

    /**
     *
     * @param hashTimestamp
     */
    public void setHashTimestamp(long hashTimestamp) {
        this.hashTimestamp = hashTimestamp;
    }

    /**
     *
     * @return
     */
    public String getHashSalt() {
        return hashSalt;
    }

    /**
     *
     * @param hashSalt
     */
    public void setHashSalt(String hashSalt) {
        this.hashSalt = hashSalt;
    }

    /**
     * Get the value of region
     *
     * @return the value of region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Set the value of region
     *
     * @param region new value of region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Get the value of services
     *
     * @return the value of services
     */
    public List<Service> getServices() {
        return services;
    }

    /**
     * Set the value of services
     *
     * @param service new value of services
     */
    public void setServices(List<Service> service) {
        this.services = service;
    }

    /**
     * Set the value of services
     *
     * @param services new value of services
     */
    public void setServices(Service... services) {
        this.services = services != null ? Arrays.asList(services) : null;
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
     * Get the value of imageUpscaleFactor
     *
     * @return the value of imageUpscaleFactor
     */
    public double getImageUpscaleFactor() {
        return imageUpscaleFactor;
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
     * Set the value of image, imageName, and imageMimeType
     *
     * @param imageSource image source
     * @param imageName   image name
     * @throws java.io.IOException
     */
    public void setImage(byte[] imageSource, String imageName) throws IOException {
        setImage(imageSource, imageName, true);
    }

    /**
     * Set the value of image, imageName, and imageMimeType
     *
     * @param imageSource image source
     * @param imageName   image name
     * @param resize      size the image if its size is larger than full hd
     * @throws java.io.IOException
     */
    public void setImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        this.imageUpscaleFactor = 1;
        if (imageSource != null) {
            ImageInputStream iis = ImageIO.createImageInputStream(new ByteArrayInputStream(imageSource));
            Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(iis);
            if (!imageReaders.hasNext()) {
                throw new IOException("Invalid image format");
            }
            ImageReader reader = imageReaders.next();
            reader.setInput(iis);
            BufferedImage img = reader.read(0);
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
                graphics2D.drawImage(img, 0, 0, scaledWidth, scaledHeight, null);
                graphics2D.dispose();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(outputImage, reader.getFormatName(), baos);
                this.image = outputImage;
                this.imageSource = baos.toByteArray();
            }
        } else {
            this.image = null;
            this.imageSource = null;
            this.imageName = null;
            this.imageMimeType = null;
        }
    }

    /**
     * @param maxreads
     */
    public void setMaxreads(Integer maxreads) {
        this.maxreads = maxreads;
    }

    /**
     * @return
     */
    public Integer getMaxreads() {
        return this.maxreads;
    }

    /**
     * @param maxreads
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> maxreads(Integer maxreads) {
        setMaxreads(maxreads);
        return this;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> location(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param services
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> services(List<Service> services) {
        setServices(services);
        return this;
    }

    /**
     * @param services
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> services(Service... services) {
        setServices(services);
        return this;
    }

    /**
     * @param image
     * @param imageName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException
     */
    public VehicleRequest<S> image(byte[] image, String imageName) throws IOException {
        setImage(image, imageName);
        return this;
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
        sb.append("AnprRequest{");
        if (getServices() != null) {
            sb.append("Services: ").append(getServices()).append(",");
        }
        if (getImage() != null) {
            sb.append("Image: ").append(getImageName()).append(" (").append(getImageSize()).append(" bytes),");
        }
        if (getImageMimeType() != null) {
            sb.append("Image MimeType: ").append(getImageMimeType()).append(",");
        }
        sb.append("Image AspectRatio: ").append(getImageUpscaleFactor()).append(",");
        if (getLocation() != null) {
            sb.append("Region: ").append(getRegion()).append(",");
        }
        if (getLocation() != null) {
            sb.append("Location: ").append(getLocation()).append(",");
        }
        if (getMaxreads() != null) {
            sb.append("Maxreads: ").append(getMaxreads());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VehicleRequest)) {
            return false;
        }
        VehicleRequest vehicleRequest = (VehicleRequest) o;
        return calculateHash == vehicleRequest.calculateHash && hashTimestamp == vehicleRequest.hashTimestamp
                && Objects.equals(hashSalt, vehicleRequest.hashSalt)
                && Objects.equals(services, vehicleRequest.services) && Objects.equals(image, vehicleRequest.image)
                && Objects.equals(imageSource, vehicleRequest.imageSource)
                && imageUpscaleFactor == vehicleRequest.imageUpscaleFactor
                && Objects.equals(imageName, vehicleRequest.imageName)
                && Objects.equals(imageMimeType, vehicleRequest.imageMimeType)
                && Objects.equals(region, vehicleRequest.region) && Objects.equals(location, vehicleRequest.location)
                && Objects.equals(maxreads, vehicleRequest.maxreads)
                && Objects.equals(properties, vehicleRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculateHash, hashTimestamp, hashSalt, services, image, imageSource, imageUpscaleFactor,
                imageName, imageMimeType, region, location, maxreads, properties);
    }

}
