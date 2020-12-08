// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ServerAutomaticTuningsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerAutomaticTuningInner;
import com.azure.resourcemanager.sql.generated.models.ServerAutomaticTuning;
import com.azure.resourcemanager.sql.generated.models.ServerAutomaticTunings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerAutomaticTuningsImpl implements ServerAutomaticTunings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAutomaticTuningsImpl.class);

    private final ServerAutomaticTuningsClient innerClient;

    private final SqlManager serviceManager;

    public ServerAutomaticTuningsImpl(ServerAutomaticTuningsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerAutomaticTuning get(String resourceGroupName, String serverName) {
        ServerAutomaticTuningInner inner = this.serviceClient().get(resourceGroupName, serverName);
        if (inner != null) {
            return new ServerAutomaticTuningImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerAutomaticTuning> getWithResponse(
        String resourceGroupName, String serverName, Context context) {
        Response<ServerAutomaticTuningInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerAutomaticTuningImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerAutomaticTuning update(
        String resourceGroupName, String serverName, ServerAutomaticTuningInner parameters) {
        ServerAutomaticTuningInner inner = this.serviceClient().update(resourceGroupName, serverName, parameters);
        if (inner != null) {
            return new ServerAutomaticTuningImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerAutomaticTuning> updateWithResponse(
        String resourceGroupName, String serverName, ServerAutomaticTuningInner parameters, Context context) {
        Response<ServerAutomaticTuningInner> inner =
            this.serviceClient().updateWithResponse(resourceGroupName, serverName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerAutomaticTuningImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ServerAutomaticTuningsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
