// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
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
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import java.util.UUID;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * JobExecutions.
 */
public final class JobExecutionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private JobExecutionsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of JobExecutionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    JobExecutionsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(JobExecutionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientJobExecutions to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientJobExecutions")
    private interface JobExecutionsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/executions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByAgent(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @QueryParam("createTimeMin") OffsetDateTime createTimeMin, @QueryParam("createTimeMax") OffsetDateTime createTimeMax, @QueryParam("endTimeMin") OffsetDateTime endTimeMin, @QueryParam("endTimeMax") OffsetDateTime endTimeMax, @QueryParam("isActive") Boolean isActive, @QueryParam("$skip") Integer skip, @QueryParam("$top") Integer top, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}/cancel")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> cancel(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("jobExecutionId") UUID jobExecutionId, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/start")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> create(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByJob(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @QueryParam("createTimeMin") OffsetDateTime createTimeMin, @QueryParam("createTimeMax") OffsetDateTime createTimeMax, @QueryParam("endTimeMin") OffsetDateTime endTimeMin, @QueryParam("endTimeMax") OffsetDateTime endTimeMax, @QueryParam("isActive") Boolean isActive, @QueryParam("$skip") Integer skip, @QueryParam("$top") Integer top, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("jobExecutionId") UUID jobExecutionId, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("jobExecutionId") UUID jobExecutionId, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/start")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionInner>> beginCreate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("jobAgentName") String jobAgentName, @PathParam("jobName") String jobName, @PathParam("jobExecutionId") UUID jobExecutionId, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByAgentNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByJobNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Lists all executions in a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobExecutionInner>> listByAgentSinglePageAsync(String resourceGroupName, String serverName, String jobAgentName, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByAgent(this.client.getHost(), resourceGroupName, serverName, jobAgentName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top, this.client.getSubscriptionId(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Lists all executions in a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByAgentAsync(String resourceGroupName, String serverName, String jobAgentName, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        return new PagedFlux<>(
            () -> listByAgentSinglePageAsync(resourceGroupName, serverName, jobAgentName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top),
            nextLink -> listByAgentNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all executions in a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByAgentAsync(String resourceGroupName, String serverName, String jobAgentName) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        return new PagedFlux<>(
            () -> listByAgentSinglePageAsync(resourceGroupName, serverName, jobAgentName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top),
            nextLink -> listByAgentNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all executions in a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByAgent(String resourceGroupName, String serverName, String jobAgentName, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        return new PagedIterable<>(listByAgentAsync(resourceGroupName, serverName, jobAgentName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top));
    }

    /**
     * Lists all executions in a job agent.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByAgent(String resourceGroupName, String serverName, String jobAgentName) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        return new PagedIterable<>(listByAgentAsync(resourceGroupName, serverName, jobAgentName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top));
    }

    /**
     * Requests cancellation of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final String apiVersion = "2017-03-01-preview";
        return service.cancel(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Requests cancellation of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        return cancelWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Requests cancellation of a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancel(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        cancelAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId).block();
    }

    /**
     * Starts an elastic job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        final String apiVersion = "2017-03-01-preview";
        return service.create(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Starts an elastic job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobExecutionInner> createAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = createWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName);
        return this.client.<JobExecutionInner, JobExecutionInner>getLroResultAsync(mono, this.client.getHttpPipeline(), JobExecutionInner.class, JobExecutionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Starts an elastic job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobExecutionInner create(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        return createAsync(resourceGroupName, serverName, jobAgentName, jobName).block();
    }

    /**
     * Lists a job's executions.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobExecutionInner>> listByJobSinglePageAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        final String apiVersion = "2017-03-01-preview";
        return service.listByJob(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top, this.client.getSubscriptionId(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Lists a job's executions.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByJobAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        return new PagedFlux<>(
            () -> listByJobSinglePageAsync(resourceGroupName, serverName, jobAgentName, jobName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top),
            nextLink -> listByJobNextSinglePageAsync(nextLink));
    }

    /**
     * Lists a job's executions.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByJobAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        return new PagedFlux<>(
            () -> listByJobSinglePageAsync(resourceGroupName, serverName, jobAgentName, jobName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top),
            nextLink -> listByJobNextSinglePageAsync(nextLink));
    }

    /**
     * Lists a job's executions.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param createTimeMin 
     * @param createTimeMax 
     * @param endTimeMin 
     * @param endTimeMax 
     * @param isActive 
     * @param skip 
     * @param top 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByJob(String resourceGroupName, String serverName, String jobAgentName, String jobName, OffsetDateTime createTimeMin, OffsetDateTime createTimeMax, OffsetDateTime endTimeMin, OffsetDateTime endTimeMax, Boolean isActive, Integer skip, Integer top) {
        return new PagedIterable<>(listByJobAsync(resourceGroupName, serverName, jobAgentName, jobName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top));
    }

    /**
     * Lists a job's executions.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByJob(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        return new PagedIterable<>(listByJobAsync(resourceGroupName, serverName, jobAgentName, jobName, createTimeMin, createTimeMax, endTimeMin, endTimeMax, isActive, skip, top));
    }

    /**
     * Gets a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobExecutionInner>> getWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final String apiVersion = "2017-03-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobExecutionInner> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        return getWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId)
            .flatMap((SimpleResponse<JobExecutionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobExecutionInner get(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        return getAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId).block();
    }

    /**
     * Creates or updates a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final String apiVersion = "2017-03-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Creates or updates a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobExecutionInner> createOrUpdateAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = createOrUpdateWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId);
        return this.client.<JobExecutionInner, JobExecutionInner>getLroResultAsync(mono, this.client.getHttpPipeline(), JobExecutionInner.class, JobExecutionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobExecutionInner createOrUpdate(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        return createOrUpdateAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId).block();
    }

    /**
     * Starts an elastic job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobExecutionInner>> beginCreateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        final String apiVersion = "2017-03-01-preview";
        return service.beginCreate(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Starts an elastic job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobExecutionInner> beginCreateAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        return beginCreateWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName)
            .flatMap((SimpleResponse<JobExecutionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Starts an elastic job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobExecutionInner beginCreate(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        return beginCreateAsync(resourceGroupName, serverName, jobAgentName, jobName).block();
    }

    /**
     * Creates or updates a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobExecutionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final String apiVersion = "2017-03-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Creates or updates a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobExecutionInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId)
            .flatMap((SimpleResponse<JobExecutionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a job execution.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param jobAgentName 
     * @param jobName 
     * @param jobExecutionId 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobExecutionInner beginCreateOrUpdate(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobExecutionInner>> listByAgentNextSinglePageAsync(String nextLink) {
        return service.listByAgentNext(nextLink)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobExecutionInner>> listByJobNextSinglePageAsync(String nextLink) {
        return service.listByJobNext(nextLink)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }
}
