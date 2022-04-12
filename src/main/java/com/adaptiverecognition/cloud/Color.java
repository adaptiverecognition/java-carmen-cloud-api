/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

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

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.r;
        hash = 37 * hash + this.g;
        hash = 37 * hash + this.b;
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
        final Color other = (Color) obj;
        if (this.r != other.r) {
            return false;
        }
        if (this.g != other.g) {
            return false;
        }
        if (this.b != other.b) {
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
        sb.append("Color{r=").append(r);
        sb.append(", g=").append(g);
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }

}
