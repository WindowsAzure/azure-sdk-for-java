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
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.network.ErrorException;
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
 * VirtualHubs.
 */
public final class VirtualHubsInner implements InnerSupportsGet<VirtualHubInner>, InnerSupportsListing<VirtualHubInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualHubsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VirtualHubsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualHubsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VirtualHubsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVirtualHubs to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientVirtualHubs")
    private interface VirtualHubsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<VirtualHubInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualHubName") String virtualHubName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualHubName") String virtualHubName, @BodyParam("application/json") VirtualHubInner virtualHubParameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> updateTags(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualHubName") String virtualHubName, @BodyParam("application/json") TagsObject virtualHubParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualHubName") String virtualHubName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListVirtualHubsResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/virtualHubs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListVirtualHubsResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<VirtualHubInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualHubName") String virtualHubName, @BodyParam("application/json") VirtualHubInner virtualHubParameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<VirtualHubInner>> beginUpdateTags(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualHubName") String virtualHubName, @BodyParam("application/json") TagsObject virtualHubParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualHubs/{virtualHubName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualHubName") String virtualHubName, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListVirtualHubsResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListVirtualHubsResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Retrieves the details of a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualHubInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String virtualHubName) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualHubName, apiVersion);
    }

    /**
     * Retrieves the details of a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualHubInner> getByResourceGroupAsync(String resourceGroupName, String virtualHubName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, virtualHubName)
            .flatMap((SimpleResponse<VirtualHubInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves the details of a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualHubInner getByResourceGroup(String resourceGroupName, String virtualHubName) {
        return getByResourceGroupAsync(resourceGroupName, virtualHubName).block();
    }

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param virtualHubParameters VirtualHub Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualHubName, virtualHubParameters, apiVersion);
    }

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param virtualHubParameters VirtualHub Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualHubInner> createOrUpdateAsync(String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, virtualHubName, virtualHubParameters);
        return client.<VirtualHubInner, VirtualHubInner>getLroResultAsync(response, client.getHttpPipeline(), VirtualHubInner.class, VirtualHubInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param virtualHubParameters VirtualHub Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualHubInner createOrUpdate(String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters) {
        return createOrUpdateAsync(resourceGroupName, virtualHubName, virtualHubParameters).block();
    }

    /**
     * Updates VirtualHub tags.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateTagsWithResponseAsync(String resourceGroupName, String virtualHubName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject virtualHubParameters = new TagsObject();
        virtualHubParameters.withTags(tags);
        return service.updateTags(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualHubName, virtualHubParameters, apiVersion);
    }

    /**
     * Updates VirtualHub tags.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualHubInner> updateTagsAsync(String resourceGroupName, String virtualHubName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateTagsWithResponseAsync(resourceGroupName, virtualHubName, tags);
        return client.<VirtualHubInner, VirtualHubInner>getLroResultAsync(response, client.getHttpPipeline(), VirtualHubInner.class, VirtualHubInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates VirtualHub tags.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualHubInner updateTags(String resourceGroupName, String virtualHubName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, virtualHubName, tags).block();
    }

    /**
     * Deletes a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String virtualHubName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualHubName, apiVersion);
    }

    /**
     * Deletes a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String virtualHubName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, virtualHubName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String virtualHubName) {
        deleteAsync(resourceGroupName, virtualHubName).block();
    }

    /**
     * Lists all the VirtualHubs in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualHubInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-06-01";
        return service.listByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Lists all the VirtualHubs in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualHubInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the VirtualHubs in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualHubInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Lists all the VirtualHubs in a subscription.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualHubInner>> listSinglePageAsync() {
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
     * Lists all the VirtualHubs in a subscription.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualHubInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the VirtualHubs in a subscription.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualHubInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param virtualHubParameters VirtualHub Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualHubInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualHubName, virtualHubParameters, apiVersion);
    }

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param virtualHubParameters VirtualHub Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualHubInner> beginCreateOrUpdateAsync(String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, virtualHubName, virtualHubParameters)
            .flatMap((SimpleResponse<VirtualHubInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param virtualHubParameters VirtualHub Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualHubInner beginCreateOrUpdate(String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, virtualHubName, virtualHubParameters).block();
    }

    /**
     * Updates VirtualHub tags.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualHubInner>> beginUpdateTagsWithResponseAsync(String resourceGroupName, String virtualHubName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject virtualHubParameters = new TagsObject();
        virtualHubParameters.withTags(tags);
        return service.beginUpdateTags(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualHubName, virtualHubParameters, apiVersion);
    }

    /**
     * Updates VirtualHub tags.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualHubInner> beginUpdateTagsAsync(String resourceGroupName, String virtualHubName, Map<String, String> tags) {
        return beginUpdateTagsWithResponseAsync(resourceGroupName, virtualHubName, tags)
            .flatMap((SimpleResponse<VirtualHubInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates VirtualHub tags.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualHubInner beginUpdateTags(String resourceGroupName, String virtualHubName, Map<String, String> tags) {
        return beginUpdateTagsAsync(resourceGroupName, virtualHubName, tags).block();
    }

    /**
     * Deletes a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String virtualHubName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualHubName, apiVersion);
    }

    /**
     * Deletes a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String virtualHubName) {
        return beginDeleteWithResponseAsync(resourceGroupName, virtualHubName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a VirtualHub.
     * 
     * @param resourceGroupName 
     * @param virtualHubName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String virtualHubName) {
        beginDeleteAsync(resourceGroupName, virtualHubName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualHubInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
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
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualHubInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
