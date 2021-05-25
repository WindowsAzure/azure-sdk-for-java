// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupsClient;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupRequestResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.Backups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupsImpl implements Backups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupsImpl.class);

    private final BackupsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public BackupsImpl(
        BackupsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void trigger(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        BackupRequestResource parameters) {
        this
            .serviceClient()
            .trigger(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters);
    }

    public Response<Void> triggerWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        BackupRequestResource parameters,
        Context context) {
        return this
            .serviceClient()
            .triggerWithResponse(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters, context);
    }

    private BackupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
