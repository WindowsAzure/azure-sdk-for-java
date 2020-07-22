// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceRequirements model. */
@Fluent
public final class ResourceRequirements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceRequirements.class);

    /*
     * The resource requests of this container instance.
     */
    @JsonProperty(value = "requests", required = true)
    private ResourceRequests requests;

    /*
     * The resource limits of this container instance.
     */
    @JsonProperty(value = "limits")
    private ResourceLimits limits;

    /**
     * Get the requests property: The resource requests of this container instance.
     *
     * @return the requests value.
     */
    public ResourceRequests requests() {
        return this.requests;
    }

    /**
     * Set the requests property: The resource requests of this container instance.
     *
     * @param requests the requests value to set.
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements withRequests(ResourceRequests requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get the limits property: The resource limits of this container instance.
     *
     * @return the limits value.
     */
    public ResourceLimits limits() {
        return this.limits;
    }

    /**
     * Set the limits property: The resource limits of this container instance.
     *
     * @param limits the limits value to set.
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements withLimits(ResourceLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (requests() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property requests in model ResourceRequirements"));
        } else {
            requests().validate();
        }
        if (limits() != null) {
            limits().validate();
        }
    }
}
