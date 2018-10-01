/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.SelfHostedIntegrationRuntimeNodeStatus;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.IntegrationRuntimeUpdateResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of Self-hosted integration runtime node.
 */
public class SelfHostedIntegrationRuntimeNodeInner {
    /**
     * Name of the integration runtime node.
     */
    @JsonProperty(value = "nodeName", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeName;

    /**
     * Machine name of the integration runtime node.
     */
    @JsonProperty(value = "machineName", access = JsonProperty.Access.WRITE_ONLY)
    private String machineName;

    /**
     * URI for the host machine of the integration runtime.
     */
    @JsonProperty(value = "hostServiceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String hostServiceUri;

    /**
     * Status of the integration runtime node. Possible values include:
     * 'NeedRegistration', 'Online', 'Limited', 'Offline', 'Upgrading',
     * 'Initializing', 'InitializeFailed'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private SelfHostedIntegrationRuntimeNodeStatus status;

    /**
     * The integration runtime capabilities dictionary.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> capabilities;

    /**
     * Status of the integration runtime node version.
     */
    @JsonProperty(value = "versionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String versionStatus;

    /**
     * Version of the integration runtime node.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * The time at which the integration runtime node was registered in ISO8601
     * format.
     */
    @JsonProperty(value = "registerTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime registerTime;

    /**
     * The most recent time at which the integration runtime was connected in
     * ISO8601 format.
     */
    @JsonProperty(value = "lastConnectTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastConnectTime;

    /**
     * The time at which the integration runtime will expire in ISO8601 format.
     */
    @JsonProperty(value = "expiryTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expiryTime;

    /**
     * The time the node last started up.
     */
    @JsonProperty(value = "lastStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastStartTime;

    /**
     * The integration runtime node last stop time.
     */
    @JsonProperty(value = "lastStopTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastStopTime;

    /**
     * The result of the last integration runtime node update. Possible values
     * include: 'Succeed', 'Fail'.
     */
    @JsonProperty(value = "lastUpdateResult", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeUpdateResult lastUpdateResult;

    /**
     * The last time for the integration runtime node update start.
     */
    @JsonProperty(value = "lastStartUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastStartUpdateTime;

    /**
     * The last time for the integration runtime node update end.
     */
    @JsonProperty(value = "lastEndUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastEndUpdateTime;

    /**
     * Indicates whether this node is the active dispatcher for integration
     * runtime requests.
     */
    @JsonProperty(value = "isActiveDispatcher", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isActiveDispatcher;

    /**
     * Maximum concurrent jobs on the integration runtime node.
     */
    @JsonProperty(value = "concurrentJobsLimit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer concurrentJobsLimit;

    /**
     * The maximum concurrent jobs in this integration runtime.
     */
    @JsonProperty(value = "maxConcurrentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxConcurrentJobs;

    /**
     * Get name of the integration runtime node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Get machine name of the integration runtime node.
     *
     * @return the machineName value
     */
    public String machineName() {
        return this.machineName;
    }

    /**
     * Get uRI for the host machine of the integration runtime.
     *
     * @return the hostServiceUri value
     */
    public String hostServiceUri() {
        return this.hostServiceUri;
    }

    /**
     * Get status of the integration runtime node. Possible values include: 'NeedRegistration', 'Online', 'Limited', 'Offline', 'Upgrading', 'Initializing', 'InitializeFailed'.
     *
     * @return the status value
     */
    public SelfHostedIntegrationRuntimeNodeStatus status() {
        return this.status;
    }

    /**
     * Get the integration runtime capabilities dictionary.
     *
     * @return the capabilities value
     */
    public Map<String, String> capabilities() {
        return this.capabilities;
    }

    /**
     * Get status of the integration runtime node version.
     *
     * @return the versionStatus value
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    /**
     * Get version of the integration runtime node.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the time at which the integration runtime node was registered in ISO8601 format.
     *
     * @return the registerTime value
     */
    public DateTime registerTime() {
        return this.registerTime;
    }

    /**
     * Get the most recent time at which the integration runtime was connected in ISO8601 format.
     *
     * @return the lastConnectTime value
     */
    public DateTime lastConnectTime() {
        return this.lastConnectTime;
    }

    /**
     * Get the time at which the integration runtime will expire in ISO8601 format.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Get the time the node last started up.
     *
     * @return the lastStartTime value
     */
    public DateTime lastStartTime() {
        return this.lastStartTime;
    }

    /**
     * Get the integration runtime node last stop time.
     *
     * @return the lastStopTime value
     */
    public DateTime lastStopTime() {
        return this.lastStopTime;
    }

    /**
     * Get the result of the last integration runtime node update. Possible values include: 'Succeed', 'Fail'.
     *
     * @return the lastUpdateResult value
     */
    public IntegrationRuntimeUpdateResult lastUpdateResult() {
        return this.lastUpdateResult;
    }

    /**
     * Get the last time for the integration runtime node update start.
     *
     * @return the lastStartUpdateTime value
     */
    public DateTime lastStartUpdateTime() {
        return this.lastStartUpdateTime;
    }

    /**
     * Get the last time for the integration runtime node update end.
     *
     * @return the lastEndUpdateTime value
     */
    public DateTime lastEndUpdateTime() {
        return this.lastEndUpdateTime;
    }

    /**
     * Get indicates whether this node is the active dispatcher for integration runtime requests.
     *
     * @return the isActiveDispatcher value
     */
    public Boolean isActiveDispatcher() {
        return this.isActiveDispatcher;
    }

    /**
     * Get maximum concurrent jobs on the integration runtime node.
     *
     * @return the concurrentJobsLimit value
     */
    public Integer concurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }

    /**
     * Get the maximum concurrent jobs in this integration runtime.
     *
     * @return the maxConcurrentJobs value
     */
    public Integer maxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

}
