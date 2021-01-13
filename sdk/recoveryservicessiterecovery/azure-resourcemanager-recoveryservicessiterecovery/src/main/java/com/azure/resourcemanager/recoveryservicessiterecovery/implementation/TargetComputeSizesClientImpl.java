// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

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
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.TargetComputeSizesClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.TargetComputeSizeInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizeCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TargetComputeSizesClient. */
public final class TargetComputeSizesClientImpl implements TargetComputeSizesClient {
    private final ClientLogger logger = new ClientLogger(TargetComputeSizesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final TargetComputeSizesService service;

    /** The service client containing this operation class. */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of TargetComputeSizesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TargetComputeSizesClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service =
            RestProxy.create(TargetComputeSizesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientTargetComputeSizes to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    private interface TargetComputeSizesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationProtectionContainers"
                + "/{protectionContainerName}/replicationProtectedItems/{replicatedProtectedItemName}"
                + "/targetComputeSizes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TargetComputeSizeCollection>> listByReplicationProtectedItems(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("protectionContainerName") String protectionContainerName,
            @PathParam("replicatedProtectedItemName") String replicatedProtectedItemName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TargetComputeSizeCollection>> listByReplicationProtectedItemsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the available target compute sizes for a replication protected item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TargetComputeSizeInner>> listByReplicationProtectedItemsSinglePageAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        if (replicatedProtectedItemName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter replicatedProtectedItemName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByReplicationProtectedItems(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            protectionContainerName,
                            replicatedProtectedItemName,
                            accept,
                            context))
            .<PagedResponse<TargetComputeSizeInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the available target compute sizes for a replication protected item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TargetComputeSizeInner>> listByReplicationProtectedItemsSinglePageAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        if (replicatedProtectedItemName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter replicatedProtectedItemName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByReplicationProtectedItems(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
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
     * Lists the available target compute sizes for a replication protected item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TargetComputeSizeInner> listByReplicationProtectedItemsAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        return new PagedFlux<>(
            () ->
                listByReplicationProtectedItemsSinglePageAsync(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName),
            nextLink -> listByReplicationProtectedItemsNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the available target compute sizes for a replication protected item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TargetComputeSizeInner> listByReplicationProtectedItemsAsync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        return new PagedFlux<>(
            () ->
                listByReplicationProtectedItemsSinglePageAsync(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    context),
            nextLink -> listByReplicationProtectedItemsNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the available target compute sizes for a replication protected item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TargetComputeSizeInner> listByReplicationProtectedItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        return new PagedIterable<>(
            listByReplicationProtectedItemsAsync(
                resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName));
    }

    /**
     * Lists the available target compute sizes for a replication protected item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName protection container name.
     * @param replicatedProtectedItemName Replication protected item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TargetComputeSizeInner> listByReplicationProtectedItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        return new PagedIterable<>(
            listByReplicationProtectedItemsAsync(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TargetComputeSizeInner>> listByReplicationProtectedItemsNextSinglePageAsync(
        String nextLink) {
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
            .withContext(
                context ->
                    service.listByReplicationProtectedItemsNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<TargetComputeSizeInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return target compute size collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TargetComputeSizeInner>> listByReplicationProtectedItemsNextSinglePageAsync(
        String nextLink, Context context) {
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
            .listByReplicationProtectedItemsNext(nextLink, this.client.getEndpoint(), accept, context)
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
