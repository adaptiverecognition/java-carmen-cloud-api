/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Char implements Serializable {

    private Color bgColor;
    private Boolean bgDark;
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
    public Boolean getBgDark() {
        return bgDark;
    }

    /**
     *
     * @param bgDark
     */
    public void setBgDark(Boolean bgDark) {
        this.bgDark = bgDark;
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
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Char)) {
            return false;
        }
        Char ch = (Char) o;
        return Objects.equals(bgDark, ch.bgDark) && Objects.equals(bgColor, ch.bgColor)
                && Objects.equals(charROI, ch.charROI) && code == ch.code && Objects.equals(color, ch.color)
                && confidence == ch.confidence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bgDark, bgColor, charROI, code, color, confidence);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Char{bgDark=").append(bgDark);
        sb.append(", bgColor=").append(bgColor);
        sb.append(", charROI=").append(charROI);
        sb.append(", code=").append(code);
        sb.append(", color=").append(color);
        sb.append(", confidence=").append(confidence);
        sb.append('}');
        return sb.toString();
    }

}
