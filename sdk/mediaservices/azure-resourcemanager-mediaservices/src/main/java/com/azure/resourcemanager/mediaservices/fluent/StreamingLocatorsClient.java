// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.ListContentKeysResponseInner;
import com.azure.resourcemanager.mediaservices.fluent.models.ListPathsResponseInner;
import com.azure.resourcemanager.mediaservices.fluent.models.StreamingLocatorInner;

/** An instance of this class provides access to all the operations defined in StreamingLocatorsClient. */
public interface StreamingLocatorsClient {
    /**
     * Lists the Streaming Locators in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of StreamingLocator items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StreamingLocatorInner> list(String resourceGroupName, String accountName);

    /**
     * Lists the Streaming Locators in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param filter Restricts the set of items returned.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param orderby Specifies the key by which the result collection should be ordered.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of StreamingLocator items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StreamingLocatorInner> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context);

    /**
     * Get the details of a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Streaming Locator in the Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingLocatorInner get(String resourceGroupName, String accountName, String streamingLocatorName);

    /**
     * Get the details of a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Streaming Locator in the Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StreamingLocatorInner> getWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context);

    /**
     * Create a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Streaming Locator resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingLocatorInner create(
        String resourceGroupName, String accountName, String streamingLocatorName, StreamingLocatorInner parameters);

    /**
     * Create a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Streaming Locator resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StreamingLocatorInner> createWithResponse(
        String resourceGroupName,
        String accountName,
        String streamingLocatorName,
        StreamingLocatorInner parameters,
        Context context);

    /**
     * Deletes a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String streamingLocatorName);

    /**
     * Deletes a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context);

    /**
     * List Content Keys used by this Streaming Locator.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class of response for listContentKeys action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListContentKeysResponseInner listContentKeys(
        String resourceGroupName, String accountName, String streamingLocatorName);

    /**
     * List Content Keys used by this Streaming Locator.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class of response for listContentKeys action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListContentKeysResponseInner> listContentKeysWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context);

    /**
     * List Paths supported by this Streaming Locator.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class of response for listPaths action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListPathsResponseInner listPaths(String resourceGroupName, String accountName, String streamingLocatorName);

    /**
     * List Paths supported by this Streaming Locator.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class of response for listPaths action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListPathsResponseInner> listPathsWithResponse(
        String resourceGroupName, String accountName, String streamingLocatorName, Context context);
}
