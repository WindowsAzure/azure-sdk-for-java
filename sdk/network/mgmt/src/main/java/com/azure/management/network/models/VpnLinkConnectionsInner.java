// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.network.ErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VpnLinkConnections. */
public final class VpnLinkConnectionsInner {
    private final ClientLogger logger = new ClientLogger(VpnLinkConnectionsInner.class);

    /** The proxy service used to perform REST calls. */
    private final VpnLinkConnectionsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnLinkConnectionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VpnLinkConnectionsInner(NetworkManagementClientImpl client) {
        this.service =
            RestProxy.create(VpnLinkConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientVpnLinkConnections to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface VpnLinkConnectionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/vpnGateways/{gatewayName}/vpnConnections/{connectionName}/vpnLinkConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListVpnSiteLinkConnectionsResultInner>> listByVpnConnection(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("gatewayName") String gatewayName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListVpnSiteLinkConnectionsResultInner>> listByVpnConnectionNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnSiteLinkConnectionInner>> listByVpnConnectionSinglePageAsync(
        String resourceGroupName, String gatewayName, String connectionName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (gatewayName == null) {
            return Mono.error(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByVpnConnection(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            gatewayName,
                            connectionName,
                            apiVersion,
                            context))
            .<PagedResponse<VpnSiteLinkConnectionInner>>map(
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
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnSiteLinkConnectionInner>> listByVpnConnectionSinglePageAsync(
        String resourceGroupName, String gatewayName, String connectionName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (gatewayName == null) {
            return Mono.error(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        return service
            .listByVpnConnection(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                gatewayName,
                connectionName,
                apiVersion,
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
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnSiteLinkConnectionInner> listByVpnConnectionAsync(
        String resourceGroupName, String gatewayName, String connectionName) {
        return new PagedFlux<>(
            () -> listByVpnConnectionSinglePageAsync(resourceGroupName, gatewayName, connectionName),
            nextLink -> listByVpnConnectionNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnSiteLinkConnectionInner> listByVpnConnectionAsync(
        String resourceGroupName, String gatewayName, String connectionName, Context context) {
        return new PagedFlux<>(
            () -> listByVpnConnectionSinglePageAsync(resourceGroupName, gatewayName, connectionName, context),
            nextLink -> listByVpnConnectionNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves all vpn site link connections for a particular virtual wan vpn gateway vpn connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnSiteLinkConnectionInner> listByVpnConnection(
        String resourceGroupName, String gatewayName, String connectionName) {
        return new PagedIterable<>(listByVpnConnectionAsync(resourceGroupName, gatewayName, connectionName));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnSiteLinkConnectionInner>> listByVpnConnectionNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listByVpnConnectionNext(nextLink, context))
            .<PagedResponse<VpnSiteLinkConnectionInner>>map(
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
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnSiteLinkConnectionInner>> listByVpnConnectionNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listByVpnConnectionNext(nextLink, context)
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
