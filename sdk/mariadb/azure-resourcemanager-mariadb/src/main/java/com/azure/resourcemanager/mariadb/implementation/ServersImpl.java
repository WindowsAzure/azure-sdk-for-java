// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.fluent.ServersClient;
import com.azure.resourcemanager.mariadb.fluent.models.ServerInner;
import com.azure.resourcemanager.mariadb.models.Server;
import com.azure.resourcemanager.mariadb.models.Servers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServersImpl implements Servers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServersImpl.class);

    private final ServersClient innerClient;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    public ServersImpl(ServersClient innerClient, com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String serverName) {
        this.serviceClient().delete(resourceGroupName, serverName);
    }

    public void delete(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, context);
    }

    public Server getByResourceGroup(String resourceGroupName, String serverName) {
        ServerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, serverName);
        if (inner != null) {
            return new ServerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Server> getByResourceGroupWithResponse(
        String resourceGroupName, String serverName, Context context) {
        Response<ServerInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Server> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> list() {
        PagedIterable<ServerInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> list(Context context) {
        PagedIterable<ServerInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public void restart(String resourceGroupName, String serverName) {
        this.serviceClient().restart(resourceGroupName, serverName);
    }

    public void restart(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().restart(resourceGroupName, serverName, context);
    }

    public void start(String resourceGroupName, String serverName) {
        this.serviceClient().start(resourceGroupName, serverName);
    }

    public void start(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().start(resourceGroupName, serverName, context);
    }

    public void stop(String resourceGroupName, String serverName) {
        this.serviceClient().stop(resourceGroupName, serverName);
    }

    public void stop(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().stop(resourceGroupName, serverName, context);
    }

    public Server getById(String id) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, serverName, Context.NONE).getValue();
    }

    public Response<Server> getByIdWithResponse(String id, Context context) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, serverName, context);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        this.delete(resourceGroupName, serverName, Context.NONE);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        this.delete(resourceGroupName, serverName, context);
    }

    private ServersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }

    public ServerImpl define(String name) {
        return new ServerImpl(name, this.manager());
    }
}
