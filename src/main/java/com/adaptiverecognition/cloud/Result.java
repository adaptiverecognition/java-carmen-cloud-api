/**
 * Cloud API Java reference implementation.
 * 
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
 */
package com.adaptiverecognition.cloud;

import java.io.Serializable;
import java.util.Objects;

/**
 * The Result class is the base class of all result classes.
 * 
 * @author laszlo.toth@arip.hu
 */
public abstract class Result implements Serializable {

    private String nodename;
    private long nodetime;
    private String version;
    private transient String requestId;

    /**
     * 
     * Get the protocol version of the API that generated this result.
     *
     * @return the value of version
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * Set the protocol version of the API that generated this result.
     * 
     * @param version the new value of version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *
     * Get the name of the node that generated this result.
     * 
     * @return the value of nodename
     */
    public String getNodename() {
        return nodename;
    }

    /**
     *
     * Set the name of the node that generated this result.
     * 
     * @param nodename the new value of nodename
     */
    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    /**
     *
     * Get the value of the overall processing time on the node that generated this
     * result.
     * 
     * @return the value of nodetime
     */
    public long getNodetime() {
        return nodetime;
    }

    /**
     *
     * Set the value of the overall processing time on the node that generated this
     * 
     * 
     * @param nodetime the new value of nodetime
     */
    public void setNodetime(long nodetime) {
        this.nodetime = nodetime;
    }

    /**
     *
     * Get the request ID of the request that generated this result.
     * 
     * @return the value of requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 
     * Set the request ID of the request that generated this result.
     *
     * @param requestId the new value of requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Result)) {
            return false;
        }
        Result result = (Result) o;
        return Objects.equals(requestId, result.requestId) && Objects.equals(nodename, result.nodename)
                && nodetime == result.nodetime && Objects.equals(version, result.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, nodename, nodetime, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result{requestId=").append(requestId);
        sb.append(", nodename=").append(nodename);
        sb.append(", nodetime=").append(nodetime);
        sb.append(", version=").append(getVersion());
        sb.append('}');
        return sb.toString();
    }

}
