// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.LogAnalyticsOperationResultInner;
import com.azure.resourcemanager.compute.models.LogAnalyticsInputBase;
import com.azure.resourcemanager.compute.models.RequestRateByIntervalInput;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LogAnalyticsClient. */
public interface LogAnalyticsClient {
    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> exportRequestRateByIntervalWithResponseAsync(
        String location, RequestRateByIntervalInput parameters);

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>
        beginExportRequestRateByIntervalAsync(String location, RequestRateByIntervalInput parameters);

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>
        beginExportRequestRateByInterval(String location, RequestRateByIntervalInput parameters);

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>
        beginExportRequestRateByInterval(String location, RequestRateByIntervalInput parameters, Context context);

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogAnalyticsOperationResultInner> exportRequestRateByIntervalAsync(
        String location, RequestRateByIntervalInput parameters);

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogAnalyticsOperationResultInner exportRequestRateByInterval(
        String location, RequestRateByIntervalInput parameters);

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogAnalyticsOperationResultInner exportRequestRateByInterval(
        String location, RequestRateByIntervalInput parameters, Context context);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> exportThrottledRequestsWithResponseAsync(
        String location, LogAnalyticsInputBase parameters);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>
        beginExportThrottledRequestsAsync(String location, LogAnalyticsInputBase parameters);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>
        beginExportThrottledRequests(String location, LogAnalyticsInputBase parameters);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>
        beginExportThrottledRequests(String location, LogAnalyticsInputBase parameters, Context context);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogAnalyticsOperationResultInner> exportThrottledRequestsAsync(
        String location, LogAnalyticsInputBase parameters);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogAnalyticsOperationResultInner exportThrottledRequests(String location, LogAnalyticsInputBase parameters);

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogAnalyticsOperationResultInner exportThrottledRequests(
        String location, LogAnalyticsInputBase parameters, Context context);
}
