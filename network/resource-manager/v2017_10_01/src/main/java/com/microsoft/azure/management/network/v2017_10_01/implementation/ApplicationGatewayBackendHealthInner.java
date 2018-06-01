/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2017_10_01.ApplicationGatewayBackendHealthPool;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of ApplicationGatewayBackendHealthPool resources.
 */
public class ApplicationGatewayBackendHealthInner {
    /**
     * The backendAddressPools property.
     */
    @JsonProperty(value = "backendAddressPools")
    private List<ApplicationGatewayBackendHealthPool> backendAddressPools;

    /**
     * Get the backendAddressPools value.
     *
     * @return the backendAddressPools value
     */
    public List<ApplicationGatewayBackendHealthPool> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools value.
     *
     * @param backendAddressPools the backendAddressPools value to set
     * @return the ApplicationGatewayBackendHealthInner object itself.
     */
    public ApplicationGatewayBackendHealthInner withBackendAddressPools(List<ApplicationGatewayBackendHealthPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

}
