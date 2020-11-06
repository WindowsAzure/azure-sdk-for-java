/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Babylon Configuration.
 */
public class BabylonConfiguration {
    /**
     * Babylon Resource ID.
     */
    @JsonProperty(value = "babylonResourceId")
    private String babylonResourceId;

    /**
     * Get babylon Resource ID.
     *
     * @return the babylonResourceId value
     */
    public String babylonResourceId() {
        return this.babylonResourceId;
    }

    /**
     * Set babylon Resource ID.
     *
     * @param babylonResourceId the babylonResourceId value to set
     * @return the BabylonConfiguration object itself.
     */
    public BabylonConfiguration withBabylonResourceId(String babylonResourceId) {
        this.babylonResourceId = babylonResourceId;
        return this;
    }

}
