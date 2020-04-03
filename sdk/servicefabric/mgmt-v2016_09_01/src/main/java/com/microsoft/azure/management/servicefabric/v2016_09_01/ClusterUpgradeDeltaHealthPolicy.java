/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Delta health policy for the cluster.
 */
public class ClusterUpgradeDeltaHealthPolicy {
    /**
     * Additional unhealthy nodes percentage.
     */
    @JsonProperty(value = "maxPercentDeltaUnhealthyNodes", required = true)
    private int maxPercentDeltaUnhealthyNodes;

    /**
     * Additional unhealthy nodes percentage per upgrade domain.
     */
    @JsonProperty(value = "maxPercentUpgradeDomainDeltaUnhealthyNodes", required = true)
    private int maxPercentUpgradeDomainDeltaUnhealthyNodes;

    /**
     * Additional unhealthy applications percentage.
     */
    @JsonProperty(value = "maxPercentDeltaUnhealthyApplications", required = true)
    private int maxPercentDeltaUnhealthyApplications;

    /**
     * Get additional unhealthy nodes percentage.
     *
     * @return the maxPercentDeltaUnhealthyNodes value
     */
    public int maxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * Set additional unhealthy nodes percentage.
     *
     * @param maxPercentDeltaUnhealthyNodes the maxPercentDeltaUnhealthyNodes value to set
     * @return the ClusterUpgradeDeltaHealthPolicy object itself.
     */
    public ClusterUpgradeDeltaHealthPolicy withMaxPercentDeltaUnhealthyNodes(int maxPercentDeltaUnhealthyNodes) {
        this.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
        return this;
    }

    /**
     * Get additional unhealthy nodes percentage per upgrade domain.
     *
     * @return the maxPercentUpgradeDomainDeltaUnhealthyNodes value
     */
    public int maxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    /**
     * Set additional unhealthy nodes percentage per upgrade domain.
     *
     * @param maxPercentUpgradeDomainDeltaUnhealthyNodes the maxPercentUpgradeDomainDeltaUnhealthyNodes value to set
     * @return the ClusterUpgradeDeltaHealthPolicy object itself.
     */
    public ClusterUpgradeDeltaHealthPolicy withMaxPercentUpgradeDomainDeltaUnhealthyNodes(int maxPercentUpgradeDomainDeltaUnhealthyNodes) {
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = maxPercentUpgradeDomainDeltaUnhealthyNodes;
        return this;
    }

    /**
     * Get additional unhealthy applications percentage.
     *
     * @return the maxPercentDeltaUnhealthyApplications value
     */
    public int maxPercentDeltaUnhealthyApplications() {
        return this.maxPercentDeltaUnhealthyApplications;
    }

    /**
     * Set additional unhealthy applications percentage.
     *
     * @param maxPercentDeltaUnhealthyApplications the maxPercentDeltaUnhealthyApplications value to set
     * @return the ClusterUpgradeDeltaHealthPolicy object itself.
     */
    public ClusterUpgradeDeltaHealthPolicy withMaxPercentDeltaUnhealthyApplications(int maxPercentDeltaUnhealthyApplications) {
        this.maxPercentDeltaUnhealthyApplications = maxPercentDeltaUnhealthyApplications;
        return this;
    }

}
