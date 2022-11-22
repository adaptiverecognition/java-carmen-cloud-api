/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adaptiverecognition.cloud.transport;

import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.Char;

/**
 *
 * @author laszlo.toth
 */
public class ImageResult {

    private boolean found;
    private String text;
    private Integer confidence;
    private List<Char> characters;

    /**
     * 
     */
    public ImageResult() {
    }

    /**
     *
     * @return
     */
    public boolean isFound() {
        return found;
    }

    /**
     *
     * @param text
     */
    public void setFound(boolean found) {
        this.found = found;
    }

    /**
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     *
     * @param confidence
     */
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     *
     * @return
     */
    public List<Char> getCharacters() {
        return characters;
    }

    /**
     *
     * @param characters
     */
    public void setCharacters(List<Char> characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ImageResult)) {
            return false;
        }
        ImageResult imageResult = (ImageResult) o;
        return found == imageResult.found && Objects.equals(text, imageResult.text)
                && Objects.equals(confidence, imageResult.confidence)
                && Objects.equals(characters, imageResult.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(found, text, confidence, characters);
    }

    @Override
    public String toString() {
        return "ImageResult{" + " found=" + found + "" + ", text=" + text
                + ", confidence=" + confidence + ", characters=" + characters + '}';
    }

}
