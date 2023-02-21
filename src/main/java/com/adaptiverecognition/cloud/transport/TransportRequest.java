/**
 *
 */
package com.adaptiverecognition.cloud.transport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.imageio.ImageIO;

import com.adaptiverecognition.cloud.InputImage;
import com.adaptiverecognition.cloud.Request;

/**
 *
 * @author laszlo.toth
 */
public class TransportRequest<S extends Enum<?>> extends Request<S> {

    static {
        // ha egy jvm crash után újraindul a lambda/docker image, akkor ennek az
        // osztálynak az újratöltésekor az ImageIO-val is újraszkenneljük a plugin-eket,
        // ui. úgy tnűnik, hogy egy ilyen újraindulás után "elvesznek" a korábban
        // használt image reader-ek
        ImageIO.scanForPlugins();
    }

    private String type;

    private final List<InputImage> inputImages = new ArrayList<>();

    private Integer maxreads;

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TransportRequest<S> type(String type) {
        setType(type);
        return this;
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
    public TransportRequest<S> maxreads(Integer maxreads) {
        setMaxreads(maxreads);
        return this;
    }

    /**
     * Get the value of inputImages
     *
     * @return the value of inputImages
     */
    public List<InputImage> getInputImages() {
        return inputImages;
    }

    /**
     * Set the value of inputImages
     *
     * @param inputImages new value of inputImages
     */
    public void setInputImages(List<InputImage> inputImages) {
        this.inputImages.clear();
        this.inputImages.addAll(inputImages);
    }

    /**
     * Clears input image list
     */
    public void clearInputImages() {
        this.inputImages.clear();
    }

    /**
     * Set the value of image, imageName, and imageMimeType
     *
     * @param imageSource image source
     * @param imageName   image name
     * @throws java.io.IOException
     */
    public void addImage(byte[] imageSource, String imageName) throws IOException {
        addImage(imageSource, imageName, true);
    }

    /**
     * Set the value of image, imageName, and imageMimeType
     *
     * @param imageSource image source
     * @param imageName   image name
     * @param resize      size the image if its size is larger than full hd
     * @throws java.io.IOException
     */
    public void addImage(byte[] imageSource, String imageName, boolean resize) throws IOException {
        this.inputImages.add(new InputImage(imageSource, imageName, resize));
    }

    /**
     * @param image
     * @param imageName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException
     */
    public TransportRequest<S> image(byte[] image, String imageName) throws IOException {
        return image(image, imageName, true);
    }

    /**
     * @param image
     * @param imageName
     * @param resize
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @throws java.io.IOException
     */
    public TransportRequest<S> image(byte[] image, String imageName, boolean resize) throws IOException {
        addImage(image, imageName, resize);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing
     * and debugging. Sensitive data will be redacted from this string using a
     * placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransportRequest)) {
            return false;
        }
        TransportRequest<?> transportRequest = (TransportRequest<?>) o;
        return Objects.equals(type, transportRequest.type) && Objects.equals(maxreads, transportRequest.maxreads)
                && Objects.equals(inputImages, transportRequest.inputImages)
                && Objects.equals(getProperties(), transportRequest.getProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, maxreads, inputImages, getProperties());
    }

}
