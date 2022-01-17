/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

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
     * @param nodeName
     * @param lazy
     */
    public void init(String nodeName, boolean lazy);

    /**
     *
     * @param region
     * @param parameters
     * @param result
     * @param statistics
     * @return
     */
    public int processRequest(String region, Map<String, byte[]> parameters, R result, S statistics);
}
