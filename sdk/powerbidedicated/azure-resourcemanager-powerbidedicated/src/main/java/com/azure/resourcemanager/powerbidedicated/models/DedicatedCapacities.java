// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.powerbidedicated.fluent.models.DedicatedCapacityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An array of Dedicated capacities resources. */
@Fluent
public final class DedicatedCapacities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedCapacities.class);

    /*
     * An array of Dedicated capacities resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<DedicatedCapacityInner> value;

    /**
     * Get the value property: An array of Dedicated capacities resources.
     *
     * @return the value value.
     */
    public List<DedicatedCapacityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of Dedicated capacities resources.
     *
     * @param value the value value to set.
     * @return the DedicatedCapacities object itself.
     */
    public DedicatedCapacities withValue(List<DedicatedCapacityInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model DedicatedCapacities"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
