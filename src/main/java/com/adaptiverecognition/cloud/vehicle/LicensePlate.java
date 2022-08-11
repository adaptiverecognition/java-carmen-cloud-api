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

    private boolean found;
    private Color daColor;
    private String country;
    private String state;
    private String category;

    public LicensePlate() {
        super(TypeCategory.LICENSE_PLATE);
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LicensePlate)) {
            return false;
        }
        LicensePlate licensePlate = (LicensePlate) o;
        return found == licensePlate.found && Objects.equals(daColor, licensePlate.daColor)
                && Objects.equals(country, licensePlate.country) && Objects.equals(state, licensePlate.state)
                && Objects.equals(category, licensePlate.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(found, daColor, country, state, category);
    }

    @Override
    public String toString() {
        return "LicensePlate{" + "found=" + this.found + ", proctime=" + getProctime() + ", bgColor=" + getBgColor()
                + ", color=" + getColor() + ", daColor=" + daColor + ", confidence=" + getConfidence() + ", country="
                + country + ", state=" + state + ", plateChars=" + getPlateChars() + ", plateROI=" + getPlateROI()
                + ", plateType=" + getPlateType() + ", plateTypeCategory=" + getType() + ", unicodeText="
                + getUnicodeText() + ", separatedText=" + getSeparatedText() + ", plateTypeConfidence="
                + getPlateTypeConfidence() + ", positionConfidence=" + getPositionConfidence() + ", category="
                + category + '}';
    }

}
