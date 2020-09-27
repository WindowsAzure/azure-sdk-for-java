// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** A rule condition based on a metric crossing a threshold. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata\\.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition")
@JsonFlatten
@Fluent
public class ThresholdRuleCondition extends RuleCondition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ThresholdRuleCondition.class);

    /*
     * the operator used to compare the data and the threshold.
     */
    @JsonProperty(value = "operator", required = true)
    private ConditionOperator operator;

    /*
     * the threshold value that activates the alert.
     */
    @JsonProperty(value = "threshold", required = true)
    private double threshold;

    /*
     * the period of time (in ISO 8601 duration format) that is used to monitor
     * alert activity based on the threshold. If specified then it must be
     * between 5 minutes and 1 day.
     */
    @JsonProperty(value = "windowSize")
    private Duration windowSize;

    /*
     * the time aggregation operator. How the data that are collected should be
     * combined over time. The default value is the PrimaryAggregationType of
     * the Metric.
     */
    @JsonProperty(value = "timeAggregation")
    private TimeAggregationOperator timeAggregation;

    /**
     * Get the operator property: the operator used to compare the data and the threshold.
     *
     * @return the operator value.
     */
    public ConditionOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: the operator used to compare the data and the threshold.
     *
     * @param operator the operator value to set.
     * @return the ThresholdRuleCondition object itself.
     */
    public ThresholdRuleCondition withOperator(ConditionOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold property: the threshold value that activates the alert.
     *
     * @return the threshold value.
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: the threshold value that activates the alert.
     *
     * @param threshold the threshold value to set.
     * @return the ThresholdRuleCondition object itself.
     */
    public ThresholdRuleCondition withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     *
     * @return the windowSize value.
     */
    public Duration windowSize() {
        return this.windowSize;
    }

    /**
     * Set the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     *
     * @param windowSize the windowSize value to set.
     * @return the ThresholdRuleCondition object itself.
     */
    public ThresholdRuleCondition withWindowSize(Duration windowSize) {
        this.windowSize = windowSize;
        return this;
    }

    /**
     * Get the timeAggregation property: the time aggregation operator. How the data that are collected should be
     * combined over time. The default value is the PrimaryAggregationType of the Metric.
     *
     * @return the timeAggregation value.
     */
    public TimeAggregationOperator timeAggregation() {
        return this.timeAggregation;
    }

    /**
     * Set the timeAggregation property: the time aggregation operator. How the data that are collected should be
     * combined over time. The default value is the PrimaryAggregationType of the Metric.
     *
     * @param timeAggregation the timeAggregation value to set.
     * @return the ThresholdRuleCondition object itself.
     */
    public ThresholdRuleCondition withTimeAggregation(TimeAggregationOperator timeAggregation) {
        this.timeAggregation = timeAggregation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model ThresholdRuleCondition"));
        }
    }
}
