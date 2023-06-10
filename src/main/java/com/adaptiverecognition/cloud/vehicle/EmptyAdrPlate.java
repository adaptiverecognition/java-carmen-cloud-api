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

/**
 * The EmptyAdrPlate class represents an empty ADR plate or an A-plate.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class EmptyAdrPlate extends Plate {

    /**
     * EmptyAdrPlate constructor
     */
    public EmptyAdrPlate() {
        this(TypeCategory.EMPTY_ADR_PLATE);
    }

    /**
     * EmptyAdrPlate constructor
     *
     * @param plateTypeCategory the type of the plate to be created
     */
    protected EmptyAdrPlate(TypeCategory plateTypeCategory) {
        setType(plateTypeCategory);
    }

    /** {@inheritDoc} */
    @Override
    public void setType(TypeCategory type) {
        if (type == TypeCategory.EMPTY_ADR_PLATE || type == TypeCategory.A_PLATE) {
            setPlateTypeCategory(type);
        } else {
            setPlateTypeCategory(TypeCategory.EMPTY_ADR_PLATE);
        }
    }

}
