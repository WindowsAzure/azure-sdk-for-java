// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.implementation;

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
import com.azure.resourcemanager.commerce.fluent.UsageAggregatesClient;
import com.azure.resourcemanager.commerce.fluent.models.UsageAggregationInner;
import com.azure.resourcemanager.commerce.models.AggregationGranularity;
import com.azure.resourcemanager.commerce.models.UsageAggregationListResult;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in UsageAggregatesClient. */
public final class UsageAggregatesClientImpl implements UsageAggregatesClient {
    private final ClientLogger logger = new ClientLogger(UsageAggregatesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final UsageAggregatesService service;

    /** The service client containing this operation class. */
    private final UsageManagementClientImpl client;

    /**
     * Initializes an instance of UsageAggregatesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    UsageAggregatesClientImpl(UsageManagementClientImpl client) {
        this.service =
            RestProxy.create(UsageAggregatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for UsageManagementClientUsageAggregates to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "UsageManagementClien")
    private interface UsageAggregatesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Commerce/UsageAggregates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsageAggregationListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("reportedStartTime") OffsetDateTime reportedStartTime,
            @QueryParam("reportedEndTime") OffsetDateTime reportedEndTime,
            @QueryParam("showDetails") Boolean showDetails,
            @QueryParam("aggregationGranularity") AggregationGranularity aggregationGranularity,
            @QueryParam("continuationToken") String continuationToken,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsageAggregationListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation
     *     with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for
     *     website consumption. If you specify showDetails = false, the data will be aggregated as a single line item
     *     for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and
     *     usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data
     *     in hourly granularity.
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous
     *     call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of
     *     the day/hour (based on the granularity) passed in.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageAggregationInner>> listSinglePageAsync(
        OffsetDateTime reportedStartTime,
        OffsetDateTime reportedEndTime,
        Boolean showDetails,
        AggregationGranularity aggregationGranularity,
        String continuationToken) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportedStartTime == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter reportedStartTime is required and cannot be null."));
        }
        if (reportedEndTime == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter reportedEndTime is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            reportedStartTime,
                            reportedEndTime,
                            showDetails,
                            aggregationGranularity,
                            continuationToken,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<UsageAggregationInner>>map(
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
     * Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation
     *     with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for
     *     website consumption. If you specify showDetails = false, the data will be aggregated as a single line item
     *     for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and
     *     usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data
     *     in hourly granularity.
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous
     *     call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of
     *     the day/hour (based on the granularity) passed in.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageAggregationInner>> listSinglePageAsync(
        OffsetDateTime reportedStartTime,
        OffsetDateTime reportedEndTime,
        Boolean showDetails,
        AggregationGranularity aggregationGranularity,
        String continuationToken,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportedStartTime == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter reportedStartTime is required and cannot be null."));
        }
        if (reportedEndTime == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter reportedEndTime is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                reportedStartTime,
                reportedEndTime,
                showDetails,
                aggregationGranularity,
                continuationToken,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
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
     * Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation
     *     with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for
     *     website consumption. If you specify showDetails = false, the data will be aggregated as a single line item
     *     for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and
     *     usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data
     *     in hourly granularity.
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous
     *     call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of
     *     the day/hour (based on the granularity) passed in.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageAggregationInner> listAsync(
        OffsetDateTime reportedStartTime,
        OffsetDateTime reportedEndTime,
        Boolean showDetails,
        AggregationGranularity aggregationGranularity,
        String continuationToken) {
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageAggregationInner> listAsync(
        OffsetDateTime reportedStartTime, OffsetDateTime reportedEndTime) {
        final Boolean showDetails = null;
        final AggregationGranularity aggregationGranularity = null;
        final String continuationToken = null;
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation
     *     with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for
     *     website consumption. If you specify showDetails = false, the data will be aggregated as a single line item
     *     for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and
     *     usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data
     *     in hourly granularity.
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous
     *     call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of
     *     the day/hour (based on the granularity) passed in.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageAggregationInner> listAsync(
        OffsetDateTime reportedStartTime,
        OffsetDateTime reportedEndTime,
        Boolean showDetails,
        AggregationGranularity aggregationGranularity,
        String continuationToken,
        Context context) {
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    reportedStartTime,
                    reportedEndTime,
                    showDetails,
                    aggregationGranularity,
                    continuationToken,
                    context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageAggregationInner> list(OffsetDateTime reportedStartTime, OffsetDateTime reportedEndTime) {
        final Boolean showDetails = null;
        final AggregationGranularity aggregationGranularity = null;
        final String continuationToken = null;
        return new PagedIterable<>(
            listAsync(reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken));
    }

    /**
     * Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation
     *     with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for
     *     website consumption. If you specify showDetails = false, the data will be aggregated as a single line item
     *     for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and
     *     usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data
     *     in hourly granularity.
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous
     *     call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of
     *     the day/hour (based on the granularity) passed in.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageAggregationInner> list(
        OffsetDateTime reportedStartTime,
        OffsetDateTime reportedEndTime,
        Boolean showDetails,
        AggregationGranularity aggregationGranularity,
        String continuationToken,
        Context context) {
        return new PagedIterable<>(
            listAsync(
                reportedStartTime, reportedEndTime, showDetails, aggregationGranularity, continuationToken, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageAggregationInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<UsageAggregationInner>>map(
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
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageAggregationInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json, text/json";
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
