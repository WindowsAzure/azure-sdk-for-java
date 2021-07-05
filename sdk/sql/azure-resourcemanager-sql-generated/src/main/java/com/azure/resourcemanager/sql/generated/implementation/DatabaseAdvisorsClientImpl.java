// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.resourcemanager.sql.generated.fluent.DatabaseAdvisorsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.AdvisorInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DatabaseAdvisorsClient. */
public final class DatabaseAdvisorsClientImpl implements DatabaseAdvisorsClient {
    private final ClientLogger logger = new ClientLogger(DatabaseAdvisorsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DatabaseAdvisorsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseAdvisorsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DatabaseAdvisorsClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy.create(DatabaseAdvisorsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientDatabaseAdvisors to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientD")
    private interface DatabaseAdvisorsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<AdvisorInner>>> listByDatabase(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @QueryParam("$expand") String expand,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AdvisorInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AdvisorInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") AdvisorInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param expand The child resources to include in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AdvisorInner>>> listByDatabaseWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String expand) {
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
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDatabase(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            expand,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<AdvisorInner>>> listByDatabaseWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String expand, Context context) {
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
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDatabase(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                expand,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param expand The child resources to include in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<AdvisorInner>> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName, String expand) {
        return listByDatabaseWithResponseAsync(resourceGroupName, serverName, databaseName, expand)
            .flatMap(
                (Response<List<AdvisorInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<AdvisorInner>> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName) {
        final String expand = null;
        return listByDatabaseWithResponseAsync(resourceGroupName, serverName, databaseName, expand)
            .flatMap(
                (Response<List<AdvisorInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<AdvisorInner> listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        final String expand = null;
        return listByDatabaseAsync(resourceGroupName, serverName, databaseName, expand).block();
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database advisors.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<AdvisorInner>> listByDatabaseWithResponse(
        String resourceGroupName, String serverName, String databaseName, String expand, Context context) {
        return listByDatabaseWithResponseAsync(resourceGroupName, serverName, databaseName, expand, context).block();
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            advisorName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName, Context context) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context);
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AdvisorInner> getAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName)
            .flatMap(
                (Response<AdvisorInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AdvisorInner get(String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return getAsync(resourceGroupName, serverName, databaseName, advisorName).block();
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AdvisorInner> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, String advisorName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName, context).block();
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> updateWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName, AdvisorInner parameters) {
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            advisorName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param parameters The requested advisor resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AdvisorInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        AdvisorInner parameters,
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
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                this.client.getSubscriptionId(),
                apiVersion,
                parameters,
                accept,
                context);
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AdvisorInner> updateAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName, AdvisorInner parameters) {
        return updateWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName, parameters)
            .flatMap(
                (Response<AdvisorInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param parameters The requested advisor resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AdvisorInner update(
        String resourceGroupName, String serverName, String databaseName, String advisorName, AdvisorInner parameters) {
        return updateAsync(resourceGroupName, serverName, databaseName, advisorName, parameters).block();
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param parameters The requested advisor resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AdvisorInner> updateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        AdvisorInner parameters,
        Context context) {
        return updateWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName, parameters, context)
            .block();
    }
}
