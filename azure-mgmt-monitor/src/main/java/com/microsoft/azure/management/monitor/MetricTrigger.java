/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The trigger that results in a scaling action.
 */
public class MetricTrigger {
    /**
     * the name of the metric that defines what the rule monitors.
     */
    @JsonProperty(value = "metricName", required = true)
    private String metricName;

    /**
     * the resource identifier of the resource the rule monitors.
     */
    @JsonProperty(value = "metricResourceUri", required = true)
    private String metricResourceUri;

    /**
     * the granularity of metrics the rule monitors. Must be one of the
     * predefined values returned from metric definitions for the metric. Must
     * be between 12 hours and 1 minute.
     */
    @JsonProperty(value = "timeGrain", required = true)
    private Period timeGrain;

    /**
     * the metric statistic type. How the metrics from multiple instances are
     * combined. Possible values include: 'Average', 'Min', 'Max', 'Sum'.
     */
    @JsonProperty(value = "statistic", required = true)
    private MetricStatisticType statistic;

    /**
     * the range of time in which instance data is collected. This value must
     * be greater than the delay in metric collection, which can vary from
     * resource-to-resource. Must be between 12 hours and 5 minutes.
     */
    @JsonProperty(value = "timeWindow", required = true)
    private Period timeWindow;

    /**
     * time aggregation type. How the data that is collected should be combined
     * over time. The default value is Average. Possible values include:
     * 'Average', 'Minimum', 'Maximum', 'Total', 'Count'.
     */
    @JsonProperty(value = "timeAggregation", required = true)
    private TimeAggregationType timeAggregation;

    /**
     * the operator that is used to compare the metric data and the threshold.
     * Possible values include: 'Equals', 'NotEquals', 'GreaterThan',
     * 'GreaterThanOrEqual', 'LessThan', 'LessThanOrEqual'.
     */
    @JsonProperty(value = "operator", required = true)
    private ComparisonOperationType operator;

    /**
     * the threshold of the metric that triggers the scale action.
     */
    @JsonProperty(value = "threshold", required = true)
    private double threshold;

    /**
     * Get the metricName value.
     *
     * @return the metricName value
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName value.
     *
     * @param metricName the metricName value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the metricResourceUri value.
     *
     * @return the metricResourceUri value
     */
    public String metricResourceUri() {
        return this.metricResourceUri;
    }

    /**
     * Set the metricResourceUri value.
     *
     * @param metricResourceUri the metricResourceUri value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withMetricResourceUri(String metricResourceUri) {
        this.metricResourceUri = metricResourceUri;
        return this;
    }

    /**
     * Get the timeGrain value.
     *
     * @return the timeGrain value
     */
    public Period timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain value.
     *
     * @param timeGrain the timeGrain value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withTimeGrain(Period timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the statistic value.
     *
     * @return the statistic value
     */
    public MetricStatisticType statistic() {
        return this.statistic;
    }

    /**
     * Set the statistic value.
     *
     * @param statistic the statistic value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withStatistic(MetricStatisticType statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * Get the timeWindow value.
     *
     * @return the timeWindow value
     */
    public Period timeWindow() {
        return this.timeWindow;
    }

    /**
     * Set the timeWindow value.
     *
     * @param timeWindow the timeWindow value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withTimeWindow(Period timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }

    /**
     * Get the timeAggregation value.
     *
     * @return the timeAggregation value
     */
    public TimeAggregationType timeAggregation() {
        return this.timeAggregation;
    }

    /**
     * Set the timeAggregation value.
     *
     * @param timeAggregation the timeAggregation value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withTimeAggregation(TimeAggregationType timeAggregation) {
        this.timeAggregation = timeAggregation;
        return this;
    }

    /**
     * Get the operator value.
     *
     * @return the operator value
     */
    public ComparisonOperationType operator() {
        return this.operator;
    }

    /**
     * Set the operator value.
     *
     * @param operator the operator value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withOperator(ComparisonOperationType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold value.
     *
     * @return the threshold value
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold value.
     *
     * @param threshold the threshold value to set
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

}
