/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ResponseBuilder {

    /**
     * 
     */
    private Gson jsonConverter;

    /**
     * 
     */
    public ResponseBuilder() {
        this(new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create());
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
