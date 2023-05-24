/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.transport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laszlo.toth
 */
public class TransportStatistics {

    public static class Read {

        private int imageCount;
        private boolean succeeded;
        private long proctime;

        /**
         * Get the value of imageCount
         *
         * @return the value of imageCount
         */
        public int getImageCount() {
            return imageCount;
        }

        /**
         * Set the value of imageCount
         *
         * @param imageCount new value of imageCount
         */
        public void setImageCount(int imageCount) {
            this.imageCount = imageCount;
        }

        /**
         * Get the value of succeeded
         *
         * @return the value of succeeded
         */
        public boolean isSucceeded() {
            return succeeded;
        }

        /**
         * Set the value of succeeded
         *
         * @param succeeded new value of succeeded
         */
        public void setSucceeded(boolean succeeded) {
            this.succeeded = succeeded;
        }

        /**
         * Get the value of proctime
         *
         * @return the value of anpproctimerProctime
         */
        public long getProctime() {
            return proctime;
        }

        /**
         * Set the value of proctime
         *
         * @param proctime new value of proctime
         */
        public void setProctime(long proctime) {
            this.proctime = proctime;
        }

        @Override
        public String toString() {
            return "Read{" + "imageCount=" + imageCount + ", succeeded=" + succeeded + ", proctime=" + proctime + '}';
        }
    }

    private String type;
    private int maxreads;
    private List<Read> reads;

    public void addRead(Read hit) {
        if (reads == null) {
            reads = new ArrayList<>();
        }
        reads.add(hit);
    }

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "TransportStatistics{" + "type=" + type + ", maxreads=" + maxreads + ", reads=" + reads + '}';
    }

}
