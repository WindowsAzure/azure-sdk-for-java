// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.BackupShortTermRetentionPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.BackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.BackupShortTermRetentionPolicies;
import com.azure.resourcemanager.sql.generated.models.BackupShortTermRetentionPolicy;
import com.azure.resourcemanager.sql.generated.models.ShortTermRetentionPolicyName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupShortTermRetentionPoliciesImpl implements BackupShortTermRetentionPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupShortTermRetentionPoliciesImpl.class);

    private final BackupShortTermRetentionPoliciesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public BackupShortTermRetentionPoliciesImpl(
        BackupShortTermRetentionPoliciesClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BackupShortTermRetentionPolicy get(
        String resourceGroupName, String serverName, String databaseName, ShortTermRetentionPolicyName policyName) {
        BackupShortTermRetentionPolicyInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, policyName);
        if (inner != null) {
            return new BackupShortTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupShortTermRetentionPolicy> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ShortTermRetentionPolicyName policyName,
        Context context) {
        Response<BackupShortTermRetentionPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, databaseName, policyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupShortTermRetentionPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<BackupShortTermRetentionPolicy> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<BackupShortTermRetentionPolicyInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return Utils.mapPage(inner, inner1 -> new BackupShortTermRetentionPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<BackupShortTermRetentionPolicy> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        PagedIterable<BackupShortTermRetentionPolicyInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new BackupShortTermRetentionPolicyImpl(inner1, this.manager()));
    }

    public BackupShortTermRetentionPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        ShortTermRetentionPolicyName policyName =
            ShortTermRetentionPolicyName.fromString(Utils.getValueFromIdByName(id, "backupShortTermRetentionPolicies"));
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'backupShortTermRetentionPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, policyName, Context.NONE).getValue();
    }

    public Response<BackupShortTermRetentionPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        ShortTermRetentionPolicyName policyName =
            ShortTermRetentionPolicyName.fromString(Utils.getValueFromIdByName(id, "backupShortTermRetentionPolicies"));
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'backupShortTermRetentionPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, policyName, context);
    }

    private BackupShortTermRetentionPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public BackupShortTermRetentionPolicyImpl define(ShortTermRetentionPolicyName name) {
        return new BackupShortTermRetentionPolicyImpl(name, this.manager());
    }
}
