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
package com.adaptiverecognition.cloud.vehicle;

import java.util.Objects;

import com.adaptiverecognition.cloud.Color;

/**
 * The LicensePlate class represents a license plate.
 *
 * @author laszlo.toth@arip.hu
 */
public class LicensePlate extends AdrPlate {

    private boolean found;
    private Color daColor;
    private String country;
    private String state;
    private String category;

    /**
     * <p>
     * LicensePlate constructor
     * </p>
     */
    public LicensePlate() {
        /*
         * We do not fill the type property in case of LicensePlate, because it would be
         * unnecessary to return it in the json. The vehicle.plate can only be
         * licensePlate, there is no need to distinguish
         */
        super(null);
    }

    /** {@inheritDoc} */
    @Override
    public TypeCategory getType() {
        return TypeCategory.LICENSE_PLATE;
    }

    /** {@inheritDoc} */
    @Override
    public void setType(TypeCategory type) {
        // do nothing
    }

    /**
     * <p>
     * Get the value of found
     * </p>
     *
     * @return the value of found
     */
    public boolean isFound() {
        return found;
    }

    /**
     * <p>
     * Set the value of found
     * </p>
     *
     * @param found new value of found
     */
    public void setFound(boolean found) {
        this.found = found;
    }

    /**
     * <p>
     * Get the value of daColor (dedicated area color)
     * </p>
     *
     * @return the value of daColor
     */
    public Color getDaColor() {
        return daColor;
    }

    /**
     * <p>
     * Set the value of daColor (dedicated area color)
     * </p>
     *
     * @param daColor new value of daColor
     */
    public void setDaColor(Color daColor) {
        this.daColor = daColor;
    }

    /**
     * <p>
     * Get the value of plate category
     * </p>
     *
     * @return the value of plate category
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * Set the value of plate category
     * </p>
     *
     * @param category new value of plate category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * Get the country of origin of the license plate
     * </p>
     *
     * @return the value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * Set the country of origin of the license plate
     * </p>
     *
     * @param country new value of country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * Get the state of origin of the license plate
     * </p>
     *
     * @return the value of state
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * Set the state of origin of the license plate
     * </p>
     *
     * @param state new value of state
     */
    public void setState(String state) {
        this.state = state;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LicensePlate)) {
            return false;
        }
        LicensePlate licensePlate = (LicensePlate) o;
        return super.equals(o) && found == licensePlate.found && Objects.equals(daColor, licensePlate.daColor)
                && Objects.equals(country, licensePlate.country) && Objects.equals(state, licensePlate.state)
                && Objects.equals(category, licensePlate.category);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(found, daColor, country, state, category);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "LicensePlate{" + "found=" + this.found + ", engine=" + getEngine() + ", proctime=" + getProctime()
                + ", bgColor=" + getBgColor() + ", color=" + getColor() + ", daColor=" + daColor + ", confidence="
                + getConfidence() + ", country=" + country + ", state=" + state + ", plateChars=" + getPlateChars()
                + ", plateROI=" + getPlateROI() + ", plateType=" + getPlateType() + ", plateTypeCategory=" + getType()
                + ", unicodeText=" + getUnicodeText() + ", separatedText=" + getSeparatedText()
                + ", plateTypeConfidence=" + getPlateTypeConfidence() + ", positionConfidence="
                + getPositionConfidence() + ", textConfidence=" + getTextConfidence() + ", normalizedConfidence="
                + getNormalizedConfidence() + ", category=" + category + '}';
    }

}
