// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The rule result adjusted with baseline. */
@Fluent
public final class BaselineAdjustedResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BaselineAdjustedResult.class);

    /*
     * Baseline details.
     */
    @JsonProperty(value = "baseline")
    private Baseline baseline;

    /*
     * The rule result status.
     */
    @JsonProperty(value = "status")
    private RuleStatus status;

    /*
     * Results the are not in baseline.
     */
    @JsonProperty(value = "resultsNotInBaseline")
    private List<List<String>> resultsNotInBaseline;

    /*
     * Results the are in baseline.
     */
    @JsonProperty(value = "resultsOnlyInBaseline")
    private List<List<String>> resultsOnlyInBaseline;

    /**
     * Get the baseline property: Baseline details.
     *
     * @return the baseline value.
     */
    public Baseline baseline() {
        return this.baseline;
    }

    /**
     * Set the baseline property: Baseline details.
     *
     * @param baseline the baseline value to set.
     * @return the BaselineAdjustedResult object itself.
     */
    public BaselineAdjustedResult withBaseline(Baseline baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * Get the status property: The rule result status.
     *
     * @return the status value.
     */
    public RuleStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The rule result status.
     *
     * @param status the status value to set.
     * @return the BaselineAdjustedResult object itself.
     */
    public BaselineAdjustedResult withStatus(RuleStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the resultsNotInBaseline property: Results the are not in baseline.
     *
     * @return the resultsNotInBaseline value.
     */
    public List<List<String>> resultsNotInBaseline() {
        return this.resultsNotInBaseline;
    }

    /**
     * Set the resultsNotInBaseline property: Results the are not in baseline.
     *
     * @param resultsNotInBaseline the resultsNotInBaseline value to set.
     * @return the BaselineAdjustedResult object itself.
     */
    public BaselineAdjustedResult withResultsNotInBaseline(List<List<String>> resultsNotInBaseline) {
        this.resultsNotInBaseline = resultsNotInBaseline;
        return this;
    }

    /**
     * Get the resultsOnlyInBaseline property: Results the are in baseline.
     *
     * @return the resultsOnlyInBaseline value.
     */
    public List<List<String>> resultsOnlyInBaseline() {
        return this.resultsOnlyInBaseline;
    }

    /**
     * Set the resultsOnlyInBaseline property: Results the are in baseline.
     *
     * @param resultsOnlyInBaseline the resultsOnlyInBaseline value to set.
     * @return the BaselineAdjustedResult object itself.
     */
    public BaselineAdjustedResult withResultsOnlyInBaseline(List<List<String>> resultsOnlyInBaseline) {
        this.resultsOnlyInBaseline = resultsOnlyInBaseline;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (baseline() != null) {
            baseline().validate();
        }
    }
}
