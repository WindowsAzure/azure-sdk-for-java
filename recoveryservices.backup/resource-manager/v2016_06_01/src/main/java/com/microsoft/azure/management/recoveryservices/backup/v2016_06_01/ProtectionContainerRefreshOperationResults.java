/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectionContainerRefreshOperationResultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectionContainerRefreshOperationResults.
 */
public interface ProtectionContainerRefreshOperationResults extends HasInner<ProtectionContainerRefreshOperationResultsInner> {
    /**
     * Provides the result of the refresh operation triggered by the BeginRefresh operation.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the container.
     * @param operationId The operation ID used for this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getAsync(String vaultName, String resourceGroupName, String fabricName, String operationId);

}
