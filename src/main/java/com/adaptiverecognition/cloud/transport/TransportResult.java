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

import java.util.Objects;

import com.adaptiverecognition.cloud.Result;

/**
 * The TransportResult class represents the result of a ocr recognition.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class TransportResult extends Result {

    private static final String VERSION = "1.0";

    private Data data = new Data();

    /**
     * <p>
     * Constructor for TransportResult.
     * </p>
     */
    public TransportResult() {
        super.setVersion(VERSION);
    }

    /**
     * <p>
     * Getter for the field <code>data</code>.
     * </p>
     *
     * @return a {@link com.adaptiverecognition.cloud.transport.Data} object
     */
    public Data getData() {
        return data;
    }

    /**
     * <p>
     * Setter for the field <code>data</code>.
     * </p>
     *
     * @param data a {@link com.adaptiverecognition.cloud.transport.Data} object
     */
    public void setData(Data data) {
        this.data = data;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransportResult)) {
            return false;
        }
        TransportResult transportResult = (TransportResult) o;
        return super.equals(o) && Objects.equals(data, transportResult.data);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(data);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportResult{requestId=").append(getRequestId());
        sb.append(", nodename=").append(getNodename());
        sb.append(", nodetime=").append(getNodetime());
        sb.append(", version=").append(getVersion());
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

}
