// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.ExtendedDatabaseBlobAuditingPolicyInner;
import com.azure.resourcemanager.sql.generated.models.BlobAuditingPolicyState;
import com.azure.resourcemanager.sql.generated.models.ExtendedDatabaseBlobAuditingPolicy;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ExtendedDatabaseBlobAuditingPolicyImpl
    implements ExtendedDatabaseBlobAuditingPolicy,
        ExtendedDatabaseBlobAuditingPolicy.Definition,
        ExtendedDatabaseBlobAuditingPolicy.Update {
    private ExtendedDatabaseBlobAuditingPolicyInner innerObject;

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

    public ExtendedDatabaseBlobAuditingPolicyInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    public ExtendedDatabaseBlobAuditingPolicyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, serverName, databaseName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl(String name, SqlManager serviceManager) {
        this.innerObject = new ExtendedDatabaseBlobAuditingPolicyInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl update() {
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedDatabaseBlobAuditingPolicies()
                .createOrUpdateWithResponse(resourceGroupName, serverName, databaseName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl(
        ExtendedDatabaseBlobAuditingPolicyInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
    }

    public ExtendedDatabaseBlobAuditingPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedDatabaseBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtendedDatabaseBlobAuditingPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, context)
                .getValue();
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withPredicateExpression(String predicateExpression) {
        this.innerModel().withPredicateExpression(predicateExpression);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.innerModel().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.innerModel().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.innerModel().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.innerModel().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    public ExtendedDatabaseBlobAuditingPolicyImpl withQueueDelayMs(Integer queueDelayMs) {
        this.innerModel().withQueueDelayMs(queueDelayMs);
        return this;
    }
}
