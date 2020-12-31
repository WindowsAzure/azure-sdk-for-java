// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of private endpoint connection associated with the specified storage account. */
@Fluent
public final class PrivateEndpointConnectionListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionListResultInner.class);

    /*
     * Array of private endpoint connections
     */
    @JsonProperty(value = "value")
    private List<PrivateEndpointConnectionInner> value;

    /**
     * Get the value property: Array of private endpoint connections.
     *
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private endpoint connections.
     *
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionListResultInner object itself.
     */
    public PrivateEndpointConnectionListResultInner withValue(List<PrivateEndpointConnectionInner> value) {
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
