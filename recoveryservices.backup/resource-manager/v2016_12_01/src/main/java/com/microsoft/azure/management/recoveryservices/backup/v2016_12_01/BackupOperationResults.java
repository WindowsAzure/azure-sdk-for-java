/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.BackupOperationResultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupOperationResults.
 */
public interface BackupOperationResults extends HasInner<BackupOperationResultsInner> {
    /**
     * Provides the status of the delete operations such as deleting backed up item. Once the operation has started, the status code in the response would be Accepted. It will continue to be in this state till it reaches completion. On successful completion, the status code will be OK. This method expects OperationID as an argument. OperationID is part of the Location header of the operation response.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getAsync(String vaultName, String resourceGroupName, String operationId);

}
