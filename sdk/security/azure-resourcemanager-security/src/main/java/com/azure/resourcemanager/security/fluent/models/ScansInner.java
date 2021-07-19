// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of vulnerability assessment scan records. */
@Fluent
public final class ScansInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScansInner.class);

    /*
     * List of vulnerability assessment scan records.
     */
    @JsonProperty(value = "value")
    private List<ScanInner> value;

    /**
     * Get the value property: List of vulnerability assessment scan records.
     *
     * @return the value value.
     */
    public List<ScanInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of vulnerability assessment scan records.
     *
     * @param value the value value to set.
     * @return the ScansInner object itself.
     */
    public ScansInner withValue(List<ScanInner> value) {
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
