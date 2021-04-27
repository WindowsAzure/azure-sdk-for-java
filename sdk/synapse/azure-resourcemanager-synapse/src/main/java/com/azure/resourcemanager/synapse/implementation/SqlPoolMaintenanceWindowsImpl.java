// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolMaintenanceWindowsClient;
import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowsInner;
import com.azure.resourcemanager.synapse.models.MaintenanceWindows;
import com.azure.resourcemanager.synapse.models.SqlPoolMaintenanceWindows;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolMaintenanceWindowsImpl implements SqlPoolMaintenanceWindows {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolMaintenanceWindowsImpl.class);

    private final SqlPoolMaintenanceWindowsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolMaintenanceWindowsImpl(
        SqlPoolMaintenanceWindowsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public MaintenanceWindows get(
        String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowName) {
        MaintenanceWindowsInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName);
        if (inner != null) {
            return new MaintenanceWindowsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MaintenanceWindows> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String maintenanceWindowName,
        Context context) {
        Response<MaintenanceWindowsInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MaintenanceWindowsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String maintenanceWindowName,
        MaintenanceWindowsInner parameters) {
        this
            .serviceClient()
            .createOrUpdate(resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName, parameters);
    }

    public Response<Void> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String maintenanceWindowName,
        MaintenanceWindowsInner parameters,
        Context context) {
        return this
            .serviceClient()
            .createOrUpdateWithResponse(
                resourceGroupName, workspaceName, sqlPoolName, maintenanceWindowName, parameters, context);
    }

    private SqlPoolMaintenanceWindowsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
