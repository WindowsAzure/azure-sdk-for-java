// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.AvailableOperationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of available operations. */
@Fluent
public final class AvailableOperationsListResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableOperationsListResponse.class);

    /*
     * Link for next list of available operations
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Returns a list of available operations
     */
    @JsonProperty(value = "value")
    private List<AvailableOperationInner> value;

    /**
     * Get the nextLink property: Link for next list of available operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link for next list of available operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the AvailableOperationsListResponse object itself.
     */
    public AvailableOperationsListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Returns a list of available operations.
     *
     * @return the value value.
     */
    public List<AvailableOperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Returns a list of available operations.
     *
     * @param value the value value to set.
     * @return the AvailableOperationsListResponse object itself.
     */
    public AvailableOperationsListResponse withValue(List<AvailableOperationInner> value) {
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
