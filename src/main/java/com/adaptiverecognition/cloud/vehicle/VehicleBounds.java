/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.io.Serializable;
import java.util.Objects;

import com.adaptiverecognition.cloud.Rectangle;

/**
 *
 * @author laszlo.toth
 */
public class VehicleBounds implements Serializable {

    private Rectangle vehicleFrame;
    private Rectangle extendedPlateFrame;

    /**
     *
     * @return
     */
    public Rectangle getExtendedPlateFrame() {
        return extendedPlateFrame;
    }

    /**
     *
     * @param extendedPlateFrame
     */
    public void setExtendedPlateFrame(Rectangle extendedPlateFrame) {
        this.extendedPlateFrame = extendedPlateFrame;
    }

    /**
     *
     * @return
     */
    public Rectangle getVehicleFrame() {
        return vehicleFrame;
    }

    /**
     *
     * @param vehicleFrame
     */
    public void setVehicleFrame(Rectangle vehicleFrame) {
        this.vehicleFrame = vehicleFrame;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VehicleBounds)) {
            return false;
        }
        VehicleBounds vehicleBounds = (VehicleBounds) o;
        return Objects.equals(vehicleFrame, vehicleBounds.vehicleFrame)
                && Objects.equals(extendedPlateFrame, vehicleBounds.extendedPlateFrame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleFrame, extendedPlateFrame);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehicleBounds{vehicleFrame=").append(vehicleFrame);
        sb.append(", extendedPlateFrame=").append(extendedPlateFrame);
        sb.append('}');
        return sb.toString();
    }

}
