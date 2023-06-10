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
 */
package com.adaptiverecognition.cloud;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is the base class for all request classes used in the Cloud APIs.
 * 
 * @author laszlo.toth@arip.hu
 * 
 * @param <S> The type of the enum used as key for the properties map
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
     * Get the value of a property identified by the given key.
     *
     * @param key the key of the property
     * @return the value of the property
     */
    public Object getProperty(S key) {
        return properties != null ? properties.get(key) : null;
    }

    /**
     *
     * Set the value of a property identified by the given key.
     * 
     * @param key   the key of the property
     * @param value the new value of the property
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
