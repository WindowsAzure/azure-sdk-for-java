/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Policy definition group summary.
 */
public class PolicyGroupSummary {
    /**
     * Policy group name.
     */
    @JsonProperty(value = "policyGroupName")
    private String policyGroupName;

    /**
     * Compliance summary for the policy definition group.
     */
    @JsonProperty(value = "results")
    private SummaryResults results;

    /**
     * Get policy group name.
     *
     * @return the policyGroupName value
     */
    public String policyGroupName() {
        return this.policyGroupName;
    }

    /**
     * Set policy group name.
     *
     * @param policyGroupName the policyGroupName value to set
     * @return the PolicyGroupSummary object itself.
     */
    public PolicyGroupSummary withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * Get compliance summary for the policy definition group.
     *
     * @return the results value
     */
    public SummaryResults results() {
        return this.results;
    }

    /**
     * Set compliance summary for the policy definition group.
     *
     * @param results the results value to set
     * @return the PolicyGroupSummary object itself.
     */
    public PolicyGroupSummary withResults(SummaryResults results) {
        this.results = results;
        return this;
    }

}
