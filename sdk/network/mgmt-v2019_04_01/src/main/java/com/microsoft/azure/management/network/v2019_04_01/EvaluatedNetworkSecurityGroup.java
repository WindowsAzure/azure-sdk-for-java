/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Results of network security group evaluation.
 */
public class EvaluatedNetworkSecurityGroup {
    /**
     * Network security group ID.
     */
    @JsonProperty(value = "networkSecurityGroupId")
    private String networkSecurityGroupId;

    /**
     * Resource ID of nic or subnet to which network security group is applied.
     */
    @JsonProperty(value = "appliedTo")
    private String appliedTo;

    /**
     * Matched network security rule.
     */
    @JsonProperty(value = "matchedRule")
    private MatchedRule matchedRule;

    /**
     * List of network security rules evaluation results.
     */
    @JsonProperty(value = "rulesEvaluationResult", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkSecurityRulesEvaluationResult> rulesEvaluationResult;

    /**
     * Get network security group ID.
     *
     * @return the networkSecurityGroupId value
     */
    public String networkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }

    /**
     * Set network security group ID.
     *
     * @param networkSecurityGroupId the networkSecurityGroupId value to set
     * @return the EvaluatedNetworkSecurityGroup object itself.
     */
    public EvaluatedNetworkSecurityGroup withNetworkSecurityGroupId(String networkSecurityGroupId) {
        this.networkSecurityGroupId = networkSecurityGroupId;
        return this;
    }

    /**
     * Get resource ID of nic or subnet to which network security group is applied.
     *
     * @return the appliedTo value
     */
    public String appliedTo() {
        return this.appliedTo;
    }

    /**
     * Set resource ID of nic or subnet to which network security group is applied.
     *
     * @param appliedTo the appliedTo value to set
     * @return the EvaluatedNetworkSecurityGroup object itself.
     */
    public EvaluatedNetworkSecurityGroup withAppliedTo(String appliedTo) {
        this.appliedTo = appliedTo;
        return this;
    }

    /**
     * Get matched network security rule.
     *
     * @return the matchedRule value
     */
    public MatchedRule matchedRule() {
        return this.matchedRule;
    }

    /**
     * Set matched network security rule.
     *
     * @param matchedRule the matchedRule value to set
     * @return the EvaluatedNetworkSecurityGroup object itself.
     */
    public EvaluatedNetworkSecurityGroup withMatchedRule(MatchedRule matchedRule) {
        this.matchedRule = matchedRule;
        return this;
    }

    /**
     * Get list of network security rules evaluation results.
     *
     * @return the rulesEvaluationResult value
     */
    public List<NetworkSecurityRulesEvaluationResult> rulesEvaluationResult() {
        return this.rulesEvaluationResult;
    }

}
