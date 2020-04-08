// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExtendedServerBlobAuditingPolicies. */
public final class ExtendedServerBlobAuditingPoliciesInner {
    /** The proxy service used to perform REST calls. */
    private final ExtendedServerBlobAuditingPoliciesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ExtendedServerBlobAuditingPoliciesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ExtendedServerBlobAuditingPoliciesInner(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ExtendedServerBlobAuditingPoliciesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientExtendedServerBlobAuditingPolicies to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientE")
    private interface ExtendedServerBlobAuditingPoliciesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExtendedServerBlobAuditingPolicyInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("blobAuditingPolicyName") String blobAuditingPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("blobAuditingPolicyName") String blobAuditingPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ExtendedServerBlobAuditingPolicyInner parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExtendedServerBlobAuditingPolicyInner>> beginCreateOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("blobAuditingPolicyName") String blobAuditingPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ExtendedServerBlobAuditingPolicyInner parameters,
            Context context);
    }

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExtendedServerBlobAuditingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName) {
        final String blobAuditingPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            blobAuditingPolicyName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExtendedServerBlobAuditingPolicyInner> getAsync(String resourceGroupName, String serverName) {
        return getWithResponseAsync(resourceGroupName, serverName)
            .flatMap(
                (SimpleResponse<ExtendedServerBlobAuditingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExtendedServerBlobAuditingPolicyInner get(String resourceGroupName, String serverName) {
        return getAsync(resourceGroupName, serverName).block();
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An extended server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        final String blobAuditingPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            blobAuditingPolicyName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An extended server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExtendedServerBlobAuditingPolicyInner> createOrUpdateAsync(
        String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(resourceGroupName, serverName, parameters);
        return this
            .client
            .<ExtendedServerBlobAuditingPolicyInner, ExtendedServerBlobAuditingPolicyInner>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                ExtendedServerBlobAuditingPolicyInner.class,
                ExtendedServerBlobAuditingPolicyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An extended server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExtendedServerBlobAuditingPolicyInner createOrUpdate(
        String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, parameters).block();
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An extended server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExtendedServerBlobAuditingPolicyInner>> beginCreateOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        final String blobAuditingPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginCreateOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            blobAuditingPolicyName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An extended server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExtendedServerBlobAuditingPolicyInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, serverName, parameters)
            .flatMap(
                (SimpleResponse<ExtendedServerBlobAuditingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An extended server blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended server blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExtendedServerBlobAuditingPolicyInner beginCreateOrUpdate(
        String resourceGroupName, String serverName, ExtendedServerBlobAuditingPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, parameters).block();
    }
}
