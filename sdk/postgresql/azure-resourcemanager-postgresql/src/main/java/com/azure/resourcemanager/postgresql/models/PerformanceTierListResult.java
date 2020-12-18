// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.fluent.models.PerformanceTierPropertiesInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of performance tiers. */
@Fluent
public final class PerformanceTierListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PerformanceTierListResult.class);

    /*
     * The list of performance tiers
     */
    @JsonProperty(value = "value")
    private List<PerformanceTierPropertiesInner> value;

    /**
     * Get the value property: The list of performance tiers.
     *
     * @return the value value.
     */
    public List<PerformanceTierPropertiesInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of performance tiers.
     *
     * @param value the value value to set.
     * @return the PerformanceTierListResult object itself.
     */
    public PerformanceTierListResult withValue(List<PerformanceTierPropertiesInner> value) {
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
