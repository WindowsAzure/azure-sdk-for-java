// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiVersionSetContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetUpdateParameters;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetsCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetsGetResponse;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetsUpdateResponse;

/** An instance of this class provides access to all the operations defined in ApiVersionSetsClient. */
public interface ApiVersionSetsClient {
    /**
     * Lists a collection of API Version Sets in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Api Version Set list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiVersionSetContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of API Version Sets in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Api Version Set list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiVersionSetContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the Api Version Set specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String versionSetId);

    /**
     * Gets the entity state (Etag) version of the Api Version Set specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the Api Version Set specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiVersionSetsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String versionSetId, Context context);

    /**
     * Gets the details of the Api Version Set specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Api Version Set specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiVersionSetContractInner get(String resourceGroupName, String serviceName, String versionSetId);

    /**
     * Gets the details of the Api Version Set specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Api Version Set specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiVersionSetsGetResponse getWithResponse(
        String resourceGroupName, String serviceName, String versionSetId, Context context);

    /**
     * Creates or Updates a Api Version Set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api Version Set Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiVersionSetContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String versionSetId, ApiVersionSetContractInner parameters);

    /**
     * Creates or Updates a Api Version Set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api Version Set Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiVersionSetsCreateOrUpdateResponse createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String versionSetId,
        ApiVersionSetContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the details of the Api VersionSet specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api Version Set Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiVersionSetContractInner update(
        String resourceGroupName,
        String serviceName,
        String versionSetId,
        String ifMatch,
        ApiVersionSetUpdateParameters parameters);

    /**
     * Updates the details of the Api VersionSet specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api Version Set Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiVersionSetsUpdateResponse updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String versionSetId,
        String ifMatch,
        ApiVersionSetUpdateParameters parameters,
        Context context);

    /**
     * Deletes specific Api Version Set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String versionSetId, String ifMatch);

    /**
     * Deletes specific Api Version Set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param versionSetId Api Version Set identifier. Must be unique in the current API Management service instance.
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
        String resourceGroupName, String serviceName, String versionSetId, String ifMatch, Context context);
}
