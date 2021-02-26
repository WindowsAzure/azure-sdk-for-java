// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupRecoveryPointResourceInner;

/** An instance of this class provides access to all the operations defined in RecoveryPointOperationsClient. */
public interface RecoveryPointOperationsClient {
    /**
     * Gets a Recovery Point using recoveryPointId for a Datasource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param recoveryPointId The recoveryPointId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Recovery Point using recoveryPointId for a Datasource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureBackupRecoveryPointResourceInner get(
        String vaultName, String resourceGroupName, String backupInstanceName, String recoveryPointId);

    /**
     * Gets a Recovery Point using recoveryPointId for a Datasource.
     *
     * @param vaultName The name of the backup vault.
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param backupInstanceName The name of the backup instance.
     * @param recoveryPointId The recoveryPointId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Recovery Point using recoveryPointId for a Datasource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureBackupRecoveryPointResourceInner> getWithResponse(
        String vaultName, String resourceGroupName, String backupInstanceName, String recoveryPointId, Context context);
}
