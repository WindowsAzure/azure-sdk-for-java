// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteCircuitConnectionListResult model. */
@Fluent
public final class ExpressRouteCircuitConnectionListResultInner {
    /*
     * The global reach connection associated with Private Peering in an
     * ExpressRoute Circuit.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitConnectionInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The global reach connection associated with Private Peering in an ExpressRoute Circuit.
     *
     * @return the value value.
     */
    public List<ExpressRouteCircuitConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The global reach connection associated with Private Peering in an ExpressRoute Circuit.
     *
     * @param value the value value to set.
     * @return the ExpressRouteCircuitConnectionListResultInner object itself.
     */
    public ExpressRouteCircuitConnectionListResultInner withValue(List<ExpressRouteCircuitConnectionInner> value) {
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
     * @return the ExpressRouteCircuitConnectionListResultInner object itself.
     */
    public ExpressRouteCircuitConnectionListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
