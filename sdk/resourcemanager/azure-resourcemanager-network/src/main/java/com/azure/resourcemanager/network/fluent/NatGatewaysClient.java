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
import com.azure.resourcemanager.network.fluent.models.NatGatewayInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NatGatewaysClient. */
public interface NatGatewaysClient
    extends InnerSupportsGet<NatGatewayInner>, InnerSupportsListing<NatGatewayInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String natGatewayName);

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String natGatewayName);

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String natGatewayName);

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String natGatewayName, Context context);

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String natGatewayName);

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String natGatewayName);

    /**
     * Deletes the specified nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String natGatewayName, Context context);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NatGatewayInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String natGatewayName, String expand);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NatGatewayInner> getByResourceGroupAsync(String resourceGroupName, String natGatewayName, String expand);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NatGatewayInner> getByResourceGroupAsync(String resourceGroupName, String natGatewayName);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NatGatewayInner getByResourceGroup(String resourceGroupName, String natGatewayName);

    /**
     * Gets the specified nat gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified nat gateway in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NatGatewayInner> getByResourceGroupWithResponse(
        String resourceGroupName, String natGatewayName, String expand, Context context);

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Parameters supplied to the create or update nat gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String natGatewayName, NatGatewayInner parameters);

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Parameters supplied to the create or update nat gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<NatGatewayInner>, NatGatewayInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String natGatewayName, NatGatewayInner parameters);

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Parameters supplied to the create or update nat gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NatGatewayInner>, NatGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String natGatewayName, NatGatewayInner parameters);

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Parameters supplied to the create or update nat gateway operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NatGatewayInner>, NatGatewayInner> beginCreateOrUpdate(
        String resourceGroupName, String natGatewayName, NatGatewayInner parameters, Context context);

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Parameters supplied to the create or update nat gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NatGatewayInner> createOrUpdateAsync(
        String resourceGroupName, String natGatewayName, NatGatewayInner parameters);

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Parameters supplied to the create or update nat gateway operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NatGatewayInner createOrUpdate(String resourceGroupName, String natGatewayName, NatGatewayInner parameters);

    /**
     * Creates or updates a nat gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param parameters Parameters supplied to the create or update nat gateway operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NatGatewayInner createOrUpdate(
        String resourceGroupName, String natGatewayName, NatGatewayInner parameters, Context context);

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NatGatewayInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String natGatewayName, Map<String, String> tags);

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NatGatewayInner> updateTagsAsync(String resourceGroupName, String natGatewayName, Map<String, String> tags);

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NatGatewayInner> updateTagsAsync(String resourceGroupName, String natGatewayName);

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NatGatewayInner updateTags(String resourceGroupName, String natGatewayName);

    /**
     * Updates nat gateway tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param natGatewayName The name of the nat gateway.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return nat Gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NatGatewayInner> updateTagsWithResponse(
        String resourceGroupName, String natGatewayName, Map<String, String> tags, Context context);

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NatGatewayInner> listAsync();

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NatGatewayInner> list();

    /**
     * Gets all the Nat Gateways in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Nat Gateways in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NatGatewayInner> list(Context context);

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NatGatewayInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NatGatewayInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all nat gateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all nat gateways in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NatGatewayInner> listByResourceGroup(String resourceGroupName, Context context);
}
