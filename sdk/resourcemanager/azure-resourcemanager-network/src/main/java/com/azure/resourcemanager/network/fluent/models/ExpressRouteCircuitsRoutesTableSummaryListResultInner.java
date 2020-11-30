// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitRoutesTableSummary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListRoutesTable associated with the Express Route Circuits API. */
@Fluent
public final class ExpressRouteCircuitsRoutesTableSummaryListResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitsRoutesTableSummaryListResultInner.class);

    /*
     * A list of the routes table.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitRoutesTableSummary> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of the routes table.
     *
     * @return the value value.
     */
    public List<ExpressRouteCircuitRoutesTableSummary> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of the routes table.
     *
     * @param value the value value to set.
     * @return the ExpressRouteCircuitsRoutesTableSummaryListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableSummaryListResultInner withValue(
        List<ExpressRouteCircuitRoutesTableSummary> value) {
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
     * @return the ExpressRouteCircuitsRoutesTableSummaryListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableSummaryListResultInner withNextLink(String nextLink) {
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
