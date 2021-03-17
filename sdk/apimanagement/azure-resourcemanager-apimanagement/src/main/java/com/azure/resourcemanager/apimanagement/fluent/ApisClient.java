// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiCreateOrUpdateParameter;
import com.azure.resourcemanager.apimanagement.models.ApiUpdateContract;

/** An instance of this class provides access to all the operations defined in ApisClient. */
public interface ApisClient {
    /**
     * Lists all APIs of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Api list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists all APIs of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| isCurrent | filter | eq, ne | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param tags Include tags in the response.
     * @param expandApiVersionSet Include full ApiVersionSet resource in response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Api list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiContractInner> listByService(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        String tags,
        Boolean expandApiVersionSet,
        Context context);

    /**
     * Gets the entity state (Etag) version of the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String apiId);

    /**
     * Gets the entity state (Etag) version of the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the API specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String apiId, Context context);

    /**
     * Gets the details of the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiContractInner get(String resourceGroupName, String serviceName, String apiId);

    /**
     * Gets the details of the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiContractInner> getWithResponse(
        String resourceGroupName, String serviceName, String apiId, Context context);

    /**
     * Creates new or updates existing specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiContractInner>, ApiContractInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        ApiCreateOrUpdateParameter parameters,
        String ifMatch);

    /**
     * Creates new or updates existing specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApiContractInner>, ApiContractInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        ApiCreateOrUpdateParameter parameters,
        String ifMatch,
        Context context);

    /**
     * Creates new or updates existing specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        ApiCreateOrUpdateParameter parameters,
        String ifMatch);

    /**
     * Creates new or updates existing specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String apiId, ApiCreateOrUpdateParameter parameters);

    /**
     * Creates new or updates existing specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param parameters Create or update parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        ApiCreateOrUpdateParameter parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters API Update Contract parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiContractInner update(
        String resourceGroupName, String serviceName, String apiId, String ifMatch, ApiUpdateContract parameters);

    /**
     * Updates the specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters API Update Contract parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String ifMatch,
        ApiUpdateContract parameters,
        Context context);

    /**
     * Deletes the specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String apiId, String ifMatch);

    /**
     * Deletes the specified API of the API Management service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param deleteRevisions Delete all revisions of the Api.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String ifMatch,
        Boolean deleteRevisions,
        Context context);

    /**
     * Lists a collection of apis associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TagResourceContractInner> listByTags(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of apis associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| apiRevision | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| isCurrent | filter | eq | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param includeNotTaggedApis Include not tagged APIs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Tag list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TagResourceContractInner> listByTags(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean includeNotTaggedApis,
        Context context);
}
