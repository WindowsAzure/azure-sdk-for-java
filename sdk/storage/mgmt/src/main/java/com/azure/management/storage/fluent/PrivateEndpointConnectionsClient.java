// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
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
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.storage.StorageManagementClient;
import com.azure.management.storage.fluent.inner.PrivateEndpointConnectionInner;
import com.azure.management.storage.fluent.inner.PrivateEndpointConnectionListResultInner;
import com.azure.management.storage.models.PrivateEndpoint;
import com.azure.management.storage.models.PrivateLinkServiceConnectionState;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnections. */
public final class PrivateEndpointConnectionsClient {
    private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsClient.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateEndpointConnectionsService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsClient(StorageManagementClient client) {
        this.service =
            RestProxy
                .create(
                    PrivateEndpointConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientPrivateEndpointConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface PrivateEndpointConnectionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/privateEndpointConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionListResultInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> put(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @BodyParam("application/json") PrivateEndpointConnectionInner properties,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            Context context);
    }

    /**
     * List all the private endpoint connections associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateEndpointConnectionInner>> listSinglePageAsync(
        String resourceGroupName, String accountName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<PrivateEndpointConnectionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * List all the private endpoint connections associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateEndpointConnectionInner>> listSinglePageAsync(
        String resourceGroupName, String accountName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .list(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * List all the private endpoint connections associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PrivateEndpointConnectionInner> listAsync(String resourceGroupName, String accountName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, accountName));
    }

    /**
     * List all the private endpoint connections associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PrivateEndpointConnectionInner> listAsync(
        String resourceGroupName, String accountName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, accountName, context));
    }

    /**
     * List all the private endpoint connections associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String accountName) {
        return new PagedIterable<>(listAsync(resourceGroupName, accountName));
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            privateEndpointConnectionName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        return service
            .get(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                privateEndpointConnectionName,
                context);
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> getAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName)
            .flatMap(
                (SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner get(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getAsync(resourceGroupName, accountName, privateEndpointConnectionName).block();
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param privateEndpoint The Private Endpoint resource.
     * @param privateLinkServiceConnectionState A collection of information about the state of the connection between
     *     service consumer and provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> putWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpoint privateEndpoint,
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (privateLinkServiceConnectionState != null) {
            privateLinkServiceConnectionState.validate();
        }
        if (privateEndpoint != null) {
            privateEndpoint.validate();
        }
        PrivateEndpointConnectionInner properties = new PrivateEndpointConnectionInner();
        properties.withPrivateEndpoint(privateEndpoint);
        properties.withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .put(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            privateEndpointConnectionName,
                            properties,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param privateEndpoint The Private Endpoint resource.
     * @param privateLinkServiceConnectionState A collection of information about the state of the connection between
     *     service consumer and provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> putWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpoint privateEndpoint,
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (privateLinkServiceConnectionState != null) {
            privateLinkServiceConnectionState.validate();
        }
        if (privateEndpoint != null) {
            privateEndpoint.validate();
        }
        PrivateEndpointConnectionInner properties = new PrivateEndpointConnectionInner();
        properties.withPrivateEndpoint(privateEndpoint);
        properties.withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return service
            .put(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                privateEndpointConnectionName,
                properties,
                context);
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param privateEndpoint The Private Endpoint resource.
     * @param privateLinkServiceConnectionState A collection of information about the state of the connection between
     *     service consumer and provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> putAsync(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpoint privateEndpoint,
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return putWithResponseAsync(
                resourceGroupName,
                accountName,
                privateEndpointConnectionName,
                privateEndpoint,
                privateLinkServiceConnectionState)
            .flatMap(
                (SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param privateEndpoint The Private Endpoint resource.
     * @param privateLinkServiceConnectionState A collection of information about the state of the connection between
     *     service consumer and provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner put(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpoint privateEndpoint,
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return putAsync(
                resourceGroupName,
                accountName,
                privateEndpointConnectionName,
                privateEndpoint,
                privateLinkServiceConnectionState)
            .block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            privateEndpointConnectionName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String privateEndpointConnectionName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        return service
            .delete(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                privateEndpointConnectionName,
                context);
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return deleteWithResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        deleteAsync(resourceGroupName, accountName, privateEndpointConnectionName).block();
    }
}
