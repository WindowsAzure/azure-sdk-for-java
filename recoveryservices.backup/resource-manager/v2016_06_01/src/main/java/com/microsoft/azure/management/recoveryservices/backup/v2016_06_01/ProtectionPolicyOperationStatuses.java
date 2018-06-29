/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ProtectionPolicyOperationStatusesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectionPolicyOperationStatuses.
 */
public interface ProtectionPolicyOperationStatuses extends HasInner<ProtectionPolicyOperationStatusesInner> {
    /**
     * Provides the status of the asynchronous operations like backup or restore. The status can be: in progress, completed, or failed. You can refer to the Operation Status enumeration for the possible states of an operation. Some operations create jobs. This method returns the list of jobs associated with the operation.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy name used in this GET operation.
     * @param operationId The ID associated with this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupPolicyVaultOperationStatus> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId);

}
