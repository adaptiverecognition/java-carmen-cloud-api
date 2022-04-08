/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.anpr;

import com.adaptiverecognition.cloud.Color;
import com.adaptiverecognition.cloud.Rectangle;

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
