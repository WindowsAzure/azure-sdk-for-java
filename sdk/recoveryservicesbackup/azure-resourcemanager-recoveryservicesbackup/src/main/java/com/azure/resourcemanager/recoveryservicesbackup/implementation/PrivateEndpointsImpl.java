// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.PrivateEndpointsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpoints;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointsImpl implements PrivateEndpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointsImpl.class);

    private final PrivateEndpointsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public PrivateEndpointsImpl(PrivateEndpointsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationStatus getOperationStatus(
        String vaultName, String resourceGroupName, String privateEndpointConnectionName, String operationId) {
        OperationStatusInner inner =
            this
                .serviceClient()
                .getOperationStatus(vaultName, resourceGroupName, privateEndpointConnectionName, operationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationStatus> getOperationStatusWithResponse(
        String vaultName,
        String resourceGroupName,
        String privateEndpointConnectionName,
        String operationId,
        Context context) {
        Response<OperationStatusInner> inner =
            this
                .serviceClient()
                .getOperationStatusWithResponse(
                    vaultName, resourceGroupName, privateEndpointConnectionName, operationId, context);
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

    private PrivateEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
