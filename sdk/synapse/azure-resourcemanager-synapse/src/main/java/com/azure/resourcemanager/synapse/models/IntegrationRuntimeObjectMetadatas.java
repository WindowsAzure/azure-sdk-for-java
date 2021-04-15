// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IntegrationRuntimeObjectMetadatas. */
public interface IntegrationRuntimeObjectMetadatas {
    /**
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    SsisObjectMetadataListResponse list(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    Response<SsisObjectMetadataListResponse> listWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        GetSsisObjectMetadataRequest getMetadataRequest,
        Context context);

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    SsisObjectMetadataStatusResponse refresh(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    SsisObjectMetadataStatusResponse refresh(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);
}
