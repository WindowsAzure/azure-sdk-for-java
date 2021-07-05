// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
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
import com.azure.resourcemanager.sql.generated.fluent.RecommendedSensitivityLabelsClient;
import com.azure.resourcemanager.sql.generated.models.RecommendedSensitivityLabelUpdateList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RecommendedSensitivityLabelsClient. */
public final class RecommendedSensitivityLabelsClientImpl implements RecommendedSensitivityLabelsClient {
    private final ClientLogger logger = new ClientLogger(RecommendedSensitivityLabelsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RecommendedSensitivityLabelsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of RecommendedSensitivityLabelsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RecommendedSensitivityLabelsClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    RecommendedSensitivityLabelsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientRecommendedSensitivityLabels to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientR")
    private interface RecommendedSensitivityLabelsService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/recommendedSensitivityLabels")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") RecommendedSensitivityLabelUpdateList parameters,
            Context context);
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters A list of recommended sensitivity label update operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> updateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        RecommendedSensitivityLabelUpdateList parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-11-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters A list of recommended sensitivity label update operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> updateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        RecommendedSensitivityLabelUpdateList parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-11-01-preview";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                this.client.getSubscriptionId(),
                apiVersion,
                parameters,
                context);
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters A list of recommended sensitivity label update operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> updateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        RecommendedSensitivityLabelUpdateList parameters) {
        return updateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters A list of recommended sensitivity label update operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(
        String resourceGroupName,
        String serverName,
        String databaseName,
        RecommendedSensitivityLabelUpdateList parameters) {
        updateAsync(resourceGroupName, serverName, databaseName, parameters).block();
    }

    /**
     * Update recommended sensitivity labels states of a given database using an operations batch.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters A list of recommended sensitivity label update operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> updateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        RecommendedSensitivityLabelUpdateList parameters,
        Context context) {
        return updateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters, context).block();
    }
}
