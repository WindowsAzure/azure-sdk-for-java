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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectedItemsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectedItemResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemResourceList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BackupProtectedItemsClient. */
public final class BackupProtectedItemsClientImpl implements BackupProtectedItemsClient {
    private final ClientLogger logger = new ClientLogger(BackupProtectedItemsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BackupProtectedItemsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupProtectedItemsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BackupProtectedItemsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy
                .create(BackupProtectedItemsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientBackupProtectedItems to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface BackupProtectedItemsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupProtectedItems")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectedItemResourceList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$filter") String filter,
            @QueryParam("$skipToken") String skipToken,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectedItemResourceList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectedItemResourceInner>> listSinglePageAsync(
        String vaultName, String resourceGroupName, String filter, String skipToken) {
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
                            filter,
                            skipToken,
                            accept,
                            context))
            .<PagedResponse<ProtectedItemResourceInner>>map(
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
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectedItemResourceInner>> listSinglePageAsync(
        String vaultName, String resourceGroupName, String filter, String skipToken, Context context) {
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
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProtectedItemResourceInner> listAsync(
        String vaultName, String resourceGroupName, String filter, String skipToken) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProtectedItemResourceInner> listAsync(String vaultName, String resourceGroupName) {
        final String filter = null;
        final String skipToken = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProtectedItemResourceInner> listAsync(
        String vaultName, String resourceGroupName, String filter, String skipToken, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProtectedItemResourceInner> list(String vaultName, String resourceGroupName) {
        final String filter = null;
        final String skipToken = null;
        return new PagedIterable<>(listAsync(vaultName, resourceGroupName, filter, skipToken));
    }

    /**
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProtectedItemResourceInner> list(
        String vaultName, String resourceGroupName, String filter, String skipToken, Context context) {
        return new PagedIterable<>(listAsync(vaultName, resourceGroupName, filter, skipToken, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectedItemResourceInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<ProtectedItemResourceInner>>map(
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
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProtectedItemResourceInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
