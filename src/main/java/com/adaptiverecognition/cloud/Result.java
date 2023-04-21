/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public abstract class Result implements Serializable {

    private String nodename;
    private long nodetime;
    private String version;
    private transient String requestId;

    /**
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *
     * @return
     */
    public String getNodename() {
        return nodename;
    }

    /**
     *
     * @param nodename
     */
    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    /**
     *
     * @return
     */
    public long getNodetime() {
        return nodetime;
    }

    /**
     *
     * @param nodetime
     */
    public void setNodetime(long nodetime) {
        this.nodetime = nodetime;
    }

    /**
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     *
     * @param requestId
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
