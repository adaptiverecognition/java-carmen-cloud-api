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
 * Char is a simple class that contains the character code, the confidence
 * value, the color and the background color of the character, and the
 * coordinates of the character's bounding box.
 * 
 * @author laszlo.toth@arip.hu
 */
public class Char implements Serializable {

    private Color bgColor;
    private Boolean bgDark;
    private Rectangle charROI;
    private int code;
    private Color color;
    private int confidence;

    /**
     * Get the value of background color
     *
     * @return the value of background color
     */
    public Color getBgColor() {
        return bgColor;
    }

    /**
     * Set the value of background color
     *
     * @param bgColor new value of background color
     */
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * Get the value of the character's bounding box
     *
     * @return the value of the character's bounding box
     */
    public Rectangle getCharROI() {
        return charROI;
    }

    /**
     * Set the value of the character's bounding box
     *
     * @param charROI new value of the character's bounding box
     */
    public void setCharROI(Rectangle charROI) {
        this.charROI = charROI;
    }

    /**
     * Get the value of the character code
     *
     * @return the value of the character code
     */
    public int getCode() {
        return code;
    }

    /**
     * Set the value of the character code
     *
     * @param code new value of the character code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Returns true if the background color is darker than the characters' color
     *
     * @return true if the background color is darker than the characters' color
     */
    public Boolean getBgDark() {
        return bgDark;
    }

    /**
     * Sets the value of the gbDark property
     *
     * @param bgDark new value of the gbDark property
     */
    public void setBgDark(Boolean bgDark) {
        this.bgDark = bgDark;
    }

    /**
     * Get the value of the character's color
     *
     * @return the value of the character's color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of the character's color
     *
     * @param color new value of the character's color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Get the value of the confidence
     *
     * @return the value of the confidence
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     * Set the value of the confidence
     *
     * @param confidence new value of the confidence
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
