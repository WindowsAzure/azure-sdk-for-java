// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.implementation;

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
import com.azure.resourcemanager.cosmos.fluent.RestorableDatabaseAccountsClient;
import com.azure.resourcemanager.cosmos.fluent.models.RestorableDatabaseAccountGetResultInner;
import com.azure.resourcemanager.cosmos.models.RestorableDatabaseAccountsListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RestorableDatabaseAccountsClient. */
public final class RestorableDatabaseAccountsClientImpl implements RestorableDatabaseAccountsClient {
    private final ClientLogger logger = new ClientLogger(RestorableDatabaseAccountsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RestorableDatabaseAccountsService service;

    /** The service client containing this operation class. */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of RestorableDatabaseAccountsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestorableDatabaseAccountsClientImpl(CosmosDBManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    RestorableDatabaseAccountsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientRestorableDatabaseAccounts to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    private interface RestorableDatabaseAccountsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}"
                + "/restorableDatabaseAccounts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDatabaseAccountsListResult>> listByLocation(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/restorableDatabaseAccounts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDatabaseAccountsListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}"
                + "/restorableDatabaseAccounts/{instanceId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDatabaseAccountGetResultInner>> getByLocation(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @PathParam("instanceId") String instanceId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDatabaseAccountGetResultInner>> listByLocationSinglePageAsync(
        String location) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByLocation(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            accept,
                            context))
            .<PagedResponse<RestorableDatabaseAccountGetResultInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDatabaseAccountGetResultInner>> listByLocationSinglePageAsync(
        String location, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByLocation(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RestorableDatabaseAccountGetResultInner> listByLocationAsync(String location) {
        return new PagedFlux<>(() -> listByLocationSinglePageAsync(location));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RestorableDatabaseAccountGetResultInner> listByLocationAsync(String location, Context context) {
        return new PagedFlux<>(() -> listByLocationSinglePageAsync(location, context));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDatabaseAccountGetResultInner> listByLocation(String location) {
        return new PagedIterable<>(listByLocationAsync(location));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription and in a region. This
     * call requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDatabaseAccountGetResultInner> listByLocation(String location, Context context) {
        return new PagedIterable<>(listByLocationAsync(location, context));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDatabaseAccountGetResultInner>> listSinglePageAsync() {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<RestorableDatabaseAccountGetResultInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDatabaseAccountGetResultInner>> listSinglePageAsync(Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RestorableDatabaseAccountGetResultInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RestorableDatabaseAccountGetResultInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDatabaseAccountGetResultInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all the restorable Azure Cosmos DB database accounts available under the subscription. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read' permission.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable database accounts and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDatabaseAccountGetResultInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Retrieves the properties of an existing Azure Cosmos DB restorable database account. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read/*' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Cosmos DB restorable database account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RestorableDatabaseAccountGetResultInner>> getByLocationWithResponseAsync(
        String location, String instanceId) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByLocation(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            instanceId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the properties of an existing Azure Cosmos DB restorable database account. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read/*' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Cosmos DB restorable database account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RestorableDatabaseAccountGetResultInner>> getByLocationWithResponseAsync(
        String location, String instanceId, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByLocation(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                instanceId,
                accept,
                context);
    }

    /**
     * Retrieves the properties of an existing Azure Cosmos DB restorable database account. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read/*' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Cosmos DB restorable database account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RestorableDatabaseAccountGetResultInner> getByLocationAsync(String location, String instanceId) {
        return getByLocationWithResponseAsync(location, instanceId)
            .flatMap(
                (Response<RestorableDatabaseAccountGetResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves the properties of an existing Azure Cosmos DB restorable database account. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read/*' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Cosmos DB restorable database account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RestorableDatabaseAccountGetResultInner getByLocation(String location, String instanceId) {
        return getByLocationAsync(location, instanceId).block();
    }

    /**
     * Retrieves the properties of an existing Azure Cosmos DB restorable database account. This call requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/read/*' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Azure Cosmos DB restorable database account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RestorableDatabaseAccountGetResultInner> getByLocationWithResponse(
        String location, String instanceId, Context context) {
        return getByLocationWithResponseAsync(location, instanceId, context).block();
    }
}
