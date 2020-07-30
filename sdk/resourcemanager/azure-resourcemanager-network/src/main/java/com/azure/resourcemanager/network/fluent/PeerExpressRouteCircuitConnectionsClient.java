// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.NetworkManagementClient;
import com.azure.resourcemanager.network.fluent.inner.PeerExpressRouteCircuitConnectionInner;
import com.azure.resourcemanager.network.fluent.inner.PeerExpressRouteCircuitConnectionListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PeerExpressRouteCircuitConnections. */
public final class PeerExpressRouteCircuitConnectionsClient {
    private final ClientLogger logger = new ClientLogger(PeerExpressRouteCircuitConnectionsClient.class);

    /** The proxy service used to perform REST calls. */
    private final PeerExpressRouteCircuitConnectionsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClient client;

    /**
     * Initializes an instance of PeerExpressRouteCircuitConnectionsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PeerExpressRouteCircuitConnectionsClient(NetworkManagementClient client) {
        this.service =
            RestProxy
                .create(
                    PeerExpressRouteCircuitConnectionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientPeerExpressRouteCircuitConnections to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface PeerExpressRouteCircuitConnectionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteCircuits/{circuitName}/peerings/{peeringName}/peerConnections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeerExpressRouteCircuitConnectionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("circuitName") String circuitName,
            @PathParam("peeringName") String peeringName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteCircuits/{circuitName}/peerings/{peeringName}/peerConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeerExpressRouteCircuitConnectionListResultInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("circuitName") String circuitName,
            @PathParam("peeringName") String peeringName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeerExpressRouteCircuitConnectionListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PeerExpressRouteCircuitConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (circuitName == null) {
            return Mono.error(new IllegalArgumentException("Parameter circuitName is required and cannot be null."));
        }
        if (peeringName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peeringName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            circuitName,
                            peeringName,
                            connectionName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PeerExpressRouteCircuitConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (circuitName == null) {
            return Mono.error(new IllegalArgumentException("Parameter circuitName is required and cannot be null."));
        }
        if (peeringName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peeringName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                circuitName,
                peeringName,
                connectionName,
                apiVersion,
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PeerExpressRouteCircuitConnectionInner> getAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName)
            .flatMap(
                (Response<PeerExpressRouteCircuitConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PeerExpressRouteCircuitConnectionInner> getAsync(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, circuitName, peeringName, connectionName, context)
            .flatMap(
                (Response<PeerExpressRouteCircuitConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PeerExpressRouteCircuitConnectionInner get(
        String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        return getAsync(resourceGroupName, circuitName, peeringName, connectionName).block();
    }

    /**
     * Gets the specified Peer Express Route Circuit Connection from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param connectionName The name of the peer express route circuit connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Peer Express Route Circuit Connection from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PeerExpressRouteCircuitConnectionInner get(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context) {
        return getAsync(resourceGroupName, circuitName, peeringName, connectionName, context).block();
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PeerExpressRouteCircuitConnectionInner>> listSinglePageAsync(
        String resourceGroupName, String circuitName, String peeringName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (circuitName == null) {
            return Mono.error(new IllegalArgumentException("Parameter circuitName is required and cannot be null."));
        }
        if (peeringName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peeringName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            circuitName,
                            peeringName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<PeerExpressRouteCircuitConnectionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PeerExpressRouteCircuitConnectionInner>> listSinglePageAsync(
        String resourceGroupName, String circuitName, String peeringName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (circuitName == null) {
            return Mono.error(new IllegalArgumentException("Parameter circuitName is required and cannot be null."));
        }
        if (peeringName == null) {
            return Mono.error(new IllegalArgumentException("Parameter peeringName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                circuitName,
                peeringName,
                apiVersion,
                this.client.getSubscriptionId(),
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PeerExpressRouteCircuitConnectionInner> listAsync(
        String resourceGroupName, String circuitName, String peeringName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, circuitName, peeringName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PeerExpressRouteCircuitConnectionInner> listAsync(
        String resourceGroupName, String circuitName, String peeringName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, circuitName, peeringName, context),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeerExpressRouteCircuitConnectionInner> list(
        String resourceGroupName, String circuitName, String peeringName) {
        return new PagedIterable<>(listAsync(resourceGroupName, circuitName, peeringName));
    }

    /**
     * Gets all global reach peer connections associated with a private peering in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all global reach peer connections associated with a private peering in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeerExpressRouteCircuitConnectionInner> list(
        String resourceGroupName, String circuitName, String peeringName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, circuitName, peeringName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPeeredConnections API service call retrieves all global reach peer circuit connections
     *     that belongs to a Private Peering for an ExpressRouteCircuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PeerExpressRouteCircuitConnectionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<PeerExpressRouteCircuitConnectionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPeeredConnections API service call retrieves all global reach peer circuit connections
     *     that belongs to a Private Peering for an ExpressRouteCircuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PeerExpressRouteCircuitConnectionInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
