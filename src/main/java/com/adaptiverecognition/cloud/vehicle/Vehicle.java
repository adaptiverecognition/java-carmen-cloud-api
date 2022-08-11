/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Vehicle implements Serializable {

    private LicensePlate plate;
    private Mmr mmr;
    private List<Plate> markings;
    private VehicleBounds bounds;

    /**
     *
     * @return
     */
    public LicensePlate getPlate() {
        return plate;
    }

    /**
     *
     * @param plate
     */
    public void setPlate(LicensePlate plate) {
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

    /**
     *
     * @return
     */
    public List<Plate> getMarkings() {
        return markings;
    }

    /**
     *
     * @param markings
     */
    public void setMarkings(List<Plate> markings) {
        this.markings = markings;
    }

    /**
     *
     * @return
     */
    public VehicleBounds getBounds() {
        return bounds;
    }

    /**
     *
     * @param bounds
     */
    public void setBounds(VehicleBounds bounds) {
        this.bounds = bounds;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehicle)) {
            return false;
        }
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(plate, vehicle.plate) && Objects.equals(mmr, vehicle.mmr)
                && Objects.equals(markings, vehicle.markings) && Objects.equals(bounds, vehicle.bounds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate, mmr, markings, bounds);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{plate=").append(plate);
        sb.append(", mmr=").append(mmr);
        sb.append(", markings=").append(markings);
        sb.append(", bounds=").append(bounds);
        sb.append('}');
        return sb.toString();
    }

}
