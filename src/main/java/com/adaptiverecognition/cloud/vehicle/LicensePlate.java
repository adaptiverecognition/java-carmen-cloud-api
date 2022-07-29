/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.Objects;

import com.adaptiverecognition.cloud.Color;

/**
 *
 * @author laszlo.toth
 */
public class LicensePlate extends AdrPlate {

    private Color daColor;
    private String country;
    private String state;
    private String category;

    public LicensePlate() {
        super(TypeCategory.LicensePlate);
    }

    /**
     * Get the value of daColor
     *
     * @return the value of daColor
     */
    public Color getDaColor() {
        return daColor;
    }

    /**
     * Set the value of daColor
     *
     * @param daColor new value of daColor
     */
    public void setDaColor(Color daColor) {
        this.daColor = daColor;
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
        int hash = super.hashCode();
        hash = 73 * hash + Objects.hashCode(this.country);
        hash = 73 * hash + Objects.hashCode(this.state);
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
        final LicensePlate other = (LicensePlate) obj;
        if (!equals(other)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LicensePlate{" + "found=" + isFound() + ", proctime=" + getProctime() + ", bgColor=" + getBgColor()
                + ", color=" + getColor() + ", daColor=" + daColor + ", confidence=" + getConfidence() + ", country="
                + country + ", state=" + state + ", plateChars=" + getPlateChars() + ", plateROI=" + getPlateROI()
                + ", plateType=" + getPlateType() + ", plateTypeCategory=" + getType() + ", unicodeText="
                + getUnicodeText() + ", separatedText=" + getSeparatedText() + ", plateTypeConfidence="
                + getPlateTypeConfidence() + ", positionConfidence=" + getPositionConfidence() + ", category="
                + category + '}';
    }

}
