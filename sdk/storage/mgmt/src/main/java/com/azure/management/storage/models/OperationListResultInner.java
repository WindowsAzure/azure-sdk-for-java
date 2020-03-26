// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The OperationListResult model.
 */
@Fluent
public final class OperationListResultInner {
    /*
     * List of Storage operations supported by the Storage resource provider.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /**
     * Get the value property: List of Storage operations supported by the
     * Storage resource provider.
     * 
     * @return the value value.
     */
    public List<OperationInner> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of Storage operations supported by the
     * Storage resource provider.
     * 
     * @param value the value value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner setValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }
}
