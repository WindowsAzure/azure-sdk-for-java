// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

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
import com.azure.resourcemanager.automation.fluent.TestJobStreamsClient;
import com.azure.resourcemanager.automation.fluent.models.JobStreamInner;
import com.azure.resourcemanager.automation.fluent.models.JobStreamListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TestJobStreamsClient. */
public final class TestJobStreamsClientImpl implements TestJobStreamsClient {
    private final ClientLogger logger = new ClientLogger(TestJobStreamsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final TestJobStreamsService service;

    /** The service client containing this operation class. */
    private final AutomationClientImpl client;

    /**
     * Initializes an instance of TestJobStreamsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TestJobStreamsClientImpl(AutomationClientImpl client) {
        this.service =
            RestProxy.create(TestJobStreamsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutomationClientTestJobStreams to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutomationClientTest")
    private interface TestJobStreamsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation"
                + "/automationAccounts/{automationAccountName}/runbooks/{runbookName}/draft/testJob/streams"
                + "/{jobStreamId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<JobStreamInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("automationAccountName") String automationAccountName,
            @PathParam("runbookName") String runbookName,
            @PathParam("jobStreamId") String jobStreamId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation"
                + "/automationAccounts/{automationAccountName}/runbooks/{runbookName}/draft/testJob/streams")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<JobStreamListResultInner>> listByTestJob(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("automationAccountName") String automationAccountName,
            @PathParam("runbookName") String runbookName,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<JobStreamListResultInner>> listByTestJobNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieve a test job stream of the test job identified by runbook name and stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param jobStreamId The job stream id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job stream.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<JobStreamInner>> getWithResponseAsync(
        String resourceGroupName, String automationAccountName, String runbookName, String jobStreamId) {
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
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (runbookName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runbookName is required and cannot be null."));
        }
        if (jobStreamId == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobStreamId is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            automationAccountName,
                            runbookName,
                            jobStreamId,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve a test job stream of the test job identified by runbook name and stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param jobStreamId The job stream id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job stream.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<JobStreamInner>> getWithResponseAsync(
        String resourceGroupName,
        String automationAccountName,
        String runbookName,
        String jobStreamId,
        Context context) {
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
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (runbookName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runbookName is required and cannot be null."));
        }
        if (jobStreamId == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobStreamId is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                automationAccountName,
                runbookName,
                jobStreamId,
                apiVersion,
                accept,
                context);
    }

    /**
     * Retrieve a test job stream of the test job identified by runbook name and stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param jobStreamId The job stream id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job stream.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<JobStreamInner> getAsync(
        String resourceGroupName, String automationAccountName, String runbookName, String jobStreamId) {
        return getWithResponseAsync(resourceGroupName, automationAccountName, runbookName, jobStreamId)
            .flatMap(
                (Response<JobStreamInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieve a test job stream of the test job identified by runbook name and stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param jobStreamId The job stream id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job stream.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobStreamInner get(
        String resourceGroupName, String automationAccountName, String runbookName, String jobStreamId) {
        return getAsync(resourceGroupName, automationAccountName, runbookName, jobStreamId).block();
    }

    /**
     * Retrieve a test job stream of the test job identified by runbook name and stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param jobStreamId The job stream id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job stream.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<JobStreamInner> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String runbookName,
        String jobStreamId,
        Context context) {
        return getWithResponseAsync(resourceGroupName, automationAccountName, runbookName, jobStreamId, context)
            .block();
    }

    /**
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobStreamInner>> listByTestJobSinglePageAsync(
        String resourceGroupName, String automationAccountName, String runbookName, String filter) {
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
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (runbookName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runbookName is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByTestJob(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            automationAccountName,
                            runbookName,
                            filter,
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<JobStreamInner>>map(
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
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobStreamInner>> listByTestJobSinglePageAsync(
        String resourceGroupName, String automationAccountName, String runbookName, String filter, Context context) {
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
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (runbookName == null) {
            return Mono.error(new IllegalArgumentException("Parameter runbookName is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByTestJob(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                automationAccountName,
                runbookName,
                filter,
                apiVersion,
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
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<JobStreamInner> listByTestJobAsync(
        String resourceGroupName, String automationAccountName, String runbookName, String filter) {
        return new PagedFlux<>(
            () -> listByTestJobSinglePageAsync(resourceGroupName, automationAccountName, runbookName, filter),
            nextLink -> listByTestJobNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<JobStreamInner> listByTestJobAsync(
        String resourceGroupName, String automationAccountName, String runbookName) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listByTestJobSinglePageAsync(resourceGroupName, automationAccountName, runbookName, filter),
            nextLink -> listByTestJobNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<JobStreamInner> listByTestJobAsync(
        String resourceGroupName, String automationAccountName, String runbookName, String filter, Context context) {
        return new PagedFlux<>(
            () -> listByTestJobSinglePageAsync(resourceGroupName, automationAccountName, runbookName, filter, context),
            nextLink -> listByTestJobNextSinglePageAsync(nextLink, context));
    }

    /**
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobStreamInner> listByTestJob(
        String resourceGroupName, String automationAccountName, String runbookName) {
        final String filter = null;
        return new PagedIterable<>(listByTestJobAsync(resourceGroupName, automationAccountName, runbookName, filter));
    }

    /**
     * Retrieve a list of test job streams identified by runbook name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param runbookName The runbook name.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobStreamInner> listByTestJob(
        String resourceGroupName, String automationAccountName, String runbookName, String filter, Context context) {
        return new PagedIterable<>(
            listByTestJobAsync(resourceGroupName, automationAccountName, runbookName, filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobStreamInner>> listByTestJobNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByTestJobNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<JobStreamInner>>map(
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
     * @return the response model for the list job stream operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<JobStreamInner>> listByTestJobNextSinglePageAsync(String nextLink, Context context) {
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
            .listByTestJobNext(nextLink, this.client.getEndpoint(), accept, context)
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
