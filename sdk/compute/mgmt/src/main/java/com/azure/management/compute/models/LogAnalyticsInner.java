// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.compute.RequestRateByIntervalInput;
import com.azure.management.compute.ThrottledRequestsInput;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LogAnalytics. */
public final class LogAnalyticsInner {
    /** The proxy service used to perform REST calls. */
    private final LogAnalyticsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of LogAnalyticsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LogAnalyticsInner(ComputeManagementClientImpl client) {
        this.service =
            RestProxy.create(LogAnalyticsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientLogAnalytics to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface LogAnalyticsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics"
                + "/apiAccess/getRequestRateByInterval")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> exportRequestRateByInterval(
            @HostParam("$host") String host,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") RequestRateByIntervalInput parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics"
                + "/apiAccess/getThrottledRequests")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> exportThrottledRequests(
            @HostParam("$host") String host,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") ThrottledRequestsInput parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics"
                + "/apiAccess/getRequestRateByInterval")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LogAnalyticsOperationResultInner>> beginExportRequestRateByInterval(
            @HostParam("$host") String host,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") RequestRateByIntervalInput parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics"
                + "/apiAccess/getThrottledRequests")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<LogAnalyticsOperationResultInner>> beginExportThrottledRequests(
            @HostParam("$host") String host,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") ThrottledRequestsInput parameters,
            Context context);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> exportRequestRateByIntervalWithResponseAsync(
        String location, RequestRateByIntervalInput parameters) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .exportRequestRateByInterval(
                            this.client.getHost(),
                            location,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogAnalyticsOperationResultInner> exportRequestRateByIntervalAsync(
        String location, RequestRateByIntervalInput parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            exportRequestRateByIntervalWithResponseAsync(location, parameters);
        return this
            .client
            .<LogAnalyticsOperationResultInner, LogAnalyticsOperationResultInner>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                LogAnalyticsOperationResultInner.class,
                LogAnalyticsOperationResultInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResultInner exportRequestRateByInterval(
        String location, RequestRateByIntervalInput parameters) {
        return exportRequestRateByIntervalAsync(location, parameters).block();
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> exportThrottledRequestsWithResponseAsync(
        String location, ThrottledRequestsInput parameters) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .exportThrottledRequests(
                            this.client.getHost(),
                            location,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogAnalyticsOperationResultInner> exportThrottledRequestsAsync(
        String location, ThrottledRequestsInput parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = exportThrottledRequestsWithResponseAsync(location, parameters);
        return this
            .client
            .<LogAnalyticsOperationResultInner, LogAnalyticsOperationResultInner>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                LogAnalyticsOperationResultInner.class,
                LogAnalyticsOperationResultInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResultInner exportThrottledRequests(
        String location, ThrottledRequestsInput parameters) {
        return exportThrottledRequestsAsync(location, parameters).block();
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogAnalyticsOperationResultInner>> beginExportRequestRateByIntervalWithResponseAsync(
        String location, RequestRateByIntervalInput parameters) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginExportRequestRateByInterval(
                            this.client.getHost(),
                            location,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogAnalyticsOperationResultInner> beginExportRequestRateByIntervalAsync(
        String location, RequestRateByIntervalInput parameters) {
        return beginExportRequestRateByIntervalWithResponseAsync(location, parameters)
            .flatMap(
                (SimpleResponse<LogAnalyticsOperationResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResultInner beginExportRequestRateByInterval(
        String location, RequestRateByIntervalInput parameters) {
        return beginExportRequestRateByIntervalAsync(location, parameters).block();
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LogAnalyticsOperationResultInner>> beginExportThrottledRequestsWithResponseAsync(
        String location, ThrottledRequestsInput parameters) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginExportThrottledRequests(
                            this.client.getHost(),
                            location,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogAnalyticsOperationResultInner> beginExportThrottledRequestsAsync(
        String location, ThrottledRequestsInput parameters) {
        return beginExportThrottledRequestsWithResponseAsync(location, parameters)
            .flatMap(
                (SimpleResponse<LogAnalyticsOperationResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Api request input for LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogAnalyticsOperationResultInner beginExportThrottledRequests(
        String location, ThrottledRequestsInput parameters) {
        return beginExportThrottledRequestsAsync(location, parameters).block();
    }
}
