// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HeatMapEndpoint model. */
public final class HeatMapEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HeatMapEndpoint.class);

    /*
     * The ARM Resource ID of this Traffic Manager endpoint.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * A number uniquely identifying this endpoint in query experiences.
     */
    @JsonProperty(value = "endpointId")
    private Integer endpointId;

    /**
     * Get the resourceId property: The ARM Resource ID of this Traffic Manager endpoint.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ARM Resource ID of this Traffic Manager endpoint.
     *
     * @param resourceId the resourceId value to set.
     * @return the HeatMapEndpoint object itself.
     */
    public HeatMapEndpoint withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the endpointId property: A number uniquely identifying this endpoint in query experiences.
     *
     * @return the endpointId value.
     */
    public Integer endpointId() {
        return this.endpointId;
    }

    /**
     * Set the endpointId property: A number uniquely identifying this endpoint in query experiences.
     *
     * @param endpointId the endpointId value to set.
     * @return the HeatMapEndpoint object itself.
     */
    public HeatMapEndpoint withEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
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
