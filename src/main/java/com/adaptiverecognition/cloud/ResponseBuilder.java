/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

import java.io.IOException;

import com.adaptiverecognition.cloud.vehicle.AdrPlate;
import com.adaptiverecognition.cloud.vehicle.EmptyAdrPlate;
import com.adaptiverecognition.cloud.vehicle.LicensePlate;
import com.adaptiverecognition.cloud.vehicle.Plate;
import com.adaptiverecognition.cloud.vehicle.Plate.TypeCategory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class ResponseBuilder {

    /**
     * 
     */
    protected static class PlateTypeAdapterFactory implements TypeAdapterFactory {

        /**
         * 
         */
        public <P> TypeAdapter<P> create(Gson gson, TypeToken<P> type) {
            if (!Plate.class.isAssignableFrom(type.getRawType())) {
                return null;
            }

            final TypeAdapter<Plate> plateDelegate = (TypeAdapter<Plate>) gson.getDelegateAdapter(this,
                    new TypeToken<Plate>() {
                    });
            final TypeAdapter<EmptyAdrPlate> eadrDelegate = (TypeAdapter<EmptyAdrPlate>) gson.getDelegateAdapter(this,
                    new TypeToken<EmptyAdrPlate>() {
                    });
            final TypeAdapter<AdrPlate> adrDelegate = (TypeAdapter<AdrPlate>) gson.getDelegateAdapter(this,
                    new TypeToken<AdrPlate>() {
                    });
            final TypeAdapter<LicensePlate> lpDelegate = (TypeAdapter<LicensePlate>) gson.getDelegateAdapter(
                    this,
                    new TypeToken<LicensePlate>() {
                    });

            return new TypeAdapter<P>() {

                @Override
                public void write(JsonWriter out, P value) throws IOException {
                    Plate plate = (Plate) value;
                    if (plate == null || plate.getType() == null) {
                        return;
                    }
                    switch (plate.getType()) {
                        case EMPTY_ADR_PLATE:
                        case A_PLATE:
                            eadrDelegate.write(out, (EmptyAdrPlate) plate);
                            break;
                        case ADR_PLATE:
                        case IMO_ADR_PLATE:
                            adrDelegate.write(out, (AdrPlate) plate);
                            break;
                        case LICENSE_PLATE:
                            lpDelegate.write(out, (LicensePlate) plate);
                            break;
                    }
                }

                @Override
                public P read(JsonReader in) throws IOException {
                    JsonElement je = JsonParser.parseReader(in);
                    if (je.getAsJsonObject() == null) {
                        return null;
                    }
                    String type = je.getAsJsonObject().get("type") != null
                            ? je.getAsJsonObject().get("type").getAsString()
                            : null;
                    TypeCategory typeCategory = TypeCategory.fromValue(type);
                    if (typeCategory == null) {
                        return (P) lpDelegate.fromJsonTree(je);
                    } else if (typeCategory == Plate.TypeCategory.ADR_PLATE
                            || typeCategory == Plate.TypeCategory.IMO_ADR_PLATE) {
                        return (P) adrDelegate.fromJsonTree(je);
                    }
                    return (P) eadrDelegate.fromJsonTree(je);
                }
            };
        }
    }

    /**
     * 
     */
    private Gson jsonConverter;

    /**
     * 
     */
    public ResponseBuilder() {
        this(new GsonBuilder()/* .setPrettyPrinting() */.disableHtmlEscaping()
                .registerTypeAdapterFactory(new PlateTypeAdapterFactory()).create());
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
