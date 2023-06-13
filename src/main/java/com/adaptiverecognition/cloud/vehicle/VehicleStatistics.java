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

import java.util.ArrayList;
import java.util.List;

import com.adaptiverecognition.cloud.vehicle.VehicleRequest.Service;

/**
 * The VehicleStatistics class represents the statistics of a vehicle
 * recognition.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class VehicleStatistics {

    /**
     * The Read class represents the statistics of a single search on the given
     * image
     */
    public static class Read {

        private Boolean anprSucceeded;
        private Boolean mmrSucceeded;
        private Boolean adrSucceeded;
        private String country;
        private String state;
        private Integer plateType;
        private String plateCategory;
        private String category;
        private String make;
        private String model;
        private List<Integer> adrPlateTypes;
        private long anprProctime;
        private long mmrProctime;
        private long adrProctime;

        /**
         * Get the value of adrSucceeded
         *
         * @return the value of adrSucceeded
         */
        public Boolean isAdrSucceeded() {
            return adrSucceeded;
        }

        /**
         * Set the value of adrSucceeded
         *
         * @param adrSucceeded new value of adrSucceeded
         */
        public void setAdrSucceeded(Boolean adrSucceeded) {
            this.adrSucceeded = adrSucceeded;
        }

        /**
         * Get the value of mmrSucceeded
         *
         * @return the value of mmrSucceeded
         */
        public Boolean isMmrSucceeded() {
            return mmrSucceeded;
        }

        /**
         * Set the value of mmrSucceeded
         *
         * @param mmrSucceeded new value of mmrSucceeded
         */
        public void setMmrSucceeded(Boolean mmrSucceeded) {
            this.mmrSucceeded = mmrSucceeded;
        }

        /**
         * Get the value of anprSucceeded
         *
         * @return the value of anprSucceeded
         */
        public Boolean isAnprSucceeded() {
            return anprSucceeded;
        }

        /**
         * Set the value of anprSucceeded
         *
         * @param anprSucceeded new value of anprSucceeded
         */
        public void setAnprSucceeded(Boolean anprSucceeded) {
            this.anprSucceeded = anprSucceeded;
        }

        /**
         * Get the value of anprProctime
         *
         * @return the value of anprProctime
         */
        public long getAnprProctime() {
            return anprProctime;
        }

        /**
         * Set the value of anprProctime
         *
         * @param anprProctime new value of anprProctime
         */
        public void setAnprProctime(long anprProctime) {
            this.anprProctime = anprProctime;
        }

        /**
         * Get the value of adrProctime
         *
         * @return the value of adrProctime
         */
        public long getAdrProctime() {
            return adrProctime;
        }

        /**
         * Set the value of adrProctime
         *
         * @param adrProctime new value of adrProctime
         */
        public void setAdrProctime(long adrProctime) {
            this.adrProctime = adrProctime;
        }

        /**
         * Get the value of mmrProctime
         *
         * @return the value of mmrProctime
         */
        public long getMmrProctime() {
            return mmrProctime;
        }

        /**
         * Set the value of mmrProctime
         *
         * @param mmrProctime new value of mmrProctime
         */
        public void setMmrProctime(long mmrProctime) {
            this.mmrProctime = mmrProctime;
        }

        /**
         * Get the value of model
         *
         * @return the value of model
         */
        public String getModel() {
            return model;
        }

        /**
         * Set the value of model
         *
         * @param model new value of model
         */
        public void setModel(String model) {
            this.model = model;
        }

        /**
         * Get the value of make
         *
         * @return the value of make
         */
        public String getMake() {
            return make;
        }

        /**
         * Set the value of make
         *
         * @param make new value of make
         */
        public void setMake(String make) {
            this.make = make;
        }

        /**
         * Get the value of category
         *
         * @return the value of category
         */
        public String getCategory() {
            return category;
        }

        /**
         * Set the value of category
         *
         * @param category new value of category
         */
        public void setCategory(String category) {
            this.category = category;
        }

        /**
         * Get the value of plateCategory
         *
         * @return the value of plateCategory
         */
        public String getPlateCategory() {
            return plateCategory;
        }

        /**
         * Set the value of plateCategory
         *
         * @param plateCategory new value of plateCategory
         */
        public void setPlateCategory(String plateCategory) {
            this.plateCategory = plateCategory;
        }

        /**
         * Get the value of plateType
         *
         * @return the value of plateType
         */
        public Integer getPlateType() {
            return plateType;
        }

        /**
         * Set the value of plateType
         *
         * @param plateType new value of plateType
         */
        public void setPlateType(Integer plateType) {
            this.plateType = plateType;
        }

        /**
         * Get the value of country
         *
         * @return the value of country
         */
        public String getCountry() {
            return country;
        }

        /**
         * Set the value of country
         *
         * @param country new value of country
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         * Get the value of state
         *
         * @return the value of state
         */
        public String getState() {
            return state;
        }

        /**
         * Set the value of state
         *
         * @param state new value of state
         */
        public void setState(String state) {
            this.state = state;
        }

        /**
         * Add a adrPlateType to the list of adrPlateTypes
         * 
         * @param adrPlateType the adrPlateType
         */
        public void addAdrPlateType(Integer adrPlateType) {
            if (adrPlateTypes == null) {
                adrPlateTypes = new ArrayList<>();
            }
            adrPlateTypes.add(adrPlateType);
        }

        @Override
        public String toString() {
            return "Read{" + "anprSucceeded=" + anprSucceeded + ", mmrSucceeded=" + mmrSucceeded + ", adrSucceeded="
                    + adrSucceeded + ", country=" + country + ", state=" + state + ", plateType=" + plateType
                    + ", plateCategory=" + plateCategory + ", category=" + category + ", make=" + make + ", model="
                    + model + ", adrPlateTypes=" + adrPlateTypes + ", anprProctime=" + anprProctime + ", mmrProctime="
                    + mmrProctime + ", adrProctime=" + adrProctime + '}';
        }
    }

    private String region;
    private String location;
    private List<Service> services;
    private int maxreads;
    private List<Read> reads;

    /**
     * Add a read to the list of reads
     *
     * @param hit the
     *            {@link com.adaptiverecognition.cloud.vehicle.VehicleStatistics.Read}
     */
    public void addRead(Read hit) {
        if (reads == null) {
            reads = new ArrayList<>();
        }
        reads.add(hit);
    }

    /**
     * Get the value of services
     *
     * @return the value of services
     */
    public List<Service> getServices() {
        return services;
    }

    /**
     * Set the value of services
     *
     * @param services new value of services
     */
    public void setServices(List<Service> services) {
        this.services = services;
    }

    /**
     * Get the value of region
     *
     * @return the value of region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Set the value of region
     *
     * @param region new value of region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Get the value of location
     *
     * @return the value of location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set the value of location
     *
     * @param location new value of location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get the value of reads
     *
     * @return the value of reads
     */
    public List<Read> getReads() {
        return reads;
    }

    /**
     * Set the value of reads
     *
     * @param reads new value of reads
     */
    public void setReads(List<Read> reads) {
        this.reads = reads;
    }

    /**
     * Get the value of maxreads
     *
     * @return the value of maxreads
     */
    public int getMaxreads() {
        return maxreads;
    }

    /**
     * Set the value of maxreads
     *
     * @param maxreads new value of maxreads
     */
    public void setMaxreads(int maxreads) {
        this.maxreads = maxreads;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "VehicleStatistics{" + "region=" + region + ", location=" + location + ", services=" + services
                + ", maxreads=" + maxreads + ", reads=" + reads + '}';
    }

}
