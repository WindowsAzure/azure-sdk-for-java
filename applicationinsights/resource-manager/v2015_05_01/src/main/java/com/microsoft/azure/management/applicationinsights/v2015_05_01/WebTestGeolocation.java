/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Geo-physical location to run a web test from. You must specify one or more
 * locations for the test to run from.
 */
public class WebTestGeolocation {
    /**
     * Location ID for the webtest to run from.
     */
    @JsonProperty(value = "Id")
    private String location;

    /**
     * Get location ID for the webtest to run from.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location ID for the webtest to run from.
     *
     * @param location the location value to set
     * @return the WebTestGeolocation object itself.
     */
    public WebTestGeolocation withLocation(String location) {
        this.location = location;
        return this;
    }

}
