/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.QueryInterval;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A database query.
 */
public class QueryStatisticInner {
    /**
     * The id of the query.
     */
    @JsonProperty(value = "queryId", access = JsonProperty.Access.WRITE_ONLY)
    private String queryId;

    /**
     * The list of query intervals.
     */
    @JsonProperty(value = "intervals", access = JsonProperty.Access.WRITE_ONLY)
    private List<QueryInterval> intervals;

    /**
     * Get the id of the query.
     *
     * @return the queryId value
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Get the list of query intervals.
     *
     * @return the intervals value
     */
    public List<QueryInterval> intervals() {
        return this.intervals;
    }

}
