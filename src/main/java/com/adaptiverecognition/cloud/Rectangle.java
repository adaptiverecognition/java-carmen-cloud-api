/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import java.awt.Point;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Rectangle {

    private Point bottomLeft;
    private Point bottomRight;
    private Point topLeft;
    private Point topRight;

    /**
     *
     * @return
     */
    public Point getBottomLeft() {
        return bottomLeft;
    }

    /**
     *
     * @param bottomLeft
     */
    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    /**
     *
     * @return
     */
    public Point getBottomRight() {
        return bottomRight;
    }

    /**
     *
     * @param bottomRight
     */
    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     *
     * @return
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     *
     * @param topLeft
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     *
     * @return
     */
    public Point getTopRight() {
        return topRight;
    }

    /**
     *
     * @param topRight
     */
    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.bottomLeft);
        hash = 79 * hash + Objects.hashCode(this.bottomRight);
        hash = 79 * hash + Objects.hashCode(this.topLeft);
        hash = 79 * hash + Objects.hashCode(this.topRight);
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
        final Rectangle other = (Rectangle) obj;
        if (!Objects.equals(this.bottomLeft, other.bottomLeft)) {
            return false;
        }
        if (!Objects.equals(this.bottomRight, other.bottomRight)) {
            return false;
        }
        if (!Objects.equals(this.topLeft, other.topLeft)) {
            return false;
        }
        if (!Objects.equals(this.topRight, other.topRight)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
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
