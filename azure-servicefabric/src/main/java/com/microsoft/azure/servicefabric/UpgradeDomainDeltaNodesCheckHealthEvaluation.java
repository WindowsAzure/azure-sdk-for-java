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
 * Represents health evaluation for delta unhealthy cluster nodes in an upgrade
 * domain, containing health evaluations for each unhealthy node that impacted
 * current aggregated health state.
 * Can be returned during cluster upgrade when cluster aggregated health state
 * is Warning or Error.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("UpgradeDomainDeltaNodesCheck")
public class UpgradeDomainDeltaNodesCheckHealthEvaluation extends HealthEvaluation {
    /**
     * Name of the upgrade domain where nodes health is currently evaluated.
     */
    @JsonProperty(value = "UpgradeDomainName")
    private String upgradeDomainName;

    /**
     * Number of upgrade domain nodes with aggregated heath state Error in the
     * health store at the beginning of the cluster upgrade.
     */
    @JsonProperty(value = "BaselineErrorCount")
    private Long baselineErrorCount;

    /**
     * Total number of upgrade domain nodes in the health store at the
     * beginning of the cluster upgrade.
     */
    @JsonProperty(value = "BaselineTotalCount")
    private Long baselineTotalCount;

    /**
     * Maximum allowed percentage of upgrade domain delta unhealthy nodes from
     * the ClusterUpgradeHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentDeltaUnhealthyNodes")
    private Integer maxPercentDeltaUnhealthyNodes;

    /**
     * Total number of upgrade domain nodes in the health store.
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
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation withUpgradeDomainName(String upgradeDomainName) {
        this.upgradeDomainName = upgradeDomainName;
        return this;
    }

    /**
     * Get number of upgrade domain nodes with aggregated heath state Error in the health store at the beginning of the cluster upgrade.
     *
     * @return the baselineErrorCount value
     */
    public Long baselineErrorCount() {
        return this.baselineErrorCount;
    }

    /**
     * Set number of upgrade domain nodes with aggregated heath state Error in the health store at the beginning of the cluster upgrade.
     *
     * @param baselineErrorCount the baselineErrorCount value to set
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation withBaselineErrorCount(Long baselineErrorCount) {
        this.baselineErrorCount = baselineErrorCount;
        return this;
    }

    /**
     * Get total number of upgrade domain nodes in the health store at the beginning of the cluster upgrade.
     *
     * @return the baselineTotalCount value
     */
    public Long baselineTotalCount() {
        return this.baselineTotalCount;
    }

    /**
     * Set total number of upgrade domain nodes in the health store at the beginning of the cluster upgrade.
     *
     * @param baselineTotalCount the baselineTotalCount value to set
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation withBaselineTotalCount(Long baselineTotalCount) {
        this.baselineTotalCount = baselineTotalCount;
        return this;
    }

    /**
     * Get maximum allowed percentage of upgrade domain delta unhealthy nodes from the ClusterUpgradeHealthPolicy.
     *
     * @return the maxPercentDeltaUnhealthyNodes value
     */
    public Integer maxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * Set maximum allowed percentage of upgrade domain delta unhealthy nodes from the ClusterUpgradeHealthPolicy.
     *
     * @param maxPercentDeltaUnhealthyNodes the maxPercentDeltaUnhealthyNodes value to set
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation withMaxPercentDeltaUnhealthyNodes(Integer maxPercentDeltaUnhealthyNodes) {
        this.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
        return this;
    }

    /**
     * Get total number of upgrade domain nodes in the health store.
     *
     * @return the totalCount value
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Set total number of upgrade domain nodes in the health store.
     *
     * @param totalCount the totalCount value to set
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation withTotalCount(Long totalCount) {
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
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}
