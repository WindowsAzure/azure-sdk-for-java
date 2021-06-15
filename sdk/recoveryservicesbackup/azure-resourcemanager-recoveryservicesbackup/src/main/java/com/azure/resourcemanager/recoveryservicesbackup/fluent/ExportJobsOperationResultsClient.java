// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationResultInfoBaseResourceInner;

/** An instance of this class provides access to all the operations defined in ExportJobsOperationResultsClient. */
public interface ExportJobsOperationResultsClient {
    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultInfoBaseResourceInner get(String vaultName, String resourceGroupName, String operationId);

    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID which represents the export job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationResultInfoBaseResourceInner> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context);
}
