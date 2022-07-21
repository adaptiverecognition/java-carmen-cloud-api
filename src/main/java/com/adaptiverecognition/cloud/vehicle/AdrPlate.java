/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class AdrPlate extends Plate {

    private Integer plateTypeConfidence;
    private Integer positionConfidence;
    private List<Char> plateChars;
    private String unicodeText;

    public AdrPlate() {
        this(TypeCategory.ADR);
    }

    public AdrPlate(TypeCategory plateTypeCategory) {
        super(plateTypeCategory);
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
    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 73 * hash + Objects.hashCode(this.unicodeText);
        hash = 73 * hash + Objects.hashCode(this.plateTypeConfidence);
        hash = 73 * hash + Objects.hashCode(this.positionConfidence);
        hash = 73 * hash + Objects.hashCode(this.plateChars);
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
        final AdrPlate other = (AdrPlate) obj;
        if (!equals(other)) {
            return false;
        }
        if (!Objects.equals(this.unicodeText, other.unicodeText)) {
            return false;
        }
        if (!Objects.equals(this.plateChars, other.plateChars)) {
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
        return "AdrPlate{" + "found=" + isFound() + ", proctime=" + getProctime() + ", bgColor=" + getBgColor()
                + ", color=" + getColor() + ", confidence=" + getConfidence() + ", country=" + ", plateChars="
                + plateChars + ", plateROI=" + getPlateROI() + ", plateType=" + getPlateType() + ", plateTypeCategory="
                + getType() + ", unicodeText=" + unicodeText + ", plateTypeConfidence="
                + plateTypeConfidence + ", positionConfidence=" + positionConfidence + '}';
    }

}
