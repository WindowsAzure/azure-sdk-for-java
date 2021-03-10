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
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCircuitConnectionInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExpressRouteCircuitConnectionsClient. */
public interface ExpressRouteCircuitConnectionsClient {
    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context);

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Deletes the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context);

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteCircuitConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteCircuitConnectionInner> getAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitConnectionInner get(
        String resourceGroupName, String circuitName, String peeringName, String connectionName);

    /**
     * Gets the specified Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCircuitConnectionInner> getWithResponse(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context);

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit
     *     connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters);

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit
     *     connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ExpressRouteCircuitConnectionInner>, ExpressRouteCircuitConnectionInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String circuitName,
            String peeringName,
            String connectionName,
            ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters);

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit
     *     connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteCircuitConnectionInner>, ExpressRouteCircuitConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters);

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit
     *     connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteCircuitConnectionInner>, ExpressRouteCircuitConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters,
        Context context);

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit
     *     connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteCircuitConnectionInner> createOrUpdateAsync(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters);

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit
     *     connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitConnectionInner createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters);

    /**
     * Creates or updates a Express Route Circuit Connection in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the express route circuit connection.
     * @param expressRouteCircuitConnectionParameters Parameters supplied to the create or update express route circuit
     *     connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitConnectionInner createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters,
        Context context);

    /**
     * Gets all global reach connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ExpressRouteCircuitConnectionInner> listAsync(
        String resourceGroupName, String circuitName, String peeringName);

    /**
     * Gets all global reach connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitConnectionInner> list(
        String resourceGroupName, String circuitName, String peeringName);

    /**
     * Gets all global reach connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitConnectionInner> list(
        String resourceGroupName, String circuitName, String peeringName, Context context);
}
