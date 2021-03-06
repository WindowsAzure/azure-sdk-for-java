// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.CrrOperationStatusClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.CrrOperationStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CrrOperationStatusImpl implements CrrOperationStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CrrOperationStatusImpl.class);

    private final CrrOperationStatusClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public CrrOperationStatusImpl(
        CrrOperationStatusClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationStatus get(String azureRegion, String operationId) {
        OperationStatusInner inner = this.serviceClient().get(azureRegion, operationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationStatus> getWithResponse(String azureRegion, String operationId, Context context) {
        Response<OperationStatusInner> inner = this.serviceClient().getWithResponse(azureRegion, operationId, context);
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

    private CrrOperationStatusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
