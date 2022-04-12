/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.anpr;

import java.util.Objects;

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

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.plate);
        hash = 53 * hash + Objects.hashCode(this.mmr);
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
        sb.append('}');
        return sb.toString();
    }

}
