// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteCrossConnectionPeeringList model. */
@Fluent
public final class ExpressRouteCrossConnectionPeeringListInner {
    /*
     * The peerings in an express route cross connection.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCrossConnectionPeeringInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The peerings in an express route cross connection.
     *
     * @return the value value.
     */
    public List<ExpressRouteCrossConnectionPeeringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The peerings in an express route cross connection.
     *
     * @param value the value value to set.
     * @return the ExpressRouteCrossConnectionPeeringListInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringListInner withValue(List<ExpressRouteCrossConnectionPeeringInner> value) {
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
}
