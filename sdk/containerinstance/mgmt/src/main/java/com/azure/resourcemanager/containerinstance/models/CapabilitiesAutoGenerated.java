// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CapabilitiesAutoGenerated model. */
@Immutable
public final class CapabilitiesAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapabilitiesAutoGenerated.class);

    /*
     * The maximum allowed memory request in GB.
     */
    @JsonProperty(value = "maxMemoryInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Float maxMemoryInGB;

    /*
     * The maximum allowed CPU request in cores.
     */
    @JsonProperty(value = "maxCpu", access = JsonProperty.Access.WRITE_ONLY)
    private Float maxCpu;

    /*
     * The maximum allowed GPU count.
     */
    @JsonProperty(value = "maxGpuCount", access = JsonProperty.Access.WRITE_ONLY)
    private Float maxGpuCount;

    /**
     * Get the maxMemoryInGB property: The maximum allowed memory request in GB.
     *
     * @return the maxMemoryInGB value.
     */
    public Float maxMemoryInGB() {
        return this.maxMemoryInGB;
    }

    /**
     * Get the maxCpu property: The maximum allowed CPU request in cores.
     *
     * @return the maxCpu value.
     */
    public Float maxCpu() {
        return this.maxCpu;
    }

    /**
     * Get the maxGpuCount property: The maximum allowed GPU count.
     *
     * @return the maxGpuCount value.
     */
    public Float maxGpuCount() {
        return this.maxGpuCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
