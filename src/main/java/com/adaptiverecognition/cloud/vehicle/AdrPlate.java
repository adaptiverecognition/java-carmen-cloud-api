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

import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.Char;

/**
 * The AdrPlate class represents an ADR plate.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class AdrPlate extends Plate {

    private Integer plateTypeConfidence;
    private Integer positionConfidence;
    private List<Char> plateChars;
    private String unicodeText;
    private String separatedText;

    /**
     * AdrPlate constructor.
     */
    public AdrPlate() {
        this(TypeCategory.ADR_PLATE);
    }

    /**
     * AdrPlate constructor.
     *
     * @param plateTypeCategory the type of the plate to be created
     */
    protected AdrPlate(TypeCategory plateTypeCategory) {
        setType(plateTypeCategory);
    }

    /** {@inheritDoc} */
    @Override
    public void setType(TypeCategory type) {
        if (type == TypeCategory.ADR_PLATE || type == TypeCategory.IMO_ADR_PLATE) {
            setPlateTypeCategory(type);
        } else {
            setPlateTypeCategory(TypeCategory.ADR_PLATE);
        }
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
     * Get the value of unicodeText
     *
     * @return the value of unicodeText
     */
    public String getUnicodeText() {
        return unicodeText;
    }

    /**
     * Set the value of unicodeText
     *
     * @param unicodeText new value of unicodeText
     */
    public void setUnicodeText(String unicodeText) {
        this.unicodeText = unicodeText;
    }

    /**
     * Get the value of separatedText
     *
     * @return the value of separatedText
     */
    public String getSeparatedText() {
        return separatedText;
    }

    /**
     * Set the value of separatedText
     *
     * @param separatedText new value of separatedText
     */
    public void setSeparatedText(String separatedText) {
        this.separatedText = separatedText;
    }

    /**
     * Get the value of plateChars
     *
     * @return the value of plateChars
     */
    public List<Char> getPlateChars() {
        return plateChars;
    }

    /**
     * Set the value of plateChars
     *
     * @param plateChars new value of plateChars
     */
    public void setPlateChars(List<Char> plateChars) {
        this.plateChars = plateChars;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AdrPlate)) {
            return false;
        }
        AdrPlate adrPlate = (AdrPlate) o;
        return super.equals(o) && Objects.equals(plateTypeConfidence, adrPlate.plateTypeConfidence)
                && Objects.equals(positionConfidence, adrPlate.positionConfidence)
                && Objects.equals(plateChars, adrPlate.plateChars) && Objects.equals(unicodeText, adrPlate.unicodeText)
                && Objects.equals(separatedText, adrPlate.separatedText);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return super.hashCode()
                + Objects.hash(plateTypeConfidence, positionConfidence, plateChars, unicodeText, separatedText);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "AdrPlate{" + " engine=" + getEngine() + ", proctime=" + getProctime() + ", bgColor=" + getBgColor()
                + ", color=" + getColor() + ", confidence=" + getConfidence() + ", country=" + ", plateChars="
                + plateChars + ", plateROI=" + getPlateROI() + ", plateType=" + getPlateType() + ", plateTypeCategory="
                + getType() + ", unicodeText=" + unicodeText + ", plateTypeConfidence=" + plateTypeConfidence
                + ", positionConfidence=" + positionConfidence + '}';
    }

}
