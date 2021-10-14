/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cloud;

import java.util.Map;

/**
 *
 * @author laszlo.toth
 * @param <R>
 * @param <S>
 */
public interface Handler<R extends Result, S extends Object> {

    /**
     * 
     * @return 
     */
    public R createResult();

    /**
     * 
     * @return 
     */
    public S createStatistics();

    /**
     * 
     * @param region
     * @param parameters
     * @param result
     * @param statitics
     * @return 
     */
    public int processRequest(String region, Map<String, byte[]> parameters, R result, S statitics);
}
