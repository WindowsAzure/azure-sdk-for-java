// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricBaselinesResponse model. */
@Fluent
public final class MetricBaselinesResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricBaselinesResponseInner.class);

    /*
     * The list of metric baselines.
     */
    @JsonProperty(value = "value")
    private List<SingleMetricBaselineInner> value;

    /**
     * Get the value property: The list of metric baselines.
     *
     * @return the value value.
     */
    public List<SingleMetricBaselineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of metric baselines.
     *
     * @param value the value value to set.
     * @return the MetricBaselinesResponseInner object itself.
     */
    public MetricBaselinesResponseInner withValue(List<SingleMetricBaselineInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
