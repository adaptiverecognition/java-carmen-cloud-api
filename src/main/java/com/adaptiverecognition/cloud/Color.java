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

import java.io.Serializable;
import java.util.Objects;

/**
 * Color is a simple class that contains three integer values: r, g, b (red,
 * green, blue).
 *
 * @author laszlo.toth@arip.hu
 */
public class Color implements Serializable {

    private int r;
    private int g;
    private int b;

    /**
     * <p>
     * Get the value of red component
     * </p>
     *
     * @return the value of red component
     */
    public int getR() {
        return r;
    }

    /**
     * <p>
     * Set the value of red component
     * </p>
     *
     * @param r new value of red component
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * <p>
     * Get the value of green component
     * </p>
     *
     * @return the value of green component
     */
    public int getG() {
        return g;
    }

    /**
     * <p>
     * Set the value of green component
     * </p>
     *
     * @param g new value of green component
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * <p>
     * Get the value of blue component
     * </p>
     *
     * @return the value of blue component
     */
    public int getB() {
        return b;
    }

    /**
     * <p>
     * Set the value of blue component
     * </p>
     *
     * @param b new value of blue component
     */
    public void setB(int b) {
        this.b = b;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Color)) {
            return false;
        }
        Color color = (Color) o;
        return r == color.r && g == color.g && b == color.b;
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(r, g, b);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color{r=").append(r);
        sb.append(", g=").append(g);
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }

}
