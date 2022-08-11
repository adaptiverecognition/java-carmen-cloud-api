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

    private String error;
    private String nodename;
    private long nodetime;
    private String version;
    private transient int statusCode;
    private transient ResponseBuilder responseBuilder;

    /**
     * 
     */
    protected Result() {
        this(new ResponseBuilder());
    }

    /**
     * 
     * @param responseBuilder
     */
    protected Result(ResponseBuilder responseBuilder) {
        setResponseBuilder(responseBuilder);
    }

    /**
     * 
     * @param responseBuilder
     */
    public final void setResponseBuilder(ResponseBuilder responseBuilder) {
        this.responseBuilder = responseBuilder;
    }

    /**
     * 
     * @return
     */
    public ResponseBuilder getResponseBuilder() {
        return this.responseBuilder;
    }

    /**
     * 
     * @return
     */
    public String toJson() {
        return getResponseBuilder().createResponse(this);
    }

    /**
     *
     * @return
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     *
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Result)) {
            return false;
        }
        Result result = (Result) o;
        return Objects.equals(error, result.error) && Objects.equals(nodename, result.nodename)
                && nodetime == result.nodetime && Objects.equals(version, result.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, nodename, nodetime, version);
    }

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
