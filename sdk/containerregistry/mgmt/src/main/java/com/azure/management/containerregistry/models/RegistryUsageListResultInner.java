// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.containerregistry.RegistryUsage;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RegistryUsageListResult model. */
@Fluent
public final class RegistryUsageListResultInner {
    /*
     * The list of container registry quota usages.
     */
    @JsonProperty(value = "value")
    private List<RegistryUsage> value;

    /**
     * Get the value property: The list of container registry quota usages.
     *
     * @return the value value.
     */
    public List<RegistryUsage> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of container registry quota usages.
     *
     * @param value the value value to set.
     * @return the RegistryUsageListResultInner object itself.
     */
    public RegistryUsageListResultInner withValue(List<RegistryUsage> value) {
        this.value = value;
        return this;
    }
}
