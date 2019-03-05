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
 * Input definition for planned failover input properties.
 */
public class PlannedFailoverInputProperties {
    /**
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /**
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ProviderSpecificFailoverInput providerSpecificDetails;

    /**
     * Get failover direction.
     *
     * @return the failoverDirection value
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set failover direction.
     *
     * @param failoverDirection the failoverDirection value to set
     * @return the PlannedFailoverInputProperties object itself.
     */
    public PlannedFailoverInputProperties withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get provider specific settings.
     *
     * @return the providerSpecificDetails value
     */
    public ProviderSpecificFailoverInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set provider specific settings.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the PlannedFailoverInputProperties object itself.
     */
    public PlannedFailoverInputProperties withProviderSpecificDetails(ProviderSpecificFailoverInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}
