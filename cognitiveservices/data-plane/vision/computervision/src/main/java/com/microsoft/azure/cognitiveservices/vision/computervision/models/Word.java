/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Json object representing a recognized word.
 */
public class Word {
    /**
     * Bounding box of a recognized word.
     */
    @JsonProperty(value = "boundingBox", required = true)
    private List<Integer> boundingBox;

    /**
     * The text content of the word.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /**
     * Qualitative confidence measure. Possible values include: 'High', 'Low'.
     */
    @JsonProperty(value = "confidence")
    private TextRecognitionResultConfidenceClass confidence;

    /**
     * Get bounding box of a recognized word.
     *
     * @return the boundingBox value
     */
    public List<Integer> boundingBox() {
        return this.boundingBox;
    }

    /**
     * Set bounding box of a recognized word.
     *
     * @param boundingBox the boundingBox value to set
     * @return the Word object itself.
     */
    public Word withBoundingBox(List<Integer> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the text content of the word.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text content of the word.
     *
     * @param text the text value to set
     * @return the Word object itself.
     */
    public Word withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get qualitative confidence measure. Possible values include: 'High', 'Low'.
     *
     * @return the confidence value
     */
    public TextRecognitionResultConfidenceClass confidence() {
        return this.confidence;
    }

    /**
     * Set qualitative confidence measure. Possible values include: 'High', 'Low'.
     *
     * @param confidence the confidence value to set
     * @return the Word object itself.
     */
    public Word withConfidence(TextRecognitionResultConfidenceClass confidence) {
        this.confidence = confidence;
        return this;
    }

}
