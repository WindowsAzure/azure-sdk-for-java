// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** the list of solution response. */
@Fluent
public final class SolutionPropertiesListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SolutionPropertiesListInner.class);

    /*
     * List of solution properties within the subscription.
     */
    @JsonProperty(value = "value")
    private List<SolutionInner> value;

    /**
     * Get the value property: List of solution properties within the subscription.
     *
     * @return the value value.
     */
    public List<SolutionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of solution properties within the subscription.
     *
     * @param value the value value to set.
     * @return the SolutionPropertiesListInner object itself.
     */
    public SolutionPropertiesListInner withValue(List<SolutionInner> value) {
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
