// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice.models;

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
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * AgentPools.
 */
public final class AgentPoolsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private AgentPoolsService service;

    /**
     * The service client containing this operation class.
     */
    private ContainerServiceManagementClientImpl client;

    /**
     * Initializes an instance of AgentPoolsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public AgentPoolsInner(ContainerServiceManagementClientImpl client) {
        this.service = RestProxy.create(AgentPoolsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ContainerServiceManagementClientAgentPools to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerServiceManagementClientAgentPools")
    private interface AgentPoolsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/agentPools")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AgentPoolListResultInner>> list(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/agentPools/{agentPoolName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AgentPoolInner>> get(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @PathParam("agentPoolName") String agentPoolName);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/agentPools/{agentPoolName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @PathParam("agentPoolName") String agentPoolName, @BodyParam("application/json") AgentPoolInner parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/agentPools/{agentPoolName}")
        @ExpectedResponses({202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @PathParam("agentPoolName") String agentPoolName);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/agentPools/{agentPoolName}/upgradeProfiles/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AgentPoolUpgradeProfileInner>> getUpgradeProfile(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @PathParam("agentPoolName") String agentPoolName);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/availableAgentPoolVersions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AgentPoolAvailableVersionsInner>> getAvailableAgentPoolVersions(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/agentPools/{agentPoolName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AgentPoolInner>> beginCreateOrUpdate(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @PathParam("agentPoolName") String agentPoolName, @BodyParam("application/json") AgentPoolInner parameters);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{resourceName}/agentPools/{agentPoolName}")
        @ExpectedResponses({202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @PathParam("agentPoolName") String agentPoolName);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AgentPoolListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a list of agent pools in the specified managed cluster. The operation returns properties of each agent pool.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<AgentPoolInner>> listSinglePageAsync(String resourceGroupName, String resourceName) {
        final String apiVersion = "2019-08-01";
        return service.list(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of agent pools in the specified managed cluster. The operation returns properties of each agent pool.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AgentPoolInner> listAsync(String resourceGroupName, String resourceName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, resourceName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of agent pools in the specified managed cluster. The operation returns properties of each agent pool.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AgentPoolInner> list(String resourceGroupName, String resourceName) {
        return new PagedIterable<>(listAsync(resourceGroupName, resourceName));
    }

    /**
     * Gets the details of the agent pool by managed cluster and resource group.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AgentPoolInner>> getWithResponseAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        final String apiVersion = "2019-08-01";
        return service.get(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName, agentPoolName);
    }

    /**
     * Gets the details of the agent pool by managed cluster and resource group.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AgentPoolInner> getAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        return getWithResponseAsync(resourceGroupName, resourceName, agentPoolName)
            .flatMap((SimpleResponse<AgentPoolInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the details of the agent pool by managed cluster and resource group.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AgentPoolInner get(String resourceGroupName, String resourceName, String agentPoolName) {
        return getAsync(resourceGroupName, resourceName, agentPoolName).block();
    }

    /**
     * Creates or updates an agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @param parameters Agent Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String resourceName, String agentPoolName, AgentPoolInner parameters) {
        final String apiVersion = "2019-08-01";
        return service.createOrUpdate(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName, agentPoolName, parameters);
    }

    /**
     * Creates or updates an agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @param parameters Agent Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AgentPoolInner> createOrUpdateAsync(String resourceGroupName, String resourceName, String agentPoolName, AgentPoolInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, resourceName, agentPoolName, parameters);
        return this.client.<AgentPoolInner, AgentPoolInner>getLroResultAsync(response, this.client.getHttpPipeline(), AgentPoolInner.class, AgentPoolInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates an agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @param parameters Agent Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AgentPoolInner createOrUpdate(String resourceGroupName, String resourceName, String agentPoolName, AgentPoolInner parameters) {
        return createOrUpdateAsync(resourceGroupName, resourceName, agentPoolName, parameters).block();
    }

    /**
     * Deletes the agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        final String apiVersion = "2019-08-01";
        return service.delete(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName, agentPoolName);
    }

    /**
     * Deletes the agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, resourceName, agentPoolName);
        return this.client.<Void, Void>getLroResultAsync(response, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String resourceName, String agentPoolName) {
        deleteAsync(resourceGroupName, resourceName, agentPoolName).block();
    }

    /**
     * Gets the details of the upgrade profile for an agent pool with a specified resource group and managed cluster name.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AgentPoolUpgradeProfileInner>> getUpgradeProfileWithResponseAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        final String apiVersion = "2019-08-01";
        return service.getUpgradeProfile(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName, agentPoolName);
    }

    /**
     * Gets the details of the upgrade profile for an agent pool with a specified resource group and managed cluster name.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AgentPoolUpgradeProfileInner> getUpgradeProfileAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        return getUpgradeProfileWithResponseAsync(resourceGroupName, resourceName, agentPoolName)
            .flatMap((SimpleResponse<AgentPoolUpgradeProfileInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the details of the upgrade profile for an agent pool with a specified resource group and managed cluster name.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AgentPoolUpgradeProfileInner getUpgradeProfile(String resourceGroupName, String resourceName, String agentPoolName) {
        return getUpgradeProfileAsync(resourceGroupName, resourceName, agentPoolName).block();
    }

    /**
     * Gets a list of supported versions for the specified agent pool.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AgentPoolAvailableVersionsInner>> getAvailableAgentPoolVersionsWithResponseAsync(String resourceGroupName, String resourceName) {
        final String apiVersion = "2019-08-01";
        return service.getAvailableAgentPoolVersions(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName);
    }

    /**
     * Gets a list of supported versions for the specified agent pool.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AgentPoolAvailableVersionsInner> getAvailableAgentPoolVersionsAsync(String resourceGroupName, String resourceName) {
        return getAvailableAgentPoolVersionsWithResponseAsync(resourceGroupName, resourceName)
            .flatMap((SimpleResponse<AgentPoolAvailableVersionsInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a list of supported versions for the specified agent pool.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AgentPoolAvailableVersionsInner getAvailableAgentPoolVersions(String resourceGroupName, String resourceName) {
        return getAvailableAgentPoolVersionsAsync(resourceGroupName, resourceName).block();
    }

    /**
     * Creates or updates an agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @param parameters Agent Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AgentPoolInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String resourceName, String agentPoolName, AgentPoolInner parameters) {
        final String apiVersion = "2019-08-01";
        return service.beginCreateOrUpdate(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName, agentPoolName, parameters);
    }

    /**
     * Creates or updates an agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @param parameters Agent Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AgentPoolInner> beginCreateOrUpdateAsync(String resourceGroupName, String resourceName, String agentPoolName, AgentPoolInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, resourceName, agentPoolName, parameters)
            .flatMap((SimpleResponse<AgentPoolInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates an agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @param parameters Agent Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AgentPoolInner beginCreateOrUpdate(String resourceGroupName, String resourceName, String agentPoolName, AgentPoolInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, resourceName, agentPoolName, parameters).block();
    }

    /**
     * Deletes the agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        final String apiVersion = "2019-08-01";
        return service.beginDelete(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), resourceGroupName, resourceName, agentPoolName);
    }

    /**
     * Deletes the agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        return beginDeleteWithResponseAsync(resourceGroupName, resourceName, agentPoolName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the agent pool in the specified managed cluster.
     * 
     * @param resourceGroupName 
     * @param resourceName 
     * @param agentPoolName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String resourceName, String agentPoolName) {
        beginDeleteAsync(resourceGroupName, resourceName, agentPoolName).block();
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
    public Mono<PagedResponse<AgentPoolInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
