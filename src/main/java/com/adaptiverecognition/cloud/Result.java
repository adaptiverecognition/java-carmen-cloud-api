/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

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
