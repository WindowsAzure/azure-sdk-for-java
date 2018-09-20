/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for a set of operations.
 */
public class QueryOptions {
    /**
     * Maximum number of records to return.
     */
    @JsonProperty(value = "")
    private Integer top;

    /**
     * Ordering expression using OData notation. One or more comma-separated
     * column names with an optional "desc" (the default) or "asc", e.g.
     * "$orderby=PolicyAssignmentId, ResourceId asc".
     */
    @JsonProperty(value = "")
    private String orderBy;

    /**
     * Select expression using OData notation. Limits the columns on each
     * record to just those requested, e.g. "$select=PolicyAssignmentId,
     * ResourceId".
     */
    @JsonProperty(value = "")
    private String select;

    /**
     * ISO 8601 formatted timestamp specifying the start time of the interval
     * to query. When not specified, the service uses ($to - 1-day).
     */
    @JsonProperty(value = "")
    private DateTime from;

    /**
     * ISO 8601 formatted timestamp specifying the end time of the interval to
     * query. When not specified, the service uses request time.
     */
    @JsonProperty(value = "")
    private DateTime to;

    /**
     * OData filter expression.
     */
    @JsonProperty(value = "")
    private String filter;

    /**
     * OData apply expression for aggregations.
     */
    @JsonProperty(value = "")
    private String apply;

    /**
     * Get maximum number of records to return.
     *
     * @return the top value
     */
    public Integer top() {
        return this.top;
    }

    /**
     * Set maximum number of records to return.
     *
     * @param top the top value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get ordering expression using OData notation. One or more comma-separated column names with an optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     *
     * @return the orderBy value
     */
    public String orderBy() {
        return this.orderBy;
    }

    /**
     * Set ordering expression using OData notation. One or more comma-separated column names with an optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     *
     * @param orderBy the orderBy value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get select expression using OData notation. Limits the columns on each record to just those requested, e.g. "$select=PolicyAssignmentId, ResourceId".
     *
     * @return the select value
     */
    public String select() {
        return this.select;
    }

    /**
     * Set select expression using OData notation. Limits the columns on each record to just those requested, e.g. "$select=PolicyAssignmentId, ResourceId".
     *
     * @param select the select value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * Get iSO 8601 formatted timestamp specifying the start time of the interval to query. When not specified, the service uses ($to - 1-day).
     *
     * @return the from value
     */
    public DateTime from() {
        return this.from;
    }

    /**
     * Set iSO 8601 formatted timestamp specifying the start time of the interval to query. When not specified, the service uses ($to - 1-day).
     *
     * @param from the from value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withFrom(DateTime from) {
        this.from = from;
        return this;
    }

    /**
     * Get iSO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the service uses request time.
     *
     * @return the to value
     */
    public DateTime to() {
        return this.to;
    }

    /**
     * Set iSO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the service uses request time.
     *
     * @param to the to value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withTo(DateTime to) {
        this.to = to;
        return this;
    }

    /**
     * Get oData filter expression.
     *
     * @return the filter value
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set oData filter expression.
     *
     * @param filter the filter value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get oData apply expression for aggregations.
     *
     * @return the apply value
     */
    public String apply() {
        return this.apply;
    }

    /**
     * Set oData apply expression for aggregations.
     *
     * @param apply the apply value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withApply(String apply) {
        this.apply = apply;
        return this;
    }

}
