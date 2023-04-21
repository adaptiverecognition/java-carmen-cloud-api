/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.Objects;

import com.adaptiverecognition.cloud.Result;

/**
 *
 * @author laszlo.toth
 */
public class VehicleResult extends Result {

    private static final String VERSION = "1.4";

    private Data data = new Data();

    /**
     *
     */
    public VehicleResult() {
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
        if (!(o instanceof VehicleResult)) {
            return false;
        }
        VehicleResult vehicleResult = (VehicleResult) o;
        return super.equals(o) && Objects.equals(data, vehicleResult.data);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(data);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehicleResult{requestId=").append(getRequestId());
        sb.append(", nodename=").append(getNodename());
        sb.append(", nodetime=").append(getNodetime());
        sb.append(", version=").append(getVersion());
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

}
