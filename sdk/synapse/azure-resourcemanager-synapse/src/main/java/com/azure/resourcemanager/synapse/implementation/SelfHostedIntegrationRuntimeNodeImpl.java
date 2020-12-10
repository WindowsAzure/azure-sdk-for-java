// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeUpdateResult;
import com.azure.resourcemanager.synapse.models.SelfHostedIntegrationRuntimeNode;
import com.azure.resourcemanager.synapse.models.SelfHostedIntegrationRuntimeNodeStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeNodeImpl implements SelfHostedIntegrationRuntimeNode {
    private SelfHostedIntegrationRuntimeNodeInner innerObject;

    private final SynapseManager serviceManager;

    public SelfHostedIntegrationRuntimeNodeImpl(
        SelfHostedIntegrationRuntimeNodeInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String nodeName() {
        return this.innerModel().nodeName();
    }

    public String machineName() {
        return this.innerModel().machineName();
    }

    public String hostServiceUri() {
        return this.innerModel().hostServiceUri();
    }

    public SelfHostedIntegrationRuntimeNodeStatus status() {
        return this.innerModel().status();
    }

    public Map<String, String> capabilities() {
        Map<String, String> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String versionStatus() {
        return this.innerModel().versionStatus();
    }

    public String version() {
        return this.innerModel().version();
    }

    public OffsetDateTime registerTime() {
        return this.innerModel().registerTime();
    }

    public OffsetDateTime lastConnectTime() {
        return this.innerModel().lastConnectTime();
    }

    public OffsetDateTime expiryTime() {
        return this.innerModel().expiryTime();
    }

    public OffsetDateTime lastStartTime() {
        return this.innerModel().lastStartTime();
    }

    public OffsetDateTime lastStopTime() {
        return this.innerModel().lastStopTime();
    }

    public IntegrationRuntimeUpdateResult lastUpdateResult() {
        return this.innerModel().lastUpdateResult();
    }

    public OffsetDateTime lastStartUpdateTime() {
        return this.innerModel().lastStartUpdateTime();
    }

    public OffsetDateTime lastEndUpdateTime() {
        return this.innerModel().lastEndUpdateTime();
    }

    public Boolean isActiveDispatcher() {
        return this.innerModel().isActiveDispatcher();
    }

    public Integer concurrentJobsLimit() {
        return this.innerModel().concurrentJobsLimit();
    }

    public Integer maxConcurrentJobs() {
        return this.innerModel().maxConcurrentJobs();
    }

    public Map<String, Object> additionalProperties() {
        Map<String, Object> inner = this.innerModel().additionalProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SelfHostedIntegrationRuntimeNodeInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
