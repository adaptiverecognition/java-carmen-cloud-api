/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.anpr;

import com.adaptiverecognition.cloud.Rectangle;
import com.adaptiverecognition.cloud.Color;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Plate {

    private boolean found;
    private long proctime;
    private Color bgColor;
    private Color color;
    private String daColor;
    private Integer confidence;
    private String country;
    private List<Char> plateChars;
    private Rectangle plateROI;
    private Integer plateType;
    private String state;
    private String unicodeText;
    private Integer plateTypeConfidence;
    private Integer positionConfidence;
    private String category;

    /**
     * Get the value of daColor
     *
     * @return the value of daColor
     */
    public String getDaColor() {
        return daColor;
    }

    /**
     * Set the value of daColor
     *
     * @param daColor new value of daColor
     */
    public void setDaColor(String daColor) {
        this.daColor = daColor;
    }

    /**
     * Get the value of found
     *
     * @return the value of found
     */
    public boolean isFound() {
        return found;
    }

    /**
     * Set the value of found
     *
     * @param found new value of found
     */
    public void setFound(boolean found) {
        this.found = found;
    }

    /**
     * Get the value of category
     *
     * @return the value of category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Set the value of category
     *
     * @param category new value of category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Get the value of positionConfidence
     *
     * @return the value of positionConfidence
     */
    public Integer getPositionConfidence() {
        return positionConfidence;
    }

    /**
     * Set the value of positionConfidence
     *
     * @param positionConfidence new value of positionConfidence
     */
    public void setPositionConfidence(Integer positionConfidence) {
        this.positionConfidence = positionConfidence;
    }

    /**
     * Get the value of plateTypeConfidence
     *
     * @return the value of plateTypeConfidence
     */
    public Integer getPlateTypeConfidence() {
        return plateTypeConfidence;
    }

    /**
     * Set the value of plateTypeConfidence
     *
     * @param plateTypeConfidence new value of plateTypeConfidence
     */
    public void setPlateTypeConfidence(Integer plateTypeConfidence) {
        this.plateTypeConfidence = plateTypeConfidence;
    }

    /**
     *
     * @return
     */
    public String getUnicodeText() {
        return unicodeText;
    }

    /**
     *
     * @param unicodeText
     */
    public void setUnicodeText(String unicodeText) {
        this.unicodeText = unicodeText;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     */
    public Integer getPlateType() {
        return plateType;
    }

    /**
     *
     * @param plateType
     */
    public void setPlateType(Integer plateType) {
        this.plateType = plateType;
    }

    /**
     *
     * @return
     */
    public long getProctime() {
        return proctime;
    }

    /**
     *
     * @param proctime
     */
    public void setProctime(long proctime) {
        this.proctime = proctime;
    }

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
    public Integer getConfidence() {
        return confidence;
    }

    /**
     *
     * @param confidence
     */
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     *
     * @return
     */
    public List<Char> getPlateChars() {
        return plateChars;
    }

    /**
     *
     * @param plateChars
     */
    public void setPlateChars(List<Char> plateChars) {
        this.plateChars = plateChars;
    }

    /**
     *
     * @return
     */
    public Rectangle getPlateROI() {
        return plateROI;
    }

    /**
     *
     * @param plateROI
     */
    public void setPlateROI(Rectangle plateROI) {
        this.plateROI = plateROI;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.found ? 1 : 0);
        hash = 73 * hash + (int) (this.proctime ^ (this.proctime >>> 32));
        hash = 73 * hash + Objects.hashCode(this.bgColor);
        hash = 73 * hash + Objects.hashCode(this.color);
        hash = 73 * hash + Objects.hashCode(this.confidence);
        hash = 73 * hash + Objects.hashCode(this.country);
        hash = 73 * hash + Objects.hashCode(this.plateChars);
        hash = 73 * hash + Objects.hashCode(this.plateROI);
        hash = 73 * hash + Objects.hashCode(this.plateType);
        hash = 73 * hash + Objects.hashCode(this.state);
        hash = 73 * hash + Objects.hashCode(this.unicodeText);
        hash = 73 * hash + Objects.hashCode(this.plateTypeConfidence);
        hash = 73 * hash + Objects.hashCode(this.positionConfidence);
        hash = 73 * hash + Objects.hashCode(this.category);
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
        final Plate other = (Plate) obj;
        if (this.found != other.found) {
            return false;
        }
        if (this.proctime != other.proctime) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.unicodeText, other.unicodeText)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.bgColor, other.bgColor)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.confidence, other.confidence)) {
            return false;
        }
        if (!Objects.equals(this.plateChars, other.plateChars)) {
            return false;
        }
        if (!Objects.equals(this.plateROI, other.plateROI)) {
            return false;
        }
        if (!Objects.equals(this.plateType, other.plateType)) {
            return false;
        }
        if (!Objects.equals(this.plateTypeConfidence, other.plateTypeConfidence)) {
            return false;
        }
        if (!Objects.equals(this.positionConfidence, other.positionConfidence)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plate{" + "found=" + found + ", proctime=" + proctime + ", bgColor=" + bgColor + ", color=" + color + ", daColor=" + daColor + ", confidence=" + confidence + ", country=" + country + ", plateChars=" + plateChars + ", plateROI=" + plateROI + ", plateType=" + plateType + ", state=" + state + ", unicodeText=" + unicodeText + ", plateTypeConfidence=" + plateTypeConfidence + ", positionConfidence=" + positionConfidence + ", category=" + category + '}';
    }

}
