/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceServerBlobAuditingPolicyModel;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.BlobAuditingPolicyState;
import java.util.List;
import java.util.UUID;

class WorkspaceServerBlobAuditingPolicyModelImpl extends CreatableUpdatableImpl<WorkspaceServerBlobAuditingPolicyModel, ServerBlobAuditingPolicyInner, WorkspaceServerBlobAuditingPolicyModelImpl> implements WorkspaceServerBlobAuditingPolicyModel, WorkspaceServerBlobAuditingPolicyModel.Definition, WorkspaceServerBlobAuditingPolicyModel.Update {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;

    WorkspaceServerBlobAuditingPolicyModelImpl(String name, SynapseManager manager) {
        super(name, new ServerBlobAuditingPolicyInner());
        this.manager = manager;
        // Set resource name
        this.workspaceName = name;
        //
    }

    WorkspaceServerBlobAuditingPolicyModelImpl(ServerBlobAuditingPolicyInner inner, SynapseManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.workspaceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        //
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<WorkspaceServerBlobAuditingPolicyModel> createResourceAsync() {
        WorkspaceManagedqlServerBlobAuditingPoliciesInner client = this.manager().inner().workspaceManagedqlServerBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<WorkspaceServerBlobAuditingPolicyModel> updateResourceAsync() {
        WorkspaceManagedqlServerBlobAuditingPoliciesInner client = this.manager().inner().workspaceManagedqlServerBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerBlobAuditingPolicyInner> getInnerAsync() {
        WorkspaceManagedqlServerBlobAuditingPoliciesInner client = this.manager().inner().workspaceManagedqlServerBlobAuditingPolicies();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> auditActionsAndGroups() {
        return this.inner().auditActionsAndGroups();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isAzureMonitorTargetEnabled() {
        return this.inner().isAzureMonitorTargetEnabled();
    }

    @Override
    public Boolean isStorageSecondaryKeyInUse() {
        return this.inner().isStorageSecondaryKeyInUse();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer queueDelayMs() {
        return this.inner().queueDelayMs();
    }

    @Override
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public BlobAuditingPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageAccountAccessKey() {
        return this.inner().storageAccountAccessKey();
    }

    @Override
    public UUID storageAccountSubscriptionId() {
        return this.inner().storageAccountSubscriptionId();
    }

    @Override
    public String storageEndpoint() {
        return this.inner().storageEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withState(BlobAuditingPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.inner().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.inner().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.inner().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withQueueDelayMs(Integer queueDelayMs) {
        this.inner().withQueueDelayMs(queueDelayMs);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.inner().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    @Override
    public WorkspaceServerBlobAuditingPolicyModelImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}
