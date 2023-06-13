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
package com.adaptiverecognition.cloud.transport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.InputImage;
import com.adaptiverecognition.cloud.Request;

/**
 * The TransportRequest class represents a request to be sent to the
 * Transportation &amp; Cargo API.
 *
 * @author laszlo.toth@arip.hu
 * @param <S> the type of the request properties enum
 */
public class TransportRequest<S extends Enum<?>> extends Request<S> {

    private String type;

    private final List<InputImage> inputImages = new ArrayList<>();

    private Integer maxreads;

    /**
     * <p>
     * Get the value of type
     * </p>
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Set the value of type
     * </p>
     *
     * @param type new value of type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Set the value of type
     * </p>
     *
     * @param type a {@link java.lang.String} object
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TransportRequest<S> type(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Setter for the field <code>maxreads</code>.
     * </p>
     *
     * @param maxreads a {@link java.lang.Integer} object
     */
    public void setMaxreads(Integer maxreads) {
        this.maxreads = maxreads;
    }

    /**
     * <p>
     * Getter for the field <code>maxreads</code>.
     * </p>
     *
     * @return a {@link java.lang.Integer} object
     */
    public Integer getMaxreads() {
        return this.maxreads;
    }

    /**
     * <p>
     * Setter for the field <code>maxreads</code>.
     * </p>
     *
     * @param maxreads a {@link java.lang.Integer} object
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TransportRequest<S> maxreads(Integer maxreads) {
        setMaxreads(maxreads);
        return this;
    }

    /**
     * <p>
     * Get the value of inputImages
     * </p>
     *
     * @return the value of inputImages
     */
    public List<InputImage> getInputImages() {
        return inputImages;
    }

    /**
     * <p>
     * Set the value of inputImages
     * </p>
     *
     * @param inputImages new value of inputImages
     */
    public void setInputImages(List<InputImage> inputImages) {
        this.inputImages.clear();
        this.inputImages.addAll(inputImages);
    }

    /**
     * <p>
     * Clears input image list
     * </p>
     */
    public void clearInputImages() {
        this.inputImages.clear();
    }

    /**
     * <p>
     * Set the value of image source and image name
     * </p>
     *
     * @param imageSource image source
     * @param imageName   image name
     * @throws java.io.IOException if the image cannot be read or resized
     */
    public void addImage(byte[] imageSource, String imageName) throws IOException {
        addImage(imageSource, imageName, true);
    }

    /**
     * <p>
     * Add an image to the inputImages list
     * </p>
     *
     * @param imageSource image source
     * @param imageName   image name
     * @param resize      resize the image if its size is larger than full hd
     * @throws java.io.IOException if the image cannot be read or resized
     */
    public void addImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        this.inputImages.add(new InputImage(imageSource, imageName, resize));
    }

    /**
     * <p>
     * Add an image to the inputImages list
     * </p>
     *
     * @param image     image source as an array of {@link byte}s
     * @param imageName image name
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException if the image cannot be read or resized
     */
    public TransportRequest<S> image(byte[] image, String imageName) throws IOException {
        return image(image, imageName, true);
    }

    /**
     * <p>
     * Add an image to the inputImages list
     * </p>
     *
     * @param image     image source as an array of {@link byte}s
     * @param imageName image name
     * @param resize    resize the image if its size is larger than full hd
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException if the image cannot be read or resized
     */
    public TransportRequest<S> image(byte[] image, String imageName, boolean resize) throws IOException {
        addImage(image, imageName, resize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportRequest{");
        if (getType() != null) {
            sb.append("Type: ").append(getType()).append(",");
        }
        if (getMaxreads() != null) {
            sb.append("Maxreads: ").append(getMaxreads());
        }
        sb.append("InputImages: ").append(getInputImages());
        sb.append("}");
        return sb.toString();
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransportRequest)) {
            return false;
        }
        TransportRequest<?> transportRequest = (TransportRequest<?>) o;
        return super.equals(o) && Objects.equals(type, transportRequest.type)
                && Objects.equals(maxreads, transportRequest.maxreads)
                && Objects.equals(inputImages, transportRequest.inputImages)
                && Objects.equals(getProperties(), transportRequest.getProperties());
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(type, maxreads, inputImages, getProperties());
    }

}
