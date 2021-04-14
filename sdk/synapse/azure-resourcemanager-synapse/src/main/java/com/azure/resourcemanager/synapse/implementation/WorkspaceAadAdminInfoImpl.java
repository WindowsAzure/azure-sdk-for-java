// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.WorkspaceAadAdminInfoInner;
import com.azure.resourcemanager.synapse.models.WorkspaceAadAdminInfo;

public final class WorkspaceAadAdminInfoImpl implements WorkspaceAadAdminInfo {
    private WorkspaceAadAdminInfoInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    WorkspaceAadAdminInfoImpl(
        WorkspaceAadAdminInfoInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
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

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public String login() {
        return this.innerModel().login();
    }

    public String administratorType() {
        return this.innerModel().administratorType();
    }

    public String sid() {
        return this.innerModel().sid();
    }

    public WorkspaceAadAdminInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
