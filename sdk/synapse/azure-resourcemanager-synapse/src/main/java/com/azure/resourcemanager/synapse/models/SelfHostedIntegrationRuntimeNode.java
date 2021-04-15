// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of SelfHostedIntegrationRuntimeNode. */
public interface SelfHostedIntegrationRuntimeNode {
    /**
     * Gets the nodeName property: Name of the integration runtime node.
     *
     * @return the nodeName value.
     */
    String nodeName();

    /**
     * Gets the machineName property: Machine name of the integration runtime node.
     *
     * @return the machineName value.
     */
    String machineName();

    /**
     * Gets the hostServiceUri property: URI for the host machine of the integration runtime.
     *
     * @return the hostServiceUri value.
     */
    String hostServiceUri();

    /**
     * Gets the status property: Status of the integration runtime node.
     *
     * @return the status value.
     */
    SelfHostedIntegrationRuntimeNodeStatus status();

    /**
     * Gets the capabilities property: The integration runtime capabilities dictionary.
     *
     * @return the capabilities value.
     */
    Map<String, String> capabilities();

    /**
     * Gets the versionStatus property: Status of the integration runtime node version.
     *
     * @return the versionStatus value.
     */
    String versionStatus();

    /**
     * Gets the version property: Version of the integration runtime node.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the registerTime property: The time at which the integration runtime node was registered in ISO8601 format.
     *
     * @return the registerTime value.
     */
    OffsetDateTime registerTime();

    /**
     * Gets the lastConnectTime property: The most recent time at which the integration runtime was connected in ISO8601
     * format.
     *
     * @return the lastConnectTime value.
     */
    OffsetDateTime lastConnectTime();

    /**
     * Gets the expiryTime property: The time at which the integration runtime will expire in ISO8601 format.
     *
     * @return the expiryTime value.
     */
    OffsetDateTime expiryTime();

    /**
     * Gets the lastStartTime property: The time the node last started up.
     *
     * @return the lastStartTime value.
     */
    OffsetDateTime lastStartTime();

    /**
     * Gets the lastStopTime property: The integration runtime node last stop time.
     *
     * @return the lastStopTime value.
     */
    OffsetDateTime lastStopTime();

    /**
     * Gets the lastUpdateResult property: The result of the last integration runtime node update.
     *
     * @return the lastUpdateResult value.
     */
    IntegrationRuntimeUpdateResult lastUpdateResult();

    /**
     * Gets the lastStartUpdateTime property: The last time for the integration runtime node update start.
     *
     * @return the lastStartUpdateTime value.
     */
    OffsetDateTime lastStartUpdateTime();

    /**
     * Gets the lastEndUpdateTime property: The last time for the integration runtime node update end.
     *
     * @return the lastEndUpdateTime value.
     */
    OffsetDateTime lastEndUpdateTime();

    /**
     * Gets the isActiveDispatcher property: Indicates whether this node is the active dispatcher for integration
     * runtime requests.
     *
     * @return the isActiveDispatcher value.
     */
    Boolean isActiveDispatcher();

    /**
     * Gets the concurrentJobsLimit property: Maximum concurrent jobs on the integration runtime node.
     *
     * @return the concurrentJobsLimit value.
     */
    Integer concurrentJobsLimit();

    /**
     * Gets the maxConcurrentJobs property: The maximum concurrent jobs in this integration runtime.
     *
     * @return the maxConcurrentJobs value.
     */
    Integer maxConcurrentJobs();

    /**
     * Gets the additionalProperties property: Properties of Self-hosted integration runtime node.
     *
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.SelfHostedIntegrationRuntimeNodeInner object.
     *
     * @return the inner object.
     */
    SelfHostedIntegrationRuntimeNodeInner innerModel();
}
