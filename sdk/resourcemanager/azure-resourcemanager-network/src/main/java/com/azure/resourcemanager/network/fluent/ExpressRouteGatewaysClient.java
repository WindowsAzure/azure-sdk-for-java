// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteGatewayInner;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteGatewayListInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExpressRouteGatewaysClient. */
public interface ExpressRouteGatewaysClient
    extends InnerSupportsGet<ExpressRouteGatewayInner>, InnerSupportsDelete<Void> {
    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteGatewayListInner>> listBySubscriptionWithResponseAsync();

    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteGatewayListInner> listBySubscriptionAsync();

    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayListInner listBySubscription();

    /**
     * Lists ExpressRoute gateways under a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteGatewayListInner> listBySubscriptionWithResponse(Context context);

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteGatewayListInner>> listByResourceGroupWithResponseAsync(String resourceGroupName);

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteGatewayListInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayListInner listByResourceGroup(String resourceGroupName);

    /**
     * Lists ExpressRoute gateways in a given resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExpressRoute gateways.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteGatewayListInner> listByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ExpressRouteGatewayInner>, ExpressRouteGatewayInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteGatewayInner>, ExpressRouteGatewayInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteGatewayInner>, ExpressRouteGatewayInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters,
        Context context);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteGatewayInner> createOrUpdateAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters);

    /**
     * Creates or updates a ExpressRoute gateway in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param putExpressRouteGatewayParameters ExpressRoute gateway resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        ExpressRouteGatewayInner putExpressRouteGatewayParameters,
        Context context);

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteGatewayInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName);

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteGatewayInner> getByResourceGroupAsync(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteGatewayInner getByResourceGroup(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Fetches the details of a ExpressRoute gateway in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute gateway resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteGatewayInner> getByResourceGroupWithResponse(
        String resourceGroupName, String expressRouteGatewayName, Context context);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String expressRouteGatewayName, Context context);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRouteGatewayName);

    /**
     * Deletes the specified ExpressRoute gateway in a resource group. An ExpressRoute gateway resource can only be
     * deleted when there are no connection subresources.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRouteGatewayName, Context context);
}
