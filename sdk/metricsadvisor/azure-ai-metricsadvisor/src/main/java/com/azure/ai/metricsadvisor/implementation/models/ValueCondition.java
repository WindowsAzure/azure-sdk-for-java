// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The ValueCondition model. */
@Fluent
public final class ValueCondition {
    /*
     * lower bound
     *
     * should be specified when direction is Both or Down
     */
    @JsonProperty(value = "lower")
    private Double lower;

    /*
     * upper bound
     *
     * should be specified when direction is Both or Up
     */
    @JsonProperty(value = "upper")
    private Double upper;

    /*
     * value filter direction
     */
    @JsonProperty(value = "direction", required = true)
    private Direction direction;

    /*
     * data used to implement value filter
     */
    @JsonProperty(value = "type")
    private ValueType type;

    /*
     * the other metric unique id used for value filter
     */
    @JsonProperty(value = "metricId")
    private UUID metricId;

    /*
     * trigger alert when the corresponding point is missing in the other
     * metric
     *
     * should be specified only when using other metric to filter
     */
    @JsonProperty(value = "triggerForMissing")
    private Boolean triggerForMissing;

    /**
     * Get the lower property: lower bound
     *
     * <p>should be specified when direction is Both or Down.
     *
     * @return the lower value.
     */
    public Double getLower() {
        return this.lower;
    }

    /**
     * Set the lower property: lower bound
     *
     * <p>should be specified when direction is Both or Down.
     *
     * @param lower the lower value to set.
     * @return the ValueCondition object itself.
     */
    public ValueCondition setLower(Double lower) {
        this.lower = lower;
        return this;
    }

    /**
     * Get the upper property: upper bound
     *
     * <p>should be specified when direction is Both or Up.
     *
     * @return the upper value.
     */
    public Double getUpper() {
        return this.upper;
    }

    /**
     * Set the upper property: upper bound
     *
     * <p>should be specified when direction is Both or Up.
     *
     * @param upper the upper value to set.
     * @return the ValueCondition object itself.
     */
    public ValueCondition setUpper(Double upper) {
        this.upper = upper;
        return this;
    }

    /**
     * Get the direction property: value filter direction.
     *
     * @return the direction value.
     */
    public Direction getDirection() {
        return this.direction;
    }

    /**
     * Set the direction property: value filter direction.
     *
     * @param direction the direction value to set.
     * @return the ValueCondition object itself.
     */
    public ValueCondition setDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the type property: data used to implement value filter.
     *
     * @return the type value.
     */
    public ValueType getType() {
        return this.type;
    }

    /**
     * Set the type property: data used to implement value filter.
     *
     * @param type the type value to set.
     * @return the ValueCondition object itself.
     */
    public ValueCondition setType(ValueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the metricId property: the other metric unique id used for value filter.
     *
     * @return the metricId value.
     */
    public UUID getMetricId() {
        return this.metricId;
    }

    /**
     * Set the metricId property: the other metric unique id used for value filter.
     *
     * @param metricId the metricId value to set.
     * @return the ValueCondition object itself.
     */
    public ValueCondition setMetricId(UUID metricId) {
        this.metricId = metricId;
        return this;
    }

    /**
     * Get the triggerForMissing property: trigger alert when the corresponding point is missing in the other metric
     *
     * <p>should be specified only when using other metric to filter.
     *
     * @return the triggerForMissing value.
     */
    public Boolean isTriggerForMissing() {
        return this.triggerForMissing;
    }

    /**
     * Set the triggerForMissing property: trigger alert when the corresponding point is missing in the other metric
     *
     * <p>should be specified only when using other metric to filter.
     *
     * @param triggerForMissing the triggerForMissing value to set.
     * @return the ValueCondition object itself.
     */
    public ValueCondition setTriggerForMissing(Boolean triggerForMissing) {
        this.triggerForMissing = triggerForMissing;
        return this;
    }
}
