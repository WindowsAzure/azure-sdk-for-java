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

/**
 * Represents a ServiceFabric cluster upgrade.
 */
public class ClusterUpgradeDescriptionObject {
    /**
     * The cluster configuration version (specified in the cluster manifest).
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * The ServiceFabric code version of the cluster.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /**
     * The kind of upgrade out of the following possible values. Possible
     * values include: 'Invalid', 'Rolling'.
     */
    @JsonProperty(value = "UpgradeKind")
    private UpgradeKind upgradeKind;

    /**
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored. Possible values
     * include: 'Invalid', 'UnmonitoredAuto', 'UnmonitoredManual', 'Monitored'.
     */
    @JsonProperty(value = "RollingUpgradeMode")
    private UpgradeMode rollingUpgradeMode;

    /**
     * The maximum amount of time to block processing of an upgrade domain and
     * prevent loss of availability when there are unexpected issues. When this
     * timeout expires, processing of the upgrade domain will proceed
     * regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925
     * inclusive. (unsigned 32-bit integer).
     */
    @JsonProperty(value = "UpgradeReplicaSetCheckTimeoutInSeconds")
    private Long upgradeReplicaSetCheckTimeoutInSeconds;

    /**
     * If true, then processes are forcefully restarted during upgrade even
     * when the code version has not changed (the upgrade only changes
     * configuration or data).
     */
    @JsonProperty(value = "ForceRestart")
    private Boolean forceRestart;

    /**
     * When true, enables delta health evaluation rather than absolute health
     * evaluation after completion of each upgrade domain.
     */
    @JsonProperty(value = "EnableDeltaHealthEvaluation")
    private Boolean enableDeltaHealthEvaluation;

    /**
     * Describes the parameters for monitoring an upgrade in Monitored mode.
     */
    @JsonProperty(value = "MonitoringPolicy")
    private MonitoringPolicyDescription monitoringPolicy;

    /**
     * Defines a health policy used to evaluate the health of the cluster or of
     * a cluster node.
     */
    @JsonProperty(value = "ClusterHealthPolicy")
    private ClusterHealthPolicy clusterHealthPolicy;

    /**
     * Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     */
    @JsonProperty(value = "ClusterUpgradeHealthPolicy")
    private ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy;

    /**
     * Defines a map that contains specific application health policies for
     * different applications.
     * Each entry specifies as key the application name and as value an
     * ApplicationHealthPolicy used to evaluate the application health.
     * If an application is not specified in the map, the application health
     * evaluation uses the ApplicationHealthPolicy found in its application
     * manifest or the default application health policy (if no health policy
     * is defined in the manifest).
     * The map is empty by default.
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap;

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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the kind of upgrade out of the following possible values. Possible values include: 'Invalid', 'Rolling'.
     *
     * @return the upgradeKind value
     */
    public UpgradeKind upgradeKind() {
        return this.upgradeKind;
    }

    /**
     * Set the kind of upgrade out of the following possible values. Possible values include: 'Invalid', 'Rolling'.
     *
     * @param upgradeKind the upgradeKind value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withUpgradeKind(UpgradeKind upgradeKind) {
        this.upgradeKind = upgradeKind;
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @return the upgradeReplicaSetCheckTimeoutInSeconds value
     */
    public Long upgradeReplicaSetCheckTimeoutInSeconds() {
        return this.upgradeReplicaSetCheckTimeoutInSeconds;
    }

    /**
     * Set the maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @param upgradeReplicaSetCheckTimeoutInSeconds the upgradeReplicaSetCheckTimeoutInSeconds value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withUpgradeReplicaSetCheckTimeoutInSeconds(Long upgradeReplicaSetCheckTimeoutInSeconds) {
        this.upgradeReplicaSetCheckTimeoutInSeconds = upgradeReplicaSetCheckTimeoutInSeconds;
        return this;
    }

    /**
     * Get if true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     *
     * @return the forceRestart value
     */
    public Boolean forceRestart() {
        return this.forceRestart;
    }

    /**
     * Set if true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     *
     * @param forceRestart the forceRestart value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get when true, enables delta health evaluation rather than absolute health evaluation after completion of each upgrade domain.
     *
     * @return the enableDeltaHealthEvaluation value
     */
    public Boolean enableDeltaHealthEvaluation() {
        return this.enableDeltaHealthEvaluation;
    }

    /**
     * Set when true, enables delta health evaluation rather than absolute health evaluation after completion of each upgrade domain.
     *
     * @param enableDeltaHealthEvaluation the enableDeltaHealthEvaluation value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withEnableDeltaHealthEvaluation(Boolean enableDeltaHealthEvaluation) {
        this.enableDeltaHealthEvaluation = enableDeltaHealthEvaluation;
        return this;
    }

    /**
     * Get describes the parameters for monitoring an upgrade in Monitored mode.
     *
     * @return the monitoringPolicy value
     */
    public MonitoringPolicyDescription monitoringPolicy() {
        return this.monitoringPolicy;
    }

    /**
     * Set describes the parameters for monitoring an upgrade in Monitored mode.
     *
     * @param monitoringPolicy the monitoringPolicy value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withMonitoringPolicy(MonitoringPolicyDescription monitoringPolicy) {
        this.monitoringPolicy = monitoringPolicy;
        return this;
    }

    /**
     * Get defines a health policy used to evaluate the health of the cluster or of a cluster node.
     *
     * @return the clusterHealthPolicy value
     */
    public ClusterHealthPolicy clusterHealthPolicy() {
        return this.clusterHealthPolicy;
    }

    /**
     * Set defines a health policy used to evaluate the health of the cluster or of a cluster node.
     *
     * @param clusterHealthPolicy the clusterHealthPolicy value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withClusterHealthPolicy(ClusterHealthPolicy clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }

    /**
     * Get defines a health policy used to evaluate the health of the cluster during a cluster upgrade.
     *
     * @return the clusterUpgradeHealthPolicy value
     */
    public ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy() {
        return this.clusterUpgradeHealthPolicy;
    }

    /**
     * Set defines a health policy used to evaluate the health of the cluster during a cluster upgrade.
     *
     * @param clusterUpgradeHealthPolicy the clusterUpgradeHealthPolicy value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withClusterUpgradeHealthPolicy(ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy) {
        this.clusterUpgradeHealthPolicy = clusterUpgradeHealthPolicy;
        return this;
    }

    /**
     * Get defines a map that contains specific application health policies for different applications.
     Each entry specifies as key the application name and as value an ApplicationHealthPolicy used to evaluate the application health.
     If an application is not specified in the map, the application health evaluation uses the ApplicationHealthPolicy found in its application manifest or the default application health policy (if no health policy is defined in the manifest).
     The map is empty by default.
     *
     * @return the applicationHealthPolicyMap value
     */
    public List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set defines a map that contains specific application health policies for different applications.
     Each entry specifies as key the application name and as value an ApplicationHealthPolicy used to evaluate the application health.
     If an application is not specified in the map, the application health evaluation uses the ApplicationHealthPolicy found in its application manifest or the default application health policy (if no health policy is defined in the manifest).
     The map is empty by default.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject withApplicationHealthPolicyMap(List<ApplicationHealthPolicyMapItem> applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
        return this;
    }

}
