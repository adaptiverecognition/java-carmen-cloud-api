/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.Objects;

import com.adaptiverecognition.cloud.Color;
import com.adaptiverecognition.cloud.Rectangle;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author laszlo.toth
 */
public class Plate {

    /**
     *
     */
    public enum TypeCategory {
        /**
         *
         */
        @SerializedName("LP")
        LicensePlate,
        /**
         *
         */
        @SerializedName("ADR")
        ADR,
        /**
         *
         */
        @SerializedName("IMO")
        IMO,
        /**
         *
         */
        @SerializedName("AP")
        APlate,
        /**
         *
         */
        @SerializedName("E")
        EmptyADR;

        /**
         *
         */
        TypeCategory() {
        }

    }

    private String engine;
    private long proctime;
    private Color bgColor;
    private Color color;
    private Integer confidence;
    private Rectangle plateROI;
    private Integer plateType;
    private TypeCategory type;

    /**
     * 
     */
    public Plate() {
        this(TypeCategory.EmptyADR);
    }

    /**
     * 
     * @param plateTypeCategory
     */
    public Plate(TypeCategory plateTypeCategory) {
        this.type = plateTypeCategory;
    }

    /**
     * Get the value of engine
     *
     * @return the value of engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Set the value of engine
     *
     * @param engine new value of engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
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
    public TypeCategory getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(TypeCategory type) {
        this.type = type;
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
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.engine);
        hash = 73 * hash + (int) (this.proctime ^ (this.proctime >>> 32));
        hash = 73 * hash + Objects.hashCode(this.bgColor);
        hash = 73 * hash + Objects.hashCode(this.color);
        hash = 73 * hash + Objects.hashCode(this.confidence);
        hash = 73 * hash + Objects.hashCode(this.plateROI);
        hash = 73 * hash + Objects.hashCode(this.plateType);
        hash = 73 * hash + Objects.hashCode(this.type);
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
        if (!Objects.equals(this.engine, other.engine)) {
            return false;
        }
        if (this.proctime != other.proctime) {
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
        if (!Objects.equals(this.plateROI, other.plateROI)) {
            return false;
        }
        if (!Objects.equals(this.plateType, other.plateType)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plate{" + " engine=" + engine + ", proctime=" + proctime + ", bgColor=" + bgColor + ", color=" + color
                + ", confidence=" + confidence + ", plateROI=" + plateROI + ", plateType=" + plateType
                + ", plateTypeCategory=" + type + '}';
    }

}
