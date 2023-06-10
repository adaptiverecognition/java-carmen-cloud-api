/**
 * Cloud API Java reference implementation.

 * License: Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * This file is part of the Adaptive Recognition Hungary Kft. 
 * Vehicle API and Transportation&Cargo API Java reference implementation.
 * 
 * This software is free to use in either commercial or non-commercial applications.
 * 
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 * 
 * Adaptive Recognition Hungary Kft.
 * H-1023 Budapest, Alkotas u. 41. Hungary
 * Web: https://adaptiverecognition.com/contact-us/
 * 
 */
package com.adaptiverecognition.cloud.vehicle;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * The Vehicle class represents the result of a vehicle recognition.
 * 
 * @author laszlo.toth@arip.hu
 */
public class Vehicle implements Serializable {

    private LicensePlate plate;
    private Mmr mmr;
    private List<Plate> markings;
    private VehicleBounds bounds;

    /**
     * Get the license plate.
     *
     * @return the license plate
     */
    public LicensePlate getPlate() {
        return plate;
    }

    /**
     * Set the license plate.
     *
     * @param plate the license plate
     */
    public void setPlate(LicensePlate plate) {
        this.plate = plate;
    }

    /**
     * Get the MMR (make, model, color recognition) result of the vehicle.
     *
     * @return the MMR result
     */
    public Mmr getMmr() {
        return mmr;
    }

    /**
     * Set the MMR (make, model, color recognition) result of the vehicle.
     *
     * @param mmr the MMR result
     */
    public void setMmr(Mmr mmr) {
        this.mmr = mmr;
    }

    /**
     * Get the list of markings (ADR plates) of the vehicle.
     *
     * @return the list of markings
     */
    public List<Plate> getMarkings() {
        return markings;
    }

    /**
     * Set the list of markings (ADR plates) of the vehicle.
     *
     * @param markings the list of markings
     */
    public void setMarkings(List<Plate> markings) {
        this.markings = markings;
    }

    /**
     * Get the bounds of the vehicle.
     *
     * @return the bounds
     */
    public VehicleBounds getBounds() {
        return bounds;
    }

    /**
     * Set the bounds of the vehicle.
     *
     * @param bounds the bounds
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
