/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud;

/**
 *
 * @author laszlo.toth
 * @param <R>
 * @param <A>
 * @param <S>
 */
public interface Handler<R extends Request, A extends Result, S extends Statistics> {

    /**
     *
     * @param lazy
     */
    public void init(boolean lazy);

    /**
     *
     */
    public void stop();

    /**
     *
     * @param region
     * @param request
     * @param result
     * @param statistics
     * @return
     */
    public int processRequest(String region, R request, A result, S statistics);
}
