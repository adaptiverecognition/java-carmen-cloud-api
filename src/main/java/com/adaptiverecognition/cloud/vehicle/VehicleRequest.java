/**
 *
 */
package com.adaptiverecognition.cloud.vehicle;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.imageio.ImageIO;

import com.adaptiverecognition.cloud.InputImage;
import com.adaptiverecognition.cloud.Request;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author laszlo.toth
 */
public class VehicleRequest<S extends Enum> extends Request<S> {

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

    private boolean calculateHash;

    private long hashTimestamp;

    private String hashSalt;

    private List<Service> services;

    private InputImage inputImage;

    private String region;

    private String location;

    private Integer maxreads;

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
     * Get the value of inputImage
     *
     * @return the value of inputImage
     */
    public InputImage getInputImage() {
        return inputImage;
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
        if (imageSource != null) {
            this.inputImage = new InputImage(imageSource, imageName, resize);
        } else {
            this.inputImage = null;
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
        return image(image, imageName, true);
    }

    /**
     * @param image
     * @param imageName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException
     */
    public VehicleRequest<S> image(byte[] image, String imageName, boolean resize) throws IOException {
        setImage(image, imageName, resize);
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
        sb.append("VehicleRequest{");
        if (getServices() != null) {
            sb.append("Services: ").append(getServices()).append(",");
        }
        if (getInputImage() != null) {
            sb.append("InputImage: ").append(getInputImage()).append(",");
        }
        if (getRegion() != null) {
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
        VehicleRequest<S> vehicleRequest = (VehicleRequest<S>) o;
        return calculateHash == vehicleRequest.calculateHash && hashTimestamp == vehicleRequest.hashTimestamp
                && Objects.equals(hashSalt, vehicleRequest.hashSalt)
                && Objects.equals(services, vehicleRequest.services)
                && Objects.equals(inputImage, vehicleRequest.inputImage)
                && Objects.equals(region, vehicleRequest.region) && Objects.equals(location, vehicleRequest.location)
                && Objects.equals(maxreads, vehicleRequest.maxreads)
                && Objects.equals(getProperties(), vehicleRequest.getProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculateHash, hashTimestamp, hashSalt, services, inputImage, region, location, maxreads,
                getProperties());
    }

}
