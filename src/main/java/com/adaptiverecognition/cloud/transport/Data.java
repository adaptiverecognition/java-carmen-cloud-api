/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author laszlo.tothI
 */
public class Data {

    private List<Code> codes = new ArrayList<>();

    /**
     * 
     */
    public Data() {
    }

    /**
     *
     * @return
     */
    public List<Code> getCodes() {
        return codes;
    }

    /**
     *
     * @param codes
     */
    public void setCodes(List<Code> codes) {
        this.codes = codes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Data)) {
            return false;
        }
        Data data = (Data) o;
        return Objects.equals(codes, data.codes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codes);
    }

    @Override
    public String toString() {
        return "Data{" + " codes=" + codes + '}';
    }

}
