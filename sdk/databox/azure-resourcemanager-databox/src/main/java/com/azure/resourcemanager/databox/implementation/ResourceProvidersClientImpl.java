// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.implementation;

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
import com.azure.resourcemanager.databox.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.databox.models.MitigateJobRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    private final ClientLogger logger = new ClientLogger(ResourceProvidersClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final DataBoxManagementClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(DataBoxManagementClientImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataBoxManagementClientResourceProviders to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataBoxManagementCli")
    private interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBox/jobs"
                + "/{jobName}/mitigate")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> mitigate(
            @HostParam("$host") String endpoint,
            @PathParam("jobName") String jobName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") MitigateJobRequest mitigateJobRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Request to mitigate for a given job.
     *
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param resourceGroupName The Resource Group Name.
     * @param mitigateJobRequest Mitigation Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> mitigateWithResponseAsync(
        String jobName, String resourceGroupName, MitigateJobRequest mitigateJobRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
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
        if (mitigateJobRequest == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter mitigateJobRequest is required and cannot be null."));
        } else {
            mitigateJobRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .mitigate(
                            this.client.getEndpoint(),
                            jobName,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            mitigateJobRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Request to mitigate for a given job.
     *
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param resourceGroupName The Resource Group Name.
     * @param mitigateJobRequest Mitigation Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> mitigateWithResponseAsync(
        String jobName, String resourceGroupName, MitigateJobRequest mitigateJobRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
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
        if (mitigateJobRequest == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter mitigateJobRequest is required and cannot be null."));
        } else {
            mitigateJobRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .mitigate(
                this.client.getEndpoint(),
                jobName,
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                mitigateJobRequest,
                accept,
                context);
    }

    /**
     * Request to mitigate for a given job.
     *
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param resourceGroupName The Resource Group Name.
     * @param mitigateJobRequest Mitigation Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> mitigateAsync(String jobName, String resourceGroupName, MitigateJobRequest mitigateJobRequest) {
        return mitigateWithResponseAsync(jobName, resourceGroupName, mitigateJobRequest)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Request to mitigate for a given job.
     *
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param resourceGroupName The Resource Group Name.
     * @param mitigateJobRequest Mitigation Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void mitigate(String jobName, String resourceGroupName, MitigateJobRequest mitigateJobRequest) {
        mitigateAsync(jobName, resourceGroupName, mitigateJobRequest).block();
    }

    /**
     * Request to mitigate for a given job.
     *
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param resourceGroupName The Resource Group Name.
     * @param mitigateJobRequest Mitigation Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> mitigateWithResponse(
        String jobName, String resourceGroupName, MitigateJobRequest mitigateJobRequest, Context context) {
        return mitigateWithResponseAsync(jobName, resourceGroupName, mitigateJobRequest, context).block();
    }
}
