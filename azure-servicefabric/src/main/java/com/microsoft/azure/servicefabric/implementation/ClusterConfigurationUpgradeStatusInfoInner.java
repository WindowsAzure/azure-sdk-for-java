/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.UpgradeState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a standalone cluster configuration upgrade status.
 */
public class ClusterConfigurationUpgradeStatusInfoInner {
    /**
     * The state of the upgrade domain. Possible values include: 'Invalid',
     * 'RollingBackInProgress', 'RollingBackCompleted',
     * 'RollingForwardPending', 'RollingForwardInProgress',
     * 'RollingForwardCompleted', 'Failed'.
     */
    @JsonProperty(value = "UpgradeState")
    private UpgradeState upgradeState;

    /**
     * The cluster manifest version.
     */
    @JsonProperty(value = "ProgressStatus")
    private Integer progressStatus;

    /**
     * The cluster configuration version.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * The cluster upgrade status details.
     */
    @JsonProperty(value = "Details")
    private String details;

    /**
     * Get the state of the upgrade domain. Possible values include: 'Invalid', 'RollingBackInProgress', 'RollingBackCompleted', 'RollingForwardPending', 'RollingForwardInProgress', 'RollingForwardCompleted', 'Failed'.
     *
     * @return the upgradeState value
     */
    public UpgradeState upgradeState() {
        return this.upgradeState;
    }

    /**
     * Set the state of the upgrade domain. Possible values include: 'Invalid', 'RollingBackInProgress', 'RollingBackCompleted', 'RollingForwardPending', 'RollingForwardInProgress', 'RollingForwardCompleted', 'Failed'.
     *
     * @param upgradeState the upgradeState value to set
     * @return the ClusterConfigurationUpgradeStatusInfoInner object itself.
     */
    public ClusterConfigurationUpgradeStatusInfoInner withUpgradeState(UpgradeState upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the cluster manifest version.
     *
     * @return the progressStatus value
     */
    public Integer progressStatus() {
        return this.progressStatus;
    }

    /**
     * Set the cluster manifest version.
     *
     * @param progressStatus the progressStatus value to set
     * @return the ClusterConfigurationUpgradeStatusInfoInner object itself.
     */
    public ClusterConfigurationUpgradeStatusInfoInner withProgressStatus(Integer progressStatus) {
        this.progressStatus = progressStatus;
        return this;
    }

    /**
     * Get the cluster configuration version.
     *
     * @return the configVersion value
     */
    public String configVersion() {
        return this.configVersion;
    }

    /**
     * Set the cluster configuration version.
     *
     * @param configVersion the configVersion value to set
     * @return the ClusterConfigurationUpgradeStatusInfoInner object itself.
     */
    public ClusterConfigurationUpgradeStatusInfoInner withConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    /**
     * Get the cluster upgrade status details.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the cluster upgrade status details.
     *
     * @param details the details value to set
     * @return the ClusterConfigurationUpgradeStatusInfoInner object itself.
     */
    public ClusterConfigurationUpgradeStatusInfoInner withDetails(String details) {
        this.details = details;
        return this;
    }

}
