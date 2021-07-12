// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentNetworkHealthsClient;
import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSubnetNetworkHealthInner;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * IntegrationServiceEnvironmentNetworkHealthsClient.
 */
public final class IntegrationServiceEnvironmentNetworkHealthsClientImpl
    implements IntegrationServiceEnvironmentNetworkHealthsClient {
    private final ClientLogger logger = new ClientLogger(IntegrationServiceEnvironmentNetworkHealthsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final IntegrationServiceEnvironmentNetworkHealthsService service;

    /** The service client containing this operation class. */
    private final LogicManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationServiceEnvironmentNetworkHealthsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntegrationServiceEnvironmentNetworkHealthsClientImpl(LogicManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    IntegrationServiceEnvironmentNetworkHealthsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for LogicManagementClientIntegrationServiceEnvironmentNetworkHealths to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "LogicManagementClien")
    private interface IntegrationServiceEnvironmentNetworkHealthsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Logic"
                + "/integrationServiceEnvironments/{integrationServiceEnvironmentName}/health/network")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroup") String resourceGroup,
            @PathParam("integrationServiceEnvironmentName") String integrationServiceEnvironmentName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the integration service environment network health.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration service environment network health.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>>> getWithResponseAsync(
        String resourceGroup, String integrationServiceEnvironmentName) {
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
        if (resourceGroup == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroup is required and cannot be null."));
        }
        if (integrationServiceEnvironmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationServiceEnvironmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroup,
                            integrationServiceEnvironmentName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the integration service environment network health.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration service environment network health.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>>> getWithResponseAsync(
        String resourceGroup, String integrationServiceEnvironmentName, Context context) {
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
        if (resourceGroup == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceGroup is required and cannot be null."));
        }
        if (integrationServiceEnvironmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter integrationServiceEnvironmentName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroup,
                integrationServiceEnvironmentName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the integration service environment network health.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration service environment network health.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>> getAsync(
        String resourceGroup, String integrationServiceEnvironmentName) {
        return getWithResponseAsync(resourceGroup, integrationServiceEnvironmentName)
            .flatMap(
                (Response<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the integration service environment network health.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration service environment network health.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner> get(
        String resourceGroup, String integrationServiceEnvironmentName) {
        return getAsync(resourceGroup, integrationServiceEnvironmentName).block();
    }

    /**
     * Gets the integration service environment network health.
     *
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration service environment network health.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>> getWithResponse(
        String resourceGroup, String integrationServiceEnvironmentName, Context context) {
        return getWithResponseAsync(resourceGroup, integrationServiceEnvironmentName, context).block();
    }
}
