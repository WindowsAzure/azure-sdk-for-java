// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.fluent.MonitoredResourcesClient;
import com.azure.resourcemanager.datadog.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.datadog.models.MonitoredResourceListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MonitoredResourcesClient. */
public final class MonitoredResourcesClientImpl implements MonitoredResourcesClient {
    private final ClientLogger logger = new ClientLogger(MonitoredResourcesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final MonitoredResourcesService service;

    /** The service client containing this operation class. */
    private final MicrosoftDatadogClientImpl client;

    /**
     * Initializes an instance of MonitoredResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MonitoredResourcesClientImpl(MicrosoftDatadogClientImpl client) {
        this.service =
            RestProxy.create(MonitoredResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftDatadogClientMonitoredResources to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftDatadogClie")
    private interface MonitoredResourcesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Datadog/monitors"
                + "/{monitorName}/listMonitoredResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MonitoredResourceListResponse>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("monitorName") String monitorName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MonitoredResourceListResponse>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List the resources currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MonitoredResourceInner>> listSinglePageAsync(
        String resourceGroupName, String monitorName) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            monitorName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<MonitoredResourceInner>>map(
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
     * List the resources currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MonitoredResourceInner>> listSinglePageAsync(
        String resourceGroupName, String monitorName, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                monitorName,
                this.client.getApiVersion(),
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
     * List the resources currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MonitoredResourceInner> listAsync(String resourceGroupName, String monitorName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, monitorName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List the resources currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MonitoredResourceInner> listAsync(String resourceGroupName, String monitorName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, monitorName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List the resources currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MonitoredResourceInner> list(String resourceGroupName, String monitorName) {
        return new PagedIterable<>(listAsync(resourceGroupName, monitorName));
    }

    /**
     * List the resources currently being monitored by the Datadog monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MonitoredResourceInner> list(String resourceGroupName, String monitorName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, monitorName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MonitoredResourceInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<MonitoredResourceInner>>map(
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
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MonitoredResourceInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
