// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.resourcemanager.network.fluent.AvailableResourceGroupDelegationsClient;
import com.azure.resourcemanager.network.fluent.models.AvailableDelegationInner;
import com.azure.resourcemanager.network.models.AvailableDelegationsResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in AvailableResourceGroupDelegationsClient.
 */
public final class AvailableResourceGroupDelegationsClientImpl implements AvailableResourceGroupDelegationsClient {
    private final ClientLogger logger = new ClientLogger(AvailableResourceGroupDelegationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AvailableResourceGroupDelegationsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of AvailableResourceGroupDelegationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AvailableResourceGroupDelegationsClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    AvailableResourceGroupDelegationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientAvailableResourceGroupDelegations to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface AvailableResourceGroupDelegationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/locations"
                + "/{location}/availableDelegations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AvailableDelegationsResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AvailableDelegationsResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this resource group in this region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailableDelegationInner>> listSinglePageAsync(
        String location, String resourceGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            location,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<AvailableDelegationInner>>map(
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
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this resource group in this region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailableDelegationInner>> listSinglePageAsync(
        String location, String resourceGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                location,
                resourceGroupName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
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
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this resource group in this region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AvailableDelegationInner> listAsync(String location, String resourceGroupName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, resourceGroupName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this resource group in this region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AvailableDelegationInner> listAsync(String location, String resourceGroupName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, resourceGroupName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this resource group in this region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailableDelegationInner> list(String location, String resourceGroupName) {
        return new PagedIterable<>(listAsync(location, resourceGroupName));
    }

    /**
     * Gets all of the available subnet delegations for this resource group in this region.
     *
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this resource group in this region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailableDelegationInner> list(String location, String resourceGroupName, Context context) {
        return new PagedIterable<>(listAsync(location, resourceGroupName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available delegations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailableDelegationInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AvailableDelegationInner>>map(
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
     * @return an array of available delegations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AvailableDelegationInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
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
