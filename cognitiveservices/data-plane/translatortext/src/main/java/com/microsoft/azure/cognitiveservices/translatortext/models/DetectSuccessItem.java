/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DetectSuccessItem model.
 */
public class DetectSuccessItem {
    /**
     * The text property.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the DetectSuccessItem object itself.
     */
    public DetectSuccessItem withText(String text) {
        this.text = text;
        return this;
    }

}
