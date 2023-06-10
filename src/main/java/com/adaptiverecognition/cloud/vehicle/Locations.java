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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * The Locations class represents the result of the /countries request.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class Locations implements Serializable {
    /**
     * 
     */
    public static class Location implements Serializable {
        private String region;
        private String location;
        private String country;
        private String state;

        /**
         * Create an empty Location object.
         */
        public Location() {
        }

        /**
         * Create a Location object with the given parameters.
         * 
         * @param region   the region.
         * @param location the location.
         * @param country  the country.
         * @param state    the state.
         */
        public Location(String region, String location, String country, String state) {
            this.region = region;
            this.location = location;
            this.country = country;
            this.state = state;
        }

        /**
         * Get the region.
         * 
         * @return the region.
         */
        public String getRegion() {
            return region;
        }

        /**
         * Get the location.
         * 
         * @return the location.
         */
        public String getLocation() {
            return location;
        }

        /**
         * Get the country.
         * 
         * @return the country.
         */
        public String getCountry() {
            return country;
        }

        /**
         * Get the state.
         * 
         * @return the state.
         */
        public String getState() {
            return state;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Location)) {
                return false;
            }
            Location anprCountry = (Location) o;
            return Objects.equals(region, anprCountry.region) && Objects.equals(location, anprCountry.location)
                    && Objects.equals(country, anprCountry.country) && Objects.equals(state, anprCountry.state);
        }

        @Override
        public int hashCode() {
            return Objects.hash(region, location, country, state);
        }

        @Override
        public String toString() {
            return "{" + " region='" + region + "', " + " location='" + location + "', " + " country='" + country
                    + "', " + " state='" + state + "'" + "}";
        }

    }

    private final List<Location> locations;

    /**
     * Create a Locations object from the given list of Location objects.
     *
     * @param locations the list of Location objects.
     */
    public Locations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * Get the list of Location objects.
     *
     * @return the list of Location objects.
     */
    public List<Location> getLocations() {
        return this.locations;
    }

    /**
     * Find the Location object with the given country and state.
     *
     * @param country the country.
     * @param state   the state.
     * @return the Location object.
     */
    public Location findByCountryAndState(String country, String state) {
        Optional<Location> lo = this.locations.stream()
                .filter(l -> equalsIgnoreCase(l.country, country) && equalsIgnoreCase(l.state, state)).findFirst();
        if (lo.isPresent()) {
            return lo.get();
        }
        lo = this.locations.stream().filter(l -> equalsIgnoreCase(l.country, country)).findFirst();
        return lo.isPresent() ? lo.get() : null;
    }

    /**
     * Find the Location object with the given location.
     *
     * @param location the location.
     * @return the Location object.
     */
    public Location findByLocation(String location) {
        Optional<Location> lo = this.locations.stream().filter(l -> equalsIgnoreCase(l.location, location)).findFirst();
        return lo.isPresent() ? lo.get() : null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return locations != null ? locations.toString() : null;
    }

    private boolean equalsIgnoreCase(String value1, String value2) {
        if (value1 == null && value2 == null) {
            return true;
        }
        if (value1 == null || value2 == null) {
            return false;
        }
        return value1.equalsIgnoreCase(value2);
    }
}
