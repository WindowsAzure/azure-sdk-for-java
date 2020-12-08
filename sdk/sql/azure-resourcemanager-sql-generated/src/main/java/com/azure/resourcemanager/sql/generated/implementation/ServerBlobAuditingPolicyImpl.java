// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerBlobAuditingPolicyInner;
import com.azure.resourcemanager.sql.generated.models.BlobAuditingPolicyState;
import com.azure.resourcemanager.sql.generated.models.ServerBlobAuditingPolicy;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ServerBlobAuditingPolicyImpl
    implements ServerBlobAuditingPolicy, ServerBlobAuditingPolicy.Definition, ServerBlobAuditingPolicy.Update {
    private ServerBlobAuditingPolicyInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public BlobAuditingPolicyState state() {
        return this.innerModel().state();
    }

    public String storageEndpoint() {
        return this.innerModel().storageEndpoint();
    }

    public String storageAccountAccessKey() {
        return this.innerModel().storageAccountAccessKey();
    }

    public Integer retentionDays() {
        return this.innerModel().retentionDays();
    }

    public List<String> auditActionsAndGroups() {
        List<String> inner = this.innerModel().auditActionsAndGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UUID storageAccountSubscriptionId() {
        return this.innerModel().storageAccountSubscriptionId();
    }

    public Boolean isStorageSecondaryKeyInUse() {
        return this.innerModel().isStorageSecondaryKeyInUse();
    }

    public Boolean isAzureMonitorTargetEnabled() {
        return this.innerModel().isAzureMonitorTargetEnabled();
    }

    public Integer queueDelayMs() {
        return this.innerModel().queueDelayMs();
    }

    public ServerBlobAuditingPolicyInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    public ServerBlobAuditingPolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ServerBlobAuditingPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerBlobAuditingPolicies()
                .createOrUpdate(resourceGroupName, serverName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerBlobAuditingPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerBlobAuditingPolicies()
                .createOrUpdate(resourceGroupName, serverName, this.innerModel(), context);
        return this;
    }

    public ServerBlobAuditingPolicyImpl(String name, SqlManager serviceManager) {
        this.innerObject = new ServerBlobAuditingPolicyInner();
        this.serviceManager = serviceManager;
        this.serverName = name;
    }

    public ServerBlobAuditingPolicyImpl update() {
        return this;
    }

    public ServerBlobAuditingPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerBlobAuditingPolicies()
                .createOrUpdate(resourceGroupName, serverName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerBlobAuditingPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerBlobAuditingPolicies()
                .createOrUpdate(resourceGroupName, serverName, this.innerModel(), context);
        return this;
    }

    public ServerBlobAuditingPolicyImpl(ServerBlobAuditingPolicyInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
    }

    public ServerBlobAuditingPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, serverName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerBlobAuditingPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, serverName, context)
                .getValue();
        return this;
    }

    public ServerBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.innerModel().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.innerModel().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.innerModel().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.innerModel().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    public ServerBlobAuditingPolicyImpl withQueueDelayMs(Integer queueDelayMs) {
        this.innerModel().withQueueDelayMs(queueDelayMs);
        return this;
    }
}
