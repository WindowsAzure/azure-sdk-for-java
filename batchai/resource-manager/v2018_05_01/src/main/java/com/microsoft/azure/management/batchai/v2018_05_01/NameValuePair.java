/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Name-value pair.
 */
public class NameValuePair {
    /**
     * Name.
     * The name in the name-value pair.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Value.
     * The value in the name-value pair.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name in the name-value pair.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name in the name-value pair.
     *
     * @param name the name value to set
     * @return the NameValuePair object itself.
     */
    public NameValuePair withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value in the name-value pair.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value in the name-value pair.
     *
     * @param value the value value to set
     * @return the NameValuePair object itself.
     */
    public NameValuePair withValue(String value) {
        this.value = value;
        return this;
    }

}
