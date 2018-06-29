/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.BackupProtectableItemsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupProtectableItems.
 */
public interface BackupProtectableItems extends HasInner<BackupProtectableItemsInner> {
    /**
     * Provides a pageable list of protectable objects within your subscription according to the query filter and the pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkloadProtectableItemResource> listAsync(final String vaultName, final String resourceGroupName);

}
