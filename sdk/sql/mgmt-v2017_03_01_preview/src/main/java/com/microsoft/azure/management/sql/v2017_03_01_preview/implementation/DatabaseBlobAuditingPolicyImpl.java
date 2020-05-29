/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseBlobAuditingPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.BlobAuditingPolicyState;
import java.util.List;
import java.util.UUID;

class DatabaseBlobAuditingPolicyImpl extends CreatableUpdatableImpl<DatabaseBlobAuditingPolicy, DatabaseBlobAuditingPolicyInner, DatabaseBlobAuditingPolicyImpl> implements DatabaseBlobAuditingPolicy, DatabaseBlobAuditingPolicy.Definition, DatabaseBlobAuditingPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;

    DatabaseBlobAuditingPolicyImpl(String name, SqlManager manager) {
        super(name, new DatabaseBlobAuditingPolicyInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    DatabaseBlobAuditingPolicyImpl(DatabaseBlobAuditingPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DatabaseBlobAuditingPolicy> createResourceAsync() {
        DatabaseBlobAuditingPoliciesInner client = this.manager().inner().databaseBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DatabaseBlobAuditingPolicy> updateResourceAsync() {
        DatabaseBlobAuditingPoliciesInner client = this.manager().inner().databaseBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseBlobAuditingPolicyInner> getInnerAsync() {
        DatabaseBlobAuditingPoliciesInner client = this.manager().inner().databaseBlobAuditingPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
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
    public String kind() {
        return this.inner().kind();
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
    public DatabaseBlobAuditingPolicyImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.inner().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.inner().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.inner().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withQueueDelayMs(Integer queueDelayMs) {
        this.inner().withQueueDelayMs(queueDelayMs);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.inner().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    @Override
    public DatabaseBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}
