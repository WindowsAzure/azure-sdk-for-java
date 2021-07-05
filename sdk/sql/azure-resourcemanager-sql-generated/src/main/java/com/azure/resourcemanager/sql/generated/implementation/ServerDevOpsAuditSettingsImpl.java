// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServerDevOpsAuditSettingsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerDevOpsAuditingSettingsInner;
import com.azure.resourcemanager.sql.generated.models.ServerDevOpsAuditSettings;
import com.azure.resourcemanager.sql.generated.models.ServerDevOpsAuditingSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerDevOpsAuditSettingsImpl implements ServerDevOpsAuditSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerDevOpsAuditSettingsImpl.class);

    private final ServerDevOpsAuditSettingsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ServerDevOpsAuditSettingsImpl(
        ServerDevOpsAuditSettingsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerDevOpsAuditingSettings get(
        String resourceGroupName, String serverName, String devOpsAuditingSettingsName) {
        ServerDevOpsAuditingSettingsInner inner =
            this.serviceClient().get(resourceGroupName, serverName, devOpsAuditingSettingsName);
        if (inner != null) {
            return new ServerDevOpsAuditingSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerDevOpsAuditingSettings> getWithResponse(
        String resourceGroupName, String serverName, String devOpsAuditingSettingsName, Context context) {
        Response<ServerDevOpsAuditingSettingsInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, devOpsAuditingSettingsName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerDevOpsAuditingSettingsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ServerDevOpsAuditingSettings> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerDevOpsAuditingSettingsInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerDevOpsAuditingSettingsImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerDevOpsAuditingSettings> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerDevOpsAuditingSettingsInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerDevOpsAuditingSettingsImpl(inner1, this.manager()));
    }

    public ServerDevOpsAuditingSettings getById(String id) {
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
        String devOpsAuditingSettingsName = Utils.getValueFromIdByName(id, "devOpsAuditingSettings");
        if (devOpsAuditingSettingsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'devOpsAuditingSettings'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, devOpsAuditingSettingsName, Context.NONE).getValue();
    }

    public Response<ServerDevOpsAuditingSettings> getByIdWithResponse(String id, Context context) {
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
        String devOpsAuditingSettingsName = Utils.getValueFromIdByName(id, "devOpsAuditingSettings");
        if (devOpsAuditingSettingsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'devOpsAuditingSettings'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, devOpsAuditingSettingsName, context);
    }

    private ServerDevOpsAuditSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ServerDevOpsAuditingSettingsImpl define(String name) {
        return new ServerDevOpsAuditingSettingsImpl(name, this.manager());
    }
}
