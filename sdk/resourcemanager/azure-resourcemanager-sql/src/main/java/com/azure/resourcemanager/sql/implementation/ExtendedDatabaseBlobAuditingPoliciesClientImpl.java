// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

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
import com.azure.resourcemanager.sql.fluent.ExtendedDatabaseBlobAuditingPoliciesClient;
import com.azure.resourcemanager.sql.fluent.models.ExtendedDatabaseBlobAuditingPolicyInner;
import com.azure.resourcemanager.sql.models.ExtendedDatabaseBlobAuditingPolicyListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ExtendedDatabaseBlobAuditingPoliciesClient.
 */
public final class ExtendedDatabaseBlobAuditingPoliciesClientImpl
    implements ExtendedDatabaseBlobAuditingPoliciesClient {
    private final ClientLogger logger = new ClientLogger(ExtendedDatabaseBlobAuditingPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ExtendedDatabaseBlobAuditingPoliciesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ExtendedDatabaseBlobAuditingPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ExtendedDatabaseBlobAuditingPoliciesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ExtendedDatabaseBlobAuditingPoliciesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientExtendedDatabaseBlobAuditingPolicies to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientE")
    private interface ExtendedDatabaseBlobAuditingPoliciesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("blobAuditingPolicyName") String blobAuditingPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/extendedAuditingSettings/{blobAuditingPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("blobAuditingPolicyName") String blobAuditingPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ExtendedDatabaseBlobAuditingPolicyInner parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/extendedAuditingSettings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExtendedDatabaseBlobAuditingPolicyListResult>> listByDatabase(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExtendedDatabaseBlobAuditingPolicyListResult>> listByDatabaseNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName) {
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
        final String blobAuditingPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            blobAuditingPolicyName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
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
        final String blobAuditingPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                blobAuditingPolicyName,
                this.client.getSubscriptionId(),
                apiVersion,
                context);
    }

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExtendedDatabaseBlobAuditingPolicyInner> getAsync(
        String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap(
                (Response<ExtendedDatabaseBlobAuditingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExtendedDatabaseBlobAuditingPolicyInner get(
        String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Gets an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExtendedDatabaseBlobAuditingPolicyInner> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, context).block();
    }

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters) {
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
        final String blobAuditingPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            blobAuditingPolicyName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExtendedDatabaseBlobAuditingPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters,
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
        final String blobAuditingPolicyName = "default";
        final String apiVersion = "2017-03-01-preview";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                blobAuditingPolicyName,
                this.client.getSubscriptionId(),
                apiVersion,
                parameters,
                context);
    }

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExtendedDatabaseBlobAuditingPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters)
            .flatMap(
                (Response<ExtendedDatabaseBlobAuditingPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExtendedDatabaseBlobAuditingPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters).block();
    }

    /**
     * Creates or updates an extended database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters An extended database blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended database blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExtendedDatabaseBlobAuditingPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ExtendedDatabaseBlobAuditingPolicyInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters, context)
            .block();
    }

    /**
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExtendedDatabaseBlobAuditingPolicyInner>> listByDatabaseSinglePageAsync(
        String resourceGroupName, String serverName, String databaseName) {
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
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDatabase(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .<PagedResponse<ExtendedDatabaseBlobAuditingPolicyInner>>map(
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
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExtendedDatabaseBlobAuditingPolicyInner>> listByDatabaseSinglePageAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
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
        final String apiVersion = "2017-03-01-preview";
        context = this.client.mergeContext(context);
        return service
            .listByDatabase(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                this.client.getSubscriptionId(),
                apiVersion,
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
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExtendedDatabaseBlobAuditingPolicyInner> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ExtendedDatabaseBlobAuditingPolicyInner> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName, context),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExtendedDatabaseBlobAuditingPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName));
    }

    /**
     * Lists extended auditing settings of a database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExtendedDatabaseBlobAuditingPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExtendedDatabaseBlobAuditingPolicyInner>> listByDatabaseNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listByDatabaseNext(nextLink, context))
            .<PagedResponse<ExtendedDatabaseBlobAuditingPolicyInner>>map(
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
     * @return a list of database extended auditing settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExtendedDatabaseBlobAuditingPolicyInner>> listByDatabaseNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listByDatabaseNext(nextLink, context)
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
