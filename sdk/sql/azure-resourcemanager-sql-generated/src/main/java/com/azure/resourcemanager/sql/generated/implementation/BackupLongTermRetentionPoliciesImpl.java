// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.BackupLongTermRetentionPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.BackupLongTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.BackupLongTermRetentionPolicies;
import com.azure.resourcemanager.sql.generated.models.BackupLongTermRetentionPolicy;
import com.azure.resourcemanager.sql.generated.models.LongTermRetentionPolicyName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupLongTermRetentionPoliciesImpl implements BackupLongTermRetentionPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupLongTermRetentionPoliciesImpl.class);

    private final BackupLongTermRetentionPoliciesClient innerClient;

    private final SqlManager serviceManager;

    public BackupLongTermRetentionPoliciesImpl(
        BackupLongTermRetentionPoliciesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BackupLongTermRetentionPolicy get(
        String resourceGroupName, String serverName, String databaseName, LongTermRetentionPolicyName policyName) {
        BackupLongTermRetentionPolicyInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, policyName);
        if (inner != null) {
            return new BackupLongTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupLongTermRetentionPolicy> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        LongTermRetentionPolicyName policyName,
        Context context) {
        Response<BackupLongTermRetentionPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, databaseName, policyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupLongTermRetentionPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BackupLongTermRetentionPolicy listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        BackupLongTermRetentionPolicyInner inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        if (inner != null) {
            return new BackupLongTermRetentionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupLongTermRetentionPolicy> listByDatabaseWithResponse(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        Response<BackupLongTermRetentionPolicyInner> inner =
            this.serviceClient().listByDatabaseWithResponse(resourceGroupName, serverName, databaseName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupLongTermRetentionPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BackupLongTermRetentionPolicy getById(String id) {
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
        LongTermRetentionPolicyName policyName =
            LongTermRetentionPolicyName.fromString(Utils.getValueFromIdByName(id, "backupLongTermRetentionPolicies"));
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'backupLongTermRetentionPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, policyName, Context.NONE).getValue();
    }

    public Response<BackupLongTermRetentionPolicy> getByIdWithResponse(String id, Context context) {
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
        LongTermRetentionPolicyName policyName =
            LongTermRetentionPolicyName.fromString(Utils.getValueFromIdByName(id, "backupLongTermRetentionPolicies"));
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'backupLongTermRetentionPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, policyName, context);
    }

    private BackupLongTermRetentionPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public BackupLongTermRetentionPolicyImpl define(LongTermRetentionPolicyName name) {
        return new BackupLongTermRetentionPolicyImpl(name, this.manager());
    }
}
