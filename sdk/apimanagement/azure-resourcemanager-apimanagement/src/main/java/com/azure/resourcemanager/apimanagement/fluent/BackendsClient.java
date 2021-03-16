// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.BackendContractInner;
import com.azure.resourcemanager.apimanagement.models.BackendReconnectContract;
import com.azure.resourcemanager.apimanagement.models.BackendUpdateParameters;

/** An instance of this class provides access to all the operations defined in BackendsClient. */
public interface BackendsClient {
    /**
     * Lists a collection of backends in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Backend list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackendContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of backends in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| title | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| url | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Backend list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackendContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the entity state (Etag) version of the backend specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String backendId);

    /**
     * Gets the entity state (Etag) version of the backend specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the backend specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String backendId, Context context);

    /**
     * Gets the details of the backend specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the backend specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackendContractInner get(String resourceGroupName, String serviceName, String backendId);

    /**
     * Gets the details of the backend specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the backend specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackendContractInner> getWithResponse(
        String resourceGroupName, String serviceName, String backendId, Context context);

    /**
     * Creates or Updates a backend.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backend details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackendContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String backendId, BackendContractInner parameters);

    /**
     * Creates or Updates a backend.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backend details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackendContractInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String backendId,
        BackendContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates an existing backend.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backend details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackendContractInner update(
        String resourceGroupName,
        String serviceName,
        String backendId,
        String ifMatch,
        BackendUpdateParameters parameters);

    /**
     * Updates an existing backend.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backend details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackendContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String backendId,
        String ifMatch,
        BackendUpdateParameters parameters,
        Context context);

    /**
     * Deletes the specified backend.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String backendId, String ifMatch);

    /**
     * Deletes the specified backend.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
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
        String resourceGroupName, String serviceName, String backendId, String ifMatch, Context context);

    /**
     * Notifies the APIM proxy to create a new connection to the backend after the specified timeout. If no timeout was
     * specified, timeout of 2 minutes is used.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void reconnect(String resourceGroupName, String serviceName, String backendId);

    /**
     * Notifies the APIM proxy to create a new connection to the backend after the specified timeout. If no timeout was
     * specified, timeout of 2 minutes is used.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * @param parameters Reconnect request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> reconnectWithResponse(
        String resourceGroupName,
        String serviceName,
        String backendId,
        BackendReconnectContract parameters,
        Context context);
}
