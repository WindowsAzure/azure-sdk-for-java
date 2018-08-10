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
 * IP Address details.
 */
public class IPA {
    /**
     * Subtype of the detected IP Address.
     */
    @JsonProperty(value = "SubType")
    private String subType;

    /**
     * Detected IP Address.
     */
    @JsonProperty(value = "Text")
    private String text;

    /**
     * Index(Location) of the IP Address in the input text content.
     */
    @JsonProperty(value = "Index")
    private Integer index;

    /**
     * Get subtype of the detected IP Address.
     *
     * @return the subType value
     */
    public String subType() {
        return this.subType;
    }

    /**
     * Set subtype of the detected IP Address.
     *
     * @param subType the subType value to set
     * @return the IPA object itself.
     */
    public IPA withSubType(String subType) {
        this.subType = subType;
        return this;
    }

    /**
     * Get detected IP Address.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set detected IP Address.
     *
     * @param text the text value to set
     * @return the IPA object itself.
     */
    public IPA withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get index(Location) of the IP Address in the input text content.
     *
     * @return the index value
     */
    public Integer index() {
        return this.index;
    }

    /**
     * Set index(Location) of the IP Address in the input text content.
     *
     * @param index the index value to set
     * @return the IPA object itself.
     */
    public IPA withIndex(Integer index) {
        this.index = index;
        return this;
    }

}
