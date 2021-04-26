// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionForPrivateLinkHubInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse model. */
@Fluent
public final class PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse.class);

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<PrivateEndpointConnectionForPrivateLinkHubInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<PrivateEndpointConnectionForPrivateLinkHubInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse object itself.
     */
    public PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse withValue(
        List<PrivateEndpointConnectionForPrivateLinkHubInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse object itself.
     */
    public PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse withNextLink(String nextLink) {
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
