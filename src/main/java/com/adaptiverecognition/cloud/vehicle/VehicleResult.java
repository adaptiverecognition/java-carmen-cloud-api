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

import java.util.Objects;

import com.adaptiverecognition.cloud.Result;

/**
 * The VehicleResult class represents the result of a vehicle recognition.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class VehicleResult extends Result {

    private static final String VERSION = "1.4.1";

    private Data data = new Data();

    /**
     * Constructor.
     */
    public VehicleResult() {
        super.setVersion(VERSION);
    }

    /**
     * Get the data of the recognition result.
     *
     * @return the data of the recognition result
     */
    public Data getData() {
        return data;
    }

    /**
     * Set the data of the recognition result.
     *
     * @param data the data of the recognition result
     */
    public void setData(Data data) {
        this.data = data;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VehicleResult)) {
            return false;
        }
        VehicleResult vehicleResult = (VehicleResult) o;
        return super.equals(o) && Objects.equals(data, vehicleResult.data);
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
        sb.append("VehicleResult{requestId=").append(getRequestId());
        sb.append(", nodename=").append(getNodename());
        sb.append(", startuptime=").append(getStartuptime());
        sb.append(", nodetime=").append(getNodetime());
        sb.append(", recognitiontime=").append(getRecognitiontime());
        sb.append(", version=").append(getVersion());
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

}
