/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.v2016_09_01.MetricAvailabilily;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_09_01.ProxyOnlyResource;

/**
 * Metadata for a metric.
 */
@JsonFlatten
public class MetricDefinitionInner extends ProxyOnlyResource {
    /**
     * Name of the metric.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String metricDefinitionName;

    /**
     * Unit of the metric.
     */
    @JsonProperty(value = "properties.unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Primary aggregation type.
     */
    @JsonProperty(value = "properties.primaryAggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAggregationType;

    /**
     * List of time grains supported for the metric together with retention
     * period.
     */
    @JsonProperty(value = "properties.metricAvailabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricAvailabilily> metricAvailabilities;

    /**
     * Friendly name shown in the UI.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Get name of the metric.
     *
     * @return the metricDefinitionName value
     */
    public String metricDefinitionName() {
        return this.metricDefinitionName;
    }

    /**
     * Get unit of the metric.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get primary aggregation type.
     *
     * @return the primaryAggregationType value
     */
    public String primaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Get list of time grains supported for the metric together with retention period.
     *
     * @return the metricAvailabilities value
     */
    public List<MetricAvailabilily> metricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * Get friendly name shown in the UI.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

}
