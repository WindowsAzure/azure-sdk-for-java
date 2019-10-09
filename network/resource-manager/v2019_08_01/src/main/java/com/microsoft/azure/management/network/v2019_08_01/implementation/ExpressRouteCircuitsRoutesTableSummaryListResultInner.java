/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.ExpressRouteCircuitRoutesTableSummary;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for ListRoutesTable associated with the Express Route Circuits API.
 */
public class ExpressRouteCircuitsRoutesTableSummaryListResultInner {
    /**
     * A list of the routes table.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitRoutesTableSummary> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get a list of the routes table.
     *
     * @return the value value
     */
    public List<ExpressRouteCircuitRoutesTableSummary> value() {
        return this.value;
    }

    /**
     * Set a list of the routes table.
     *
     * @param value the value value to set
     * @return the ExpressRouteCircuitsRoutesTableSummaryListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableSummaryListResultInner withValue(List<ExpressRouteCircuitRoutesTableSummary> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URL to get the next set of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set
     * @return the ExpressRouteCircuitsRoutesTableSummaryListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableSummaryListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
