// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.redis.fluent.models.RedisLinkedServerWithPropertiesInner;
import com.azure.resourcemanager.redis.models.RedisLinkedServerCreateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LinkedServersClient. */
public interface LinkedServersClient {
    /**
     * Adds a linked server to the Redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param parameters Parameters supplied to the Create Linked server operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get linked server (with properties) for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String name, String linkedServerName, RedisLinkedServerCreateParameters parameters);

    /**
     * Adds a linked server to the Redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param parameters Parameters supplied to the Create Linked server operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get linked server (with properties) for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RedisLinkedServerWithPropertiesInner>, RedisLinkedServerWithPropertiesInner> beginCreateAsync(
        String resourceGroupName, String name, String linkedServerName, RedisLinkedServerCreateParameters parameters);

    /**
     * Adds a linked server to the Redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param parameters Parameters supplied to the Create Linked server operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get linked server (with properties) for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RedisLinkedServerWithPropertiesInner>, RedisLinkedServerWithPropertiesInner> beginCreate(
        String resourceGroupName, String name, String linkedServerName, RedisLinkedServerCreateParameters parameters);

    /**
     * Adds a linked server to the Redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param parameters Parameters supplied to the Create Linked server operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get linked server (with properties) for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RedisLinkedServerWithPropertiesInner>, RedisLinkedServerWithPropertiesInner> beginCreate(
        String resourceGroupName,
        String name,
        String linkedServerName,
        RedisLinkedServerCreateParameters parameters,
        Context context);

    /**
     * Adds a linked server to the Redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param parameters Parameters supplied to the Create Linked server operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get linked server (with properties) for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RedisLinkedServerWithPropertiesInner> createAsync(
        String resourceGroupName, String name, String linkedServerName, RedisLinkedServerCreateParameters parameters);

    /**
     * Adds a linked server to the Redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param parameters Parameters supplied to the Create Linked server operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get linked server (with properties) for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RedisLinkedServerWithPropertiesInner create(
        String resourceGroupName, String name, String linkedServerName, RedisLinkedServerCreateParameters parameters);

    /**
     * Adds a linked server to the Redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the Redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param parameters Parameters supplied to the Create Linked server operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to put/get linked server (with properties) for Redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RedisLinkedServerWithPropertiesInner create(
        String resourceGroupName,
        String name,
        String linkedServerName,
        RedisLinkedServerCreateParameters parameters,
        Context context);

    /**
     * Deletes the linked server from a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String name, String linkedServerName);

    /**
     * Deletes the linked server from a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String name, String linkedServerName);

    /**
     * Deletes the linked server from a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name, String linkedServerName);

    /**
     * Deletes the linked server from a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server that is being added to the Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String name, String linkedServerName, Context context);

    /**
     * Gets the detailed information about a linked server of a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information about a linked server of a redis cache (requires Premium SKU).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RedisLinkedServerWithPropertiesInner>> getWithResponseAsync(
        String resourceGroupName, String name, String linkedServerName);

    /**
     * Gets the detailed information about a linked server of a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information about a linked server of a redis cache (requires Premium SKU).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RedisLinkedServerWithPropertiesInner> getAsync(String resourceGroupName, String name, String linkedServerName);

    /**
     * Gets the detailed information about a linked server of a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information about a linked server of a redis cache (requires Premium SKU).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RedisLinkedServerWithPropertiesInner get(String resourceGroupName, String name, String linkedServerName);

    /**
     * Gets the detailed information about a linked server of a redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param linkedServerName The name of the linked server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information about a linked server of a redis cache (requires Premium SKU).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RedisLinkedServerWithPropertiesInner> getWithResponse(
        String resourceGroupName, String name, String linkedServerName, Context context);

    /**
     * Gets the list of linked servers associated with this redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of linked servers associated with this redis cache (requires Premium SKU).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RedisLinkedServerWithPropertiesInner> listAsync(String resourceGroupName, String name);

    /**
     * Gets the list of linked servers associated with this redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of linked servers associated with this redis cache (requires Premium SKU).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RedisLinkedServerWithPropertiesInner> list(String resourceGroupName, String name);

    /**
     * Gets the list of linked servers associated with this redis cache (requires Premium SKU).
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of linked servers associated with this redis cache (requires Premium SKU).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RedisLinkedServerWithPropertiesInner> list(String resourceGroupName, String name, Context context);
}
