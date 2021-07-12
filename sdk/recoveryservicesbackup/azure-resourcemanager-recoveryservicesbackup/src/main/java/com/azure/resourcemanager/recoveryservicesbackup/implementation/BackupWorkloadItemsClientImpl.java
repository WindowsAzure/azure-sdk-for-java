// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupWorkloadItemsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.WorkloadItemResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadItemResourceList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BackupWorkloadItemsClient. */
public final class BackupWorkloadItemsClientImpl implements BackupWorkloadItemsClient {
    private final ClientLogger logger = new ClientLogger(BackupWorkloadItemsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BackupWorkloadItemsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupWorkloadItemsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BackupWorkloadItemsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy.create(BackupWorkloadItemsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientBackupWorkloadItems to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface BackupWorkloadItemsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/items")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkloadItemResourceList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("containerName") String containerName,
            @QueryParam("$filter") String filter,
            @QueryParam("$skipToken") String skipToken,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkloadItemResourceList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkloadItemResourceInner>> listSinglePageAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String filter,
        String skipToken) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
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
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        final String apiVersion = "2021-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            containerName,
                            filter,
                            skipToken,
                            accept,
                            context))
            .<PagedResponse<WorkloadItemResourceInner>>map(
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
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkloadItemResourceInner>> listSinglePageAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String filter,
        String skipToken,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
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
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        final String apiVersion = "2021-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                containerName,
                filter,
                skipToken,
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
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkloadItemResourceInner> listAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String filter,
        String skipToken) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkloadItemResourceInner> listAsync(
        String vaultName, String resourceGroupName, String fabricName, String containerName) {
        final String filter = null;
        final String skipToken = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkloadItemResourceInner> listAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String filter,
        String skipToken,
        Context context) {
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    vaultName, resourceGroupName, fabricName, containerName, filter, skipToken, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkloadItemResourceInner> list(
        String vaultName, String resourceGroupName, String fabricName, String containerName) {
        final String filter = null;
        final String skipToken = null;
        return new PagedIterable<>(
            listAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken));
    }

    /**
     * Provides a pageable list of workload item of a specific container according to the query filter and the
     * pagination parameters.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the container.
     * @param containerName Name of the container.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkloadItemResourceInner> list(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String filter,
        String skipToken,
        Context context) {
        return new PagedIterable<>(
            listAsync(vaultName, resourceGroupName, fabricName, containerName, filter, skipToken, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkloadItemResourceInner>> listNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<WorkloadItemResourceInner>>map(
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
     * @return list of WorkloadItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkloadItemResourceInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
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
