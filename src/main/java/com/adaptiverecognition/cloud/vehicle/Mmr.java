/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import com.adaptiverecognition.cloud.Color;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Mmr {
    private String engine;
    private boolean found;
    private long proctime;
    private String category;
    private Integer categoryConfidence;
    private Color color;
    private Integer colorConfidence;
    private String make;
    private String model;
    private Integer makeConfidence;
    private Integer modelConfidence;
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
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.found ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.engine);
        hash = 97 * hash + (int) (this.proctime ^ (this.proctime >>> 32));
        hash = 97 * hash + Objects.hashCode(this.category);
        hash = 97 * hash + Objects.hashCode(this.categoryConfidence);
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + Objects.hashCode(this.colorConfidence);
        hash = 97 * hash + Objects.hashCode(this.make);
        hash = 97 * hash + Objects.hashCode(this.model);
        hash = 97 * hash + Objects.hashCode(this.makeConfidence);
        hash = 97 * hash + Objects.hashCode(this.modelConfidence);
        hash = 97 * hash + Objects.hashCode(this.heading);
        hash = 97 * hash + Objects.hashCode(this.headingConfidence);
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
        final Mmr other = (Mmr) obj;
        if (this.found != other.found) {
            return false;
        }
        if (!Objects.equals(this.engine, other.engine)) {
            return false;
        }
        if (this.proctime != other.proctime) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.heading, other.heading)) {
            return false;
        }
        if (!Objects.equals(this.categoryConfidence, other.categoryConfidence)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.colorConfidence, other.colorConfidence)) {
            return false;
        }
        if (!Objects.equals(this.makeConfidence, other.makeConfidence)) {
            return false;
        }
        if (!Objects.equals(this.modelConfidence, other.modelConfidence)) {
            return false;
        }
        if (!Objects.equals(this.headingConfidence, other.headingConfidence)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Mmr{" + "found=" + found + ", engine=" + engine + ", proctime=" + proctime + ", category=" + category
                + ", categoryConfidence=" + categoryConfidence + ", color=" + color + ", colorConfidence="
                + colorConfidence + ", make=" + make + ", model=" + model + ", makeConfidence=" + makeConfidence
                + ", modelConfidence=" + modelConfidence + ", heading=" + heading + ", headingConfidence="
                + headingConfidence + '}';
    }

}
