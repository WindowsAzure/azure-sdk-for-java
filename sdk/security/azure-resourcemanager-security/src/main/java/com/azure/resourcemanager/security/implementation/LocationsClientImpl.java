// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

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
import com.azure.resourcemanager.security.fluent.LocationsClient;
import com.azure.resourcemanager.security.fluent.models.AscLocationInner;
import com.azure.resourcemanager.security.models.AscLocationList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public final class LocationsClientImpl implements LocationsClient {
    private final ClientLogger logger = new ClientLogger(LocationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LocationsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of LocationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LocationsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy.create(LocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterLocations to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterLocati")
    private interface LocationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/locations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AscLocationList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/locations/{ascLocation}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AscLocationInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("ascLocation") String ascLocation,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AscLocationList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AscLocationInner>> listSinglePageAsync() {
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
        final String apiVersion = "2015-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), accept, context))
            .<PagedResponse<AscLocationInner>>map(
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
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AscLocationInner>> listSinglePageAsync(Context context) {
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
        final String apiVersion = "2015-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), accept, context)
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
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AscLocationInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AscLocationInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AscLocationInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * The location of the responsible ASC of the specific subscription (home region). For each subscription there is
     * only one responsible location. The location in the response should be used to read or write other resources in
     * ASC according to their ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AscLocationInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Details of a specific location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ASC location of the subscription is in the "name" field.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AscLocationInner>> getWithResponseAsync(String ascLocation) {
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
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        final String apiVersion = "2015-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            ascLocation,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Details of a specific location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ASC location of the subscription is in the "name" field.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AscLocationInner>> getWithResponseAsync(String ascLocation, Context context) {
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
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        final String apiVersion = "2015-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), ascLocation, accept, context);
    }

    /**
     * Details of a specific location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ASC location of the subscription is in the "name" field.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AscLocationInner> getAsync(String ascLocation) {
        return getWithResponseAsync(ascLocation)
            .flatMap(
                (Response<AscLocationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Details of a specific location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ASC location of the subscription is in the "name" field.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AscLocationInner get(String ascLocation) {
        return getAsync(ascLocation).block();
    }

    /**
     * Details of a specific location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ASC location of the subscription is in the "name" field.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AscLocationInner> getWithResponse(String ascLocation, Context context) {
        return getWithResponseAsync(ascLocation, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AscLocationInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<AscLocationInner>>map(
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
     * @return list of locations where ASC saves your data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AscLocationInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
