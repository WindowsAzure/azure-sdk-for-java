// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** AutoScale settings for the pool. */
@Fluent
public final class AutoScaleSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoScaleSettings.class);

    /*
     * A formula for the desired number of compute nodes in the pool.
     */
    @JsonProperty(value = "formula", required = true)
    private String formula;

    /*
     * If omitted, the default value is 15 minutes (PT15M).
     */
    @JsonProperty(value = "evaluationInterval")
    private Duration evaluationInterval;

    /**
     * Get the formula property: A formula for the desired number of compute nodes in the pool.
     *
     * @return the formula value.
     */
    public String formula() {
        return this.formula;
    }

    /**
     * Set the formula property: A formula for the desired number of compute nodes in the pool.
     *
     * @param formula the formula value to set.
     * @return the AutoScaleSettings object itself.
     */
    public AutoScaleSettings withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * Get the evaluationInterval property: If omitted, the default value is 15 minutes (PT15M).
     *
     * @return the evaluationInterval value.
     */
    public Duration evaluationInterval() {
        return this.evaluationInterval;
    }

    /**
     * Set the evaluationInterval property: If omitted, the default value is 15 minutes (PT15M).
     *
     * @param evaluationInterval the evaluationInterval value to set.
     * @return the AutoScaleSettings object itself.
     */
    public AutoScaleSettings withEvaluationInterval(Duration evaluationInterval) {
        this.evaluationInterval = evaluationInterval;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (formula() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property formula in model AutoScaleSettings"));
        }
    }
}
