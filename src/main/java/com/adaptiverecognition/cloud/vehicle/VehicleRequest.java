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
package com.adaptiverecognition.cloud.vehicle;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.InputImage;
import com.adaptiverecognition.cloud.Request;
import com.google.gson.annotations.SerializedName;

/**
 * The VehicleRequest class represents a request to be sent to the Vehicle API.
 *
 * @author laszlo.toth@arip.hu
 * @param <S> the type of the request properties enum
 * @version $Id: $Id
 */
public class VehicleRequest<S extends Enum<?>> extends Request<S> {

    /**
     * The Service enum represents the possible services of the Vehicle API.
     */
    public enum Service {
        /**
         * ANPR service
         */
        @SerializedName("anpr")
        ANPR("anpr"),
        /**
         * MMR service
         */
        @SerializedName("mmr")
        MMR("mmr"),
        /**
         * ADR service
         */
        @SerializedName("adr")
        ADR("adr");

        private final String value;

        /**
         * Constructor
         *
         * @param value the value of the enum
         */
        Service(String value) {
            this.value = value;
        }

        /**
         * Get the value of the enum
         *
         * @return the value of the enum
         */
        public String getValue() {
            return this.value;
        }

        /**
         * Get the enum from the given value
         *
         * @param value the value of the enum
         * @return the enum
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

    private List<Service> services;

    private InputImage inputImage;

    private String region;

    private String location;

    private String roi;

    private Integer maxreads;

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
     * @throws java.io.IOException if the image cannot be read or resized
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
     * @throws java.io.IOException if the image cannot be read
     */
    public void setImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        if (imageSource != null) {
            this.inputImage = new InputImage(imageSource, imageName, resize);
        } else {
            this.inputImage = null;
        }
    }

    /**
     * Set the value of maxreads
     *
     * @param maxreads the value of maxreads
     */
    public void setMaxreads(Integer maxreads) {
        this.maxreads = maxreads;
    }

    /**
     * Get the value of maxreads
     *
     * @return the value of maxreads
     */
    public Integer getMaxreads() {
        return this.maxreads;
    }

    /**
     * Set the value of location
     *
     * @param maxreads the value of location
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> maxreads(Integer maxreads) {
        setMaxreads(maxreads);
        return this;
    }

    /**
     * Set the value of location
     *
     * @param location the value of location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get the value of location
     *
     * @return the value of location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the value of location
     *
     * @param location the value of location
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> location(String location) {
        setLocation(location);
        return this;
    }

    /**
     * Set the value of roi
     *
     * @param roi the value of roi
     */
    public void setRoi(String roi) {
        this.roi = roi;
    }

    /**
     * Get the value of roi
     *
     * @return the value of roi
     */
    public String getRoi() {
        return this.roi;
    }

    /**
     * Set the value of roi
     *
     * @param roi the value of roi
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> roi(String roi) {
        setRoi(roi);
        return this;
    }

    /**
     * Set the value of services
     *
     * @param services the value of services
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> services(List<Service> services) {
        setServices(services);
        return this;
    }

    /**
     * Set the value of services
     *
     * @param services the value of services
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public VehicleRequest<S> services(Service... services) {
        setServices(services);
        return this;
    }

    /**
     * Set the value of image
     *
     * @param image     the image source as a byte array
     * @param imageName the name of the image
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException if the image cannot be read or resized
     */
    public VehicleRequest<S> image(byte[] image, String imageName) throws IOException {
        return image(image, imageName, true);
    }

    /**
     * Set the value of image
     *
     * @param image     the image source as a byte array
     * @param imageName the name of the image
     * @param resize    resize the image (on the server-side) if its size is larger
     *                  than full hd
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException if the image cannot be read or resized
     */
    public VehicleRequest<S> image(byte[] image, String imageName, boolean resize) throws IOException {
        setImage(image, imageName, resize);
        return this;
    }

    /** {@inheritDoc} */
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
        if (getRoi() != null) {
            sb.append("ROI: ").append(getRoi()).append(",");
        }
        if (getMaxreads() != null) {
            sb.append("Maxreads: ").append(getMaxreads());
        }
        sb.append("}");
        return sb.toString();
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VehicleRequest)) {
            return false;
        }
        VehicleRequest<?> vehicleRequest = (VehicleRequest<?>) o;
        return super.equals(o) && Objects.equals(services, vehicleRequest.services)
                && Objects.equals(inputImage, vehicleRequest.inputImage)
                && Objects.equals(region, vehicleRequest.region) && Objects.equals(location, vehicleRequest.location)
                && Objects.equals(roi, vehicleRequest.roi) && Objects.equals(maxreads, vehicleRequest.maxreads)
                && Objects.equals(getProperties(), vehicleRequest.getProperties());
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(services, inputImage, region, location, roi, maxreads, getProperties());
    }

}
