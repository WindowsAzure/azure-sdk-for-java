/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for SignalR service create/update operation.
 *
 * Keep the same schema as AzSignalR.Models.SignalRResource.
 */
public class SignalRCreateParameters extends SignalRUpdateParameters {
    /**
     * Azure GEO region: e.g. West US | East US | North Central US | South
     * Central US | West Europe | North Europe | East Asia | Southeast Asia |
     * etc.
     * The geo region of a resource never changes after it is created.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Get azure GEO region: e.g. West US | East US | North Central US | South Central US | West Europe | North Europe | East Asia | Southeast Asia | etc.
     The geo region of a resource never changes after it is created.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set azure GEO region: e.g. West US | East US | North Central US | South Central US | West Europe | North Europe | East Asia | Southeast Asia | etc.
     The geo region of a resource never changes after it is created.
     *
     * @param location the location value to set
     * @return the SignalRCreateParameters object itself.
     */
    public SignalRCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

}
