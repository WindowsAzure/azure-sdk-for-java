/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update network mapping input.
 */
public class UpdateNetworkMappingInput {
    /**
     * The input properties needed to update network mapping.
     */
    @JsonProperty(value = "properties")
    private UpdateNetworkMappingInputProperties properties;

    /**
     * Get the input properties needed to update network mapping.
     *
     * @return the properties value
     */
    public UpdateNetworkMappingInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the input properties needed to update network mapping.
     *
     * @param properties the properties value to set
     * @return the UpdateNetworkMappingInput object itself.
     */
    public UpdateNetworkMappingInput withProperties(UpdateNetworkMappingInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
