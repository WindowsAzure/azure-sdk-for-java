// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.containerinstance.fluent.ContainersClient;
import com.azure.resourcemanager.containerinstance.fluent.models.ContainerExecResponseInner;
import com.azure.resourcemanager.containerinstance.fluent.models.LogsInner;
import com.azure.resourcemanager.containerinstance.models.ContainerExecRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ContainersClient. */
public final class ContainersClientImpl implements ContainersClient {
    private final ClientLogger logger = new ClientLogger(ContainersClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ContainersService service;

    /** The service client containing this operation class. */
    private final ContainerInstanceManagementClientImpl client;

    /**
     * Initializes an instance of ContainersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ContainersClientImpl(ContainerInstanceManagementClientImpl client) {
        this.service =
            RestProxy.create(ContainersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerInstanceManagementClientContainers to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerInstanceMan")
    private interface ContainersService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerInstance"
                + "/containerGroups/{containerGroupName}/containers/{containerName}/logs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LogsInner>> listLogs(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("containerGroupName") String containerGroupName,
            @PathParam("containerName") String containerName,
            @QueryParam("tail") Integer tail,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerInstance"
                + "/containerGroups/{containerGroupName}/containers/{containerName}/exec")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ContainerExecResponseInner>> executeCommand(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("containerGroupName") String containerGroupName,
            @PathParam("containerName") String containerName,
            @BodyParam("application/json") ContainerExecRequest containerExecRequest,
            Context context);
    }

    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all
     *     available logs are shown up to 4mb.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogsInner>> listLogsWithResponseAsync(
        String resourceGroupName, String containerGroupName, String containerName, Integer tail) {
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
        if (containerGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerGroupName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listLogs(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            resourceGroupName,
                            containerGroupName,
                            containerName,
                            tail,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all
     *     available logs are shown up to 4mb.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LogsInner>> listLogsWithResponseAsync(
        String resourceGroupName, String containerGroupName, String containerName, Integer tail, Context context) {
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
        if (containerGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerGroupName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listLogs(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                resourceGroupName,
                containerGroupName,
                containerName,
                tail,
                context);
    }

    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all
     *     available logs are shown up to 4mb.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogsInner> listLogsAsync(
        String resourceGroupName, String containerGroupName, String containerName, Integer tail) {
        return listLogsWithResponseAsync(resourceGroupName, containerGroupName, containerName, tail)
            .flatMap(
                (Response<LogsInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LogsInner> listLogsAsync(String resourceGroupName, String containerGroupName, String containerName) {
        final Integer tail = null;
        return listLogsWithResponseAsync(resourceGroupName, containerGroupName, containerName, tail)
            .flatMap(
                (Response<LogsInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogsInner listLogs(String resourceGroupName, String containerGroupName, String containerName) {
        final Integer tail = null;
        return listLogsAsync(resourceGroupName, containerGroupName, containerName, tail).block();
    }

    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all
     *     available logs are shown up to 4mb.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LogsInner> listLogsWithResponse(
        String resourceGroupName, String containerGroupName, String containerName, Integer tail, Context context) {
        return listLogsWithResponseAsync(resourceGroupName, containerGroupName, containerName, tail, context).block();
    }

    /**
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The container exec request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the container exec command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ContainerExecResponseInner>> executeCommandWithResponseAsync(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        ContainerExecRequest containerExecRequest) {
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
        if (containerGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerGroupName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (containerExecRequest == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerExecRequest is required and cannot be null."));
        } else {
            containerExecRequest.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .executeCommand(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            resourceGroupName,
                            containerGroupName,
                            containerName,
                            containerExecRequest,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The container exec request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the container exec command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ContainerExecResponseInner>> executeCommandWithResponseAsync(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        ContainerExecRequest containerExecRequest,
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
        if (containerGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerGroupName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (containerExecRequest == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter containerExecRequest is required and cannot be null."));
        } else {
            containerExecRequest.validate();
        }
        context = this.client.mergeContext(context);
        return service
            .executeCommand(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                resourceGroupName,
                containerGroupName,
                containerName,
                containerExecRequest,
                context);
    }

    /**
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The container exec request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the container exec command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerExecResponseInner> executeCommandAsync(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        ContainerExecRequest containerExecRequest) {
        return executeCommandWithResponseAsync(
                resourceGroupName, containerGroupName, containerName, containerExecRequest)
            .flatMap(
                (Response<ContainerExecResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The container exec request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the container exec command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ContainerExecResponseInner executeCommand(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        ContainerExecRequest containerExecRequest) {
        return executeCommandAsync(resourceGroupName, containerGroupName, containerName, containerExecRequest).block();
    }

    /**
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The container exec request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the container exec command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ContainerExecResponseInner> executeCommandWithResponse(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        ContainerExecRequest containerExecRequest,
        Context context) {
        return executeCommandWithResponseAsync(
                resourceGroupName, containerGroupName, containerName, containerExecRequest, context)
            .block();
    }
}
