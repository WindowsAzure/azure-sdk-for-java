// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
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
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.network.TagsObject;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * RouteTables.
 */
public final class RouteTablesInner implements InnerSupportsGet<RouteTableInner>, InnerSupportsListing<RouteTableInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private RouteTablesService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of RouteTablesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public RouteTablesInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(RouteTablesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientRouteTables to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientRouteTables")
    private interface RouteTablesService {
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeTableName") String routeTableName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteTableInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeTableName") String routeTableName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeTableName") String routeTableName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") RouteTableInner parameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> updateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeTableName") String routeTableName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteTableListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/routeTables")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteTableListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeTableName") String routeTableName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteTableInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeTableName") String routeTableName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") RouteTableInner parameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteTableInner>> beginUpdateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("routeTableName") String routeTableName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteTableListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RouteTableListResultInner>> listAllNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String routeTableName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, routeTableName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String routeTableName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, routeTableName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String routeTableName) {
        deleteAsync(resourceGroupName, routeTableName).block();
    }

    /**
     * Gets the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RouteTableInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String routeTableName, String expand) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, routeTableName, this.client.getSubscriptionId(), expand, apiVersion);
    }

    /**
     * Gets the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTableInner> getByResourceGroupAsync(String resourceGroupName, String routeTableName, String expand) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, routeTableName, expand)
            .flatMap((SimpleResponse<RouteTableInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTableInner> getByResourceGroupAsync(String resourceGroupName, String routeTableName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupWithResponseAsync(resourceGroupName, routeTableName, expand)
            .flatMap((SimpleResponse<RouteTableInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteTableInner getByResourceGroup(String resourceGroupName, String routeTableName, String expand) {
        return getByResourceGroupAsync(resourceGroupName, routeTableName, expand).block();
    }

    /**
     * Gets the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteTableInner getByResourceGroup(String resourceGroupName, String routeTableName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupAsync(resourceGroupName, routeTableName, expand).block();
    }

    /**
     * Create or updates a route table in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String routeTableName, RouteTableInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, routeTableName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Create or updates a route table in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTableInner> createOrUpdateAsync(String resourceGroupName, String routeTableName, RouteTableInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, routeTableName, parameters);
        return client.<RouteTableInner, RouteTableInner>getLroResultAsync(response, client.getHttpPipeline(), RouteTableInner.class, RouteTableInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Create or updates a route table in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteTableInner createOrUpdate(String resourceGroupName, String routeTableName, RouteTableInner parameters) {
        return createOrUpdateAsync(resourceGroupName, routeTableName, parameters).block();
    }

    /**
     * Updates a route table tags.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateTagsWithResponseAsync(String resourceGroupName, String routeTableName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.updateTags(this.client.getHost(), resourceGroupName, routeTableName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a route table tags.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTableInner> updateTagsAsync(String resourceGroupName, String routeTableName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateTagsWithResponseAsync(resourceGroupName, routeTableName, tags);
        return client.<RouteTableInner, RouteTableInner>getLroResultAsync(response, client.getHttpPipeline(), RouteTableInner.class, RouteTableInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates a route table tags.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteTableInner updateTags(String resourceGroupName, String routeTableName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, routeTableName, tags).block();
    }

    /**
     * Gets all route tables in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RouteTableInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-06-01";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all route tables in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteTableInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all route tables in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteTableInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Gets all route tables in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RouteTableInner>> listSinglePageAsync() {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all route tables in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RouteTableInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listAllNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all route tables in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RouteTableInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Deletes the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String routeTableName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, routeTableName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String routeTableName) {
        return beginDeleteWithResponseAsync(resourceGroupName, routeTableName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified route table.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String routeTableName) {
        beginDeleteAsync(resourceGroupName, routeTableName).block();
    }

    /**
     * Create or updates a route table in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RouteTableInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String routeTableName, RouteTableInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, routeTableName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Create or updates a route table in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTableInner> beginCreateOrUpdateAsync(String resourceGroupName, String routeTableName, RouteTableInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, routeTableName, parameters)
            .flatMap((SimpleResponse<RouteTableInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Create or updates a route table in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param parameters Route table resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteTableInner beginCreateOrUpdate(String resourceGroupName, String routeTableName, RouteTableInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, routeTableName, parameters).block();
    }

    /**
     * Updates a route table tags.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RouteTableInner>> beginUpdateTagsWithResponseAsync(String resourceGroupName, String routeTableName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.beginUpdateTags(this.client.getHost(), resourceGroupName, routeTableName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a route table tags.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteTableInner> beginUpdateTagsAsync(String resourceGroupName, String routeTableName, Map<String, String> tags) {
        return beginUpdateTagsWithResponseAsync(resourceGroupName, routeTableName, tags)
            .flatMap((SimpleResponse<RouteTableInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a route table tags.
     * 
     * @param resourceGroupName 
     * @param routeTableName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RouteTableInner beginUpdateTags(String resourceGroupName, String routeTableName, Map<String, String> tags) {
        return beginUpdateTagsAsync(resourceGroupName, routeTableName, tags).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RouteTableInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RouteTableInner>> listAllNextSinglePageAsync(String nextLink) {
        return service.listAllNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
