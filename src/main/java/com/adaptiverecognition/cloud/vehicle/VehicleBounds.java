/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

import java.util.Objects;

import com.adaptiverecognition.cloud.Rectangle;

/**
 *
 * @author laszlo.toth
 */
public class VehicleBounds {

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

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.vehicleFrame);
        hash = 53 * hash + Objects.hashCode(this.extendedPlateFrame);
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
        final VehicleBounds other = (VehicleBounds) obj;
        if (!Objects.equals(this.vehicleFrame, other.vehicleFrame)) {
            return false;
        }
        if (!Objects.equals(this.extendedPlateFrame, other.extendedPlateFrame)) {
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
        sb.append("VehicleBounds{vehicleFrame=").append(vehicleFrame);
        sb.append(", extendedPlateFrame=").append(extendedPlateFrame);
        sb.append('}');
        return sb.toString();
    }

}
