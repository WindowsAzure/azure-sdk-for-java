// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WorkspaceManagedSqlServerRecoverableSqlpools. */
public interface WorkspaceManagedSqlServerRecoverableSqlpools {
    /**
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of recoverable sql pools for workspace managed sql server.
     */
    PagedIterable<RecoverableSqlPool> list(String resourceGroupName, String workspaceName);

    /**
     * Get list of recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of recoverable sql pools for workspace managed sql server.
     */
    PagedIterable<RecoverableSqlPool> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Get recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlComputeName The name of the sql compute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recoverable sql pools for workspace managed sql server.
     */
    RecoverableSqlPool get(String resourceGroupName, String workspaceName, String sqlComputeName);

    /**
     * Get recoverable sql pools for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlComputeName The name of the sql compute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recoverable sql pools for workspace managed sql server.
     */
    Response<RecoverableSqlPool> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlComputeName, Context context);
}
