// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectedItemsCrrsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectedItemResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupProtectedItemsCrrs;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupProtectedItemsCrrsImpl implements BackupProtectedItemsCrrs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupProtectedItemsCrrsImpl.class);

    private final BackupProtectedItemsCrrsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public BackupProtectedItemsCrrsImpl(
        BackupProtectedItemsCrrsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProtectedItemResource> list(String vaultName, String resourceGroupName) {
        PagedIterable<ProtectedItemResourceInner> inner = this.serviceClient().list(vaultName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ProtectedItemResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectedItemResource> list(
        String vaultName, String resourceGroupName, String filter, String skipToken, Context context) {
        PagedIterable<ProtectedItemResourceInner> inner =
            this.serviceClient().list(vaultName, resourceGroupName, filter, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new ProtectedItemResourceImpl(inner1, this.manager()));
    }

    private BackupProtectedItemsCrrsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
