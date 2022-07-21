/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Vehicle {

    private LicensePlate plate;
    private Mmr mmr;
    private List<Plate> additionalPlates;

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
    public List<Plate> getAdditionalPlates() {
        return additionalPlates;
    }

    /**
     *
     * @param plates
     */
    public void setAdditionalPlates(List<Plate> plates) {
        this.additionalPlates = plates;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.plate);
        hash = 53 * hash + Objects.hashCode(this.mmr);
        hash = 53 * hash + Objects.hashCode(this.additionalPlates);
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
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.plate, other.plate)) {
            return false;
        }
        if (!Objects.equals(this.mmr, other.mmr)) {
            return false;
        }
        if (!Objects.equals(this.additionalPlates, other.additionalPlates)) {
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
        sb.append("Vehicle{plate=").append(plate);
        sb.append(", mmr=").append(mmr);
        sb.append(", additionalPlates=").append(additionalPlates);
        sb.append('}');
        return sb.toString();
    }

}
