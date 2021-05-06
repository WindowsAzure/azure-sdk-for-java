// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

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
import com.azure.resourcemanager.policyinsights.fluent.PolicyMetadatasClient;
import com.azure.resourcemanager.policyinsights.fluent.models.PolicyMetadataInner;
import com.azure.resourcemanager.policyinsights.fluent.models.SlimPolicyMetadataInner;
import com.azure.resourcemanager.policyinsights.models.PolicyMetadataCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicyMetadatasClient. */
public final class PolicyMetadatasClientImpl implements PolicyMetadatasClient {
    private final ClientLogger logger = new ClientLogger(PolicyMetadatasClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PolicyMetadatasService service;

    /** The service client containing this operation class. */
    private final PolicyInsightsClientImpl client;

    /**
     * Initializes an instance of PolicyMetadatasClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PolicyMetadatasClientImpl(PolicyInsightsClientImpl client) {
        this.service =
            RestProxy.create(PolicyMetadatasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PolicyInsightsClientPolicyMetadatas to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PolicyInsightsClient")
    private interface PolicyMetadatasService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.PolicyInsights/policyMetadata/{resourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicyMetadataInner>> getResource(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceName", encoded = true) String resourceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.PolicyInsights/policyMetadata")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicyMetadataCollection>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$top") Integer top,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PolicyMetadataCollection>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy metadata resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyMetadataInner>> getResourceWithResponseAsync(String resourceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String apiVersion = "2019-10-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.getResource(this.client.getEndpoint(), resourceName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy metadata resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PolicyMetadataInner>> getResourceWithResponseAsync(String resourceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String apiVersion = "2019-10-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getResource(this.client.getEndpoint(), resourceName, apiVersion, accept, context);
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy metadata resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PolicyMetadataInner> getResourceAsync(String resourceName) {
        return getResourceWithResponseAsync(resourceName)
            .flatMap(
                (Response<PolicyMetadataInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy metadata resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyMetadataInner getResource(String resourceName) {
        return getResourceAsync(resourceName).block();
    }

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy metadata resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyMetadataInner> getResourceWithResponse(String resourceName, Context context) {
        return getResourceWithResponseAsync(resourceName, context).block();
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param top Maximum number of records to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SlimPolicyMetadataInner>> listSinglePageAsync(Integer top) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2019-10-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, top, accept, context))
            .<PagedResponse<SlimPolicyMetadataInner>>map(
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
     * Get a list of the policy metadata resources.
     *
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SlimPolicyMetadataInner>> listSinglePageAsync(Integer top, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2019-10-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, top, accept, context)
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
     * Get a list of the policy metadata resources.
     *
     * @param top Maximum number of records to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SlimPolicyMetadataInner> listAsync(Integer top) {
        return new PagedFlux<>(() -> listSinglePageAsync(top), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SlimPolicyMetadataInner> listAsync() {
        final Integer top = null;
        return new PagedFlux<>(() -> listSinglePageAsync(top), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SlimPolicyMetadataInner> listAsync(Integer top, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(top, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SlimPolicyMetadataInner> list() {
        final Integer top = null;
        return new PagedIterable<>(listAsync(top));
    }

    /**
     * Get a list of the policy metadata resources.
     *
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SlimPolicyMetadataInner> list(Integer top, Context context) {
        return new PagedIterable<>(listAsync(top, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SlimPolicyMetadataInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<SlimPolicyMetadataInner>>map(
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
     * @return collection of policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SlimPolicyMetadataInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
