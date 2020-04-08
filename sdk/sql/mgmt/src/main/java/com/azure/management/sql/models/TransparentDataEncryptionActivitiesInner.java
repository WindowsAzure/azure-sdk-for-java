// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TransparentDataEncryptionActivities. */
public final class TransparentDataEncryptionActivitiesInner {
    /** The proxy service used to perform REST calls. */
    private final TransparentDataEncryptionActivitiesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of TransparentDataEncryptionActivitiesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TransparentDataEncryptionActivitiesInner(SqlManagementClientImpl client) {
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
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/transparentDataEncryption/{transparentDataEncryptionName}"
                + "/operationResults")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<TransparentDataEncryptionActivityListResultInner>> listByConfiguration(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("transparentDataEncryptionName") String transparentDataEncryptionName,
            Context context);
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TransparentDataEncryptionActivityInner>> listByConfigurationSinglePageAsync(
        String resourceGroupName, String serverName, String databaseName) {
        final String apiVersion = "2014-04-01";
        final String transparentDataEncryptionName = "current";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByConfiguration(
                            this.client.getHost(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            transparentDataEncryptionName,
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
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TransparentDataEncryptionActivityInner> listByConfigurationAsync(
        String resourceGroupName, String serverName, String databaseName) {
        return new PagedFlux<>(() -> listByConfigurationSinglePageAsync(resourceGroupName, serverName, databaseName));
    }

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TransparentDataEncryptionActivityInner> listByConfiguration(
        String resourceGroupName, String serverName, String databaseName) {
        return new PagedIterable<>(listByConfigurationAsync(resourceGroupName, serverName, databaseName));
    }
}
