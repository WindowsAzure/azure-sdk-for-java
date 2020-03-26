// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

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
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import com.azure.management.sql.InstancePoolUpdate;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * InstancePools.
 */
public final class InstancePoolsInner implements InnerSupportsGet<InstancePoolInner>, InnerSupportsListing<InstancePoolInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private InstancePoolsService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of InstancePoolsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public InstancePoolsInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(InstancePoolsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientInstancePools to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientInstancePools")
    private interface InstancePoolsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InstancePoolInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") InstancePoolInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") InstancePoolUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InstancePoolListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/instancePools")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InstancePoolListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InstancePoolInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") InstancePoolInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/instancePools/{instancePoolName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InstancePoolInner>> beginUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("instancePoolName") String instancePoolName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") InstancePoolUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InstancePoolListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InstancePoolListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<InstancePoolInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String instancePoolName) {
        final String apiVersion = "2018-06-01-preview";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InstancePoolInner> getByResourceGroupAsync(String resourceGroupName, String instancePoolName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, instancePoolName)
            .flatMap((SimpleResponse<InstancePoolInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InstancePoolInner getByResourceGroup(String resourceGroupName, String instancePoolName) {
        return getByResourceGroupAsync(resourceGroupName, instancePoolName).block();
    }

    /**
     * Creates or updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param parameters An Azure SQL instance pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String instancePoolName, InstancePoolInner parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param parameters An Azure SQL instance pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InstancePoolInner> createOrUpdateAsync(String resourceGroupName, String instancePoolName, InstancePoolInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, instancePoolName, parameters);
        return client.<InstancePoolInner, InstancePoolInner>getLroResultAsync(response, client.getHttpPipeline(), InstancePoolInner.class, InstancePoolInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param parameters An Azure SQL instance pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InstancePoolInner createOrUpdate(String resourceGroupName, String instancePoolName, InstancePoolInner parameters) {
        return createOrUpdateAsync(resourceGroupName, instancePoolName, parameters).block();
    }

    /**
     * Deletes an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String instancePoolName) {
        final String apiVersion = "2018-06-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String instancePoolName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, instancePoolName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String instancePoolName) {
        deleteAsync(resourceGroupName, instancePoolName).block();
    }

    /**
     * Updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String instancePoolName, Map<String, String> tags) {
        final String apiVersion = "2018-06-01-preview";
        InstancePoolUpdate parameters = new InstancePoolUpdate();
        parameters.withTags(tags);
        return service.update(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InstancePoolInner> updateAsync(String resourceGroupName, String instancePoolName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateWithResponseAsync(resourceGroupName, instancePoolName, tags);
        return client.<InstancePoolInner, InstancePoolInner>getLroResultAsync(response, client.getHttpPipeline(), InstancePoolInner.class, InstancePoolInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InstancePoolInner update(String resourceGroupName, String instancePoolName, Map<String, String> tags) {
        return updateAsync(resourceGroupName, instancePoolName, tags).block();
    }

    /**
     * Gets a list of instance pools in the resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<InstancePoolInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2018-06-01-preview";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of instance pools in the resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<InstancePoolInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of instance pools in the resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<InstancePoolInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Gets a list of all instance pools in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<InstancePoolInner>> listSinglePageAsync() {
        final String apiVersion = "2018-06-01-preview";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of all instance pools in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<InstancePoolInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all instance pools in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<InstancePoolInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Creates or updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param parameters An Azure SQL instance pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<InstancePoolInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String instancePoolName, InstancePoolInner parameters) {
        final String apiVersion = "2018-06-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param parameters An Azure SQL instance pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InstancePoolInner> beginCreateOrUpdateAsync(String resourceGroupName, String instancePoolName, InstancePoolInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, instancePoolName, parameters)
            .flatMap((SimpleResponse<InstancePoolInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param parameters An Azure SQL instance pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InstancePoolInner beginCreateOrUpdate(String resourceGroupName, String instancePoolName, InstancePoolInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, instancePoolName, parameters).block();
    }

    /**
     * Deletes an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String instancePoolName) {
        final String apiVersion = "2018-06-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String instancePoolName) {
        return beginDeleteWithResponseAsync(resourceGroupName, instancePoolName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String instancePoolName) {
        beginDeleteAsync(resourceGroupName, instancePoolName).block();
    }

    /**
     * Updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<InstancePoolInner>> beginUpdateWithResponseAsync(String resourceGroupName, String instancePoolName, Map<String, String> tags) {
        final String apiVersion = "2018-06-01-preview";
        InstancePoolUpdate parameters = new InstancePoolUpdate();
        parameters.withTags(tags);
        return service.beginUpdate(this.client.getHost(), resourceGroupName, instancePoolName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InstancePoolInner> beginUpdateAsync(String resourceGroupName, String instancePoolName, Map<String, String> tags) {
        return beginUpdateWithResponseAsync(resourceGroupName, instancePoolName, tags)
            .flatMap((SimpleResponse<InstancePoolInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates an instance pool.
     * 
     * @param resourceGroupName 
     * @param instancePoolName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InstancePoolInner beginUpdate(String resourceGroupName, String instancePoolName, Map<String, String> tags) {
        return beginUpdateAsync(resourceGroupName, instancePoolName, tags).block();
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
    public Mono<PagedResponse<InstancePoolInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
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
    public Mono<PagedResponse<InstancePoolInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
