// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The IncidentListResult model.
 */
@Fluent
public final class IncidentListResultInner {
    /*
     * the incident collection.
     */
    @JsonProperty(value = "value")
    private List<IncidentInner> value;

    /**
     * Get the value property: the incident collection.
     * 
     * @return the value value.
     */
    public List<IncidentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the incident collection.
     * 
     * @param value the value value to set.
     * @return the IncidentListResultInner object itself.
     */
    public IncidentListResultInner withValue(List<IncidentInner> value) {
        this.value = value;
        return this;
    }
}
