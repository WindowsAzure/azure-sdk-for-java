/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dedicated host unutilized capacity.
 */
public class DedicatedHostAvailableCapacity {
    /**
     * The unutilized capacity of the dedicated host represented in terms of
     * each VM size that is allowed to be deployed to the dedicated host.
     */
    @JsonProperty(value = "allocatableVMs")
    private List<DedicatedHostAllocatableVM> allocatableVMs;

    /**
     * Get the unutilized capacity of the dedicated host represented in terms of each VM size that is allowed to be deployed to the dedicated host.
     *
     * @return the allocatableVMs value
     */
    public List<DedicatedHostAllocatableVM> allocatableVMs() {
        return this.allocatableVMs;
    }

    /**
     * Set the unutilized capacity of the dedicated host represented in terms of each VM size that is allowed to be deployed to the dedicated host.
     *
     * @param allocatableVMs the allocatableVMs value to set
     * @return the DedicatedHostAvailableCapacity object itself.
     */
    public DedicatedHostAvailableCapacity withAllocatableVMs(List<DedicatedHostAllocatableVM> allocatableVMs) {
        this.allocatableVMs = allocatableVMs;
        return this;
    }

}
