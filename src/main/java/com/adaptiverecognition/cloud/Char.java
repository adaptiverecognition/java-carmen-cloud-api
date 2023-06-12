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
     * <p>
     * Get the value of background color
     * </p>
     *
     * @return the value of background color
     */
    public Color getBgColor() {
        return bgColor;
    }

    /**
     * <p>
     * Set the value of background color
     * </p>
     *
     * @param bgColor new value of background color
     */
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * <p>
     * Get the value of the character's bounding box
     * </p>
     *
     * @return the value of the character's bounding box
     */
    public Rectangle getCharROI() {
        return charROI;
    }

    /**
     * <p>
     * Set the value of the character's bounding box
     * </p>
     *
     * @param charROI new value of the character's bounding box
     */
    public void setCharROI(Rectangle charROI) {
        this.charROI = charROI;
    }

    /**
     * <p>
     * Get the value of the character code
     * </p>
     *
     * @return the value of the character code
     */
    public int getCode() {
        return code;
    }

    /**
     * <p>
     * Set the value of the character code
     * </p>
     *
     * @param code new value of the character code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * <p>
     * Returns true if the background color is darker than the characters' color
     * </p>
     *
     * @return true if the background color is darker than the characters' color
     */
    public Boolean getBgDark() {
        return bgDark;
    }

    /**
     * <p>
     * Sets the value of the bgDark property
     * </p>
     *
     * @param bgDark new value of the bgDark property
     */
    public void setBgDark(Boolean bgDark) {
        this.bgDark = bgDark;
    }

    /**
     * <p>
     * Get the value of the character's color
     * </p>
     *
     * @return the value of the character's color
     */
    public Color getColor() {
        return color;
    }

    /**
     * <p>
     * Set the value of the character's color
     * </p>
     *
     * @param color new value of the character's color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * <p>
     * Get the value of the confidence
     * </p>
     *
     * @return the value of the confidence
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Set the value of the confidence
     * </p>
     *
     * @param confidence new value of the confidence
     */
    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(bgDark, bgColor, charROI, code, color, confidence);
    }

    /** {@inheritDoc} */
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
