// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.AzureServiceClient;
import com.azure.resourcemanager.resources.fluent.FeaturesClient;
import com.azure.resourcemanager.resources.fluent.inner.OperationInner;
import com.azure.resourcemanager.resources.fluent.inner.OperationListResultInner;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the FeatureClient type. */
@ServiceClient(builder = FeatureClientBuilder.class)
public final class FeatureClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(FeatureClient.class);

    /** The proxy service used to perform REST calls. */
    private final FeatureClientService service;

    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The FeaturesClient object to access its operations. */
    private final FeaturesClient features;

    /**
     * Gets the FeaturesClient object to access its operations.
     *
     * @return the FeaturesClient object.
     */
    public FeaturesClient getFeatures() {
        return this.features;
    }

    /**
     * Initializes an instance of FeatureClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    FeatureClient(HttpPipeline httpPipeline, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2015-12-01";
        this.features = new FeaturesClient(this);
        this.service = RestProxy.create(FeatureClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for FeatureClient to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "FeatureClient")
    private interface FeatureClientService {
        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/providers/Microsoft.Features/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationListResultInner>> listOperations(
            @HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationListResultInner>> listOperationsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Lists all of the available Microsoft.Features REST API operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationInner>> listOperationsSinglePageAsync() {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listOperations(this.getEndpoint(), this.getApiVersion(), context))
            .<PagedResponse<OperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.getContext())));
    }

    /**
     * Lists all of the available Microsoft.Features REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationInner>> listOperationsSinglePageAsync(Context context) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        return service
            .listOperations(this.getEndpoint(), this.getApiVersion(), context)
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
     * Lists all of the available Microsoft.Features REST API operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OperationInner> listOperationsAsync() {
        return new PagedFlux<>(
            () -> listOperationsSinglePageAsync(), nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the available Microsoft.Features REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<OperationInner> listOperationsAsync(Context context) {
        return new PagedFlux<>(
            () -> listOperationsSinglePageAsync(context), nextLink -> listOperationsNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the available Microsoft.Features REST API operations.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationInner> listOperations() {
        return new PagedIterable<>(listOperationsAsync());
    }

    /**
     * Lists all of the available Microsoft.Features REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationInner> listOperations(Context context) {
        return new PagedIterable<>(listOperationsAsync(context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationInner>> listOperationsNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listOperationsNext(nextLink, context))
            .<PagedResponse<OperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<OperationInner>> listOperationsNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
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
