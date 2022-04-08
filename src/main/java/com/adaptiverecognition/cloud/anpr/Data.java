/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.anpr;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laszlo.toth
 */
public class Data {

    private List<Vehicle> vehicles = new ArrayList<>();

    /**
     *
     * @return
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     *
     * @param vehicles
     */
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data{vehicles=").append(vehicles);
        sb.append('}');
        return sb.toString();
    }

}
