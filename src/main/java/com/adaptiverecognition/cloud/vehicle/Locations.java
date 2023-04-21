package com.adaptiverecognition.cloud.vehicle;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
         * 
         */
        public Location() {
        }

        /**
         * 
         * @param region
         * @param location
         * @param country
         * @param state
         */
        public Location(String region, String location, String country, String state) {
            this.region = region;
            this.location = location;
            this.country = country;
            this.state = state;
        }

        /**
         * 
         * @return
         */
        public String getRegion() {
            return region;
        }

        /**
         * 
         * @return
         */
        public String getLocation() {
            return location;
        }

        /**
         * 
         * @return
         */
        public String getCountry() {
            return country;
        }

        /**
         * 
         * @return
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
     * 
     * @param locations
     */
    public Locations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * 
     * @return
     */
    public List<Location> getLocations() {
        return this.locations;
    }

    /**
     * 
     * @param country
     * @param state
     * @return
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
     * 
     * @param location
     * @return
     */
    public Location findByLocation(String location) {
        Optional<Location> lo = this.locations.stream().filter(l -> equalsIgnoreCase(l.location, location)).findFirst();
        return lo.isPresent() ? lo.get() : null;
    }

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
