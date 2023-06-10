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
package com.adaptiverecognition.cloud.transport;

import java.util.List;
import java.util.Objects;

/**
 * The Code class represents a single code found on the input images.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class Code {

    private String code;
    private int confidence;
    private List<ImageResult> imageResults;
    private String engine;
    private long proctime;

    /**
     * <p>
     * Constructor for Code.
     * </p>
     */
    public Code() {
    }

    /**
     * <p>
     * Getter for the field <code>code</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * Setter for the field <code>code</code>.
     * </p>
     *
     * @param code a {@link java.lang.String} object
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Getter for the field <code>confidence</code>.
     * </p>
     *
     * @return a int
     */
    public int getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Setter for the field <code>confidence</code>.
     * </p>
     *
     * @param confidence a int
     */
    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Getter for the field <code>imageResults</code>.
     * </p>
     *
     * @return a {@link java.util.List} object
     */
    public List<ImageResult> getImageResults() {
        return imageResults;
    }

    /**
     * <p>
     * Setter for the field <code>imageResults</code>.
     * </p>
     *
     * @param imageResults a {@link java.util.List} object
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
     * <p>
     * Getter for the field <code>proctime</code>.
     * </p>
     *
     * @return a long
     */
    public long getProctime() {
        return proctime;
    }

    /**
     * <p>
     * Setter for the field <code>proctime</code>.
     * </p>
     *
     * @param proctime a long
     */
    public void setProctime(long proctime) {
        this.proctime = proctime;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(code, confidence, imageResults, engine, proctime);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Code{" + " engine=" + engine + ", proctime=" + proctime + ", code=" + code + ", confidence="
                + confidence + ", imageResults=" + imageResults + '}';
    }

}
