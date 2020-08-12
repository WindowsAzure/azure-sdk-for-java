// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

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
import com.azure.resourcemanager.authorization.AuthorizationManagementClient;
import com.azure.resourcemanager.authorization.fluent.inner.ProviderOperationsMetadataInner;
import com.azure.resourcemanager.authorization.fluent.inner.ProviderOperationsMetadataListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProviderOperationsMetadatas. */
public final class ProviderOperationsMetadatasClient {
    private final ClientLogger logger = new ClientLogger(ProviderOperationsMetadatasClient.class);

    /** The proxy service used to perform REST calls. */
    private final ProviderOperationsMetadatasService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClient client;

    /**
     * Initializes an instance of ProviderOperationsMetadatasClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ProviderOperationsMetadatasClient(AuthorizationManagementClient client) {
        this.service =
            RestProxy
                .create(
                    ProviderOperationsMetadatasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientProviderOperationsMetadatas to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface ProviderOperationsMetadatasService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.Authorization/providerOperations/{resourceProviderNamespace}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProviderOperationsMetadataInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceProviderNamespace") String resourceProviderNamespace,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$expand") String expand,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.Authorization/providerOperations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProviderOperationsMetadataListResultInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$expand") String expand,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProviderOperationsMetadataListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ProviderOperationsMetadataInner>> getWithResponseAsync(
        String resourceProviderNamespace, String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter resourceProviderNamespace is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service.get(this.client.getEndpoint(), resourceProviderNamespace, apiVersion, expand, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ProviderOperationsMetadataInner>> getWithResponseAsync(
        String resourceProviderNamespace, String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter resourceProviderNamespace is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceProviderNamespace, apiVersion, expand, context);
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderOperationsMetadataInner> getAsync(String resourceProviderNamespace, String expand) {
        return getWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap(
                (Response<ProviderOperationsMetadataInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderOperationsMetadataInner> getAsync(
        String resourceProviderNamespace, String expand, Context context) {
        return getWithResponseAsync(resourceProviderNamespace, expand, context)
            .flatMap(
                (Response<ProviderOperationsMetadataInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ProviderOperationsMetadataInner> getAsync(String resourceProviderNamespace) {
        final String expand = null;
        final Context context = null;
        return getWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap(
                (Response<ProviderOperationsMetadataInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderOperationsMetadataInner get(String resourceProviderNamespace, String expand) {
        return getAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderOperationsMetadataInner get(String resourceProviderNamespace, String expand, Context context) {
        return getAsync(resourceProviderNamespace, expand, context).block();
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderOperationsMetadataInner get(String resourceProviderNamespace) {
        final String expand = null;
        final Context context = null;
        return getAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderOperationsMetadataInner>> listSinglePageAsync(String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, expand, context))
            .<PagedResponse<ProviderOperationsMetadataInner>>map(
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
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderOperationsMetadataInner>> listSinglePageAsync(String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, expand, context)
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
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderOperationsMetadataInner> listAsync(String expand) {
        return new PagedFlux<>(() -> listSinglePageAsync(expand), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderOperationsMetadataInner> listAsync(String expand, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(expand, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderOperationsMetadataInner> listAsync() {
        final String expand = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(expand), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderOperationsMetadataInner> list(String expand) {
        return new PagedIterable<>(listAsync(expand));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderOperationsMetadataInner> list(String expand, Context context) {
        return new PagedIterable<>(listAsync(expand, context));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderOperationsMetadataInner> list() {
        final String expand = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(expand));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderOperationsMetadataInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<ProviderOperationsMetadataInner>>map(
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
     * @return provider operations metadata list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderOperationsMetadataInner>> listNextSinglePageAsync(
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
