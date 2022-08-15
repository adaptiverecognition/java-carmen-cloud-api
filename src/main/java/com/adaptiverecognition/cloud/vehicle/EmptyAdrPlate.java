/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.vehicle;

/**
 *
 * @author laszlo.toth
 */
public class EmptyAdrPlate extends Plate {

    /**
     * 
     */
    public EmptyAdrPlate() {
        this(TypeCategory.EMPTY_ADR_PLATE);
    }

    /**
     * 
     * @param plateTypeCategory
     */
    public EmptyAdrPlate(TypeCategory plateTypeCategory) {
        setType(plateTypeCategory);
    }

    @Override
    public void setType(TypeCategory type) {
        if (type == TypeCategory.EMPTY_ADR_PLATE || type == TypeCategory.A_PLATE) {
            setPlateTypeCategory(type);
        } else {
            setPlateTypeCategory(TypeCategory.EMPTY_ADR_PLATE);
        }
    }

}
