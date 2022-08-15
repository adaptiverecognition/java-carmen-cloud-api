/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import com.adaptiverecognition.cloud.vehicle.AdrPlate;
import com.adaptiverecognition.cloud.vehicle.LicensePlate;
import com.adaptiverecognition.cloud.vehicle.Plate;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

public class ResponseBuilder {
    /**
     * 
     */
    protected static final RuntimeTypeAdapterFactory<Plate> adapter = RuntimeTypeAdapterFactory
            .of(Plate.class, "typeClass")
            .registerSubtype(Plate.class, "EmptyAdrPlate")
            .registerSubtype(AdrPlate.class, "AdrPlate");
    /**
     * 
     */
    private Gson jsonConverter;

    /**
     * 
     */
    public ResponseBuilder() {
        this(new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                return (f.getDeclaringClass() == LicensePlate.class && f.getName().equals("type"));
            }

            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                return false;
            }

        }).setPrettyPrinting().disableHtmlEscaping().registerTypeAdapterFactory(adapter).create());
    }

    /**
     * 
     * @param jsonConverter
     */
    public ResponseBuilder(Gson jsonConverter) {
        this.jsonConverter = jsonConverter;
    }

    /**
     * 
     * @return
     */
    public Gson getJsonConverter() {
        return this.jsonConverter;
    }

    /**
     * 
     * @param result
     * @return
     */
    public String createResponse(Result result) {
        return getJsonConverter().toJson(result, result.getClass());
    }
}
