/**
 *
 */
package com.adaptiverecognition.cloud.anpr;

import com.adaptiverecognition.cloud.Request;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author laszlo.toth
 */
public class AnprRequest extends Request {

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
        ADR("adr"),
        /**
         *
         */
        EADR("eadr");

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

    private Integer maxreads;

    private String location;

    private String imageMimeType;

    private String imageName;

    private BufferedImage image;

    private byte[] imageSource;

    private List<Service> services;

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
     * @param imageName new value of imageName
     * @throws java.io.IOException
     */
    public void setImage(byte[] imageSource, String imageName) throws IOException {
        this.imageSource = imageSource;
        if (imageSource != null) {
            ImageInputStream iis = ImageIO.createImageInputStream(new ByteArrayInputStream(this.imageSource));
            Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(iis);
            if (!imageReaders.hasNext()) {
                throw new IOException("Invalid image format");
            }
            ImageReader reader = imageReaders.next();
            reader.setInput(iis);
            this.image = reader.read(0);
            this.imageName = imageName;
            this.imageMimeType = reader.getFormatName();
            reader.dispose();
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
     * chained together.
     */
    public AnprRequest maxreads(Integer maxreads) {
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
     * chained together.
     */
    public AnprRequest location(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param services
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public AnprRequest services(List<Service> services) {
        setServices(services);
        return this;
    }

    /**
     * @param services
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public AnprRequest services(Service... services) {
        setServices(services);
        return this;
    }

    /**
     * @param image
     * @param imageName
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     * @throws java.io.IOException
     */
    public AnprRequest image(byte[] image, String imageName) throws IOException {
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
        sb.append("{");
        if (getServices() != null) {
            sb.append("Services: ").append(getServices()).append(",");
        }
        if (getMaxreads() != null) {
            sb.append("Maxreads: ").append(getMaxreads()).append(",");
        }
        if (getLocation() != null) {
            sb.append("Location: ").append(getLocation()).append(",");
        }
        if (getImage() != null) {
            sb.append("Image: ").append(getImageName()).append(" (").append(getImageSize()).append(" bytes),");
        }
        if (getImageMimeType() != null) {
            sb.append("Image MimeType: ").append(getImageMimeType());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maxreads);
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Objects.hashCode(this.imageMimeType);
        hash = 79 * hash + Objects.hashCode(this.imageName);
        hash = 79 * hash + Arrays.hashCode(this.imageSource);
        hash = 79 * hash + Objects.hashCode(this.services);
        return hash;
    }

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
        final AnprRequest other = (AnprRequest) obj;
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
