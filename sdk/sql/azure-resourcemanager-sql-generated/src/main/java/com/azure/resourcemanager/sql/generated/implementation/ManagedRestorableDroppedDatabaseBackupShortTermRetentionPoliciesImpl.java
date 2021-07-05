// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedBackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ManagedBackupShortTermRetentionPolicy;
import com.azure.resourcemanager.sql.generated.models.ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies;
import com.azure.resourcemanager.sql.generated.models.ManagedShortTermRetentionPolicyName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesImpl
    implements ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesImpl.class);

    private final ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesImpl(
        ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ManagedBackupShortTermRetentionPolicy get(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName) {
        ManagedBackupShortTermRetentionPolicyInner inner =
            this.serviceClient().get(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId, policyName);
        if (inner != null) {
            return new ManagedBackupShortTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedBackupShortTermRetentionPolicy> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        Context context) {
        Response<ManagedBackupShortTermRetentionPolicyInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, managedInstanceName, restorableDroppedDatabaseId, policyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedBackupShortTermRetentionPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedBackupShortTermRetentionPolicy createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters) {
        ManagedBackupShortTermRetentionPolicyInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, restorableDroppedDatabaseId, policyName, parameters);
        if (inner != null) {
            return new ManagedBackupShortTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedBackupShortTermRetentionPolicy createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters,
        Context context) {
        ManagedBackupShortTermRetentionPolicyInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    managedInstanceName,
                    restorableDroppedDatabaseId,
                    policyName,
                    parameters,
                    context);
        if (inner != null) {
            return new ManagedBackupShortTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedBackupShortTermRetentionPolicy update(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters) {
        ManagedBackupShortTermRetentionPolicyInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId, policyName, parameters);
        if (inner != null) {
            return new ManagedBackupShortTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedBackupShortTermRetentionPolicy update(
        String resourceGroupName,
        String managedInstanceName,
        String restorableDroppedDatabaseId,
        ManagedShortTermRetentionPolicyName policyName,
        ManagedBackupShortTermRetentionPolicyInner parameters,
        Context context) {
        ManagedBackupShortTermRetentionPolicyInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    managedInstanceName,
                    restorableDroppedDatabaseId,
                    policyName,
                    parameters,
                    context);
        if (inner != null) {
            return new ManagedBackupShortTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ManagedBackupShortTermRetentionPolicy> listByRestorableDroppedDatabase(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId) {
        PagedIterable<ManagedBackupShortTermRetentionPolicyInner> inner =
            this
                .serviceClient()
                .listByRestorableDroppedDatabase(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId);
        return Utils.mapPage(inner, inner1 -> new ManagedBackupShortTermRetentionPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedBackupShortTermRetentionPolicy> listByRestorableDroppedDatabase(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId, Context context) {
        PagedIterable<ManagedBackupShortTermRetentionPolicyInner> inner =
            this
                .serviceClient()
                .listByRestorableDroppedDatabase(
                    resourceGroupName, managedInstanceName, restorableDroppedDatabaseId, context);
        return Utils.mapPage(inner, inner1 -> new ManagedBackupShortTermRetentionPolicyImpl(inner1, this.manager()));
    }

    private ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
