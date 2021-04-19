// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Evaluation results for the provided partial resource content. */
@Fluent
public final class CheckRestrictionsResultContentEvaluationResult {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CheckRestrictionsResultContentEvaluationResult.class);

    /*
     * Policy evaluation results against the given resource content. This will
     * indicate if the partial content that was provided will be denied as-is.
     */
    @JsonProperty(value = "policyEvaluations")
    private List<PolicyEvaluationResult> policyEvaluations;

    /**
     * Get the policyEvaluations property: Policy evaluation results against the given resource content. This will
     * indicate if the partial content that was provided will be denied as-is.
     *
     * @return the policyEvaluations value.
     */
    public List<PolicyEvaluationResult> policyEvaluations() {
        return this.policyEvaluations;
    }

    /**
     * Set the policyEvaluations property: Policy evaluation results against the given resource content. This will
     * indicate if the partial content that was provided will be denied as-is.
     *
     * @param policyEvaluations the policyEvaluations value to set.
     * @return the CheckRestrictionsResultContentEvaluationResult object itself.
     */
    public CheckRestrictionsResultContentEvaluationResult withPolicyEvaluations(
        List<PolicyEvaluationResult> policyEvaluations) {
        this.policyEvaluations = policyEvaluations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyEvaluations() != null) {
            policyEvaluations().forEach(e -> e.validate());
        }
    }
}
