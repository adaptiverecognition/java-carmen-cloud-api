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
import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.Color;

/**
 * The Mmr class represents the result of a make, model, and color recognition.
 *
 * @author laszlo.toth@arip.hu
 */
public class Mmr implements Serializable {
    private String engine;
    private boolean found;
    private long proctime;
    private String category;
    private Integer categoryConfidence;
    private String colorName;
    private Color color;
    private Integer colorConfidence;
    private String make;
    private String model;
    private String bodyType;
    private String generation;
    private String variation;
    private Integer makeConfidence;
    private Integer modelConfidence;
    private Integer bodyTypeConfidence;
    private Integer generationConfidence;
    private Integer variationConfidence;
    private String heading;
    private Integer headingConfidence;
    private String viewPoint;
    private Integer viewPointConfidence;
    private List<String> imageTooltips;
    private List<String> frameTooltips;

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
     * Get the value of engine
     * </p>
     *
     * @return the value of engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * Set the value of engine
     * </p>
     *
     * @param engine new value of engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Get the value of headingConfidence
     * </p>
     *
     * @return the value of headingConfidence
     */
    public Integer getHeadingConfidence() {
        return headingConfidence;
    }

    /**
     * <p>
     * Set the value of headingConfidence
     * </p>
     *
     * @param headingConfidence new value of headingConfidence
     */
    public void setHeadingConfidence(Integer headingConfidence) {
        this.headingConfidence = headingConfidence;
    }

    /**
     * <p>
     * Get the value of heading
     * </p>
     *
     * @return the value of heading
     */
    public String getHeading() {
        return heading;
    }

    /**
     * <p>
     * Set the value of heading
     * </p>
     *
     * @param heading new value of heading
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * <p>
     * Get the value of viewPointConfidence
     * </p>
     *
     * @return the value of viewPointConfidence
     */
    public Integer getViewPointConfidence() {
        return viewPointConfidence;
    }

    /**
     * <p>
     * Set the value of viewPointConfidence
     * </p>
     *
     * @param viewPointConfidence new value of viewPointConfidence
     */
    public void setViewPointConfidence(Integer viewPointConfidence) {
        this.viewPointConfidence = viewPointConfidence;
    }

    /**
     * <p>
     * Get the value of viewPoint
     * </p>
     *
     * @return the value of viewPoint
     */
    public String getViewPoint() {
        return viewPoint;
    }

    /**
     * <p>
     * Set the value of viewPoint
     * </p>
     *
     * @param viewPoint new value of viewPoint
     */
    public void setViewPoint(String viewPoint) {
        this.viewPoint = viewPoint;
    }

    /**
     * <p>
     * Get the value of category
     * </p>
     *
     * @return the value of category
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * Get the value of category
     * </p>
     *
     * @param category new value of category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * Get the value of make
     * </p>
     *
     * @return the value of make
     */
    public String getMake() {
        return make;
    }

    /**
     * <p>
     * Set the value of make
     * </p>
     *
     * @param make new value of make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * <p>
     * Get the value of model
     * </p>
     *
     * @return the value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * <p>
     * Set the value of model
     * </p>
     *
     * @param model new value of model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * Get the value of bodyType
     * </p>
     *
     * @return the value of bodyType
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * <p>
     * Set the value of bodyType
     * </p>
     *
     * @param bodyType new value of bodyType
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * <p>
     * Get the value of generation
     * </p>
     *
     * @return the value of generation
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * <p>
     * Set the value of generation
     * </p>
     *
     * @param generation new value of generation
     */
    public void setGeneration(String generation) {
        this.generation = generation;
    }

    /**
     * <p>
     * Get the value of variation
     * </p>
     *
     * @return the value of variation
     */
    public String getVariation() {
        return variation;
    }

    /**
     * <p>
     * Set the value of variation
     * </p>
     *
     * @param variation new value of variation
     */
    public void setVariation(String variation) {
        this.variation = variation;
    }

    /**
     * <p>
     * Get the value of color
     * </p>
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * <p>
     * Set the value of color
     * </p>
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * <p>
     * Get the value of colorName
     * </p>
     *
     * @return the value of colorName
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * <p>
     * Set the value of colorName
     * </p>
     *
     * @param colorName new value of colorName
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /**
     * <p>
     * Get the value of proctime
     * </p>
     *
     * @return the value of proctime
     */
    public long getProctime() {
        return proctime;
    }

    /**
     * <p>
     * Set the value of proctime
     * </p>
     *
     * @param proctime new value of proctime
     */
    public void setProctime(long proctime) {
        this.proctime = proctime;
    }

    /**
     * <p>
     * Get the value of categoryConfidence
     * </p>
     *
     * @return the value of categoryConfidence
     */
    public Integer getCategoryConfidence() {
        return categoryConfidence;
    }

    /**
     * <p>
     * Set the value of categoryConfidence
     * </p>
     *
     * @param categoryConfidence new value of categoryConfidence
     */
    public void setCategoryConfidence(Integer categoryConfidence) {
        this.categoryConfidence = categoryConfidence;
    }

    /**
     * <p>
     * Get the value of colorConfidence
     * </p>
     *
     * @return the value of colorConfidence
     */
    public Integer getColorConfidence() {
        return colorConfidence;
    }

    /**
     * <p>
     * Set the value of colorConfidence
     * </p>
     *
     * @param colorConfidence new value of colorConfidence
     */
    public void setColorConfidence(Integer colorConfidence) {
        this.colorConfidence = colorConfidence;
    }

    /**
     * <p>
     * Get the value of makeConfidence
     * </p>
     *
     * @return the value of makeConfidence
     */
    public Integer getMakeConfidence() {
        return makeConfidence;
    }

    /**
     * <p>
     * Set the value of makeConfidence
     * </p>
     *
     * @param makeConfidence new value of makeConfidence
     */
    public void setMakeConfidence(Integer makeConfidence) {
        this.makeConfidence = makeConfidence;
    }

    /**
     * <p>
     * Get the value of modelConfidence
     * </p>
     *
     * @return the value of modelConfidence
     */
    public Integer getModelConfidence() {
        return modelConfidence;
    }

    /**
     * <p>
     * Set the value of modelConfidence
     * </p>
     *
     * @param modelConfidence new value of modelConfidence
     */
    public void setModelConfidence(Integer modelConfidence) {
        this.modelConfidence = modelConfidence;
    }

    /**
     * <p>
     * Get the value of bodyTypeConfidence
     * </p>
     *
     * @return the value of bodyTypeConfidence
     */
    public Integer getBodyTypeConfidence() {
        return bodyTypeConfidence;
    }

    /**
     * <p>
     * Set the value of bodyTypeConfidence
     * </p>
     *
     * @param bodyTypeConfidence new value of bodyTypeConfidence
     */
    public void setBodyTypeConfidence(Integer bodyTypeConfidence) {
        this.bodyTypeConfidence = bodyTypeConfidence;
    }

    /**
     * <p>
     * Get the value of generationConfidence
     * </p>
     *
     * @return the value of generationConfidence
     */
    public Integer getGenerationConfidence() {
        return generationConfidence;
    }

    /**
     * <p>
     * Set the value of generationConfidence
     * </p>
     *
     * @param generationConfidence new value of generationConfidence
     */
    public void setGenerationConfidence(Integer generationConfidence) {
        this.generationConfidence = generationConfidence;
    }

    /**
     * <p>
     * Get the value of variationConfidence
     * </p>
     *
     * @return the value of variationConfidence
     */
    public Integer getVariationConfidence() {
        return variationConfidence;
    }

    /**
     * <p>
     * Set the value of variationConfidence
     * </p>
     *
     * @param variationConfidence new value of variationConfidence
     */
    public void setVariationConfidence(Integer variationConfidence) {
        this.variationConfidence = variationConfidence;
    }

    /**
     * <p>
     * Get the value of imageTooltips
     * </p>
     *
     * @return the value of imageTooltips
     */
    public List<String> getImageTooltips() {
        return imageTooltips;
    }

    /**
     * <p>
     * Set the value of imageTooltips
     * </p>
     *
     * @param imageTooltips new value of imageTooltips
     */
    public void setImageTooltips(List<String> imageTooltips) {
        this.imageTooltips = imageTooltips;
    }

    /**
     * <p>
     * Get the value of frameTooltips
     * </p>
     *
     * @return the value of frameTooltips
     */
    public List<String> getFrameTooltips() {
        return frameTooltips;
    }

    /**
     * <p>
     * Set the value of frameTooltips
     * </p>
     *
     * @param frameTooltips new value of frameTooltips
     */
    public void setFrameTooltips(List<String> frameTooltips) {
        this.frameTooltips = frameTooltips;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mmr)) {
            return false;
        }
        Mmr mmr = (Mmr) o;
        return Objects.equals(engine, mmr.engine) && found == mmr.found && proctime == mmr.proctime
                && Objects.equals(category, mmr.category) && Objects.equals(categoryConfidence, mmr.categoryConfidence)
                && Objects.equals(colorName, mmr.colorName) && Objects.equals(color, mmr.color)
                && Objects.equals(colorConfidence, mmr.colorConfidence) && Objects.equals(make, mmr.make)
                && Objects.equals(model, mmr.model) && Objects.equals(bodyType, mmr.bodyType)
                && Objects.equals(generation, mmr.generation) && Objects.equals(variation, mmr.variation)
                && Objects.equals(makeConfidence, mmr.makeConfidence)
                && Objects.equals(modelConfidence, mmr.modelConfidence)
                && Objects.equals(bodyTypeConfidence, mmr.bodyTypeConfidence)
                && Objects.equals(generationConfidence, mmr.generationConfidence)
                && Objects.equals(variationConfidence, mmr.variationConfidence) && Objects.equals(heading, mmr.heading)
                && Objects.equals(headingConfidence, mmr.headingConfidence) && Objects.equals(viewPoint, mmr.viewPoint)
                && Objects.equals(viewPointConfidence, mmr.viewPointConfidence)
                && Objects.equals(imageTooltips, mmr.imageTooltips) && Objects.equals(frameTooltips, mmr.frameTooltips);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(engine, found, proctime, category, categoryConfidence, colorName, color, colorConfidence,
                make, model, bodyType, generation, variation, makeConfidence, modelConfidence, bodyTypeConfidence,
                generationConfidence, variationConfidence, heading, headingConfidence, viewPoint, viewPointConfidence,
                imageTooltips, frameTooltips);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Mmr{" + "found=" + found + ", engine=" + engine + ", proctime=" + proctime + ", category=" + category
                + ", categoryConfidence=" + categoryConfidence + ", colorName=" + colorName + ", color=" + color
                + ", colorConfidence=" + colorConfidence + ", make=" + make + ", model=" + model + ", bodyType="
                + bodyType + ", generation=" + generation + ", variation=" + variation + ", makeConfidence="
                + makeConfidence + ", modelConfidence=" + modelConfidence + ", bodyTypeConfidence=" + bodyTypeConfidence
                + ", generationConfidence=" + generationConfidence + ", variationConfidence=" + variationConfidence
                + ", heading=" + heading + ", headingConfidence=" + headingConfidence + ", viewPoint=" + viewPoint
                + ", viewPointConfidence=" + viewPointConfidence + ", imageTooltips=" + imageTooltips
                + ", frameTooltips=" + frameTooltips + '}';
    }

}
