// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.inner.NatGatewayInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NatGatewayListResult model. */
@Fluent
public final class NatGatewayListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NatGatewayListResult.class);

    /*
     * A list of Nat Gateways that exists in a resource group.
     */
    @JsonProperty(value = "value")
    private List<NatGatewayInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of Nat Gateways that exists in a resource group.
     *
     * @return the value value.
     */
    public List<NatGatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of Nat Gateways that exists in a resource group.
     *
     * @param value the value value to set.
     * @return the NatGatewayListResult object itself.
     */
    public NatGatewayListResult withValue(List<NatGatewayInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the NatGatewayListResult object itself.
     */
    public NatGatewayListResult withNextLink(String nextLink) {
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
