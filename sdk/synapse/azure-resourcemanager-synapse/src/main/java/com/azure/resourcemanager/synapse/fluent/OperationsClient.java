// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.AvailableRpOperationInner;
import com.azure.resourcemanager.synapse.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.synapse.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.synapse.models.CheckNameAvailabilityRequest;
import java.util.List;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * Check whether a workspace name is available.
     *
     * @param request The check request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a response saying whether the workspace name is available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseInner checkNameAvailability(CheckNameAvailabilityRequest request);

    /**
     * Check whether a workspace name is available.
     *
     * @param request The check request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a response saying whether the workspace name is available.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest request, Context context);

    /**
     * Get all available operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<AvailableRpOperationInner> list();

    /**
     * Get all available operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<AvailableRpOperationInner>> listWithResponse(Context context);

    /**
     * Get the result of an operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getLocationHeaderResult(String resourceGroupName, String workspaceName, String operationId);

    /**
     * Get the result of an operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getLocationHeaderResultWithResponse(
        String resourceGroupName, String workspaceName, String operationId, Context context);

    /**
     * Get the status of an operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResourceInner getAzureAsyncHeaderResult(
        String resourceGroupName, String workspaceName, String operationId);

    /**
     * Get the status of an operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationResourceInner> getAzureAsyncHeaderResultWithResponse(
        String resourceGroupName, String workspaceName, String operationId, Context context);
}
