/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents health evaluation for cluster nodes in an upgrade domain,
 * containing health evaluations for each unhealthy node that impacted current
 * aggregated health state. Can be returned when evaluating cluster health
 * during cluster upgrade and the aggregated health state is either Error or
 * Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("UpgradeDomainNodes")
public class UpgradeDomainNodesHealthEvaluation extends HealthEvaluation {
    /**
     * Name of the upgrade domain where nodes health is currently evaluated.
     */
    @JsonProperty(value = "UpgradeDomainName")
    private String upgradeDomainName;

    /**
     * Maximum allowed percentage of unhealthy nodes from the
     * ClusterHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyNodes")
    private Integer maxPercentUnhealthyNodes;

    /**
     * Total number of nodes in the current upgrade domain.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /**
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy NodeHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get name of the upgrade domain where nodes health is currently evaluated.
     *
     * @return the upgradeDomainName value
     */
    public String upgradeDomainName() {
        return this.upgradeDomainName;
    }

    /**
     * Set name of the upgrade domain where nodes health is currently evaluated.
     *
     * @param upgradeDomainName the upgradeDomainName value to set
     * @return the UpgradeDomainNodesHealthEvaluation object itself.
     */
    public UpgradeDomainNodesHealthEvaluation withUpgradeDomainName(String upgradeDomainName) {
        this.upgradeDomainName = upgradeDomainName;
        return this;
    }

    /**
     * Get maximum allowed percentage of unhealthy nodes from the ClusterHealthPolicy.
     *
     * @return the maxPercentUnhealthyNodes value
     */
    public Integer maxPercentUnhealthyNodes() {
        return this.maxPercentUnhealthyNodes;
    }

    /**
     * Set maximum allowed percentage of unhealthy nodes from the ClusterHealthPolicy.
     *
     * @param maxPercentUnhealthyNodes the maxPercentUnhealthyNodes value to set
     * @return the UpgradeDomainNodesHealthEvaluation object itself.
     */
    public UpgradeDomainNodesHealthEvaluation withMaxPercentUnhealthyNodes(Integer maxPercentUnhealthyNodes) {
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
        return this;
    }

    /**
     * Get total number of nodes in the current upgrade domain.
     *
     * @return the totalCount value
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Set total number of nodes in the current upgrade domain.
     *
     * @param totalCount the totalCount value to set
     * @return the UpgradeDomainNodesHealthEvaluation object itself.
     */
    public UpgradeDomainNodesHealthEvaluation withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get list of unhealthy evaluations that led to the aggregated health state. Includes all the unhealthy NodeHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set list of unhealthy evaluations that led to the aggregated health state. Includes all the unhealthy NodeHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the UpgradeDomainNodesHealthEvaluation object itself.
     */
    public UpgradeDomainNodesHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}
