// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DiagnosticSettingsResourceCollection model. */
@Fluent
public final class DiagnosticSettingsResourceCollectionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticSettingsResourceCollectionInner.class);

    /*
     * The collection of diagnostic settings resources;.
     */
    @JsonProperty(value = "value")
    private List<DiagnosticSettingsResourceInner> value;

    /**
     * Get the value property: The collection of diagnostic settings resources;.
     *
     * @return the value value.
     */
    public List<DiagnosticSettingsResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of diagnostic settings resources;.
     *
     * @param value the value value to set.
     * @return the DiagnosticSettingsResourceCollectionInner object itself.
     */
    public DiagnosticSettingsResourceCollectionInner withValue(List<DiagnosticSettingsResourceInner> value) {
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
