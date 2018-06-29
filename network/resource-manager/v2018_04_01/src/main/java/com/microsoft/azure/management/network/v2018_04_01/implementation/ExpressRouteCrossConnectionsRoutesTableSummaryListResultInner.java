/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2018_04_01.ExpressRouteCrossConnectionRoutesTableSummary;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for ListRoutesTable associated with the Express Route Cross
 * Connections.
 */
public class ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner {
    /**
     * A list of the routes table.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCrossConnectionRoutesTableSummary> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get a list of the routes table.
     *
     * @return the value value
     */
    public List<ExpressRouteCrossConnectionRoutesTableSummary> value() {
        return this.value;
    }

    /**
     * Set a list of the routes table.
     *
     * @param value the value value to set
     * @return the ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner object itself.
     */
    public ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner withValue(List<ExpressRouteCrossConnectionRoutesTableSummary> value) {
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

}
