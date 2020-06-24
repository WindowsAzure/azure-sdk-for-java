/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The supported capabilities.
 */
public class CapabilitiesCapabilities {
    /**
     * The maximum allowed memory request in GB.
     */
    @JsonProperty(value = "maxMemoryInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxMemoryInGB;

    /**
     * The maximum allowed CPU request in cores.
     */
    @JsonProperty(value = "maxCpu", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxCpu;

    /**
     * The maximum allowed GPU count.
     */
    @JsonProperty(value = "maxGpuCount", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxGpuCount;

    /**
     * Get the maximum allowed memory request in GB.
     *
     * @return the maxMemoryInGB value
     */
    public Double maxMemoryInGB() {
        return this.maxMemoryInGB;
    }

    /**
     * Get the maximum allowed CPU request in cores.
     *
     * @return the maxCpu value
     */
    public Double maxCpu() {
        return this.maxCpu;
    }

    /**
     * Get the maximum allowed GPU count.
     *
     * @return the maxGpuCount value
     */
    public Double maxGpuCount() {
        return this.maxGpuCount;
    }

}
