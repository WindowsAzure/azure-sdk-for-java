// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.WebSiteManagementClient;
import com.azure.resourcemanager.appservice.fluent.inner.CsmOperationCollectionInner;
import com.azure.resourcemanager.appservice.fluent.inner.CsmOperationDescriptionInner;
import com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DomainRegistrationProviders. */
public final class DomainRegistrationProvidersClient {
    private final ClientLogger logger = new ClientLogger(DomainRegistrationProvidersClient.class);

    /** The proxy service used to perform REST calls. */
    private final DomainRegistrationProvidersService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClient client;

    /**
     * Initializes an instance of DomainRegistrationProvidersClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DomainRegistrationProvidersClient(WebSiteManagementClient client) {
        this.service =
            RestProxy
                .create(
                    DomainRegistrationProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientDomainRegistrationProviders to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface DomainRegistrationProvidersService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.DomainRegistration/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<CsmOperationCollectionInner>> listOperations(
            @HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<CsmOperationCollectionInner>> listOperationsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context -> service.listOperations(this.client.getEndpoint(), this.client.getApiVersion(), context))
            .<PagedResponse<CsmOperationDescriptionInner>>map(
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
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listOperations(this.client.getEndpoint(), this.client.getApiVersion(), context)
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
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CsmOperationDescriptionInner> listOperationsAsync() {
        return new PagedFlux<>(
            () -> listOperationsSinglePageAsync(), nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CsmOperationDescriptionInner> listOperationsAsync(Context context) {
        return new PagedFlux<>(
            () -> listOperationsSinglePageAsync(context), nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CsmOperationDescriptionInner> listOperations() {
        return new PagedIterable<>(listOperationsAsync());
    }

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CsmOperationDescriptionInner> listOperations(Context context) {
        return new PagedIterable<>(listOperationsAsync(context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listOperationsNext(nextLink, context))
            .<PagedResponse<CsmOperationDescriptionInner>>map(
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
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CsmOperationDescriptionInner>> listOperationsNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listOperationsNext(nextLink, context)
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
