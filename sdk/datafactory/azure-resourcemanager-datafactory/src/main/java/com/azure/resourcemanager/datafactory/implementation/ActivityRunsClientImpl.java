// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.ActivityRunsClient;
import com.azure.resourcemanager.datafactory.fluent.models.ActivityRunsQueryResponseInner;
import com.azure.resourcemanager.datafactory.models.RunFilterParameters;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ActivityRunsClient. */
public final class ActivityRunsClientImpl implements ActivityRunsClient {
    private final ClientLogger logger = new ClientLogger(ActivityRunsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ActivityRunsService service;

    /** The service client containing this operation class. */
    private final DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of ActivityRunsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ActivityRunsClientImpl(DataFactoryManagementClientImpl client) {
        this.service =
            RestProxy.create(ActivityRunsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataFactoryManagementClientActivityRuns to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataFactoryManagemen")
    private interface ActivityRunsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/pipelineruns/{runId}/queryActivityruns")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ActivityRunsQueryResponseInner>> queryByPipelineRun(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @PathParam("runId") String runId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") RunFilterParameters filterParameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ActivityRunsQueryResponseInner>> queryByPipelineRunWithResponseAsync(
        String resourceGroupName, String factoryName, String runId, RunFilterParameters filterParameters) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (runId == null) {
            return Mono.error(new IllegalArgumentException("Parameter runId is required and cannot be null."));
        }
        if (filterParameters == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter filterParameters is required and cannot be null."));
        } else {
            filterParameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .queryByPipelineRun(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            runId,
                            this.client.getApiVersion(),
                            filterParameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ActivityRunsQueryResponseInner>> queryByPipelineRunWithResponseAsync(
        String resourceGroupName,
        String factoryName,
        String runId,
        RunFilterParameters filterParameters,
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (runId == null) {
            return Mono.error(new IllegalArgumentException("Parameter runId is required and cannot be null."));
        }
        if (filterParameters == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter filterParameters is required and cannot be null."));
        } else {
            filterParameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .queryByPipelineRun(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                runId,
                this.client.getApiVersion(),
                filterParameters,
                accept,
                context);
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ActivityRunsQueryResponseInner> queryByPipelineRunAsync(
        String resourceGroupName, String factoryName, String runId, RunFilterParameters filterParameters) {
        return queryByPipelineRunWithResponseAsync(resourceGroupName, factoryName, runId, filterParameters)
            .flatMap(
                (Response<ActivityRunsQueryResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ActivityRunsQueryResponseInner queryByPipelineRun(
        String resourceGroupName, String factoryName, String runId, RunFilterParameters filterParameters) {
        return queryByPipelineRunAsync(resourceGroupName, factoryName, runId, filterParameters).block();
    }

    /**
     * Query activity runs based on input filter conditions.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param filterParameters Parameters to filter the activity runs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list activity runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ActivityRunsQueryResponseInner> queryByPipelineRunWithResponse(
        String resourceGroupName,
        String factoryName,
        String runId,
        RunFilterParameters filterParameters,
        Context context) {
        return queryByPipelineRunWithResponseAsync(resourceGroupName, factoryName, runId, filterParameters, context)
            .block();
    }
}
