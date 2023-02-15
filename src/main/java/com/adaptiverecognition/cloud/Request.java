/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adaptiverecognition.cloud;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author laszlo.toth
 */
public class Request<S extends Enum<?>> {
    private Map<S, Object> properties;

    /**
     * Get the value of properties
     *
     * @return the value of properties
     */
    public Map<S, Object> getProperties() {
        return properties;
    }

    /**
     * Set the value of properties
     *
     * @param properties new value of properties
     */
    public void setProperties(Map<S, Object> properties) {
        this.properties = properties;
    }

    /**
     *
     * @param key
     * @return
     */
    public Object getProperty(S key) {
        return properties != null ? properties.get(key) : null;
    }

    /**
     *
     * @param key
     * @param value
     */
    public void setProperty(S key, Object value) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Request)) {
            return false;
        }
        Request<?> request = (Request<?>) o;
        return Objects.equals(properties, request.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

}
