/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.transport;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.adaptiverecognition.cloud.Result;

/**
 *
 * @author laszlo.toth
 */
public class TransportResult extends Result {

    private static final String VERSION = "1.0";

    private Data data = new Data();

    /**
     *
     */
    public TransportResult() {
        super.setVersion(VERSION);
    }

    /**
     *
     * @return
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransportResult)) {
            return false;
        }
        TransportResult transportResult = (TransportResult) o;
        return Objects.equals(data, transportResult.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportResult{nodename=").append(getNodename());
        sb.append(", nodetime=").append(getNodetime());
        sb.append(", error=").append(getError());
        sb.append(", version=").append(getVersion());
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

}