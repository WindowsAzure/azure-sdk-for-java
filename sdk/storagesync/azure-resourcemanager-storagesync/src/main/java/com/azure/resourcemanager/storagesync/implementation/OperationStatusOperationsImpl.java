// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagesync.fluent.OperationStatusOperationsClient;
import com.azure.resourcemanager.storagesync.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.storagesync.models.OperationStatus;
import com.azure.resourcemanager.storagesync.models.OperationStatusOperations;
import com.azure.resourcemanager.storagesync.models.OperationStatusOperationsGetResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationStatusOperationsImpl implements OperationStatusOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationStatusOperationsImpl.class);

    private final OperationStatusOperationsClient innerClient;

    private final com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager;

    public OperationStatusOperationsImpl(
        OperationStatusOperationsClient innerClient,
        com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationStatus get(String resourceGroupName, String locationName, String workflowId, String operationId) {
        OperationStatusInner inner = this.serviceClient().get(resourceGroupName, locationName, workflowId, operationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationStatus> getWithResponse(
        String resourceGroupName, String locationName, String workflowId, String operationId, Context context) {
        OperationStatusOperationsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, locationName, workflowId, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationStatusOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagesync.StoragesyncManager manager() {
        return this.serviceManager;
    }
}
