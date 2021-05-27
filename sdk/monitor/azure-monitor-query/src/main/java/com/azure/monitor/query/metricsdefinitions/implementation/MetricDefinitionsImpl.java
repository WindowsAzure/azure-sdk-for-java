// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.metricsdefinitions.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.monitor.query.metricsdefinitions.implementation.models.ErrorResponseException;
import com.azure.monitor.query.metricsdefinitions.implementation.models.MetricDefinitionCollection;
import com.azure.monitor.query.models.MetricsDefinition;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MetricDefinitions. */
public final class MetricDefinitionsImpl {
    /** The proxy service used to perform REST calls. */
    private final MetricDefinitionsService service;

    /** The service client containing this operation class. */
    private final MetricsDefinitionsClientImpl client;

    /**
     * Initializes an instance of MetricDefinitionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MetricDefinitionsImpl(MetricsDefinitionsClientImpl client) {
        this.service =
                RestProxy.create(
                        MetricDefinitionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MetricsDefinitionsClientMetricDefinitions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MetricsDefinitionsCl")
    private interface MetricDefinitionsService {
        @Get("/{resourceUri}/providers/microsoft.insights/metricDefinitions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<MetricDefinitionCollection>> list(
                @HostParam("$host") String host,
                @PathParam(value = "resourceUri", encoded = true) String resourceUri,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("metricnamespace") String metricnamespace,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<MetricsDefinition>> listSinglePageAsync(String resourceUri, String metricnamespace) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.list(
                                        this.client.getHost(),
                                        resourceUri,
                                        this.client.getApiVersion(),
                                        metricnamespace,
                                        accept,
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        null,
                                        null));
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<MetricsDefinition>> listSinglePageAsync(
            String resourceUri, String metricnamespace, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.list(
                        this.client.getHost(),
                        resourceUri,
                        this.client.getApiVersion(),
                        metricnamespace,
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        null,
                                        null));
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<MetricsDefinition> listAsync(String resourceUri, String metricnamespace) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceUri, metricnamespace));
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<MetricsDefinition> listAsync(String resourceUri, String metricnamespace, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceUri, metricnamespace, context));
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MetricsDefinition> list(String resourceUri, String metricnamespace) {
        return new PagedIterable<>(listAsync(resourceUri, metricnamespace));
    }

    /**
     * Lists the metric definitions for the resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents collection of metric definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MetricsDefinition> list(String resourceUri, String metricnamespace, Context context) {
        return new PagedIterable<>(listAsync(resourceUri, metricnamespace, context));
    }
}
