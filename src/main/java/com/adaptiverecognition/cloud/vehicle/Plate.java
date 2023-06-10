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

import java.io.Serializable;
import java.util.Objects;

import com.adaptiverecognition.cloud.Color;
import com.adaptiverecognition.cloud.Rectangle;
import com.google.gson.annotations.SerializedName;

/**
 * The Plate class represents the result of a number plate recognition.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class Plate implements Serializable {

    /**
     * TypeCategory enum represents the type of the plate.
     *
     */
    public enum TypeCategory {
        /**
         * Licens plate
         */
        @SerializedName("LP")
        LICENSE_PLATE("LP"),
        /**
         * ADR plate
         */
        @SerializedName("ADR")
        ADR_PLATE("ADR"),
        /**
         * IMO (International Maritime Organisation) ADR plate
         */
        @SerializedName("IMO")
        IMO_ADR_PLATE("IMO"),
        /**
         * A-plate
         */
        @SerializedName("AP")
        A_PLATE("AP"),
        /**
         * Empty ADR plate
         */
        @SerializedName("E")
        EMPTY_ADR_PLATE("E");

        private String value;

        /**
         * Constructor
         */
        TypeCategory(String value) {
            this.value = value;
        }

        /**
         * Get the short value of the enum
         * 
         * @return the short value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * Get the enum from the short value
         * 
         * @param value the short value
         * @return the enum
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
     * Plate constructor.
     */
    public Plate() {
    }

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public TypeCategory getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(TypeCategory type) {
        setPlateTypeCategory(type);
    }

    /**
     * Set the value of plateTypeCategory
     *
     * @param plateTypeCategory new value of plateTypeCategory
     */
    protected final void setPlateTypeCategory(TypeCategory plateTypeCategory) {
        this.type = plateTypeCategory;
    }

    /**
     * Get the value of engine found this plate
     *
     * @return the value of engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Set the value of engine found this plate
     *
     * @param engine new value of engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Get the value of plateType (as an Integer)
     *
     * @return the value of plateType
     */
    public Integer getPlateType() {
        return plateType;
    }

    /**
     * Set the value of plateType (as an Integer)
     *
     * @param plateType new value of plateType
     */
    public void setPlateType(Integer plateType) {
        this.plateType = plateType;
    }

    /**
     * Get the value of plateSizeSource
     *
     * @return the value of plateSizeSource
     */
    public String getPlateSizeSource() {
        return plateSizeSource;
    }

    /**
     * Set the value of plateSizeSource
     *
     * @param plateSizeSource new value of plateSizeSource
     */
    public void setPlateSizeSource(String plateSizeSource) {
        this.plateSizeSource = plateSizeSource;
    }

    /**
     * Get the value of plateWidth
     *
     * @return the value of plateWidth
     */
    public Float getPlateWidth() {
        return plateWidth;
    }

    /**
     * Set the value of plateWidth
     *
     * @param plateWidth new value of plateWidth
     */
    public void setPlateWidth(Float plateWidth) {
        this.plateWidth = plateWidth;
    }

    /**
     * Get the value of plateHeight
     *
     * @return the value of plateHeight
     */
    public Float getPlateHeight() {
        return plateHeight;
    }

    /**
     * Set the value of plateHeight
     *
     * @param plateHeight new value of plateHeight
     */
    public void setPlateHeight(Float plateHeight) {
        this.plateHeight = plateHeight;
    }

    /**
     * Get the value of proctime
     *
     * @return the value of proctime
     */
    public long getProctime() {
        return proctime;
    }

    /**
     * Set the value of proctime
     *
     * @param proctime new value of proctime
     */
    public void setProctime(long proctime) {
        this.proctime = proctime;
    }

    /**
     * Get the value of bgDark
     *
     * @return the value of bgDark
     */
    public Boolean getBgDark() {
        return bgDark;
    }

    /**
     * Set the value of bgDark
     *
     * @param bgDark new value of bgDark
     */
    public void setBgDark(Boolean bgDark) {
        this.bgDark = bgDark;
    }

    /**
     * Get the value of bgColor
     *
     * @return the value of bgColor
     */
    public Color getBgColor() {
        return bgColor;
    }

    /**
     * Set the value of bgColor
     *
     * @param bgColor new value of bgColor
     */
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Get the value of confidence
     *
     * @return the value of confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * Set the value of confidence
     *
     * @param confidence new value of confidence
     */
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * Get the value of plateROI
     *
     * @return the value of plateROI
     */
    public Rectangle getPlateROI() {
        return plateROI;
    }

    /**
     * Set the value of plateROI
     *
     * @param plateROI new value of plateROI
     */
    public void setPlateROI(Rectangle plateROI) {
        this.plateROI = plateROI;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(engine, proctime, bgDark, bgColor, color, confidence, plateROI, plateType, type,
                plateSizeSource, plateWidth, plateHeight);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Plate{" + " engine=" + engine + ", proctime=" + proctime + ", bgDark=" + bgDark + ", bgColor=" + bgColor
                + ", color=" + color + ", confidence=" + confidence + ", plateROI=" + plateROI + ", plateType="
                + plateType + ", plateTypeCategory=" + type + ", plateSizeSource=" + plateSizeSource + ", plateWidth="
                + plateWidth + ", plateHeight=" + plateHeight + '}';
    }

}
