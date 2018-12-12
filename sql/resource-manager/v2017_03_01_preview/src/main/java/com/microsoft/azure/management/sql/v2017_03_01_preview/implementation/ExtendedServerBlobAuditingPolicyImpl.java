/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedServerBlobAuditingPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.BlobAuditingPolicyState;
import java.util.List;
import java.util.UUID;

class ExtendedServerBlobAuditingPolicyImpl extends CreatableUpdatableImpl<ExtendedServerBlobAuditingPolicy, ExtendedServerBlobAuditingPolicyInner, ExtendedServerBlobAuditingPolicyImpl> implements ExtendedServerBlobAuditingPolicy, ExtendedServerBlobAuditingPolicy.Definition, ExtendedServerBlobAuditingPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;

    ExtendedServerBlobAuditingPolicyImpl(String name, SqlManager manager) {
        super(name, new ExtendedServerBlobAuditingPolicyInner());
        this.manager = manager;
        // Set resource name
        this.serverName = name;
        //
    }

    ExtendedServerBlobAuditingPolicyImpl(ExtendedServerBlobAuditingPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serverName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExtendedServerBlobAuditingPolicy> createResourceAsync() {
        ExtendedServerBlobAuditingPoliciesInner client = this.manager().inner().extendedServerBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExtendedServerBlobAuditingPolicy> updateResourceAsync() {
        ExtendedServerBlobAuditingPoliciesInner client = this.manager().inner().extendedServerBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExtendedServerBlobAuditingPolicyInner> getInnerAsync() {
        ExtendedServerBlobAuditingPoliciesInner client = this.manager().inner().extendedServerBlobAuditingPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName);
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
    public String predicateExpression() {
        return this.inner().predicateExpression();
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
    public ExtendedServerBlobAuditingPolicyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.inner().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.inner().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.inner().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withPredicateExpression(String predicateExpression) {
        this.inner().withPredicateExpression(predicateExpression);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.inner().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    @Override
    public ExtendedServerBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}
