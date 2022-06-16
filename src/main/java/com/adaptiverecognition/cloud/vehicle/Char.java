/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import com.adaptiverecognition.cloud.Color;
import com.adaptiverecognition.cloud.Rectangle;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Char {

    private Color bgColor;
    private Rectangle charROI;
    private int code;
    private Color color;
    private int confidence;

    /**
     *
     * @return
     */
    public Color getBgColor() {
        return bgColor;
    }

    /**
     *
     * @param bgColor
     */
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    /**
     *
     * @return
     */
    public Rectangle getCharROI() {
        return charROI;
    }

    /**
     *
     * @param charROI
     */
    public void setCharROI(Rectangle charROI) {
        this.charROI = charROI;
    }

    /**
     *
     * @return
     */
    public int getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public Color getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     *
     * @param confidence
     */
    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.bgColor);
        hash = 29 * hash + Objects.hashCode(this.charROI);
        hash = 29 * hash + this.code;
        hash = 29 * hash + Objects.hashCode(this.color);
        hash = 29 * hash + this.confidence;
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
        final Char other = (Char) obj;
        if (this.code != other.code) {
            return false;
        }
        if (this.confidence != other.confidence) {
            return false;
        }
        if (!Objects.equals(this.bgColor, other.bgColor)) {
            return false;
        }
        if (!Objects.equals(this.charROI, other.charROI)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
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
        sb.append("Char{bgColor=").append(bgColor);
        sb.append(", charROI=").append(charROI);
        sb.append(", code=").append(code);
        sb.append(", color=").append(color);
        sb.append(", confidence=").append(confidence);
        sb.append('}');
        return sb.toString();
    }

}
