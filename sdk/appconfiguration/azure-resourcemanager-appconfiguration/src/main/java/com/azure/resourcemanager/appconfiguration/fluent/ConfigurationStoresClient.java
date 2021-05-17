// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appconfiguration.fluent.models.ApiKeyInner;
import com.azure.resourcemanager.appconfiguration.fluent.models.ConfigurationStoreInner;
import com.azure.resourcemanager.appconfiguration.models.ConfigurationStoreUpdateParameters;
import com.azure.resourcemanager.appconfiguration.models.RegenerateKeyParameters;

/** An instance of this class provides access to all the operations defined in ConfigurationStoresClient. */
public interface ConfigurationStoresClient {
    /**
     * Lists the configuration stores for a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration stores.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationStoreInner> list();

    /**
     * Lists the configuration stores for a given subscription.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration stores.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationStoreInner> list(String skipToken, Context context);

    /**
     * Lists the configuration stores for a given resource group.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration stores.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationStoreInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the configuration stores for a given resource group.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration stores.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationStoreInner> listByResourceGroup(
        String resourceGroupName, String skipToken, Context context);

    /**
     * Gets the properties of the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified configuration store.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationStoreInner getByResourceGroup(String resourceGroupName, String configStoreName);

    /**
     * Gets the properties of the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified configuration store.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationStoreInner> getByResourceGroupWithResponse(
        String resourceGroupName, String configStoreName, Context context);

    /**
     * Creates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreCreationParameters The parameters for creating a configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ConfigurationStoreInner>, ConfigurationStoreInner> beginCreate(
        String resourceGroupName, String configStoreName, ConfigurationStoreInner configStoreCreationParameters);

    /**
     * Creates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreCreationParameters The parameters for creating a configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ConfigurationStoreInner>, ConfigurationStoreInner> beginCreate(
        String resourceGroupName,
        String configStoreName,
        ConfigurationStoreInner configStoreCreationParameters,
        Context context);

    /**
     * Creates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreCreationParameters The parameters for creating a configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationStoreInner create(
        String resourceGroupName, String configStoreName, ConfigurationStoreInner configStoreCreationParameters);

    /**
     * Creates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreCreationParameters The parameters for creating a configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationStoreInner create(
        String resourceGroupName,
        String configStoreName,
        ConfigurationStoreInner configStoreCreationParameters,
        Context context);

    /**
     * Deletes a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String configStoreName);

    /**
     * Deletes a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String configStoreName, Context context);

    /**
     * Deletes a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String configStoreName);

    /**
     * Deletes a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String configStoreName, Context context);

    /**
     * Updates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreUpdateParameters The parameters for updating a configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ConfigurationStoreInner>, ConfigurationStoreInner> beginUpdate(
        String resourceGroupName,
        String configStoreName,
        ConfigurationStoreUpdateParameters configStoreUpdateParameters);

    /**
     * Updates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreUpdateParameters The parameters for updating a configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ConfigurationStoreInner>, ConfigurationStoreInner> beginUpdate(
        String resourceGroupName,
        String configStoreName,
        ConfigurationStoreUpdateParameters configStoreUpdateParameters,
        Context context);

    /**
     * Updates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreUpdateParameters The parameters for updating a configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationStoreInner update(
        String resourceGroupName,
        String configStoreName,
        ConfigurationStoreUpdateParameters configStoreUpdateParameters);

    /**
     * Updates a configuration store with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param configStoreUpdateParameters The parameters for updating a configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration store along with all resource properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationStoreInner update(
        String resourceGroupName,
        String configStoreName,
        ConfigurationStoreUpdateParameters configStoreUpdateParameters,
        Context context);

    /**
     * Lists the access key for the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list API keys.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiKeyInner> listKeys(String resourceGroupName, String configStoreName);

    /**
     * Lists the access key for the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list API keys.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiKeyInner> listKeys(
        String resourceGroupName, String configStoreName, String skipToken, Context context);

    /**
     * Regenerates an access key for the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param regenerateKeyParameters The parameters for regenerating an access key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API key used for authenticating with a configuration store endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiKeyInner regenerateKey(
        String resourceGroupName, String configStoreName, RegenerateKeyParameters regenerateKeyParameters);

    /**
     * Regenerates an access key for the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param regenerateKeyParameters The parameters for regenerating an access key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an API key used for authenticating with a configuration store endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiKeyInner> regenerateKeyWithResponse(
        String resourceGroupName,
        String configStoreName,
        RegenerateKeyParameters regenerateKeyParameters,
        Context context);
}
