/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.Char;

/**
 *
 * @author laszlo.toth
 */
public class AdrPlate extends Plate {

    private Integer plateTypeConfidence;
    private Integer positionConfidence;
    private List<Char> plateChars;
    private String unicodeText;
    private String separatedText;

    /**
     * 
     */
    public AdrPlate() {
        this(TypeCategory.ADR_PLATE);
    }

    /**
     * 
     * @param plateTypeCategory
     */
    public AdrPlate(TypeCategory plateTypeCategory) {
        setType(plateTypeCategory);
    }

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
    public String getSeparatedText() {
        return separatedText;
    }

    /**
     *
     * @param separatedText
     */
    public void setSeparatedText(String separatedText) {
        this.separatedText = separatedText;
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

    @Override
    public int hashCode() {
        return super.hashCode()
                + Objects.hash(plateTypeConfidence, positionConfidence, plateChars, unicodeText, separatedText);
    }

    @Override
    public String toString() {
        return "AdrPlate{" + " engine=" + getEngine() + ", proctime=" + getProctime() + ", bgColor=" + getBgColor()
                + ", color=" + getColor() + ", confidence=" + getConfidence() + ", country=" + ", plateChars="
                + plateChars + ", plateROI=" + getPlateROI() + ", plateType=" + getPlateType() + ", plateTypeCategory="
                + getType() + ", unicodeText=" + unicodeText + ", plateTypeConfidence=" + plateTypeConfidence
                + ", positionConfidence=" + positionConfidence + '}';
    }

}
