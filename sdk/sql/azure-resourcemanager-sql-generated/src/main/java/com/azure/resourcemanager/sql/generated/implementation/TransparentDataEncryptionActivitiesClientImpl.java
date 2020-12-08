// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

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
import com.azure.resourcemanager.sql.generated.fluent.TransparentDataEncryptionActivitiesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.TransparentDataEncryptionActivityInner;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionActivityListResult;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionName;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in TransparentDataEncryptionActivitiesClient.
 */
public final class TransparentDataEncryptionActivitiesClientImpl implements TransparentDataEncryptionActivitiesClient {
    private final ClientLogger logger = new ClientLogger(TransparentDataEncryptionActivitiesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final TransparentDataEncryptionActivitiesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of TransparentDataEncryptionActivitiesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TransparentDataEncryptionActivitiesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    TransparentDataEncryptionActivitiesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientTransparentDataEncryptionActivities to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientT")
    private interface TransparentDataEncryptionActivitiesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/transparentDataEncryption/{transparentDataEncryptionName}"
                + "/operationResults")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TransparentDataEncryptionActivityListResult>> listByConfiguration(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("transparentDataEncryptionName") TransparentDataEncryptionName transparentDataEncryptionName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TransparentDataEncryptionActivityInner>> listByConfigurationSinglePageAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (transparentDataEncryptionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter transparentDataEncryptionName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByConfiguration(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            transparentDataEncryptionName,
                            accept,
                            context))
            .<PagedResponse<TransparentDataEncryptionActivityInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TransparentDataEncryptionActivityInner>> listByConfigurationSinglePageAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName,
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (transparentDataEncryptionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter transparentDataEncryptionName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByConfiguration(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                databaseName,
                transparentDataEncryptionName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TransparentDataEncryptionActivityInner> listByConfigurationAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName) {
        return new PagedFlux<>(
            () ->
                listByConfigurationSinglePageAsync(
                    resourceGroupName, serverName, databaseName, transparentDataEncryptionName));
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TransparentDataEncryptionActivityInner> listByConfigurationAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName,
        Context context) {
        return new PagedFlux<>(
            () ->
                listByConfigurationSinglePageAsync(
                    resourceGroupName, serverName, databaseName, transparentDataEncryptionName, context));
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TransparentDataEncryptionActivityInner> listByConfiguration(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName) {
        return new PagedIterable<>(
            listByConfigurationAsync(resourceGroupName, serverName, databaseName, transparentDataEncryptionName));
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TransparentDataEncryptionActivityInner> listByConfiguration(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName,
        Context context) {
        return new PagedIterable<>(
            listByConfigurationAsync(
                resourceGroupName, serverName, databaseName, transparentDataEncryptionName, context));
    }
}
