/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object describing possible celebrity identification.
 */
public class CelebritiesModel {
    /**
     * Name of the celebrity.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Level of confidence ranging from 0 to 1.
     */
    @JsonProperty(value = "confidence")
    private double confidence;

    /**
     * The faceRectangle property.
     */
    @JsonProperty(value = "faceRectangle")
    private FaceRectangle faceRectangle;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CelebritiesModel object itself.
     */
    public CelebritiesModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the confidence value.
     *
     * @return the confidence value
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Set the confidence value.
     *
     * @param confidence the confidence value to set
     * @return the CelebritiesModel object itself.
     */
    public CelebritiesModel withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the faceRectangle value.
     *
     * @return the faceRectangle value
     */
    public FaceRectangle faceRectangle() {
        return this.faceRectangle;
    }

    /**
     * Set the faceRectangle value.
     *
     * @param faceRectangle the faceRectangle value to set
     * @return the CelebritiesModel object itself.
     */
    public CelebritiesModel withFaceRectangle(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
        return this;
    }

}
