// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

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
import com.azure.resourcemanager.synapse.fluent.RestorableDroppedSqlPoolsClient;
import com.azure.resourcemanager.synapse.fluent.models.RestorableDroppedSqlPoolInner;
import com.azure.resourcemanager.synapse.models.RestorableDroppedSqlPoolListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RestorableDroppedSqlPoolsClient. */
public final class RestorableDroppedSqlPoolsClientImpl implements RestorableDroppedSqlPoolsClient {
    private final ClientLogger logger = new ClientLogger(RestorableDroppedSqlPoolsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RestorableDroppedSqlPoolsService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of RestorableDroppedSqlPoolsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestorableDroppedSqlPoolsClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    RestorableDroppedSqlPoolsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientRestorableDroppedSqlPools to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface RestorableDroppedSqlPoolsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/restorableDroppedSqlPools/{restorableDroppedSqlPoolId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDroppedSqlPoolInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("restorableDroppedSqlPoolId") String restorableDroppedSqlPoolId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/restorableDroppedSqlPools")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDroppedSqlPoolListResult>> listByWorkspace(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of
     *     sqlPoolName,deletionTimeInFileTimeFormat.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted sql pool that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RestorableDroppedSqlPoolInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (restorableDroppedSqlPoolId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter restorableDroppedSqlPoolId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            restorableDroppedSqlPoolId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of
     *     sqlPoolName,deletionTimeInFileTimeFormat.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted sql pool that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RestorableDroppedSqlPoolInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (restorableDroppedSqlPoolId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter restorableDroppedSqlPoolId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                restorableDroppedSqlPoolId,
                accept,
                context);
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of
     *     sqlPoolName,deletionTimeInFileTimeFormat.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted sql pool that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RestorableDroppedSqlPoolInner> getAsync(
        String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId) {
        return getWithResponseAsync(resourceGroupName, workspaceName, restorableDroppedSqlPoolId)
            .flatMap(
                (Response<RestorableDroppedSqlPoolInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of
     *     sqlPoolName,deletionTimeInFileTimeFormat.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted sql pool that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RestorableDroppedSqlPoolInner get(
        String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId) {
        return getAsync(resourceGroupName, workspaceName, restorableDroppedSqlPoolId).block();
    }

    /**
     * Gets a deleted sql pool that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param restorableDroppedSqlPoolId The id of the deleted Sql Pool in the form of
     *     sqlPoolName,deletionTimeInFileTimeFormat.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted sql pool that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RestorableDroppedSqlPoolInner> getWithResponse(
        String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId, Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, restorableDroppedSqlPoolId, context).block();
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDroppedSqlPoolInner>> listByWorkspaceSinglePageAsync(
        String resourceGroupName, String workspaceName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByWorkspace(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            accept,
                            context))
            .<PagedResponse<RestorableDroppedSqlPoolInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDroppedSqlPoolInner>> listByWorkspaceSinglePageAsync(
        String resourceGroupName, String workspaceName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByWorkspace(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RestorableDroppedSqlPoolInner> listByWorkspaceAsync(
        String resourceGroupName, String workspaceName) {
        return new PagedFlux<>(() -> listByWorkspaceSinglePageAsync(resourceGroupName, workspaceName));
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RestorableDroppedSqlPoolInner> listByWorkspaceAsync(
        String resourceGroupName, String workspaceName, Context context) {
        return new PagedFlux<>(() -> listByWorkspaceSinglePageAsync(resourceGroupName, workspaceName, context));
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDroppedSqlPoolInner> listByWorkspace(
        String resourceGroupName, String workspaceName) {
        return new PagedIterable<>(listByWorkspaceAsync(resourceGroupName, workspaceName));
    }

    /**
     * Gets a list of deleted Sql pools that can be restored.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted Sql pools that can be restored.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDroppedSqlPoolInner> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        return new PagedIterable<>(listByWorkspaceAsync(resourceGroupName, workspaceName, context));
    }
}
