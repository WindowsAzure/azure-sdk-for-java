// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.WorkloadItemResourceInner;

/** An instance of this class provides access to all the operations defined in BackupWorkloadItemsClient. */
public interface BackupWorkloadItemsClient {
    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkloadItemResourceInner> list(
        String vaultName, String resourceGroupName, String fabricName, String containerName);

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkloadItemResourceInner> list(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String filter,
        String skipToken,
        Context context);
}
