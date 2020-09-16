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
 * Request to failover a process server.
 */
public class FailoverProcessServerRequest {
    /**
     * The properties of the PS Failover request.
     */
    @JsonProperty(value = "properties")
    private FailoverProcessServerRequestProperties properties;

    /**
     * Get the properties of the PS Failover request.
     *
     * @return the properties value
     */
    public FailoverProcessServerRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties of the PS Failover request.
     *
     * @param properties the properties value to set
     * @return the FailoverProcessServerRequest object itself.
     */
    public FailoverProcessServerRequest withProperties(FailoverProcessServerRequestProperties properties) {
        this.properties = properties;
        return this;
    }

}
