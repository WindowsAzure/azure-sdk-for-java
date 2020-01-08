/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Policy definition summary.
 */
public class PolicyDefinitionSummary {
    /**
     * Policy definition ID.
     */
    @JsonProperty(value = "policyDefinitionId")
    private String policyDefinitionId;

    /**
     * Policy definition reference ID.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /**
     * Policy definition group names.
     */
    @JsonProperty(value = "policyDefinitionGroupNames")
    private List<String> policyDefinitionGroupNames;

    /**
     * Policy effect, i.e. policy definition action.
     */
    @JsonProperty(value = "effect")
    private String effect;

    /**
     * Compliance summary for the policy definition.
     */
    @JsonProperty(value = "results")
    private SummaryResults results;

    /**
     * Get policy definition ID.
     *
     * @return the policyDefinitionId value
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set policy definition ID.
     *
     * @param policyDefinitionId the policyDefinitionId value to set
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get policy definition reference ID.
     *
     * @return the policyDefinitionReferenceId value
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set policy definition reference ID.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Get policy definition group names.
     *
     * @return the policyDefinitionGroupNames value
     */
    public List<String> policyDefinitionGroupNames() {
        return this.policyDefinitionGroupNames;
    }

    /**
     * Set policy definition group names.
     *
     * @param policyDefinitionGroupNames the policyDefinitionGroupNames value to set
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withPolicyDefinitionGroupNames(List<String> policyDefinitionGroupNames) {
        this.policyDefinitionGroupNames = policyDefinitionGroupNames;
        return this;
    }

    /**
     * Get policy effect, i.e. policy definition action.
     *
     * @return the effect value
     */
    public String effect() {
        return this.effect;
    }

    /**
     * Set policy effect, i.e. policy definition action.
     *
     * @param effect the effect value to set
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Get compliance summary for the policy definition.
     *
     * @return the results value
     */
    public SummaryResults results() {
        return this.results;
    }

    /**
     * Set compliance summary for the policy definition.
     *
     * @param results the results value to set
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withResults(SummaryResults results) {
        this.results = results;
        return this;
    }

}
