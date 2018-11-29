/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state of a service, which contains the service
 * identifier and its aggregated health state.
 */
public class ServiceHealthState extends EntityHealthState {
    /**
     * Name of the service whose health state is represented by this object.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /**
     * Get name of the service whose health state is represented by this object.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set name of the service whose health state is represented by this object.
     *
     * @param serviceName the serviceName value to set
     * @return the ServiceHealthState object itself.
     */
    public ServiceHealthState withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

}
