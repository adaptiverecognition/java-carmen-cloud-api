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

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 * Rectangle is a simple class that contains four points: bottomLeft,
 * bottomRight, topLeft, topRight.
 *
 * @author laszlo.toth@arip.hu
 */
public class Rectangle implements Serializable {

    private Point bottomLeft;
    private Point bottomRight;
    private Point topLeft;
    private Point topRight;

    /**
     * <p>
     * Get the value of bottomLeft
     * </p>
     *
     * @return the value of bottomLeft
     */
    public Point getBottomLeft() {
        return bottomLeft;
    }

    /**
     * <p>
     * Set the value of bottomLeft
     * </p>
     *
     * @param bottomLeft new value of bottomLeft
     */
    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    /**
     * <p>
     * Get the value of bottomRight
     * </p>
     *
     * @return the value of bottomRight
     */
    public Point getBottomRight() {
        return bottomRight;
    }

    /**
     * <p>
     * Set the value of bottomRight
     * </p>
     *
     * @param bottomRight new value of bottomRight
     */
    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * <p>
     * Get the value of topLeft
     * </p>
     *
     * @return the value of topLeft
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * <p>
     * Set the value of topLeft
     * </p>
     *
     * @param topLeft new value of topLeft
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * <p>
     * Get the value of topRight
     * </p>
     *
     * @return the value of topRight
     */
    public Point getTopRight() {
        return topRight;
    }

    /**
     * <p>
     * Set the value of topRight
     * </p>
     *
     * @param topRight new value of topRight
     */
    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(bottomLeft, rectangle.bottomLeft) && Objects.equals(bottomRight, rectangle.bottomRight)
                && Objects.equals(topLeft, rectangle.topLeft) && Objects.equals(topRight, rectangle.topRight);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(bottomLeft, bottomRight, topLeft, topRight);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle{bottomLeft=").append(bottomLeft);
        sb.append(", bottomRight=").append(bottomRight);
        sb.append(", topLeft=").append(topLeft);
        sb.append(", topRight=").append(topRight);
        sb.append('}');
        return sb.toString();
    }

}
