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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The Data class represents the result of an ocr recognition.
 *
 * @author laszlo.toth@arip.hu
 */
public class Data {

    private List<Code> codes = new ArrayList<>();

    /**
     * <p>
     * Constructor for Data.
     * </p>
     */
    public Data() {
    }

    /**
     * <p>
     * Getter for the field <code>codes</code>.
     * </p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Code> getCodes() {
        return codes;
    }

    /**
     * <p>
     * Setter for the field <code>codes</code>.
     * </p>
     *
     * @param codes a {@link java.util.List} object
     */
    public void setCodes(List<Code> codes) {
        this.codes = codes;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Data)) {
            return false;
        }
        Data data = (Data) o;
        return Objects.equals(codes, data.codes);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(codes);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Data{" + " codes=" + codes + '}';
    }

}
