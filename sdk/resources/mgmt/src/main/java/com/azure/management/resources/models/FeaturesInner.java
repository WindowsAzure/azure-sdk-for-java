// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Features. */
public final class FeaturesInner {
    /** The proxy service used to perform REST calls. */
    private final FeaturesService service;

    /** The service client containing this operation class. */
    private final FeatureClientImpl client;

    /**
     * Initializes an instance of FeaturesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FeaturesInner(FeatureClientImpl client) {
        this.service = RestProxy.create(FeaturesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for FeatureClientFeatures to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "FeatureClientFeature")
    private interface FeaturesService {
        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Features/features")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FeatureOperationsListResultInner>> listAll(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}"
                + "/features")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FeatureOperationsListResultInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceProviderNamespace") String resourceProviderNamespace,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}"
                + "/features/{featureName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FeatureResultInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceProviderNamespace") String resourceProviderNamespace,
            @PathParam("featureName") String featureName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}"
                + "/features/{featureName}/register")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FeatureResultInner>> register(
            @HostParam("$host") String host,
            @PathParam("resourceProviderNamespace") String resourceProviderNamespace,
            @PathParam("featureName") String featureName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FeatureOperationsListResultInner>> listAllNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FeatureOperationsListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the preview features that are available through AFEC for the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FeatureResultInner>> listAllSinglePageAsync() {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listAll(
                            this.client.getHost(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<FeatureResultInner>>map(
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
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the preview features that are available through AFEC for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FeatureResultInner> listAllAsync() {
        return new PagedFlux<>(() -> listAllSinglePageAsync(), nextLink -> listAllNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the preview features that are available through AFEC for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FeatureResultInner> listAll() {
        return new PagedIterable<>(listAllAsync());
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the preview features in a provider namespace that are available through AFEC for the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FeatureResultInner>> listSinglePageAsync(String resourceProviderNamespace) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceProviderNamespace,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<FeatureResultInner>>map(
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
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the preview features in a provider namespace that are available through AFEC for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FeatureResultInner> listAsync(String resourceProviderNamespace) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceProviderNamespace), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the preview features in a provider namespace that are available through AFEC for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FeatureResultInner> list(String resourceProviderNamespace) {
        return new PagedIterable<>(listAsync(resourceProviderNamespace));
    }

    /**
     * Gets the preview feature with the specified name.
     *
     * @param resourceProviderNamespace The resource provider namespace for the feature.
     * @param featureName The name of the feature to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the preview feature with the specified name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FeatureResultInner>> getWithResponseAsync(
        String resourceProviderNamespace, String featureName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceProviderNamespace,
                            featureName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the preview feature with the specified name.
     *
     * @param resourceProviderNamespace The resource provider namespace for the feature.
     * @param featureName The name of the feature to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the preview feature with the specified name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FeatureResultInner> getAsync(String resourceProviderNamespace, String featureName) {
        return getWithResponseAsync(resourceProviderNamespace, featureName)
            .flatMap(
                (SimpleResponse<FeatureResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the preview feature with the specified name.
     *
     * @param resourceProviderNamespace The resource provider namespace for the feature.
     * @param featureName The name of the feature to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the preview feature with the specified name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FeatureResultInner get(String resourceProviderNamespace, String featureName) {
        return getAsync(resourceProviderNamespace, featureName).block();
    }

    /**
     * Registers the preview feature for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param featureName The name of the feature to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return previewed feature information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FeatureResultInner>> registerWithResponseAsync(
        String resourceProviderNamespace, String featureName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .register(
                            this.client.getHost(),
                            resourceProviderNamespace,
                            featureName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Registers the preview feature for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param featureName The name of the feature to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return previewed feature information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FeatureResultInner> registerAsync(String resourceProviderNamespace, String featureName) {
        return registerWithResponseAsync(resourceProviderNamespace, featureName)
            .flatMap(
                (SimpleResponse<FeatureResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Registers the preview feature for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param featureName The name of the feature to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return previewed feature information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FeatureResultInner register(String resourceProviderNamespace, String featureName) {
        return registerAsync(resourceProviderNamespace, featureName).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of previewed features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FeatureResultInner>> listAllNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listAllNext(nextLink, context))
            .<PagedResponse<FeatureResultInner>>map(
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
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of previewed features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FeatureResultInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<FeatureResultInner>>map(
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
}
