/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.List;
import com.microsoft.azure.servicefabric.UpgradeDomainInfo;
import com.microsoft.azure.servicefabric.UpgradeState;
import com.microsoft.azure.servicefabric.UpgradeMode;
import com.microsoft.azure.servicefabric.ClusterUpgradeDescriptionObject;
import com.microsoft.azure.servicefabric.HealthEvaluationWrapper;
import com.microsoft.azure.servicefabric.CurrentUpgradeDomainProgressInfo;
import com.microsoft.azure.servicefabric.FailureReason;
import com.microsoft.azure.servicefabric.FailedUpgradeDomainProgressObject;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a cluster upgrade.
 */
public class ClusterUpgradeProgressObjectInner {
    /**
     * The ServiceFabric code version of the cluster.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /**
     * The cluster configuration version (specified in the cluster manifest).
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * List of upgrade domains and their statuses.
     */
    @JsonProperty(value = "UpgradeDomains")
    private List<UpgradeDomainInfo> upgradeDomains;

    /**
     * The state of the upgrade domain. Possible values include: 'Invalid',
     * 'RollingBackInProgress', 'RollingBackCompleted',
     * 'RollingForwardPending', 'RollingForwardInProgress',
     * 'RollingForwardCompleted', 'Failed'.
     */
    @JsonProperty(value = "UpgradeState")
    private UpgradeState upgradeState;

    /**
     * The name of the next upgrade domain to be processed.
     */
    @JsonProperty(value = "NextUpgradeDomain")
    private String nextUpgradeDomain;

    /**
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored. Possible values
     * include: 'Invalid', 'UnmonitoredAuto', 'UnmonitoredManual', 'Monitored'.
     */
    @JsonProperty(value = "RollingUpgradeMode")
    private UpgradeMode rollingUpgradeMode;

    /**
     * Represents a ServiceFabric cluster upgrade.
     */
    @JsonProperty(value = "UpgradeDescription")
    private ClusterUpgradeDescriptionObject upgradeDescription;

    /**
     * The estimated elapsed time spent processing the current overall upgrade.
     */
    @JsonProperty(value = "UpgradeDurationInMilliseconds")
    private String upgradeDurationInMilliseconds;

    /**
     * The estimated elapsed time spent processing the current upgrade domain.
     */
    @JsonProperty(value = "UpgradeDomainDurationInMilliseconds")
    private String upgradeDomainDurationInMilliseconds;

    /**
     * List of health evaluations that resulted in the current aggregated
     * health state.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Information about the current in-progress upgrade domain.
     */
    @JsonProperty(value = "CurrentUpgradeDomainProgress")
    private CurrentUpgradeDomainProgressInfo currentUpgradeDomainProgress;

    /**
     * The start time of the upgrade in UTC.
     */
    @JsonProperty(value = "StartTimestampUtc")
    private String startTimestampUtc;

    /**
     * The failure time of the upgrade in UTC.
     */
    @JsonProperty(value = "FailureTimestampUtc")
    private String failureTimestampUtc;

    /**
     * The cause of an upgrade failure that resulted in FailureAction being
     * executed. Possible values include: 'None', 'Interrupted', 'HealthCheck',
     * 'UpgradeDomainTimeout', 'OverallUpgradeTimeout'.
     */
    @JsonProperty(value = "FailureReason")
    private FailureReason failureReason;

    /**
     * The detailed upgrade progress for nodes in the current upgrade domain at
     * the point of failure.
     */
    @JsonProperty(value = "UpgradeDomainProgressAtFailure")
    private FailedUpgradeDomainProgressObject upgradeDomainProgressAtFailure;

    /**
     * Get the ServiceFabric code version of the cluster.
     *
     * @return the codeVersion value
     */
    public String codeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the ServiceFabric code version of the cluster.
     *
     * @param codeVersion the codeVersion value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the cluster configuration version (specified in the cluster manifest).
     *
     * @return the configVersion value
     */
    public String configVersion() {
        return this.configVersion;
    }

    /**
     * Set the cluster configuration version (specified in the cluster manifest).
     *
     * @param configVersion the configVersion value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    /**
     * Get list of upgrade domains and their statuses.
     *
     * @return the upgradeDomains value
     */
    public List<UpgradeDomainInfo> upgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Set list of upgrade domains and their statuses.
     *
     * @param upgradeDomains the upgradeDomains value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withUpgradeDomains(List<UpgradeDomainInfo> upgradeDomains) {
        this.upgradeDomains = upgradeDomains;
        return this;
    }

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
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withUpgradeState(UpgradeState upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the name of the next upgrade domain to be processed.
     *
     * @return the nextUpgradeDomain value
     */
    public String nextUpgradeDomain() {
        return this.nextUpgradeDomain;
    }

    /**
     * Set the name of the next upgrade domain to be processed.
     *
     * @param nextUpgradeDomain the nextUpgradeDomain value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withNextUpgradeDomain(String nextUpgradeDomain) {
        this.nextUpgradeDomain = nextUpgradeDomain;
        return this;
    }

    /**
     * Get the mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored. Possible values include: 'Invalid', 'UnmonitoredAuto', 'UnmonitoredManual', 'Monitored'.
     *
     * @return the rollingUpgradeMode value
     */
    public UpgradeMode rollingUpgradeMode() {
        return this.rollingUpgradeMode;
    }

    /**
     * Set the mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored. Possible values include: 'Invalid', 'UnmonitoredAuto', 'UnmonitoredManual', 'Monitored'.
     *
     * @param rollingUpgradeMode the rollingUpgradeMode value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get represents a ServiceFabric cluster upgrade.
     *
     * @return the upgradeDescription value
     */
    public ClusterUpgradeDescriptionObject upgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set represents a ServiceFabric cluster upgrade.
     *
     * @param upgradeDescription the upgradeDescription value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withUpgradeDescription(ClusterUpgradeDescriptionObject upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

    /**
     * Get the estimated elapsed time spent processing the current overall upgrade.
     *
     * @return the upgradeDurationInMilliseconds value
     */
    public String upgradeDurationInMilliseconds() {
        return this.upgradeDurationInMilliseconds;
    }

    /**
     * Set the estimated elapsed time spent processing the current overall upgrade.
     *
     * @param upgradeDurationInMilliseconds the upgradeDurationInMilliseconds value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withUpgradeDurationInMilliseconds(String upgradeDurationInMilliseconds) {
        this.upgradeDurationInMilliseconds = upgradeDurationInMilliseconds;
        return this;
    }

    /**
     * Get the estimated elapsed time spent processing the current upgrade domain.
     *
     * @return the upgradeDomainDurationInMilliseconds value
     */
    public String upgradeDomainDurationInMilliseconds() {
        return this.upgradeDomainDurationInMilliseconds;
    }

    /**
     * Set the estimated elapsed time spent processing the current upgrade domain.
     *
     * @param upgradeDomainDurationInMilliseconds the upgradeDomainDurationInMilliseconds value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withUpgradeDomainDurationInMilliseconds(String upgradeDomainDurationInMilliseconds) {
        this.upgradeDomainDurationInMilliseconds = upgradeDomainDurationInMilliseconds;
        return this;
    }

    /**
     * Get list of health evaluations that resulted in the current aggregated health state.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set list of health evaluations that resulted in the current aggregated health state.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

    /**
     * Get information about the current in-progress upgrade domain.
     *
     * @return the currentUpgradeDomainProgress value
     */
    public CurrentUpgradeDomainProgressInfo currentUpgradeDomainProgress() {
        return this.currentUpgradeDomainProgress;
    }

    /**
     * Set information about the current in-progress upgrade domain.
     *
     * @param currentUpgradeDomainProgress the currentUpgradeDomainProgress value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withCurrentUpgradeDomainProgress(CurrentUpgradeDomainProgressInfo currentUpgradeDomainProgress) {
        this.currentUpgradeDomainProgress = currentUpgradeDomainProgress;
        return this;
    }

    /**
     * Get the start time of the upgrade in UTC.
     *
     * @return the startTimestampUtc value
     */
    public String startTimestampUtc() {
        return this.startTimestampUtc;
    }

    /**
     * Set the start time of the upgrade in UTC.
     *
     * @param startTimestampUtc the startTimestampUtc value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withStartTimestampUtc(String startTimestampUtc) {
        this.startTimestampUtc = startTimestampUtc;
        return this;
    }

    /**
     * Get the failure time of the upgrade in UTC.
     *
     * @return the failureTimestampUtc value
     */
    public String failureTimestampUtc() {
        return this.failureTimestampUtc;
    }

    /**
     * Set the failure time of the upgrade in UTC.
     *
     * @param failureTimestampUtc the failureTimestampUtc value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withFailureTimestampUtc(String failureTimestampUtc) {
        this.failureTimestampUtc = failureTimestampUtc;
        return this;
    }

    /**
     * Get the cause of an upgrade failure that resulted in FailureAction being executed. Possible values include: 'None', 'Interrupted', 'HealthCheck', 'UpgradeDomainTimeout', 'OverallUpgradeTimeout'.
     *
     * @return the failureReason value
     */
    public FailureReason failureReason() {
        return this.failureReason;
    }

    /**
     * Set the cause of an upgrade failure that resulted in FailureAction being executed. Possible values include: 'None', 'Interrupted', 'HealthCheck', 'UpgradeDomainTimeout', 'OverallUpgradeTimeout'.
     *
     * @param failureReason the failureReason value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Get the detailed upgrade progress for nodes in the current upgrade domain at the point of failure.
     *
     * @return the upgradeDomainProgressAtFailure value
     */
    public FailedUpgradeDomainProgressObject upgradeDomainProgressAtFailure() {
        return this.upgradeDomainProgressAtFailure;
    }

    /**
     * Set the detailed upgrade progress for nodes in the current upgrade domain at the point of failure.
     *
     * @param upgradeDomainProgressAtFailure the upgradeDomainProgressAtFailure value to set
     * @return the ClusterUpgradeProgressObjectInner object itself.
     */
    public ClusterUpgradeProgressObjectInner withUpgradeDomainProgressAtFailure(FailedUpgradeDomainProgressObject upgradeDomainProgressAtFailure) {
        this.upgradeDomainProgressAtFailure = upgradeDomainProgressAtFailure;
        return this;
    }

}
