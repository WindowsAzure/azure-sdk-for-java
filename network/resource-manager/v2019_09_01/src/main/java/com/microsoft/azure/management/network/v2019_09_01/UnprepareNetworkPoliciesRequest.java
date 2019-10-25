/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of UnprepareNetworkPolicies for Subnet.
 */
public class UnprepareNetworkPoliciesRequest {
    /**
     * The name of the service for which subnet is being unprepared for.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /**
     * Get the name of the service for which subnet is being unprepared for.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the name of the service for which subnet is being unprepared for.
     *
     * @param serviceName the serviceName value to set
     * @return the UnprepareNetworkPoliciesRequest object itself.
     */
    public UnprepareNetworkPoliciesRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

}
