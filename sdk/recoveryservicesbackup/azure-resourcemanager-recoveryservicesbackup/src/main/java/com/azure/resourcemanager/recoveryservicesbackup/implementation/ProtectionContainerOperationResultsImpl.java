// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionContainerOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionContainerResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainerOperationResults;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainerResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProtectionContainerOperationResultsImpl implements ProtectionContainerOperationResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectionContainerOperationResultsImpl.class);

    private final ProtectionContainerOperationResultsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ProtectionContainerOperationResultsImpl(
        ProtectionContainerOperationResultsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProtectionContainerResource get(
        String vaultName, String resourceGroupName, String fabricName, String containerName, String operationId) {
        ProtectionContainerResourceInner inner =
            this.serviceClient().get(vaultName, resourceGroupName, fabricName, containerName, operationId);
        if (inner != null) {
            return new ProtectionContainerResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProtectionContainerResource> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String operationId,
        Context context) {
        Response<ProtectionContainerResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(vaultName, resourceGroupName, fabricName, containerName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProtectionContainerResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProtectionContainerOperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
