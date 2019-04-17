/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Successfully executed facet containing additional statistics on the response
 * of a query.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("FacetResult")
public class FacetResult extends Facet {
    /**
     * Number of total records in the facet results.
     */
    @JsonProperty(value = "totalRecords", required = true)
    private long totalRecords;

    /**
     * Number of records returned in the facet response.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /**
     * A table containing the desired facets. Only present if the facet is
     * valid.
     */
    @JsonProperty(value = "data", required = true)
    private Table data;

    /**
     * Get number of total records in the facet results.
     *
     * @return the totalRecords value
     */
    public long totalRecords() {
        return this.totalRecords;
    }

    /**
     * Set number of total records in the facet results.
     *
     * @param totalRecords the totalRecords value to set
     * @return the FacetResult object itself.
     */
    public FacetResult withTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * Get number of records returned in the facet response.
     *
     * @return the count value
     */
    public int count() {
        return this.count;
    }

    /**
     * Set number of records returned in the facet response.
     *
     * @param count the count value to set
     * @return the FacetResult object itself.
     */
    public FacetResult withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get a table containing the desired facets. Only present if the facet is valid.
     *
     * @return the data value
     */
    public Table data() {
        return this.data;
    }

    /**
     * Set a table containing the desired facets. Only present if the facet is valid.
     *
     * @param data the data value to set
     * @return the FacetResult object itself.
     */
    public FacetResult withData(Table data) {
        this.data = data;
        return this;
    }

}
