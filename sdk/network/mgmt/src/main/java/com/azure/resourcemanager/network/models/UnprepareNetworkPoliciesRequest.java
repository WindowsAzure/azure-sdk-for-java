// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UnprepareNetworkPoliciesRequest model. */
@Fluent
public final class UnprepareNetworkPoliciesRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UnprepareNetworkPoliciesRequest.class);

    /*
     * The name of the service for which subnet is being unprepared for.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /**
     * Get the serviceName property: The name of the service for which subnet is being unprepared for.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service for which subnet is being unprepared for.
     *
     * @param serviceName the serviceName value to set.
     * @return the UnprepareNetworkPoliciesRequest object itself.
     */
    public UnprepareNetworkPoliciesRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
