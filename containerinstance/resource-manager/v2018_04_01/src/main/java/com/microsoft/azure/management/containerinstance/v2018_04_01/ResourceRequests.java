/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource requests.
 */
public class ResourceRequests {
    /**
     * The memory request in GB of this container instance.
     */
    @JsonProperty(value = "memoryInGB", required = true)
    private double memoryInGB;

    /**
     * The CPU request of this container instance.
     */
    @JsonProperty(value = "cpu", required = true)
    private double cpu;

    /**
     * Get the memory request in GB of this container instance.
     *
     * @return the memoryInGB value
     */
    public double memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memory request in GB of this container instance.
     *
     * @param memoryInGB the memoryInGB value to set
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests withMemoryInGB(double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the CPU request of this container instance.
     *
     * @return the cpu value
     */
    public double cpu() {
        return this.cpu;
    }

    /**
     * Set the CPU request of this container instance.
     *
     * @param cpu the cpu value to set
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests withCpu(double cpu) {
        this.cpu = cpu;
        return this;
    }

}
