// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupResourceStorageConfigsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceConfigResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfigResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceStorageConfigs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupResourceStorageConfigsImpl implements BackupResourceStorageConfigs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupResourceStorageConfigsImpl.class);

    private final BackupResourceStorageConfigsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public BackupResourceStorageConfigsImpl(
        BackupResourceStorageConfigsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BackupResourceConfigResource get(String vaultName, String resourceGroupName) {
        BackupResourceConfigResourceInner inner = this.serviceClient().get(vaultName, resourceGroupName);
        if (inner != null) {
            return new BackupResourceConfigResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupResourceConfigResource> getWithResponse(
        String vaultName, String resourceGroupName, Context context) {
        Response<BackupResourceConfigResourceInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupResourceConfigResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BackupResourceConfigResource update(
        String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        BackupResourceConfigResourceInner inner = this.serviceClient().update(vaultName, resourceGroupName, parameters);
        if (inner != null) {
            return new BackupResourceConfigResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupResourceConfigResource> updateWithResponse(
        String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters, Context context) {
        Response<BackupResourceConfigResourceInner> inner =
            this.serviceClient().updateWithResponse(vaultName, resourceGroupName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupResourceConfigResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void patch(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters) {
        this.serviceClient().patch(vaultName, resourceGroupName, parameters);
    }

    public Response<Void> patchWithResponse(
        String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters, Context context) {
        return this.serviceClient().patchWithResponse(vaultName, resourceGroupName, parameters, context);
    }

    private BackupResourceStorageConfigsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
