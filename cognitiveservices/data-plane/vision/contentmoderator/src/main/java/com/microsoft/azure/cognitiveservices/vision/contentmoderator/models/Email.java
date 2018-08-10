/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Email Address details.
 */
public class Email {
    /**
     * Detected Email Address from the input text content.
     */
    @JsonProperty(value = "Detected")
    private String detected;

    /**
     * Subtype of the detected Email Address.
     */
    @JsonProperty(value = "SubType")
    private String subType;

    /**
     * Email Address in the input text content.
     */
    @JsonProperty(value = "Text")
    private String text;

    /**
     * Index(Location) of the Email address in the input text content.
     */
    @JsonProperty(value = "Index")
    private Integer index;

    /**
     * Get detected Email Address from the input text content.
     *
     * @return the detected value
     */
    public String detected() {
        return this.detected;
    }

    /**
     * Set detected Email Address from the input text content.
     *
     * @param detected the detected value to set
     * @return the Email object itself.
     */
    public Email withDetected(String detected) {
        this.detected = detected;
        return this;
    }

    /**
     * Get subtype of the detected Email Address.
     *
     * @return the subType value
     */
    public String subType() {
        return this.subType;
    }

    /**
     * Set subtype of the detected Email Address.
     *
     * @param subType the subType value to set
     * @return the Email object itself.
     */
    public Email withSubType(String subType) {
        this.subType = subType;
        return this;
    }

    /**
     * Get email Address in the input text content.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set email Address in the input text content.
     *
     * @param text the text value to set
     * @return the Email object itself.
     */
    public Email withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get index(Location) of the Email address in the input text content.
     *
     * @return the index value
     */
    public Integer index() {
        return this.index;
    }

    /**
     * Set index(Location) of the Email address in the input text content.
     *
     * @param index the index value to set
     * @return the Email object itself.
     */
    public Email withIndex(Integer index) {
        this.index = index;
        return this;
    }

}
