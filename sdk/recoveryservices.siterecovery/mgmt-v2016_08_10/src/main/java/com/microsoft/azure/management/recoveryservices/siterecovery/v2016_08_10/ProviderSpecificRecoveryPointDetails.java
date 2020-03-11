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
 * Replication provider specific recovery point details.
 */
public class ProviderSpecificRecoveryPointDetails {
    /**
     * Gets the provider type.
     */
    @JsonProperty(value = "Type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get gets the provider type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
