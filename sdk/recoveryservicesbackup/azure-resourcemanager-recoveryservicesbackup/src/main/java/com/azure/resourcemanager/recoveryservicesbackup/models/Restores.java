// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.Context;

/** Resource collection API of Restores. */
public interface Restores {
    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call,
     * use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void trigger(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        RestoreRequestResource parameters);

    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call,
     * use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void trigger(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        RestoreRequestResource parameters,
        Context context);
}
