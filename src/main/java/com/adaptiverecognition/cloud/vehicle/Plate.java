/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.io.Serializable;
import java.util.Objects;

import com.adaptiverecognition.cloud.Color;
import com.adaptiverecognition.cloud.Rectangle;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author laszlo.toth
 */
public class Plate implements Serializable {

    /**
     *
     */
    public enum TypeCategory {
        /**
         *
         */
        @SerializedName("LP")
        LICENSE_PLATE("LP"),
        /**
         *
         */
        @SerializedName("ADR")
        ADR_PLATE("ADR"),
        /**
         *
         */
        @SerializedName("IMO")
        IMO_ADR_PLATE("IMO"),
        /**
         *
         */
        @SerializedName("AP")
        A_PLATE("AP"),
        /**
         *
         */
        @SerializedName("E")
        EMPTY_ADR_PLATE("E");

        private String value;

        /**
         *
         */
        TypeCategory(String value) {
            this.value = value;
        }

        /**
         * 
         */
        public String getValue() {
            return this.value;
        }

        /**
         * 
         * @param value
         * @return
         */
        public static TypeCategory fromValue(String value) {
            for (TypeCategory tc : values()) {
                if (tc.value.equals(value)) {
                    return tc;
                }
            }
            return null;
        }

    }

    private String engine;
    private long proctime;
    private Boolean bgDark;
    private Color bgColor;
    private Color color;
    private Integer confidence;
    private Rectangle plateROI;
    private Integer plateType;
    private TypeCategory type;
    private String plateSizeSource;
    private Float plateWidth;
    private Float plateHeight;

    /**
     * 
     */
    public Plate() {
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
        setPlateTypeCategory(type);
    }

    /**
     *
     * @param plateTypeCategory
     */
    protected final void setPlateTypeCategory(TypeCategory plateTypeCategory) {
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
    public String getPlateSizeSource() {
        return plateSizeSource;
    }

    /**
     *
     * @param plateSizeSource
     */
    public void setPlateSizeSource(String plateSizeSource) {
        this.plateSizeSource = plateSizeSource;
    }

    /**
     *
     * @return
     */
    public Float getPlateWidth() {
        return plateWidth;
    }

    /**
     *
     * @param plateWidth
     */
    public void setPlateWidth(Float plateWidth) {
        this.plateWidth = plateWidth;
    }

    /**
     *
     * @return
     */
    public Float getPlateHeight() {
        return plateHeight;
    }

    /**
     *
     * @param plateHeight
     */
    public void setPlateHeight(Float plateHeight) {
        this.plateHeight = plateHeight;
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
    public Boolean getBgDark() {
        return bgDark;
    }

    /**
     *
     * @param bgDark
     */
    public void setBgDark(Boolean bgDark) {
        this.bgDark = bgDark;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Plate)) {
            return false;
        }
        Plate plate = (Plate) o;
        return Objects.equals(engine, plate.engine) && proctime == plate.proctime
                && Objects.equals(bgDark, plate.bgDark) && Objects.equals(bgColor, plate.bgColor)
                && Objects.equals(color, plate.color) && Objects.equals(confidence, plate.confidence)
                && Objects.equals(plateROI, plate.plateROI) && Objects.equals(plateType, plate.plateType)
                && Objects.equals(plateSizeSource, plate.plateSizeSource)
                && Objects.equals(plateWidth, plate.plateWidth) && Objects.equals(plateHeight, plate.plateHeight)
                && Objects.equals(type, plate.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, proctime, bgDark, bgColor, color, confidence, plateROI, plateType, type,
                plateSizeSource, plateWidth, plateHeight);
    }

    @Override
    public String toString() {
        return "Plate{" + " engine=" + engine + ", proctime=" + proctime + ", bgDark=" + bgDark + ", bgColor=" + bgColor
                + ", color=" + color + ", confidence=" + confidence + ", plateROI=" + plateROI + ", plateType="
                + plateType + ", plateTypeCategory=" + type + ", plateSizeSource=" + plateSizeSource + ", plateWidth="
                + plateWidth + ", plateHeight=" + plateHeight + '}';
    }

}
