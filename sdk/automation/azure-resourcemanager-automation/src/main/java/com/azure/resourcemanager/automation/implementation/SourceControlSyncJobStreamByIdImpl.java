// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamByIdInner;
import com.azure.resourcemanager.automation.models.SourceControlSyncJobStreamById;
import com.azure.resourcemanager.automation.models.StreamType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class SourceControlSyncJobStreamByIdImpl implements SourceControlSyncJobStreamById {
    private SourceControlSyncJobStreamByIdInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    SourceControlSyncJobStreamByIdImpl(
        SourceControlSyncJobStreamByIdInner innerObject,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String sourceControlSyncJobStreamId() {
        return this.innerModel().sourceControlSyncJobStreamId();
    }

    public String summary() {
        return this.innerModel().summary();
    }

    public OffsetDateTime time() {
        return this.innerModel().time();
    }

    public StreamType streamType() {
        return this.innerModel().streamType();
    }

    public String streamText() {
        return this.innerModel().streamText();
    }

    public Map<String, Object> value() {
        Map<String, Object> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SourceControlSyncJobStreamByIdInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
