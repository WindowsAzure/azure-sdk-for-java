/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resync input.
 */
public class ResyncInput {
    /**
     * Resync input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ResyncInputProperties properties;

    /**
     * Get resync input properties.
     *
     * @return the properties value
     */
    public ResyncInputProperties properties() {
        return this.properties;
    }

    /**
     * Set resync input properties.
     *
     * @param properties the properties value to set
     * @return the ResyncInput object itself.
     */
    public ResyncInput withProperties(ResyncInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
