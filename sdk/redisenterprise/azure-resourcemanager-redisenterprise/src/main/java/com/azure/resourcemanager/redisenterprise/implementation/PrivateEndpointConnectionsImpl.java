// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager;
import com.azure.resourcemanager.redisenterprise.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.redisenterprise.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.redisenterprise.models.PrivateEndpointConnection;
import com.azure.resourcemanager.redisenterprise.models.PrivateEndpointConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final RedisEnterpriseManager serviceManager;

    public PrivateEndpointConnectionsImpl(
        PrivateEndpointConnectionsClient innerClient, RedisEnterpriseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String clusterName) {
        PagedIterable<PrivateEndpointConnectionInner> inner = this.serviceClient().list(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> list(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PrivateEndpointConnection get(
        String resourceGroupName, String clusterName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String clusterName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String privateEndpointConnectionName) {
        this.serviceClient().delete(resourceGroupName, clusterName, privateEndpointConnectionName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String clusterName, String privateEndpointConnectionName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, context);
    }

    public PrivateEndpointConnection getById(String id) {
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
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
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
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, context);
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
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
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
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, clusterName, privateEndpointConnectionName, context);
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private RedisEnterpriseManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
