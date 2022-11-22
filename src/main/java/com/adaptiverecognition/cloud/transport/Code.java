/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.transport;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author laszlo.tothI
 */
public class Code {

    private String code;
    private int confidence;
    private List<ImageResult> imageResults;
    private String engine;
    private long proctime;

    /**
     * 
     */
    public Code() {
    }

    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     *
     * @param confidence
     */
    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    /**
     *
     * @return
     */
    public List<ImageResult> getImageResults() {
        return imageResults;
    }

    /**
     *
     * @param imageResults
     */
    public void setImageResults(List<ImageResult> imageResults) {
        this.imageResults = imageResults;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Data)) {
            return false;
        }
        Code data = (Code) o;
        return Objects.equals(code, data.code) && Objects.equals(confidence, data.confidence)
                && Objects.equals(imageResults, data.imageResults) && Objects.equals(engine, data.engine)
                && Objects.equals(proctime, data.proctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, confidence, imageResults, engine, proctime);
    }

    @Override
    public String toString() {
        return "Code{" + " engine=" + engine + ", proctime=" + proctime + ", code=" + code + ", confidence="
                + confidence + ", imageResults=" + imageResults + '}';
    }

}
