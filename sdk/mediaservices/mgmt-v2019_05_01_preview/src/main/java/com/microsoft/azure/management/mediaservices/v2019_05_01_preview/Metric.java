/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metric emitted by service.
 */
public class Metric {
    /**
     * The metric name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The metric display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The metric display description.
     */
    @JsonProperty(value = "displayDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String displayDescription;

    /**
     * The metric unit. Possible values include: 'Bytes', 'Count',
     * 'Milliseconds'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private MetricUnit unit;

    /**
     * The metric aggregation type. Possible values include: 'Average',
     * 'Count', 'Total'.
     */
    @JsonProperty(value = "aggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private MetricAggregationType aggregationType;

    /**
     * The metric dimensions.
     */
    @JsonProperty(value = "dimensions", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricDimension> dimensions;

    /**
     * Get the metric name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the metric display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the metric display description.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Get the metric unit. Possible values include: 'Bytes', 'Count', 'Milliseconds'.
     *
     * @return the unit value
     */
    public MetricUnit unit() {
        return this.unit;
    }

    /**
     * Get the metric aggregation type. Possible values include: 'Average', 'Count', 'Total'.
     *
     * @return the aggregationType value
     */
    public MetricAggregationType aggregationType() {
        return this.aggregationType;
    }

    /**
     * Get the metric dimensions.
     *
     * @return the dimensions value
     */
    public List<MetricDimension> dimensions() {
        return this.dimensions;
    }

}
