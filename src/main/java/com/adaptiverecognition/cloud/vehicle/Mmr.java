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
     * Get the value of headingConfidence
     *
     * @return the value of headingConfidence
     */
    public Integer getHeadingConfidence() {
        return headingConfidence;
    }

    /**
     * Set the value of headingConfidence
     *
     * @param headingConfidence new value of headingConfidence
     */
    public void setHeadingConfidence(Integer headingConfidence) {
        this.headingConfidence = headingConfidence;
    }

    /**
     * Get the value of heading
     *
     * @return the value of heading
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Set the value of heading
     *
     * @param heading new value of heading
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Get the value of viewPointConfidence
     *
     * @return the value of viewPointConfidence
     */
    public Integer getViewPointConfidence() {
        return viewPointConfidence;
    }

    /**
     * Set the value of viewPointConfidence
     *
     * @param viewPointConfidence new value of viewPointConfidence
     */
    public void setViewPointConfidence(Integer viewPointConfidence) {
        this.viewPointConfidence = viewPointConfidence;
    }

    /**
     * Get the value of viewPoint
     *
     * @return the value of viewPoint
     */
    public String getViewPoint() {
        return viewPoint;
    }

    /**
     * Set the value of viewPoint
     *
     * @param viewPoint new value of viewPoint
     */
    public void setViewPoint(String viewPoint) {
        this.viewPoint = viewPoint;
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
     * Get the value of category
     *
     * @param category new value of category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Get the value of make
     *
     * @return the value of make
     */
    public String getMake() {
        return make;
    }

    /**
     * Set the value of make
     *
     * @param make new value of make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Get the value of model
     *
     * @return the value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the value of model
     *
     * @param model new value of model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get the value of bodyType
     *
     * @return the value of bodyType
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * Set the value of bodyType
     *
     * @param bodyType new value of bodyType
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * Get the value of generation
     *
     * @return the value of generation
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * Set the value of generation
     *
     * @param generation new value of generation
     */
    public void setGeneration(String generation) {
        this.generation = generation;
    }

    /**
     * Get the value of variation
     *
     * @return the value of variation
     */
    public String getVariation() {
        return variation;
    }

    /**
     * Set the value of variation
     *
     * @param variation new value of variation
     */
    public void setVariation(String variation) {
        this.variation = variation;
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
     * Get the value of colorName
     *
     * @return the value of colorName
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Set the value of colorName
     *
     * @param colorName new value of colorName
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
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
     * Get the value of categoryConfidence
     *
     * @return the value of categoryConfidence
     */
    public Integer getCategoryConfidence() {
        return categoryConfidence;
    }

    /**
     * Set the value of categoryConfidence
     *
     * @param categoryConfidence new value of categoryConfidence
     */
    public void setCategoryConfidence(Integer categoryConfidence) {
        this.categoryConfidence = categoryConfidence;
    }

    /**
     * Get the value of colorConfidence
     *
     * @return the value of colorConfidence
     */
    public Integer getColorConfidence() {
        return colorConfidence;
    }

    /**
     * Set the value of colorConfidence
     *
     * @param colorConfidence new value of colorConfidence
     */
    public void setColorConfidence(Integer colorConfidence) {
        this.colorConfidence = colorConfidence;
    }

    /**
     * Get the value of makeConfidence
     *
     * @return the value of makeConfidence
     */
    public Integer getMakeConfidence() {
        return makeConfidence;
    }

    /**
     * Set the value of makeConfidence
     *
     * @param makeConfidence new value of makeConfidence
     */
    public void setMakeConfidence(Integer makeConfidence) {
        this.makeConfidence = makeConfidence;
    }

    /**
     * Get the value of modelConfidence
     *
     * @return the value of modelConfidence
     */
    public Integer getModelConfidence() {
        return modelConfidence;
    }

    /**
     * Set the value of modelConfidence
     *
     * @param modelConfidence new value of modelConfidence
     */
    public void setModelConfidence(Integer modelConfidence) {
        this.modelConfidence = modelConfidence;
    }

    /**
     * Get the value of bodyTypeConfidence
     *
     * @return the value of bodyTypeConfidence
     */
    public Integer getBodyTypeConfidence() {
        return bodyTypeConfidence;
    }

    /**
     * Set the value of bodyTypeConfidence
     *
     * @param bodyTypeConfidence new value of bodyTypeConfidence
     */
    public void setBodyTypeConfidence(Integer bodyTypeConfidence) {
        this.bodyTypeConfidence = bodyTypeConfidence;
    }

    /**
     * Get the value of generationConfidence
     *
     * @return the value of generationConfidence
     */
    public Integer getGenerationConfidence() {
        return generationConfidence;
    }

    /**
     * Set the value of generationConfidence
     *
     * @param generationConfidence new value of generationConfidence
     */
    public void setGenerationConfidence(Integer generationConfidence) {
        this.generationConfidence = generationConfidence;
    }

    /**
     * Get the value of variationConfidence
     *
     * @return the value of variationConfidence
     */
    public Integer getVariationConfidence() {
        return variationConfidence;
    }

    /**
     * Set the value of variationConfidence
     *
     * @param variationConfidence new value of variationConfidence
     */
    public void setVariationConfidence(Integer variationConfidence) {
        this.variationConfidence = variationConfidence;
    }

    /**
     * Get the value of imageTooltips
     *
     * @return the value of imageTooltips
     */
    public List<String> getImageTooltips() {
        return imageTooltips;
    }

    /**
     * Set the value of imageTooltips
     *
     * @param imageTooltips new value of imageTooltips
     */
    public void setImageTooltips(List<String> imageTooltips) {
        this.imageTooltips = imageTooltips;
    }

    /**
     * Get the value of frameTooltips
     * 
     * @return the value of frameTooltips
     */
    public List<String> getFrameTooltips() {
        return frameTooltips;
    }

    /**
     * Set the value of frameTooltips
     *
     * @param frameTooltips new value of frameTooltips
     */
    public void setFrameTooltips(List<String> frameTooltips) {
        this.frameTooltips = frameTooltips;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(engine, found, proctime, category, categoryConfidence, colorName, color, colorConfidence,
                make, model, bodyType, generation, variation, makeConfidence, modelConfidence, bodyTypeConfidence,
                generationConfidence, variationConfidence, heading, headingConfidence, viewPoint, viewPointConfidence,
                imageTooltips, frameTooltips);
    }

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
