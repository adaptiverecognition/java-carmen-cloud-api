/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.anpr;

import com.adaptiverecognition.cloud.Color;

/**
 *
 * @author laszlo.toth
 */
public class Mmr {

    private boolean found;
    private long proctime;
    private String category;
    private Integer categoryConfidence;
    private Color color;
    private Integer colorConfidence;
    private String make;
    private String model;
    private Integer makeAndModelConfidence;
    private String heading;
    private Integer headingConfidence;

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
    public Integer getMakeAndModelConfidence() {
        return makeAndModelConfidence;
    }

    /**
     *
     * @param makeAndModelConfidence
     */
    public void setMakeAndModelConfidence(Integer makeAndModelConfidence) {
        this.makeAndModelConfidence = makeAndModelConfidence;
    }

    @Override
    public String toString() {
        return "Mmr{" + "found=" + found + ", proctime=" + proctime + ", category=" + category + ", categoryConfidence=" + categoryConfidence + ", color=" + color + ", colorConfidence=" + colorConfidence + ", make=" + make + ", model=" + model + ", makeAndModelConfidence=" + makeAndModelConfidence + ", heading=" + heading + ", headingConfidence=" + headingConfidence + '}';
    }

}
