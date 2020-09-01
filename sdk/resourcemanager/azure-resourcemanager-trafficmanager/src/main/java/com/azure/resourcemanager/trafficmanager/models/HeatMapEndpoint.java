/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.resourcemanager.trafficmanager.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class which is a sparse representation of a Traffic Manager endpoint.
 */
public class HeatMapEndpoint {
    /**
     * The ARM Resource ID of this Traffic Manager endpoint.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * A number uniquely identifying this endpoint in query experiences.
     */
    @JsonProperty(value = "endpointId")
    private Integer endpointId;

    /**
     * Get the ARM Resource ID of this Traffic Manager endpoint.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the ARM Resource ID of this Traffic Manager endpoint.
     *
     * @param resourceId the resourceId value to set
     * @return the HeatMapEndpoint object itself.
     */
    public HeatMapEndpoint withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get a number uniquely identifying this endpoint in query experiences.
     *
     * @return the endpointId value
     */
    public Integer endpointId() {
        return this.endpointId;
    }

    /**
     * Set a number uniquely identifying this endpoint in query experiences.
     *
     * @param endpointId the endpointId value to set
     * @return the HeatMapEndpoint object itself.
     */
    public HeatMapEndpoint withEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
        return this;
    }

}
