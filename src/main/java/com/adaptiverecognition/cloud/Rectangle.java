/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import java.awt.Point;

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