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

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectionContainerOperationResultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectionContainerOperationResults.
 */
public interface ProtectionContainerOperationResults extends HasInner<ProtectionContainerOperationResultsInner> {
    /**
     * Fetches the result of any operation on the container.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Container name whose information should be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainerBackupFabricVaultProtectionContainerResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String operationId);

}
