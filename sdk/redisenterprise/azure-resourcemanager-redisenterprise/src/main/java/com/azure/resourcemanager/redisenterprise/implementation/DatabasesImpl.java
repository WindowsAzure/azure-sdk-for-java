// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redisenterprise.fluent.DatabasesClient;
import com.azure.resourcemanager.redisenterprise.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner;
import com.azure.resourcemanager.redisenterprise.models.AccessKeys;
import com.azure.resourcemanager.redisenterprise.models.Database;
import com.azure.resourcemanager.redisenterprise.models.Databases;
import com.azure.resourcemanager.redisenterprise.models.ExportClusterParameters;
import com.azure.resourcemanager.redisenterprise.models.ImportClusterParameters;
import com.azure.resourcemanager.redisenterprise.models.RegenerateKeyParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DatabasesImpl implements Databases {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasesImpl.class);

    private final DatabasesClient innerClient;

    private final com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager;

    public DatabasesImpl(
        DatabasesClient innerClient, com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Database> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<DatabaseInner> inner = this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public PagedIterable<Database> listByCluster(String resourceGroupName, String clusterName, Context context) {
        PagedIterable<DatabaseInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public Database get(String resourceGroupName, String clusterName, String databaseName) {
        DatabaseInner inner = this.serviceClient().get(resourceGroupName, clusterName, databaseName);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Database> getWithResponse(
        String resourceGroupName, String clusterName, String databaseName, Context context) {
        Response<DatabaseInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, databaseName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String databaseName) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName);
    }

    public void delete(String resourceGroupName, String clusterName, String databaseName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName, context);
    }

    public AccessKeys listKeys(String resourceGroupName, String clusterName, String databaseName) {
        AccessKeysInner inner = this.serviceClient().listKeys(resourceGroupName, clusterName, databaseName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName, String clusterName, String databaseName, Context context) {
        Response<AccessKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, clusterName, databaseName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKey(
        String resourceGroupName, String clusterName, String databaseName, RegenerateKeyParameters parameters) {
        AccessKeysInner inner =
            this.serviceClient().regenerateKey(resourceGroupName, clusterName, databaseName, parameters);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AccessKeys regenerateKey(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        RegenerateKeyParameters parameters,
        Context context) {
        AccessKeysInner inner =
            this.serviceClient().regenerateKey(resourceGroupName, clusterName, databaseName, parameters, context);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void importMethod(
        String resourceGroupName, String clusterName, String databaseName, ImportClusterParameters parameters) {
        this.serviceClient().importMethod(resourceGroupName, clusterName, databaseName, parameters);
    }

    public void importMethod(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        ImportClusterParameters parameters,
        Context context) {
        this.serviceClient().importMethod(resourceGroupName, clusterName, databaseName, parameters, context);
    }

    public void export(
        String resourceGroupName, String clusterName, String databaseName, ExportClusterParameters parameters) {
        this.serviceClient().export(resourceGroupName, clusterName, databaseName, parameters);
    }

    public void export(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        ExportClusterParameters parameters,
        Context context) {
        this.serviceClient().export(resourceGroupName, clusterName, databaseName, parameters, context);
    }

    public Database getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "redisEnterprise");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'redisEnterprise'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, databaseName, Context.NONE).getValue();
    }

    public Response<Database> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "redisEnterprise");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'redisEnterprise'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, databaseName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "redisEnterprise");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'redisEnterprise'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        this.delete(resourceGroupName, clusterName, databaseName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "redisEnterprise");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'redisEnterprise'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        this.delete(resourceGroupName, clusterName, databaseName, context);
    }

    private DatabasesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager() {
        return this.serviceManager;
    }

    public DatabaseImpl define(String name) {
        return new DatabaseImpl(name, this.manager());
    }
}
