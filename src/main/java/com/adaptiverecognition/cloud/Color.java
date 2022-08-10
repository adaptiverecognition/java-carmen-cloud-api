/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Color {

    private int r;
    private int g;
    private int b;

    /**
     *
     * @return
     */
    public int getR() {
        return r;
    }

    /**
     *
     * @param r
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     *
     * @return
     */
    public int getG() {
        return g;
    }

    /**
     *
     * @param g
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     *
     * @return
     */
    public int getB() {
        return b;
    }

    /**
     *
     * @param b
     */
    public void setB(int b) {
        this.b = b;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(r, g, b);
    }

    /**
     *
     * @return
     */
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
