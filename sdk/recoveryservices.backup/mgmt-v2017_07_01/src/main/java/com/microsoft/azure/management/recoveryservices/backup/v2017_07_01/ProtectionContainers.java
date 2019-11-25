/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.ProtectionContainersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectionContainers.
 */
public interface ProtectionContainers extends SupportsCreating<BackupFabricVaultProtectionContainerResource.DefinitionStages.Blank>, HasInner<ProtectionContainersInner> {
    /**
     * Inquires all the protectable item in the given container that can be protected.
     * Inquires all the protectable items that are protectable under the given container.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric Name associated with the container.
     * @param containerName Name of the container in which inquiry needs to be triggered.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable inquireAsync(String vaultName, String resourceGroupName, String fabricName, String containerName);

    /**
     * Gets details of the specific container registered to your Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Name of the fabric where the container belongs.
     * @param containerName Name of the container whose details need to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupFabricVaultProtectionContainerResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName);

    /**
     * Unregisters the given container from your Recovery Services Vault.
                This is an asynchronous operation. To determine whether the backend service has finished processing the request, call Get Container Operation Result API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Name of the fabric where the container belongs.
     * @param containerName Name of the container which needs to be unregistered from the Recovery Services Vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable unregisterAsync(String vaultName, String resourceGroupName, String fabricName, String containerName);

    /**
     * Discovers all the containers in the subscription that can be backed up to Recovery Services Vault. This is an asynchronous operation. To know the status of the operation, call GetRefreshOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable refreshAsync(String vaultName, String resourceGroupName, String fabricName);

}
