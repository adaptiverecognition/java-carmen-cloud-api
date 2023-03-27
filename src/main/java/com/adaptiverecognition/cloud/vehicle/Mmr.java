/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.Color;

/**
 *
 * @author laszlo.toth
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
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     */
    public String getMake() {
        return make;
    }

    /**
     *
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     *
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     *
     * @return
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     *
     * @param bodyType
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     *
     * @return
     */
    public String getGeneration() {
        return generation;
    }

    /**
     *
     * @param generation
     */
    public void setGeneration(String generation) {
        this.generation = generation;
    }

    /**
     *
     * @return
     */
    public String getVariation() {
        return variation;
    }

    /**
     *
     * @param variation
     */
    public void setVariation(String variation) {
        this.variation = variation;
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
    public String getColorName() {
        return colorName;
    }

    /**
     *
     * @param colorName
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
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
    public Integer getCategoryConfidence() {
        return categoryConfidence;
    }

    /**
     *
     * @param categoryConfidence
     */
    public void setCategoryConfidence(Integer categoryConfidence) {
        this.categoryConfidence = categoryConfidence;
    }

    /**
     *
     * @return
     */
    public Integer getColorConfidence() {
        return colorConfidence;
    }

    /**
     *
     * @param colorConfidence
     */
    public void setColorConfidence(Integer colorConfidence) {
        this.colorConfidence = colorConfidence;
    }

    /**
     *
     * @return
     */
    public Integer getMakeConfidence() {
        return makeConfidence;
    }

    /**
     *
     * @param makeConfidence
     */
    public void setMakeConfidence(Integer makeConfidence) {
        this.makeConfidence = makeConfidence;
    }

    /**
     *
     * @return
     */
    public Integer getModelConfidence() {
        return modelConfidence;
    }

    /**
     *
     * @param modelConfidence
     */
    public void setModelConfidence(Integer modelConfidence) {
        this.modelConfidence = modelConfidence;
    }

    /**
     *
     * @return
     */
    public Integer getBodyTypeConfidence() {
        return bodyTypeConfidence;
    }

    /**
     *
     * @param bodyTypeConfidence
     */
    public void setBodyTypeConfidence(Integer bodyTypeConfidence) {
        this.bodyTypeConfidence = bodyTypeConfidence;
    }

    /**
     *
     * @return
     */
    public Integer getGenerationConfidence() {
        return generationConfidence;
    }

    /**
     *
     * @param generationConfidence
     */
    public void setGenerationConfidence(Integer generationConfidence) {
        this.generationConfidence = generationConfidence;
    }

    /**
     *
     * @return
     */
    public Integer getVariationConfidence() {
        return variationConfidence;
    }

    /**
     *
     * @param variationConfidence
     */
    public void setVariationConfidence(Integer variationConfidence) {
        this.variationConfidence = variationConfidence;
    }

    /**
     *
     * @return
     */
    public List<String> getImageTooltips() {
        return imageTooltips;
    }

    /**
     *
     * @param imageTooltips
     */
    public void setImageTooltips(List<String> imageTooltips) {
        this.imageTooltips = imageTooltips;
    }

    /**
     *
     * @return
     */
    public List<String> getFrameTooltips() {
        return frameTooltips;
    }

    /**
     *
     * @param frameTooltips
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

    /**
     *
     * @return
     */
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
