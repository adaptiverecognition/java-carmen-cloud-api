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

import java.io.Serializable;
import java.util.Objects;

/**
 * Color is a simple class that contains three integer values: r, g, b (red,
 * green, blue).
 *
 * @author laszlo.toth@arip.hu
 */
public class Dimensions implements Serializable {

    private int width;
    private int height;
    private int length;

    /**
     * <p>
     * Get the value of width component
     * </p>
     *
     * @return the value of width component
     */
    public int getWidth() {
        return width;
    }

    /**
     * <p>
     * Set the value of width component
     * </p>
     *
     * @param width new value of width component
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * <p>
     * Get the value of height component
     * </p>
     *
     * @return the value of height component
     */
    public int getHeight() {
        return height;
    }

    /**
     * <p>
     * Set the value of height component
     * </p>
     *
     * @param height new value of height component
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * <p>
     * Get the value of length component
     * </p>
     *
     * @return the value of length component
     */
    public int getLength() {
        return length;
    }

    /**
     * <p>
     * Set the value of length component
     * </p>
     *
     * @param length new value of length component
     */
    public void setLength(int length) {
        this.length = length;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Dimensions)) {
            return false;
        }
        Dimensions dim = (Dimensions) o;
        return width == dim.width && height == dim.height && length == dim.length;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(width, height, length);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color{width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }

}
