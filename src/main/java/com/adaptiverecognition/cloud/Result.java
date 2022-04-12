/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public abstract class Result {

    private String error;
    private String nodename;
    private long nodetime;
    private String version;

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
    public String getError() {
        return error;
    }

    /**
     *
     * @param error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.error);
        hash = 67 * hash + Objects.hashCode(this.nodename);
        hash = 67 * hash + (int) (this.nodetime ^ (this.nodetime >>> 32));
        hash = 67 * hash + Objects.hashCode(this.version);
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
        final Result other = (Result) obj;
        if (this.nodetime != other.nodetime) {
            return false;
        }
        if (!Objects.equals(this.error, other.error)) {
            return false;
        }
        if (!Objects.equals(this.nodename, other.nodename)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Result{nodename=").append(nodename);
        sb.append(", nodetime=").append(nodetime);
        sb.append(", error=").append(error);
        sb.append(", version=").append(getVersion());
        sb.append('}');
        return sb.toString();
    }

}
