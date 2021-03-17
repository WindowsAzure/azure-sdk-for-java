// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TenantConfigurations. */
public interface TenantConfigurations {
    /**
     * This operation applies changes from the specified Git branch to the configuration database. This is a long
     * running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @param parameters Deploy Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result.
     */
    OperationResultContract deploy(
        String resourceGroupName,
        String serviceName,
        ConfigurationIdName configurationName,
        DeployConfigurationParameters parameters);

    /**
     * This operation applies changes from the specified Git branch to the configuration database. This is a long
     * running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @param parameters Deploy Configuration parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result.
     */
    OperationResultContract deploy(
        String resourceGroupName,
        String serviceName,
        ConfigurationIdName configurationName,
        DeployConfigurationParameters parameters,
        Context context);

    /**
     * This operation creates a commit with the current configuration snapshot to the specified branch in the
     * repository. This is a long running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @param parameters Save Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result.
     */
    OperationResultContract save(
        String resourceGroupName,
        String serviceName,
        ConfigurationIdName configurationName,
        SaveConfigurationParameter parameters);

    /**
     * This operation creates a commit with the current configuration snapshot to the specified branch in the
     * repository. This is a long running operation and could take several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @param parameters Save Configuration parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result.
     */
    OperationResultContract save(
        String resourceGroupName,
        String serviceName,
        ConfigurationIdName configurationName,
        SaveConfigurationParameter parameters,
        Context context);

    /**
     * This operation validates the changes in the specified Git branch. This is a long running operation and could take
     * several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @param parameters Validate Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result.
     */
    OperationResultContract validate(
        String resourceGroupName,
        String serviceName,
        ConfigurationIdName configurationName,
        DeployConfigurationParameters parameters);

    /**
     * This operation validates the changes in the specified Git branch. This is a long running operation and could take
     * several minutes to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @param parameters Validate Configuration parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation Result.
     */
    OperationResultContract validate(
        String resourceGroupName,
        String serviceName,
        ConfigurationIdName configurationName,
        DeployConfigurationParameters parameters,
        Context context);

    /**
     * Gets the status of the most recent synchronization between the configuration database and the Git repository.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the most recent synchronization between the configuration database and the Git repository.
     */
    TenantConfigurationSyncStateContract getSyncState(
        String resourceGroupName, String serviceName, ConfigurationIdName configurationName);

    /**
     * Gets the status of the most recent synchronization between the configuration database and the Git repository.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param configurationName The identifier of the Git Configuration Operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the most recent synchronization between the configuration database and the Git repository.
     */
    Response<TenantConfigurationSyncStateContract> getSyncStateWithResponse(
        String resourceGroupName, String serviceName, ConfigurationIdName configurationName, Context context);
}
