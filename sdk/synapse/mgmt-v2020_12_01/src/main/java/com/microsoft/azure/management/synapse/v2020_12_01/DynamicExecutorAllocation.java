/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dynamic Executor Allocation Properties.
 */
public class DynamicExecutorAllocation {
    /**
     * Indicates whether Dynamic Executor Allocation is enabled or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get indicates whether Dynamic Executor Allocation is enabled or not.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set indicates whether Dynamic Executor Allocation is enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the DynamicExecutorAllocation object itself.
     */
    public DynamicExecutorAllocation withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
