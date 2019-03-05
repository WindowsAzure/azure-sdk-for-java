/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to update the mobility service on a protected item.
 */
public class UpdateMobilityServiceRequest {
    /**
     * The properties of the update mobility service request.
     */
    @JsonProperty(value = "properties")
    private UpdateMobilityServiceRequestProperties properties;

    /**
     * Get the properties of the update mobility service request.
     *
     * @return the properties value
     */
    public UpdateMobilityServiceRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties of the update mobility service request.
     *
     * @param properties the properties value to set
     * @return the UpdateMobilityServiceRequest object itself.
     */
    public UpdateMobilityServiceRequest withProperties(UpdateMobilityServiceRequestProperties properties) {
        this.properties = properties;
        return this;
    }

}
