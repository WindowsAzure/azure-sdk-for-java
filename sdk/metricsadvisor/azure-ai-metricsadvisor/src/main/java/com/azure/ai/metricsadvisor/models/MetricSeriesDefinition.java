// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.ai.metricsadvisor.implementation.util.MetricSeriesDefinitionHelper;

/** The MetricSeriesDefinition model. */
public final class MetricSeriesDefinition {
    /*
     * metric unique id
     */
    private String metricId;

    /*
     * dimension name and value pair
     */
    private DimensionKey seriesKey;

    static {
        MetricSeriesDefinitionHelper.setAccessor(new MetricSeriesDefinitionHelper.MetricSeriesDefinitionAccessor() {
            @Override
            public void setMetricId(MetricSeriesDefinition seriesDefinition, String metricId) {
                seriesDefinition.setMetricId(metricId);
            }

            @Override
            public void setSeriesKey(MetricSeriesDefinition seriesDefinition, DimensionKey seriesKey) {
                seriesDefinition.setSeriesKey(seriesKey);
            }
        });
    }

    /**
     * Get the metric unique id.
     *
     * @return the metricId value.
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * Get the dimension name and value pair.
     *
     * @return the dimension value.
     */
    public DimensionKey getSeriesKey() {
        return this.seriesKey;
    }

    void setMetricId(String metricId) {
        this.metricId = metricId;
    }

    void setSeriesKey(DimensionKey seriesKey) {
        this.seriesKey = seriesKey;
    }
}
