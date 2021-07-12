// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerHistoryInner;
import com.azure.resourcemanager.logic.models.ContentLink;
import com.azure.resourcemanager.logic.models.Correlation;
import com.azure.resourcemanager.logic.models.ResourceReference;
import com.azure.resourcemanager.logic.models.WorkflowStatus;
import com.azure.resourcemanager.logic.models.WorkflowTriggerHistory;
import java.time.OffsetDateTime;

public final class WorkflowTriggerHistoryImpl implements WorkflowTriggerHistory {
    private WorkflowTriggerHistoryInner innerObject;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    WorkflowTriggerHistoryImpl(
        WorkflowTriggerHistoryInner innerObject, com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public OffsetDateTime scheduledTime() {
        return this.innerModel().scheduledTime();
    }

    public WorkflowStatus status() {
        return this.innerModel().status();
    }

    public String code() {
        return this.innerModel().code();
    }

    public Object error() {
        return this.innerModel().error();
    }

    public String trackingId() {
        return this.innerModel().trackingId();
    }

    public Correlation correlation() {
        return this.innerModel().correlation();
    }

    public ContentLink inputsLink() {
        return this.innerModel().inputsLink();
    }

    public ContentLink outputsLink() {
        return this.innerModel().outputsLink();
    }

    public Boolean fired() {
        return this.innerModel().fired();
    }

    public ResourceReference run() {
        return this.innerModel().run();
    }

    public WorkflowTriggerHistoryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
