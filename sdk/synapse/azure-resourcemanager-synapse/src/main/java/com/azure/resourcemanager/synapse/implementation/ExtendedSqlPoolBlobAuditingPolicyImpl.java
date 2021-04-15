// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.ExtendedSqlPoolBlobAuditingPolicyInner;
import com.azure.resourcemanager.synapse.models.BlobAuditingPolicyState;
import com.azure.resourcemanager.synapse.models.ExtendedSqlPoolBlobAuditingPolicy;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ExtendedSqlPoolBlobAuditingPolicyImpl
    implements ExtendedSqlPoolBlobAuditingPolicy,
        ExtendedSqlPoolBlobAuditingPolicy.Definition,
        ExtendedSqlPoolBlobAuditingPolicy.Update {
    private ExtendedSqlPoolBlobAuditingPolicyInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String predicateExpression() {
        return this.innerModel().predicateExpression();
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

    public ExtendedSqlPoolBlobAuditingPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String sqlPoolName;

    public ExtendedSqlPoolBlobAuditingPolicyImpl withExistingSqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.sqlPoolName = sqlPoolName;
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedSqlPoolBlobAuditingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, sqlPoolName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedSqlPoolBlobAuditingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, sqlPoolName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ExtendedSqlPoolBlobAuditingPolicyImpl(com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new ExtendedSqlPoolBlobAuditingPolicyInner();
        this.serviceManager = serviceManager;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl update() {
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedSqlPoolBlobAuditingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, sqlPoolName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedSqlPoolBlobAuditingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, sqlPoolName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ExtendedSqlPoolBlobAuditingPolicyImpl(
        ExtendedSqlPoolBlobAuditingPolicyInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.sqlPoolName = Utils.getValueFromIdByName(innerObject.id(), "sqlPools");
    }

    public ExtendedSqlPoolBlobAuditingPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedSqlPoolBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedSqlPoolBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, context)
                .getValue();
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withPredicateExpression(String predicateExpression) {
        this.innerModel().withPredicateExpression(predicateExpression);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.innerModel().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.innerModel().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.innerModel().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.innerModel().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    public ExtendedSqlPoolBlobAuditingPolicyImpl withQueueDelayMs(Integer queueDelayMs) {
        this.innerModel().withQueueDelayMs(queueDelayMs);
        return this;
    }
}
