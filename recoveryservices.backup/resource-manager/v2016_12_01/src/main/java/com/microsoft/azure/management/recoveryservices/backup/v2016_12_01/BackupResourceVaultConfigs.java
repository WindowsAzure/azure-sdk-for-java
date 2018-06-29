/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.BackupResourceVaultConfigResourceInner;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.BackupResourceVaultConfigsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupResourceVaultConfigs.
 */
public interface BackupResourceVaultConfigs extends HasInner<BackupResourceVaultConfigsInner> {
    /**
     * Fetches resource vault config.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupResourceVaultConfigResource> getAsync(String vaultName, String resourceGroupName);

    /**
     * Updates vault security config.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters resource config request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupResourceVaultConfigResource> updateAsync(String vaultName, String resourceGroupName, BackupResourceVaultConfigResourceInner parameters);

}
