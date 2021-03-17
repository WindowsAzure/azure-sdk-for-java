// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ContentTypeContractInner;

/** An instance of this class provides access to all the operations defined in ContentTypesClient. */
public interface ContentTypesClient {
    /**
     * Returns list of content types.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of content types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContentTypeContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Returns list of content types.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged list of content types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContentTypeContractInner> listByService(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Gets API Management content type details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param contentTypeId Content type identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI Management content type details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContentTypeContractInner get(String resourceGroupName, String serviceName, String contentTypeId);

    /**
     * Gets API Management content type details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param contentTypeId Content type identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI Management content type details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContentTypeContractInner> getWithResponse(
        String resourceGroupName, String serviceName, String contentTypeId, Context context);

    /**
     * Creates or updates an Content Type.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param contentTypeId Content type identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return content type contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContentTypeContractInner createOrUpdate(String resourceGroupName, String serviceName, String contentTypeId);

    /**
     * Creates or updates an Content Type.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param contentTypeId Content type identifier.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return content type contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContentTypeContractInner> createOrUpdateWithResponse(
        String resourceGroupName, String serviceName, String contentTypeId, String ifMatch, Context context);

    /**
     * Removes specified content type.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param contentTypeId Content type identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String contentTypeId, String ifMatch);

    /**
     * Removes specified content type.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param contentTypeId Content type identifier.
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
        String resourceGroupName, String serviceName, String contentTypeId, String ifMatch, Context context);
}
