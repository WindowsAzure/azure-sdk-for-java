// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.ContainerServiceInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ContainerServicesClient. */
public interface ContainerServicesClient
    extends InnerSupportsGet<ContainerServiceInner>,
        InnerSupportsListing<ContainerServiceInner>,
        InnerSupportsDelete<Void> {
    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ContainerServiceInner> listAsync();

    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerServiceInner> list();

    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerServiceInner> list(Context context);

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String containerServiceName, ContainerServiceInner parameters);

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ContainerServiceInner>, ContainerServiceInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String containerServiceName, ContainerServiceInner parameters);

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ContainerServiceInner>, ContainerServiceInner> beginCreateOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerServiceInner parameters);

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ContainerServiceInner>, ContainerServiceInner> beginCreateOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerServiceInner parameters, Context context);

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerServiceInner> createOrUpdateAsync(
        String resourceGroupName, String containerServiceName, ContainerServiceInner parameters);

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerServiceInner createOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerServiceInner parameters);

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerServiceInner createOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerServiceInner parameters, Context context);

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ContainerServiceInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String containerServiceName);

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerServiceInner> getByResourceGroupAsync(String resourceGroupName, String containerServiceName);

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerServiceInner getByResourceGroup(String resourceGroupName, String containerServiceName);

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerServiceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String containerServiceName, Context context);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String containerServiceName);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String containerServiceName);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String containerServiceName);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String containerServiceName, Context context);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String containerServiceName);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String containerServiceName);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String containerServiceName, Context context);

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ContainerServiceInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerServiceInner> listByResourceGroup(String resourceGroupName, Context context);
}
