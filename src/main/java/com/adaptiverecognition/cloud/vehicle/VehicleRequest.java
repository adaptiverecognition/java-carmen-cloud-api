/**
 *
 */
package com.adaptiverecognition.cloud.vehicle;

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

import com.adaptiverecognition.cloud.Request;
import com.twelvemonkeys.image.ResampleOp;

/**
 *
 * @author laszlo.toth
 */
public class VehicleRequest<S extends Enum> extends Request {

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
        ANPR("anpr"),
        /**
         *
         */
        MMR("mmr"),
        /**
         *
         */
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
     * @param imageSource new value of image
     * @param imageName   new value of imageName
     * @throws java.io.IOException
     */
    public void setImage(byte[] imageSource, String imageName) throws IOException {
        this.imageUpscaleFactor = 1;
        if (imageSource != null) {
            ImageInputStream iis = ImageIO.createImageInputStream(new ByteArrayInputStream(imageSource));
            Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(iis);
            if (!imageReaders.hasNext()) {
                throw new IOException("Invalid image format");
            }
            ImageReader reader = imageReaders.next();
            reader.setInput(iis);
            BufferedImage image = reader.read(0);
            this.imageMimeType = reader.getFormatName();
            this.imageName = imageName;
            reader.dispose();
            double q1, q2;
            if (image.getWidth() > image.getHeight()) {
                q1 = image.getWidth() / (double) 1920;
                q2 = image.getHeight() / (double) 1080;
            } else {
                q1 = image.getWidth() / (double) 1080;
                q2 = image.getHeight() / (double) 1920;
            }
            if (q1 <= 1 && q2 <= 1) {
                this.image = image;
                this.imageSource = imageSource;
            } else {
                this.imageUpscaleFactor = Math.max(q1, q2);
                int scaledWidth = (int) Math.round(image.getWidth() / this.imageUpscaleFactor);
                int scaledHeight = (int) Math.round(image.getHeight() / this.imageUpscaleFactor);
                BufferedImage outputImage = new ResampleOp(scaledWidth, scaledHeight, ResampleOp.FILTER_BOX)
                        .filter(image, null);
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
    public VehicleRequest maxreads(Integer maxreads) {
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
    public VehicleRequest location(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param services
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest services(List<Service> services) {
        setServices(services);
        return this;
    }

    /**
     * @param services
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest services(Service... services) {
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
    public VehicleRequest image(byte[] image, String imageName) throws IOException {
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

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maxreads);
        hash = 79 * hash + Objects.hashCode(this.region);
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Objects.hashCode(this.imageMimeType);
        hash = 79 * hash + Objects.hashCode(this.imageUpscaleFactor);
        hash = 79 * hash + Objects.hashCode(this.imageName);
        hash = 79 * hash + Arrays.hashCode(this.imageSource);
        hash = 79 * hash + Objects.hashCode(this.services);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRequest<S> other = (VehicleRequest<S>) obj;
        if (this.imageUpscaleFactor != other.imageUpscaleFactor) {
            return false;
        }
        if (!Objects.equals(this.region, other.region)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.imageMimeType, other.imageMimeType)) {
            return false;
        }
        if (!Objects.equals(this.imageName, other.imageName)) {
            return false;
        }
        if (!Objects.equals(this.maxreads, other.maxreads)) {
            return false;
        }
        if (!Arrays.equals(this.imageSource, other.imageSource)) {
            return false;
        }
        return Objects.equals(this.services, other.services);
    }

}
