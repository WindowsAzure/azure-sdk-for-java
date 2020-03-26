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
import com.azure.management.sql.VirtualClusterUpdate;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualClusters.
 */
public final class VirtualClustersInner implements InnerSupportsGet<VirtualClusterInner>, InnerSupportsListing<VirtualClusterInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualClustersService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of VirtualClustersInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualClustersInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(VirtualClustersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientVirtualClusters to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientVirtualClusters")
    private interface VirtualClustersService {
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/virtualClusters")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualClusterListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/virtualClusters")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualClusterListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/virtualClusters/{virtualClusterName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualClusterInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualClusterName") String virtualClusterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/virtualClusters/{virtualClusterName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualClusterName") String virtualClusterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/virtualClusters/{virtualClusterName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualClusterName") String virtualClusterName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualClusterUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/virtualClusters/{virtualClusterName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualClusterName") String virtualClusterName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/virtualClusters/{virtualClusterName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualClusterInner>> beginUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualClusterName") String virtualClusterName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualClusterUpdate parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualClusterListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualClusterListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a list of all virtualClusters in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualClusterInner>> listSinglePageAsync() {
        final String apiVersion = "2015-05-01-preview";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of all virtualClusters in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualClusterInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all virtualClusters in the subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualClusterInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets a list of virtual clusters in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualClusterInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2015-05-01-preview";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of virtual clusters in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualClusterInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of virtual clusters in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualClusterInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Gets a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualClusterInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String virtualClusterName) {
        final String apiVersion = "2015-05-01-preview";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, virtualClusterName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualClusterInner> getByResourceGroupAsync(String resourceGroupName, String virtualClusterName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, virtualClusterName)
            .flatMap((SimpleResponse<VirtualClusterInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualClusterInner getByResourceGroup(String resourceGroupName, String virtualClusterName) {
        return getByResourceGroupAsync(resourceGroupName, virtualClusterName).block();
    }

    /**
     * Deletes a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String virtualClusterName) {
        final String apiVersion = "2015-05-01-preview";
        return service.delete(this.client.getHost(), resourceGroupName, virtualClusterName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String virtualClusterName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, virtualClusterName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String virtualClusterName) {
        deleteAsync(resourceGroupName, virtualClusterName).block();
    }

    /**
     * Updates a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @param parameters An update request for an Azure SQL Database virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters) {
        final String apiVersion = "2015-05-01-preview";
        return service.update(this.client.getHost(), resourceGroupName, virtualClusterName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @param parameters An update request for an Azure SQL Database virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualClusterInner> updateAsync(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateWithResponseAsync(resourceGroupName, virtualClusterName, parameters);
        return client.<VirtualClusterInner, VirtualClusterInner>getLroResultAsync(response, client.getHttpPipeline(), VirtualClusterInner.class, VirtualClusterInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @param parameters An update request for an Azure SQL Database virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualClusterInner update(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters) {
        return updateAsync(resourceGroupName, virtualClusterName, parameters).block();
    }

    /**
     * Deletes a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String virtualClusterName) {
        final String apiVersion = "2015-05-01-preview";
        return service.beginDelete(this.client.getHost(), resourceGroupName, virtualClusterName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String virtualClusterName) {
        return beginDeleteWithResponseAsync(resourceGroupName, virtualClusterName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String virtualClusterName) {
        beginDeleteAsync(resourceGroupName, virtualClusterName).block();
    }

    /**
     * Updates a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @param parameters An update request for an Azure SQL Database virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualClusterInner>> beginUpdateWithResponseAsync(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters) {
        final String apiVersion = "2015-05-01-preview";
        return service.beginUpdate(this.client.getHost(), resourceGroupName, virtualClusterName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @param parameters An update request for an Azure SQL Database virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualClusterInner> beginUpdateAsync(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters) {
        return beginUpdateWithResponseAsync(resourceGroupName, virtualClusterName, parameters)
            .flatMap((SimpleResponse<VirtualClusterInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates a virtual cluster.
     * 
     * @param resourceGroupName 
     * @param virtualClusterName 
     * @param parameters An update request for an Azure SQL Database virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualClusterInner beginUpdate(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters) {
        return beginUpdateAsync(resourceGroupName, virtualClusterName, parameters).block();
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
    public Mono<PagedResponse<VirtualClusterInner>> listNextSinglePageAsync(String nextLink) {
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
    public Mono<PagedResponse<VirtualClusterInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
