/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04.implementation;

import com.microsoft.azure.management.resourcegraph.v2019_04.ResultTruncated;
import com.microsoft.azure.management.resourcegraph.v2019_04.Table;
import java.util.List;
import com.microsoft.azure.management.resourcegraph.v2019_04.Facet;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query result.
 */
public class QueryResponseInner {
    /**
     * Number of total records matching the query.
     */
    @JsonProperty(value = "totalRecords", required = true)
    private long totalRecords;

    /**
     * Number of records returned in the current response. In the case of
     * paging, this is the number of records in the current page.
     */
    @JsonProperty(value = "count", required = true)
    private long count;

    /**
     * Indicates whether the query results are truncated. Possible values
     * include: 'true', 'false'.
     */
    @JsonProperty(value = "resultTruncated", required = true)
    private ResultTruncated resultTruncated;

    /**
     * When present, the value can be passed to a subsequent query call
     * (together with the same query and subscriptions used in the current
     * request) to retrieve the next page of data.
     */
    @JsonProperty(value = "$skipToken")
    private String skipToken;

    /**
     * Query output in tabular format.
     */
    @JsonProperty(value = "data", required = true)
    private Table data;

    /**
     * Query facets.
     */
    @JsonProperty(value = "facets")
    private List<Facet> facets;

    /**
     * Get number of total records matching the query.
     *
     * @return the totalRecords value
     */
    public long totalRecords() {
        return this.totalRecords;
    }

    /**
     * Set number of total records matching the query.
     *
     * @param totalRecords the totalRecords value to set
     * @return the QueryResponseInner object itself.
     */
    public QueryResponseInner withTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * Get number of records returned in the current response. In the case of paging, this is the number of records in the current page.
     *
     * @return the count value
     */
    public long count() {
        return this.count;
    }

    /**
     * Set number of records returned in the current response. In the case of paging, this is the number of records in the current page.
     *
     * @param count the count value to set
     * @return the QueryResponseInner object itself.
     */
    public QueryResponseInner withCount(long count) {
        this.count = count;
        return this;
    }

    /**
     * Get indicates whether the query results are truncated. Possible values include: 'true', 'false'.
     *
     * @return the resultTruncated value
     */
    public ResultTruncated resultTruncated() {
        return this.resultTruncated;
    }

    /**
     * Set indicates whether the query results are truncated. Possible values include: 'true', 'false'.
     *
     * @param resultTruncated the resultTruncated value to set
     * @return the QueryResponseInner object itself.
     */
    public QueryResponseInner withResultTruncated(ResultTruncated resultTruncated) {
        this.resultTruncated = resultTruncated;
        return this;
    }

    /**
     * Get when present, the value can be passed to a subsequent query call (together with the same query and subscriptions used in the current request) to retrieve the next page of data.
     *
     * @return the skipToken value
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set when present, the value can be passed to a subsequent query call (together with the same query and subscriptions used in the current request) to retrieve the next page of data.
     *
     * @param skipToken the skipToken value to set
     * @return the QueryResponseInner object itself.
     */
    public QueryResponseInner withSkipToken(String skipToken) {
        this.skipToken = skipToken;
        return this;
    }

    /**
     * Get query output in tabular format.
     *
     * @return the data value
     */
    public Table data() {
        return this.data;
    }

    /**
     * Set query output in tabular format.
     *
     * @param data the data value to set
     * @return the QueryResponseInner object itself.
     */
    public QueryResponseInner withData(Table data) {
        this.data = data;
        return this;
    }

    /**
     * Get query facets.
     *
     * @return the facets value
     */
    public List<Facet> facets() {
        return this.facets;
    }

    /**
     * Set query facets.
     *
     * @param facets the facets value to set
     * @return the QueryResponseInner object itself.
     */
    public QueryResponseInner withFacets(List<Facet> facets) {
        this.facets = facets;
        return this;
    }

}
