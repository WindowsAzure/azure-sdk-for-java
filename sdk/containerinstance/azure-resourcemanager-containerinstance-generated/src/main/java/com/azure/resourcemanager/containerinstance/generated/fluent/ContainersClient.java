// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.ContainerAttachResponseInner;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.ContainerExecResponseInner;
import com.azure.resourcemanager.containerinstance.generated.fluent.models.LogsInner;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerExecRequest;

/** An instance of this class provides access to all the operations defined in ContainersClient. */
public interface ContainersClient {
    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogsInner listLogs(String resourceGroupName, String containerGroupName, String containerName);

    /**
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all
     *     available logs are shown up to 4mb.
     * @param timestamps If true, adds a timestamp at the beginning of every line of log output. If not provided,
     *     defaults to false.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the logs for a specified container instance in a specified resource group and container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogsInner> listLogsWithResponse(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        Integer tail,
        Boolean timestamps,
        Context context);

    /**
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the container exec command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerExecResponseInner executeCommand(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        ContainerExecRequest containerExecRequest);

    /**
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the container exec command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerExecResponseInner> executeCommandWithResponse(
        String resourceGroupName,
        String containerGroupName,
        String containerName,
        ContainerExecRequest containerExecRequest,
        Context context);

    /**
     * Attach to the output stream of a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the output stream from container attach.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAttachResponseInner attach(String resourceGroupName, String containerGroupName, String containerName);

    /**
     * Attach to the output stream of a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information for the output stream from container attach.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerAttachResponseInner> attachWithResponse(
        String resourceGroupName, String containerGroupName, String containerName, Context context);
}
