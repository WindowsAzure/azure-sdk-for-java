// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimeMonitoringDatasClient;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeMonitoringDataInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeMonitoringData;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeMonitoringDatas;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IntegrationRuntimeMonitoringDatasImpl implements IntegrationRuntimeMonitoringDatas {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeMonitoringDatasImpl.class);

    private final IntegrationRuntimeMonitoringDatasClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public IntegrationRuntimeMonitoringDatasImpl(
        IntegrationRuntimeMonitoringDatasClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IntegrationRuntimeMonitoringData list(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeMonitoringDataInner inner =
            this.serviceClient().list(resourceGroupName, workspaceName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeMonitoringDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeMonitoringData> listWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeMonitoringDataInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeMonitoringDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private IntegrationRuntimeMonitoringDatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
