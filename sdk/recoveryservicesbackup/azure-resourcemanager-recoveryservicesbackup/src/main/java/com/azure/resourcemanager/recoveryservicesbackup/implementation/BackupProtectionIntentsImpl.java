// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectionIntentsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionIntentResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupProtectionIntents;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntentResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupProtectionIntentsImpl implements BackupProtectionIntents {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupProtectionIntentsImpl.class);

    private final BackupProtectionIntentsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public BackupProtectionIntentsImpl(
        BackupProtectionIntentsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProtectionIntentResource> list(String vaultName, String resourceGroupName) {
        PagedIterable<ProtectionIntentResourceInner> inner = this.serviceClient().list(vaultName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ProtectionIntentResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectionIntentResource> list(
        String vaultName, String resourceGroupName, String filter, String skipToken, Context context) {
        PagedIterable<ProtectionIntentResourceInner> inner =
            this.serviceClient().list(vaultName, resourceGroupName, filter, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new ProtectionIntentResourceImpl(inner1, this.manager()));
    }

    private BackupProtectionIntentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
