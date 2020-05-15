// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.containerregistry.RegistryUsage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RegistryUsageListResult model. */
@Fluent
public final class RegistryUsageListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistryUsageListResultInner.class);

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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
