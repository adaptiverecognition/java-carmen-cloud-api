/**
 *
 */
package com.adaptiverecognition.cloud.anpr;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class AnprRequest {

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

    private String mimeType;

    private String imageName;

    private long imageSize;

    private InputStream image;

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
     * Get the value of image
     *
     * @return the value of image
     */
    public InputStream getImage() {
        return image;
    }

    /**
     * Get the value of imageSize
     *
     * @return the value of imageSize
     */
    public long getImageSize() {
        return imageSize;
    }

    /**
     * Get the value of mimeType
     *
     * @return the value of mimeType
     */
    public String getMimeType() {
        return mimeType;
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
     * Set the value of image, imageName, and mimeType
     *
     * @param image new value of image
     * @param imageName new value of imageName
     * @param mimeType new value of mimeType
     * @throws java.io.IOException
     */
    public void setImage(InputStream image, String imageName, String mimeType) throws IOException {
        byte[] imageContent = image.readAllBytes();
        this.imageSize = imageContent.length;
        this.image = new ByteArrayInputStream(imageContent);
        this.imageName = imageName;
        this.mimeType = mimeType;
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
     * @param service
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     */
    public AnprRequest services(Service... service) {
        setServices(service != null ? Arrays.asList(service) : null);
        return this;
    }

    /**
     * @param image
     * @param imageName
     * @param mimeType
     * @return Returns a reference to this object so that method calls can be
     * chained together.
     * @throws java.io.IOException
     */
    public AnprRequest image(InputStream image, String imageName, String mimeType) throws IOException {
        setImage(image, imageName, mimeType);
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
        if (getMimeType() != null) {
            sb.append("MimeType: ").append(getMimeType());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.location);
        hash = 17 * hash + Objects.hashCode(this.imageName);
        hash = 17 * hash + (int) (this.imageSize ^ (this.imageSize >>> 32));
        hash = 17 * hash + Objects.hashCode(this.services);
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
        if (this.imageSize != other.imageSize) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.mimeType, other.mimeType)) {
            return false;
        }
        if (!Objects.equals(this.imageName, other.imageName)) {
            return false;
        }
        if (!Objects.equals(this.maxreads, other.maxreads)) {
            return false;
        }
        return Objects.equals(this.services, other.services);
    }

}
