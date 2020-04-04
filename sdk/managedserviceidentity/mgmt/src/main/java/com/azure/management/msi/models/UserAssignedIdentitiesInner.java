// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.msi.models;

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
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * UserAssignedIdentities.
 */
public final class UserAssignedIdentitiesInner
        implements InnerSupportsGet<IdentityInner>, InnerSupportsListing<IdentityInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private UserAssignedIdentitiesService service;

    /**
     * The service client containing this operation class.
     */
    private ManagedServiceIdentityClientImpl client;

    /**
     * Initializes an instance of UserAssignedIdentitiesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public UserAssignedIdentitiesInner(ManagedServiceIdentityClientImpl client) {
        this.service = RestProxy.create(UserAssignedIdentitiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ManagedServiceIdentityClientUserAssignedIdentities to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ManagedServiceIdentityClientUserAssignedIdentities")
    private interface UserAssignedIdentitiesService {
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ManagedIdentity/userAssignedIdentities")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<UserAssignedIdentitiesListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<UserAssignedIdentitiesListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{resourceName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<IdentityInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @BodyParam("application/json") IdentityInner parameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{resourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<IdentityInner>> update(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @BodyParam("application/json") IdentityInner parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{resourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<IdentityInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{resourceName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<UserAssignedIdentitiesListResultInner>> listBySubscriptionNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<UserAssignedIdentitiesListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IdentityInner>> listSinglePageAsync() {
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IdentityInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listBySubscriptionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the userAssignedIdentities available under the specified subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IdentityInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IdentityInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        return service.listByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IdentityInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the userAssignedIdentities available under the specified ResourceGroup.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IdentityInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Create or update an identity in the specified subscription and resource group.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param parameters Describes an identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IdentityInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String resourceName, IdentityInner parameters) {
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, resourceName, parameters, this.client.getApiVersion());
    }

    /**
     * Create or update an identity in the specified subscription and resource group.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param parameters Describes an identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IdentityInner> createOrUpdateAsync(String resourceGroupName, String resourceName, IdentityInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, resourceName, parameters)
            .flatMap((SimpleResponse<IdentityInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Create or update an identity in the specified subscription and resource group.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param parameters Describes an identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IdentityInner createOrUpdate(String resourceGroupName, String resourceName, IdentityInner parameters) {
        return createOrUpdateAsync(resourceGroupName, resourceName, parameters).block();
    }

    /**
     * Update an identity in the specified subscription and resource group.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param parameters Describes an identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IdentityInner>> updateWithResponseAsync(String resourceGroupName, String resourceName, IdentityInner parameters) {
        return service.update(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, resourceName, parameters, this.client.getApiVersion());
    }

    /**
     * Update an identity in the specified subscription and resource group.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param parameters Describes an identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IdentityInner> updateAsync(String resourceGroupName, String resourceName, IdentityInner parameters) {
        return updateWithResponseAsync(resourceGroupName, resourceName, parameters)
            .flatMap((SimpleResponse<IdentityInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Update an identity in the specified subscription and resource group.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param parameters Describes an identity resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IdentityInner update(String resourceGroupName, String resourceName, IdentityInner parameters) {
        return updateAsync(resourceGroupName, resourceName, parameters).block();
    }

    /**
     * Gets the identity.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IdentityInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String resourceName) {
        return service.getByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, resourceName, this.client.getApiVersion());
    }

    /**
     * Gets the identity.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IdentityInner> getByResourceGroupAsync(String resourceGroupName, String resourceName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, resourceName)
            .flatMap((SimpleResponse<IdentityInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the identity.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IdentityInner getByResourceGroup(String resourceGroupName, String resourceName) {
        return getByResourceGroupAsync(resourceGroupName, resourceName).block();
    }

    /**
     * Deletes the identity.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String resourceName) {
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, resourceName, this.client.getApiVersion());
    }

    /**
     * Deletes the identity.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String resourceName) {
        return deleteWithResponseAsync(resourceGroupName, resourceName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the identity.
     * 
     * @param resourceGroupName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @param resourceName MISSING·SCHEMA-DESCRIPTION-STRING.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String resourceName) {
        deleteAsync(resourceGroupName, resourceName).block();
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
    public Mono<PagedResponse<IdentityInner>> listBySubscriptionNextSinglePageAsync(String nextLink) {
        return service.listBySubscriptionNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
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
    public Mono<PagedResponse<IdentityInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            res.getValue().getNextLink(),
            null));
    }
}
