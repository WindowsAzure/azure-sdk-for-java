/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the HTTP header.
 */
public class HTTPHeader {
    /**
     * The name in HTTP header.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The value in HTTP header.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name in HTTP header.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name in HTTP header.
     *
     * @param name the name value to set
     * @return the HTTPHeader object itself.
     */
    public HTTPHeader withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value in HTTP header.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value in HTTP header.
     *
     * @param value the value value to set
     * @return the HTTPHeader object itself.
     */
    public HTTPHeader withValue(String value) {
        this.value = value;
        return this;
    }

}
