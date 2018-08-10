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
 * The key value pair object properties.
 */
public class KeyValuePair {
    /**
     * The key parameter.
     */
    @JsonProperty(value = "Key")
    private String key;

    /**
     * The value parameter.
     */
    @JsonProperty(value = "Value")
    private String value;

    /**
     * Get the key parameter.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key parameter.
     *
     * @param key the key value to set
     * @return the KeyValuePair object itself.
     */
    public KeyValuePair withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value parameter.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value parameter.
     *
     * @param value the value value to set
     * @return the KeyValuePair object itself.
     */
    public KeyValuePair withValue(String value) {
        this.value = value;
        return this;
    }

}
