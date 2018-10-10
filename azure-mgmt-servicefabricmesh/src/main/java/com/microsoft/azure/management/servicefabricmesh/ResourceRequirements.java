/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This type describes the resource requirements for a container or a service.
 */
public class ResourceRequirements {
    /**
     * Describes the requested resources for a given container.
     */
    @JsonProperty(value = "requests", required = true)
    private ResourceRequests requests;

    /**
     * Describes the maximum limits on the resources for a given container.
     */
    @JsonProperty(value = "limits")
    private ResourceLimits limits;

    /**
     * Get describes the requested resources for a given container.
     *
     * @return the requests value
     */
    public ResourceRequests requests() {
        return this.requests;
    }

    /**
     * Set describes the requested resources for a given container.
     *
     * @param requests the requests value to set
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements withRequests(ResourceRequests requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get describes the maximum limits on the resources for a given container.
     *
     * @return the limits value
     */
    public ResourceLimits limits() {
        return this.limits;
    }

    /**
     * Set describes the maximum limits on the resources for a given container.
     *
     * @param limits the limits value to set
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements withLimits(ResourceLimits limits) {
        this.limits = limits;
        return this;
    }

}
