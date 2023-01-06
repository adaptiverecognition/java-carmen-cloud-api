/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.adaptiverecognition.cloud.Result;

/**
 *
 * @author laszlo.toth
 */
public class VehicleResult extends Result {

    private static final String VERSION = "1.4";

    private Map<String, String> engines;
    private Data data = new Data();

    /**
     *
     */
    public VehicleResult() {
        super.setVersion(VERSION);
    }

    /**
     *
     * @param type
     * @param engine
     */
    public void addEngine(String type, String engine) {
        if (engines == null) {
            engines = new HashMap<>();
        }
        engines.put(type, engine);
    }

    /**
     *
     * @return
     */
    public Map<String, String> getEngines() {
        return engines;
    }

    /**
     *
     * @param engines
     */
    public void setEngines(Map<String, String> engines) {
        this.engines = engines;
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
        return Objects.equals(engines, vehicleResult.engines) && Objects.equals(data, vehicleResult.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engines, data);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehicleResult{nodename=").append(getNodename());
        sb.append(", nodetime=").append(getNodetime());
        sb.append(", error=").append(getError());
        sb.append(", version=").append(getVersion());
        sb.append(", data=").append(data);
        sb.append(", engines=").append(engines);
        sb.append('}');
        return sb.toString();
    }

}
