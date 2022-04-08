/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.anpr;

/**
 *
 * @author laszlo.toth
 */
public class Vehicle {

    private Plate plate;
    private Mmr mmr;

    /**
     *
     * @return
     */
    public Plate getPlate() {
        return plate;
    }

    /**
     *
     * @param plate
     */
    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    /**
     *
     * @return
     */
    public Mmr getMmr() {
        return mmr;
    }

    /**
     *
     * @param mmr
     */
    public void setMmr(Mmr mmr) {
        this.mmr = mmr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{plate=").append(plate);
        sb.append(", mmr=").append(mmr);
        sb.append('}');
        return sb.toString();
    }

}
