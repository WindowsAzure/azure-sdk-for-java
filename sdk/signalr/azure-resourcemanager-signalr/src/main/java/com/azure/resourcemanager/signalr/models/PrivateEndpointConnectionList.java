// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of private endpoint connections. */
@Fluent
public final class PrivateEndpointConnectionList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionList.class);

    /*
     * The list of the private endpoint connections
     */
    @JsonProperty(value = "value")
    private List<PrivateEndpointConnectionInner> value;

    /*
     * Request URL that can be used to query next page of private endpoint
     * connections. Returned when the total number of requested private
     * endpoint connections exceed maximum page size.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of the private endpoint connections.
     *
     * @return the value value.
     */
    public List<PrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of the private endpoint connections.
     *
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionList object itself.
     */
    public PrivateEndpointConnectionList withValue(List<PrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of private endpoint connections.
     * Returned when the total number of requested private endpoint connections exceed maximum page size.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Request URL that can be used to query next page of private endpoint connections.
     * Returned when the total number of requested private endpoint connections exceed maximum page size.
     *
     * @param nextLink the nextLink value to set.
     * @return the PrivateEndpointConnectionList object itself.
     */
    public PrivateEndpointConnectionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
