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
package com.adaptiverecognition.cloud.transport;

import java.util.List;
import java.util.Objects;

import com.adaptiverecognition.cloud.Char;

/**
 * The ImageResult class represents the result of ocr recognition on an input
 * image.
 *
 * @author laszlo.toth@arip.hu
 * @version $Id: $Id
 */
public class ImageResult {

    private boolean found;
    private String text;
    private Integer confidence;
    private List<Char> characters;

    /**
     * <p>
     * Constructor for ImageResult.
     * </p>
     */
    public ImageResult() {
    }

    /**
     * <p>
     * Getter for the field <code>found</code>.
     * </p>
     *
     * @return a boolean
     */
    public boolean isFound() {
        return found;
    }

    /**
     * <p>
     * Setter for the field <code>found</code>.
     * </p>
     *
     * @param found a boolean
     */
    public void setFound(boolean found) {
        this.found = found;
    }

    /**
     * <p>
     * Getter for the field <code>text</code>.
     * </p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * Setter for the field <code>text</code>.
     * </p>
     *
     * @param text a {@link java.lang.String} object
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Getter for the field <code>confidence</code>.
     * </p>
     *
     * @return a {@link java.lang.Integer} object
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Setter for the field <code>confidence</code>.
     * </p>
     *
     * @param confidence a {@link java.lang.Integer} object
     */
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Getter for the field <code>characters</code>.
     * </p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Char> getCharacters() {
        return characters;
    }

    /**
     * <p>
     * Setter for the field <code>characters</code>.
     * </p>
     *
     * @param characters a {@link java.util.List} object
     */
    public void setCharacters(List<Char> characters) {
        this.characters = characters;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(found, text, confidence, characters);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "ImageResult{" + " found=" + found + "" + ", text=" + text + ", confidence=" + confidence
                + ", characters=" + characters + '}';
    }

}
