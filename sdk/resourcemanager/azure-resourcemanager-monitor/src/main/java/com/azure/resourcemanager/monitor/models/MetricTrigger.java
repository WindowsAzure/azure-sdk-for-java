// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** The trigger that results in a scaling action. */
@Fluent
public final class MetricTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricTrigger.class);

    /*
     * the name of the metric that defines what the rule monitors.
     */
    @JsonProperty(value = "metricName", required = true)
    private String metricName;

    /*
     * the namespace of the metric that defines what the rule monitors.
     */
    @JsonProperty(value = "metricNamespace")
    private String metricNamespace;

    /*
     * the resource identifier of the resource the rule monitors.
     */
    @JsonProperty(value = "metricResourceUri", required = true)
    private String metricResourceUri;

    /*
     * the granularity of metrics the rule monitors. Must be one of the
     * predefined values returned from metric definitions for the metric. Must
     * be between 12 hours and 1 minute.
     */
    @JsonProperty(value = "timeGrain", required = true)
    private Duration timeGrain;

    /*
     * the metric statistic type. How the metrics from multiple instances are
     * combined.
     */
    @JsonProperty(value = "statistic", required = true)
    private MetricStatisticType statistic;

    /*
     * the range of time in which instance data is collected. This value must
     * be greater than the delay in metric collection, which can vary from
     * resource-to-resource. Must be between 12 hours and 5 minutes.
     */
    @JsonProperty(value = "timeWindow", required = true)
    private Duration timeWindow;

    /*
     * time aggregation type. How the data that is collected should be combined
     * over time. The default value is Average.
     */
    @JsonProperty(value = "timeAggregation", required = true)
    private TimeAggregationType timeAggregation;

    /*
     * the operator that is used to compare the metric data and the threshold.
     */
    @JsonProperty(value = "operator", required = true)
    private ComparisonOperationType operator;

    /*
     * the threshold of the metric that triggers the scale action.
     */
    @JsonProperty(value = "threshold", required = true)
    private double threshold;

    /*
     * List of dimension conditions. For example:
     * [{"DimensionName":"AppName","Operator":"Equals","Values":["App1"]},{"DimensionName":"Deployment""
         + ","Operator":"Equals","Values":["default"]}].
     */
    @JsonProperty(value = "dimensions")
    private List<ScaleRuleMetricDimension> dimensions;

    /**
     * Get the metricName property: the name of the metric that defines what the rule monitors.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: the name of the metric that defines what the rule monitors.
     *
     * @param metricName the metricName value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the metricNamespace property: the namespace of the metric that defines what the rule monitors.
     *
     * @return the metricNamespace value.
     */
    public String metricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Set the metricNamespace property: the namespace of the metric that defines what the rule monitors.
     *
     * @param metricNamespace the metricNamespace value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * Get the metricResourceUri property: the resource identifier of the resource the rule monitors.
     *
     * @return the metricResourceUri value.
     */
    public String metricResourceUri() {
        return this.metricResourceUri;
    }

    /**
     * Set the metricResourceUri property: the resource identifier of the resource the rule monitors.
     *
     * @param metricResourceUri the metricResourceUri value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withMetricResourceUri(String metricResourceUri) {
        this.metricResourceUri = metricResourceUri;
        return this;
    }

    /**
     * Get the timeGrain property: the granularity of metrics the rule monitors. Must be one of the predefined values
     * returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
     *
     * @return the timeGrain value.
     */
    public Duration timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: the granularity of metrics the rule monitors. Must be one of the predefined values
     * returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withTimeGrain(Duration timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the statistic property: the metric statistic type. How the metrics from multiple instances are combined.
     *
     * @return the statistic value.
     */
    public MetricStatisticType statistic() {
        return this.statistic;
    }

    /**
     * Set the statistic property: the metric statistic type. How the metrics from multiple instances are combined.
     *
     * @param statistic the statistic value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withStatistic(MetricStatisticType statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * Get the timeWindow property: the range of time in which instance data is collected. This value must be greater
     * than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5
     * minutes.
     *
     * @return the timeWindow value.
     */
    public Duration timeWindow() {
        return this.timeWindow;
    }

    /**
     * Set the timeWindow property: the range of time in which instance data is collected. This value must be greater
     * than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5
     * minutes.
     *
     * @param timeWindow the timeWindow value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withTimeWindow(Duration timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }

    /**
     * Get the timeAggregation property: time aggregation type. How the data that is collected should be combined over
     * time. The default value is Average.
     *
     * @return the timeAggregation value.
     */
    public TimeAggregationType timeAggregation() {
        return this.timeAggregation;
    }

    /**
     * Set the timeAggregation property: time aggregation type. How the data that is collected should be combined over
     * time. The default value is Average.
     *
     * @param timeAggregation the timeAggregation value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withTimeAggregation(TimeAggregationType timeAggregation) {
        this.timeAggregation = timeAggregation;
        return this;
    }

    /**
     * Get the operator property: the operator that is used to compare the metric data and the threshold.
     *
     * @return the operator value.
     */
    public ComparisonOperationType operator() {
        return this.operator;
    }

    /**
     * Set the operator property: the operator that is used to compare the metric data and the threshold.
     *
     * @param operator the operator value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withOperator(ComparisonOperationType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold property: the threshold of the metric that triggers the scale action.
     *
     * @return the threshold value.
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: the threshold of the metric that triggers the scale action.
     *
     * @param threshold the threshold value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the dimensions property: List of dimension conditions. For example:
     * [{"DimensionName":"AppName","Operator":"Equals","Values":["App1"]},{"DimensionName":"Deployment""
         + ","Operator":"Equals","Values":["default"]}].
     *
     * @return the dimensions value.
     */
    public List<ScaleRuleMetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: List of dimension conditions. For example:
     * [{"DimensionName":"AppName","Operator":"Equals","Values":["App1"]},{"DimensionName":"Deployment""
         + ","Operator":"Equals","Values":["default"]}].
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricTrigger object itself.
     */
    public MetricTrigger withDimensions(List<ScaleRuleMetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property metricName in model MetricTrigger"));
        }
        if (metricResourceUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property metricResourceUri in model MetricTrigger"));
        }
        if (timeGrain() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeGrain in model MetricTrigger"));
        }
        if (statistic() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property statistic in model MetricTrigger"));
        }
        if (timeWindow() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeWindow in model MetricTrigger"));
        }
        if (timeAggregation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeAggregation in model MetricTrigger"));
        }
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model MetricTrigger"));
        }
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
