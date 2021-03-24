// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

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
import com.azure.resourcemanager.compute.fluent.ResourceSkusClient;
import com.azure.resourcemanager.compute.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.compute.models.ResourceSkusResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceSkusClient. */
public final class ResourceSkusClientImpl implements ResourceSkusClient {
    private final ClientLogger logger = new ClientLogger(ResourceSkusClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ResourceSkusService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of ResourceSkusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceSkusClientImpl(ComputeManagementClientImpl client) {
        this.service =
            RestProxy.create(ResourceSkusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientResourceSkus to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface ResourceSkusService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/skus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ResourceSkusResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ResourceSkusResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceSkuInner>> listSinglePageAsync(String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            filter,
                            accept,
                            context))
            .<PagedResponse<ResourceSkuInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceSkuInner>> listSinglePageAsync(String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), filter, accept, context)
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
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ResourceSkuInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ResourceSkuInner> listAsync() {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ResourceSkuInner> listAsync(String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceSkuInner> list() {
        final String filter = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceSkuInner> list(String filter, Context context) {
        return new PagedIterable<>(listAsync(filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Resource Skus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceSkuInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<ResourceSkuInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Resource Skus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceSkuInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
