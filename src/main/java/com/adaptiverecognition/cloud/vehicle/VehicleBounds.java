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
import java.util.Objects;

import com.adaptiverecognition.cloud.Rectangle;

/**
 * The VehicleBounds class represents the bounds of a vehicle.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class VehicleBounds implements Serializable {

    private Rectangle vehicleFrame;
    private Rectangle extendedPlateFrame;

    /**
     * Get the extended plate frame.
     *
     * @return the extended plate frame
     */
    public Rectangle getExtendedPlateFrame() {
        return extendedPlateFrame;
    }

    /**
     * Set the extended plate frame.
     *
     * @param extendedPlateFrame the extended plate frame
     */
    public void setExtendedPlateFrame(Rectangle extendedPlateFrame) {
        this.extendedPlateFrame = extendedPlateFrame;
    }

    /**
     * Get the vehicle frame.
     *
     * @return the vehicle frame
     */
    public Rectangle getVehicleFrame() {
        return vehicleFrame;
    }

    /**
     * Set the vehicle frame.
     *
     * @param vehicleFrame the vehicle frame
     */
    public void setVehicleFrame(Rectangle vehicleFrame) {
        this.vehicleFrame = vehicleFrame;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(vehicleFrame, extendedPlateFrame);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehicleBounds{vehicleFrame=").append(vehicleFrame);
        sb.append(", extendedPlateFrame=").append(extendedPlateFrame);
        sb.append('}');
        return sb.toString();
    }

}
