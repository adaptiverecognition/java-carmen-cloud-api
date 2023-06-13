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
     * <p>
     * Get the protocol version of the API that generated this result.
     * </p>
     *
     * @return the value of version
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * <p>
     * Set the protocol version of the API that generated this result.
     * </p>
     *
     * @param version the new value of version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *
     * <p>
     * Get the name of the node that generated this result.
     * </p>
     *
     * @return the value of nodename
     */
    public String getNodename() {
        return nodename;
    }

    /**
     *
     * <p>
     * Set the name of the node that generated this result.
     * </p>
     *
     * @param nodename the new value of nodename
     */
    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    /**
     *
     * <p>
     * Get the value of the overall processing time on the node that generated this
     * result.
     * </p>
     *
     * @return the value of nodetime
     */
    public long getNodetime() {
        return nodetime;
    }

    /**
     *
     * <p>
     * Set the value of the overall processing time on the node that generated this
     * result.
     * </p>
     *
     * @param nodetime the new value of nodetime
     */
    public void setNodetime(long nodetime) {
        this.nodetime = nodetime;
    }

    /**
     *
     * <p>
     * Get the request ID of the request that generated this result.
     * </p>
     *
     * @return the value of requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     *
     * <p>
     * Set the request ID of the request that generated this result.
     * </p>
     *
     * @param requestId the new value of requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(requestId, nodename, nodetime, version);
    }

    /** {@inheritDoc} */
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
