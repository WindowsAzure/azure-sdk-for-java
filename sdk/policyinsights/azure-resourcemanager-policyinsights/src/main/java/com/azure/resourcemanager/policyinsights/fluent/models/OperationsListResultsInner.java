// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.models.Operation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of available operations. */
@Fluent
public final class OperationsListResultsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsListResultsInner.class);

    /*
     * OData entity count; represents the number of operations returned.
     */
    @JsonProperty(value = "@odata.count")
    private Integer odataCount;

    /*
     * List of available operations.
     */
    @JsonProperty(value = "value")
    private List<Operation> value;

    /**
     * Get the odataCount property: OData entity count; represents the number of operations returned.
     *
     * @return the odataCount value.
     */
    public Integer odataCount() {
        return this.odataCount;
    }

    /**
     * Set the odataCount property: OData entity count; represents the number of operations returned.
     *
     * @param odataCount the odataCount value to set.
     * @return the OperationsListResultsInner object itself.
     */
    public OperationsListResultsInner withOdataCount(Integer odataCount) {
        this.odataCount = odataCount;
        return this;
    }

    /**
     * Get the value property: List of available operations.
     *
     * @return the value value.
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Set the value property: List of available operations.
     *
     * @param value the value value to set.
     * @return the OperationsListResultsInner object itself.
     */
    public OperationsListResultsInner withValue(List<Operation> value) {
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
