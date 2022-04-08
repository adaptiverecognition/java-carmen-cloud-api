/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.anpr;

import com.adaptiverecognition.cloud.Result;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author laszlo.toth
 */
public class AnprResult extends Result {

    private static final String VERSION = "1.2";

    private Map<String, String> engines;
    private Data data = new Data();

    public AnprResult() {
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result{nodename=").append(getNodename());
        sb.append(", nodetime=").append(getNodetime());
        sb.append(", error=").append(getError());
        sb.append(", version=").append(getVersion());
        sb.append(", data=").append(data);
        sb.append(", engines=").append(engines);
        sb.append('}');
        return sb.toString();
    }

}
