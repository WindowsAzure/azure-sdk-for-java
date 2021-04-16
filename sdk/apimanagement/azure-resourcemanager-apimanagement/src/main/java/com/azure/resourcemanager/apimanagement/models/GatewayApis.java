// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GatewayApis. */
public interface GatewayApis {
    /**
     * Lists a collection of the APIs associated with a gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Api list representation.
     */
    PagedIterable<ApiContract> listByService(String resourceGroupName, String serviceName, String gatewayId);

    /**
     * Lists a collection of the APIs associated with a gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Api list representation.
     */
    PagedIterable<ApiContract> listByService(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Checks that API entity specified by identifier is associated with the Gateway entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, String gatewayId, String apiId);

    /**
     * Checks that API entity specified by identifier is associated with the Gateway entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    GatewayApisGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String apiId, Context context);

    /**
     * Adds an API to the specified Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    ApiContract createOrUpdate(String resourceGroupName, String serviceName, String gatewayId, String apiId);

    /**
     * Adds an API to the specified Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param parameters Association entity details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return api details.
     */
    Response<ApiContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String gatewayId,
        String apiId,
        AssociationContract parameters,
        Context context);

    /**
     * Deletes the specified API from the specified Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String gatewayId, String apiId);

    /**
     * Deletes the specified API from the specified Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must
     *     not have value 'managed'.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String gatewayId, String apiId, Context context);
}
