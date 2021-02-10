/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SelfHostedIntegrationRuntimeNodeInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SynapseManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing SelfHostedIntegrationRuntimeNode.
 */
public interface SelfHostedIntegrationRuntimeNode extends HasInner<SelfHostedIntegrationRuntimeNodeInner>, HasManager<SynapseManager> {
    /**
     * @return the capabilities value.
     */
    Map<String, String> capabilities();

    /**
     * @return the concurrentJobsLimit value.
     */
    Integer concurrentJobsLimit();

    /**
     * @return the expiryTime value.
     */
    DateTime expiryTime();

    /**
     * @return the hostServiceUri value.
     */
    String hostServiceUri();

    /**
     * @return the isActiveDispatcher value.
     */
    Boolean isActiveDispatcher();

    /**
     * @return the lastConnectTime value.
     */
    DateTime lastConnectTime();

    /**
     * @return the lastEndUpdateTime value.
     */
    DateTime lastEndUpdateTime();

    /**
     * @return the lastStartTime value.
     */
    DateTime lastStartTime();

    /**
     * @return the lastStartUpdateTime value.
     */
    DateTime lastStartUpdateTime();

    /**
     * @return the lastStopTime value.
     */
    DateTime lastStopTime();

    /**
     * @return the lastUpdateResult value.
     */
    IntegrationRuntimeUpdateResult lastUpdateResult();

    /**
     * @return the machineName value.
     */
    String machineName();

    /**
     * @return the maxConcurrentJobs value.
     */
    Integer maxConcurrentJobs();

    /**
     * @return the nodeName value.
     */
    String nodeName();

    /**
     * @return the registerTime value.
     */
    DateTime registerTime();

    /**
     * @return the status value.
     */
    SelfHostedIntegrationRuntimeNodeStatus status();

    /**
     * @return the version value.
     */
    String version();

    /**
     * @return the versionStatus value.
     */
    String versionStatus();

}
