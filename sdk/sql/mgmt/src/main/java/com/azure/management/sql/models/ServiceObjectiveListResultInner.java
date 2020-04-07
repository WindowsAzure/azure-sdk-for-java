// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ServiceObjectiveListResult model.
 */
@Fluent
public final class ServiceObjectiveListResultInner {
    /*
     * The list of database service objectives.
     */
    @JsonProperty(value = "value", required = true)
    private List<ServiceObjectiveInner> value;

    /**
     * Get the value property: The list of database service objectives.
     * 
     * @return the value value.
     */
    public List<ServiceObjectiveInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of database service objectives.
     * 
     * @param value the value value to set.
     * @return the ServiceObjectiveListResultInner object itself.
     */
    public ServiceObjectiveListResultInner withValue(List<ServiceObjectiveInner> value) {
        this.value = value;
        return this;
    }
}
