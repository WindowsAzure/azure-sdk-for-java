// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.monitor.ErrorResponseException;
import com.azure.management.monitor.ResultType;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Metrics. */
public final class MetricsInner {
    /** The proxy service used to perform REST calls. */
    private final MetricsService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of MetricsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MetricsInner(MonitorClientImpl client) {
        this.service = RestProxy.create(MetricsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientMetrics to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientMetrics")
    private interface MetricsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/{resourceUri}/providers/microsoft.insights/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<ResponseInner>> list(
            @HostParam("$host") String host,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("timespan") String timespan,
            @QueryParam("interval") Duration interval,
            @QueryParam("metricnames") String metricnames,
            @QueryParam("aggregation") String aggregation,
            @QueryParam("top") Integer top,
            @QueryParam("orderby") String orderby,
            @QueryParam("$filter") String filter,
            @QueryParam("resultType") ResultType resultType,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("metricnamespace") String metricnamespace,
            Context context);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ResponseInner>> listWithResponseAsync(
        String resourceUri,
        String timespan,
        Duration interval,
        String metricnames,
        String aggregation,
        Integer top,
        String orderby,
        String filter,
        ResultType resultType,
        String metricnamespace) {
        final String apiVersion = "2018-01-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceUri,
                            timespan,
                            interval,
                            metricnames,
                            aggregation,
                            top,
                            orderby,
                            filter,
                            resultType,
                            apiVersion,
                            metricnamespace,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseInner> listAsync(
        String resourceUri,
        String timespan,
        Duration interval,
        String metricnames,
        String aggregation,
        Integer top,
        String orderby,
        String filter,
        ResultType resultType,
        String metricnamespace) {
        return listWithResponseAsync(
                resourceUri,
                timespan,
                interval,
                metricnames,
                aggregation,
                top,
                orderby,
                filter,
                resultType,
                metricnamespace)
            .flatMap(
                (SimpleResponse<ResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseInner> listAsync(String resourceUri) {
        final String timespan = null;
        final Duration interval = null;
        final String metricnames = null;
        final String aggregation = null;
        final Integer top = null;
        final String orderby = null;
        final String filter = null;
        final ResultType resultType = null;
        final String metricnamespace = null;
        final Context context = null;
        return listWithResponseAsync(
                resourceUri,
                timespan,
                interval,
                metricnames,
                aggregation,
                top,
                orderby,
                filter,
                resultType,
                metricnamespace)
            .flatMap(
                (SimpleResponse<ResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseInner list(
        String resourceUri,
        String timespan,
        Duration interval,
        String metricnames,
        String aggregation,
        Integer top,
        String orderby,
        String filter,
        ResultType resultType,
        String metricnamespace) {
        return listAsync(
                resourceUri,
                timespan,
                interval,
                metricnames,
                aggregation,
                top,
                orderby,
                filter,
                resultType,
                metricnamespace)
            .block();
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseInner list(String resourceUri) {
        final String timespan = null;
        final Duration interval = null;
        final String metricnames = null;
        final String aggregation = null;
        final Integer top = null;
        final String orderby = null;
        final String filter = null;
        final ResultType resultType = null;
        final String metricnamespace = null;
        final Context context = null;
        return listAsync(
                resourceUri,
                timespan,
                interval,
                metricnames,
                aggregation,
                top,
                orderby,
                filter,
                resultType,
                metricnamespace)
            .block();
    }
}
