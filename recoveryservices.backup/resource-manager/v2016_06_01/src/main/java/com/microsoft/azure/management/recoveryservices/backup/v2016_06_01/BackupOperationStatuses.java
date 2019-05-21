/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.BackupOperationStatusesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupOperationStatuses.
 */
public interface BackupOperationStatuses extends HasInner<BackupOperationStatusesInner> {
    /**
     * Gets the status of an operation such as triggering a backup or restore. The status can be In progress, Completed or Failed. You can refer to the OperationStatus enum for all the possible states of an operation. Some operations create jobs. This method returns the list of jobs when the operation is complete.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VaultOperationStatus> getAsync(String vaultName, String resourceGroupName, String operationId);

}
