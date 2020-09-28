// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.PublicIpPrefixInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PublicIpPrefixesClient. */
public interface PublicIpPrefixesClient
    extends InnerSupportsGet<PublicIpPrefixInner>,
        InnerSupportsListing<PublicIpPrefixInner>,
        InnerSupportsDelete<Void> {
    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String publicIpPrefixName);

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String publicIpPrefixName);

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String publicIpPrefixName);

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String publicIpPrefixName, Context context);

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String publicIpPrefixName);

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String publicIpPrefixName);

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String publicIpPrefixName, Context context);

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PublicIpPrefixInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String publicIpPrefixName, String expand);

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PublicIpPrefixInner> getByResourceGroupAsync(
        String resourceGroupName, String publicIpPrefixName, String expand);

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PublicIpPrefixInner> getByResourceGroupAsync(String resourceGroupName, String publicIpPrefixName);

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpPrefixInner getByResourceGroup(String resourceGroupName, String publicIpPrefixName);

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PublicIpPrefixInner> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpPrefixName, String expand, Context context);

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefixInner parameters);

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<PublicIpPrefixInner>, PublicIpPrefixInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefixInner parameters);

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PublicIpPrefixInner>, PublicIpPrefixInner> beginCreateOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefixInner parameters);

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PublicIpPrefixInner>, PublicIpPrefixInner> beginCreateOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefixInner parameters, Context context);

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PublicIpPrefixInner> createOrUpdateAsync(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefixInner parameters);

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpPrefixInner createOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefixInner parameters);

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpPrefixInner createOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefixInner parameters, Context context);

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PublicIpPrefixInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String publicIpPrefixName, Map<String, String> tags);

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PublicIpPrefixInner> updateTagsAsync(
        String resourceGroupName, String publicIpPrefixName, Map<String, String> tags);

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PublicIpPrefixInner> updateTagsAsync(String resourceGroupName, String publicIpPrefixName);

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PublicIpPrefixInner updateTags(String resourceGroupName, String publicIpPrefixName);

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PublicIpPrefixInner> updateTagsWithResponse(
        String resourceGroupName, String publicIpPrefixName, Map<String, String> tags, Context context);

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PublicIpPrefixInner> listAsync();

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpPrefixInner> list();

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpPrefixInner> list(Context context);

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PublicIpPrefixInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpPrefixInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PublicIpPrefixInner> listByResourceGroup(String resourceGroupName, Context context);
}
