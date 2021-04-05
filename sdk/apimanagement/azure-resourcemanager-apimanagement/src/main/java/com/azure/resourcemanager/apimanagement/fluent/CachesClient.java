// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.CacheContractInner;
import com.azure.resourcemanager.apimanagement.models.CacheUpdateParameters;
import com.azure.resourcemanager.apimanagement.models.CachesCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.CachesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.CachesGetResponse;
import com.azure.resourcemanager.apimanagement.models.CachesUpdateResponse;

/** An instance of this class provides access to all the operations defined in CachesClient. */
public interface CachesClient {
    /**
     * Lists a collection of all external Caches in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Caches list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CacheContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of all external Caches in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Caches list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CacheContractInner> listByService(
        String resourceGroupName, String serviceName, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the Cache specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String cacheId);

    /**
     * Gets the entity state (Etag) version of the Cache specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the Cache specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CachesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String cacheId, Context context);

    /**
     * Gets the details of the Cache specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Cache specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheContractInner get(String resourceGroupName, String serviceName, String cacheId);

    /**
     * Gets the details of the Cache specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Cache specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CachesGetResponse getWithResponse(String resourceGroupName, String serviceName, String cacheId, Context context);

    /**
     * Creates or updates an External Cache to be used in Api Management instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param parameters Create or Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cache details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String cacheId, CacheContractInner parameters);

    /**
     * Creates or updates an External Cache to be used in Api Management instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param parameters Create or Update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cache details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CachesCreateOrUpdateResponse createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String cacheId,
        CacheContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the details of the cache specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cache details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CacheContractInner update(
        String resourceGroupName, String serviceName, String cacheId, String ifMatch, CacheUpdateParameters parameters);

    /**
     * Updates the details of the cache specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cache details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CachesUpdateResponse updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String cacheId,
        String ifMatch,
        CacheUpdateParameters parameters,
        Context context);

    /**
     * Deletes specific Cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String cacheId, String ifMatch);

    /**
     * Deletes specific Cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param cacheId Identifier of the Cache entity. Cache identifier (should be either 'default' or valid Azure region
     *     identifier).
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String cacheId, String ifMatch, Context context);
}
