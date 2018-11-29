/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a health policy used to evaluate the health of the cluster during a
 * cluster upgrade.
 */
public class ClusterUpgradeHealthPolicyObject {
    /**
     * The maximum allowed percentage of nodes health degradation allowed
     * during cluster upgrades. The delta is measured between the state of the
     * nodes at the beginning of upgrade and the state of the nodes at the time
     * of the health evaluation. The check is performed after every upgrade
     * domain upgrade completion to make sure the global state of the cluster
     * is within tolerated limits. The default value is 10%.
     */
    @JsonProperty(value = "MaxPercentDeltaUnhealthyNodes")
    private Integer maxPercentDeltaUnhealthyNodes;

    /**
     * The maximum allowed percentage of upgrade domain nodes health
     * degradation allowed during cluster upgrades. The delta is measured
     * between the state of the upgrade domain nodes at the beginning of
     * upgrade and the state of the upgrade domain nodes at the time of the
     * health evaluation. The check is performed after every upgrade domain
     * upgrade completion for all completed upgrade domains to make sure the
     * state of the upgrade domains is within tolerated limits. The default
     * value is 15%.
     */
    @JsonProperty(value = "MaxPercentUpgradeDomainDeltaUnhealthyNodes")
    private Integer maxPercentUpgradeDomainDeltaUnhealthyNodes;

    /**
     * Get the maximum allowed percentage of nodes health degradation allowed during cluster upgrades. The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation. The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. The default value is 10%.
     *
     * @return the maxPercentDeltaUnhealthyNodes value
     */
    public Integer maxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * Set the maximum allowed percentage of nodes health degradation allowed during cluster upgrades. The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation. The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. The default value is 10%.
     *
     * @param maxPercentDeltaUnhealthyNodes the maxPercentDeltaUnhealthyNodes value to set
     * @return the ClusterUpgradeHealthPolicyObject object itself.
     */
    public ClusterUpgradeHealthPolicyObject withMaxPercentDeltaUnhealthyNodes(Integer maxPercentDeltaUnhealthyNodes) {
        this.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
        return this;
    }

    /**
     * Get the maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades. The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation. The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits. The default value is 15%.
     *
     * @return the maxPercentUpgradeDomainDeltaUnhealthyNodes value
     */
    public Integer maxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    /**
     * Set the maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades. The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation. The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits. The default value is 15%.
     *
     * @param maxPercentUpgradeDomainDeltaUnhealthyNodes the maxPercentUpgradeDomainDeltaUnhealthyNodes value to set
     * @return the ClusterUpgradeHealthPolicyObject object itself.
     */
    public ClusterUpgradeHealthPolicyObject withMaxPercentUpgradeDomainDeltaUnhealthyNodes(Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = maxPercentUpgradeDomainDeltaUnhealthyNodes;
        return this;
    }

}
