/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.BackupResourceConfigResourceInner;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.BackupResourceStorageConfigsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupResourceStorageConfigs.
 */
public interface BackupResourceStorageConfigs extends HasInner<BackupResourceStorageConfigsInner> {
    /**
     * Fetches resource storage config.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupResourceConfigResource> getAsync(String vaultName, String resourceGroupName);

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupResourceConfigResource> updateAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters);

    /**
     * Updates vault storage model type.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters Vault storage config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable patchAsync(String vaultName, String resourceGroupName, BackupResourceConfigResourceInner parameters);

}
