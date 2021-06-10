// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.monitor.query.log.implementation.models.BatchRequest;
import com.azure.monitor.query.log.implementation.models.BatchResponse;
import com.azure.monitor.query.log.implementation.models.ErrorResponseException;
import com.azure.monitor.query.log.implementation.models.QueryBody;
import com.azure.monitor.query.log.implementation.models.QueryResults;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Queries. */
public final class QueriesImpl {
    /** The proxy service used to perform REST calls. */
    private final QueriesService service;

    /** The service client containing this operation class. */
    private final AzureLogAnalyticsImpl client;

    /**
     * Initializes an instance of QueriesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QueriesImpl(AzureLogAnalyticsImpl client) {
        this.service = RestProxy.create(QueriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureLogAnalyticsQueries to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureLogAnalyticsQue")
    private interface QueriesService {
        @Get("workspaces/{workspaceId}/query")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<QueryResults>> get(
                @HostParam("$host") String host,
                @PathParam("workspaceId") String workspaceId,
                @QueryParam("query") String query,
                @QueryParam("timespan") Duration timespan,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("workspaces/{workspaceId}/query")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<QueryResults>> execute(
                @HostParam("$host") String host,
                @PathParam("workspaceId") String workspaceId,
                @HeaderParam("Prefer") String prefer,
                @BodyParam("application/json") QueryBody body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("$batch")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<BatchResponse>> batch(
                @HostParam("$host") String host,
                @BodyParam("application/json") BatchRequest body,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Executes an Analytics query for data.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param query The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param timespan Optional. The timespan over which to query data. This is an ISO8601 time period value. This
     *     timespan is applied in addition to any that are specified in the query expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<QueryResults>> getWithResponseAsync(String workspaceId, String query, Duration timespan) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (workspaceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceId is required and cannot be null."));
        }
        if (query == null) {
            return Mono.error(new IllegalArgumentException("Parameter query is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.get(this.client.getHost(), workspaceId, query, timespan, accept, context));
    }

    /**
     * Executes an Analytics query for data.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param query The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param timespan Optional. The timespan over which to query data. This is an ISO8601 time period value. This
     *     timespan is applied in addition to any that are specified in the query expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<QueryResults>> getWithResponseAsync(
            String workspaceId, String query, Duration timespan, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (workspaceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceId is required and cannot be null."));
        }
        if (query == null) {
            return Mono.error(new IllegalArgumentException("Parameter query is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.get(this.client.getHost(), workspaceId, query, timespan, accept, context);
    }

    /**
     * Executes an Analytics query for data.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param query The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param timespan Optional. The timespan over which to query data. This is an ISO8601 time period value. This
     *     timespan is applied in addition to any that are specified in the query expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<QueryResults> getAsync(String workspaceId, String query, Duration timespan) {
        return getWithResponseAsync(workspaceId, query, timespan)
                .flatMap(
                        (Response<QueryResults> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Executes an Analytics query for data.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param query The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param timespan Optional. The timespan over which to query data. This is an ISO8601 time period value. This
     *     timespan is applied in addition to any that are specified in the query expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<QueryResults> getAsync(String workspaceId, String query, Duration timespan, Context context) {
        return getWithResponseAsync(workspaceId, query, timespan, context)
                .flatMap(
                        (Response<QueryResults> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Executes an Analytics query for data.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param query The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param timespan Optional. The timespan over which to query data. This is an ISO8601 time period value. This
     *     timespan is applied in addition to any that are specified in the query expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueryResults get(String workspaceId, String query, Duration timespan) {
        return getAsync(workspaceId, query, timespan).block();
    }

    /**
     * Executes an Analytics query for data.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param query The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param timespan Optional. The timespan over which to query data. This is an ISO8601 time period value. This
     *     timespan is applied in addition to any that are specified in the query expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueryResults> getWithResponse(
            String workspaceId, String query, Duration timespan, Context context) {
        return getWithResponseAsync(workspaceId, query, timespan, context).block();
    }

    /**
     * Executes an Analytics query for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API) is an
     * example for using POST with an Analytics query.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param body The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param prefer Optional. The prefer header to set server timeout, query statistics and visualization information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<QueryResults>> executeWithResponseAsync(String workspaceId, QueryBody body, String prefer) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (workspaceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.execute(this.client.getHost(), workspaceId, prefer, body, accept, context));
    }

    /**
     * Executes an Analytics query for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API) is an
     * example for using POST with an Analytics query.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param body The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param prefer Optional. The prefer header to set server timeout, query statistics and visualization information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<QueryResults>> executeWithResponseAsync(
            String workspaceId, QueryBody body, String prefer, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (workspaceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return service.execute(this.client.getHost(), workspaceId, prefer, body, accept, context);
    }

    /**
     * Executes an Analytics query for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API) is an
     * example for using POST with an Analytics query.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param body The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param prefer Optional. The prefer header to set server timeout, query statistics and visualization information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<QueryResults> executeAsync(String workspaceId, QueryBody body, String prefer) {
        return executeWithResponseAsync(workspaceId, body, prefer)
                .flatMap(
                        (Response<QueryResults> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Executes an Analytics query for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API) is an
     * example for using POST with an Analytics query.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param body The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param prefer Optional. The prefer header to set server timeout, query statistics and visualization information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<QueryResults> executeAsync(String workspaceId, QueryBody body, String prefer, Context context) {
        return executeWithResponseAsync(workspaceId, body, prefer, context)
                .flatMap(
                        (Response<QueryResults> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Executes an Analytics query for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API) is an
     * example for using POST with an Analytics query.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param body The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param prefer Optional. The prefer header to set server timeout, query statistics and visualization information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueryResults execute(String workspaceId, QueryBody body, String prefer) {
        return executeAsync(workspaceId, body, prefer).block();
    }

    /**
     * Executes an Analytics query for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API) is an
     * example for using POST with an Analytics query.
     *
     * @param workspaceId ID of the workspace. This is Workspace ID from the Properties blade in the Azure portal.
     * @param body The Analytics query. Learn more about the [Analytics query
     *     syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
     * @param prefer Optional. The prefer header to set server timeout, query statistics and visualization information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains the tables, columns &amp; rows resulting from a query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueryResults> executeWithResponse(
            String workspaceId, QueryBody body, String prefer, Context context) {
        return executeWithResponseAsync(workspaceId, body, prefer, context).block();
    }

    /**
     * Executes a batch of Analytics queries for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API)
     * is an example for using POST with an Analytics query.
     *
     * @param body The batch request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to a batch query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchResponse>> batchWithResponseAsync(BatchRequest body) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.batch(this.client.getHost(), body, accept, context));
    }

    /**
     * Executes a batch of Analytics queries for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API)
     * is an example for using POST with an Analytics query.
     *
     * @param body The batch request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to a batch query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchResponse>> batchWithResponseAsync(BatchRequest body, Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return service.batch(this.client.getHost(), body, accept, context);
    }

    /**
     * Executes a batch of Analytics queries for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API)
     * is an example for using POST with an Analytics query.
     *
     * @param body The batch request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to a batch query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BatchResponse> batchAsync(BatchRequest body) {
        return batchWithResponseAsync(body)
                .flatMap(
                        (Response<BatchResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Executes a batch of Analytics queries for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API)
     * is an example for using POST with an Analytics query.
     *
     * @param body The batch request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to a batch query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BatchResponse> batchAsync(BatchRequest body, Context context) {
        return batchWithResponseAsync(body, context)
                .flatMap(
                        (Response<BatchResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Executes a batch of Analytics queries for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API)
     * is an example for using POST with an Analytics query.
     *
     * @param body The batch request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to a batch query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BatchResponse batch(BatchRequest body) {
        return batchAsync(body).block();
    }

    /**
     * Executes a batch of Analytics queries for data. [Here](https://dev.loganalytics.io/documentation/Using-the-API)
     * is an example for using POST with an Analytics query.
     *
     * @param body The batch request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to a batch query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BatchResponse> batchWithResponse(BatchRequest body, Context context) {
        return batchWithResponseAsync(body, context).block();
    }
}
