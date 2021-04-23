// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateEndpointConnectionOperations. */
public interface PrivateEndpointConnectionOperations {
    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    PrivateEndpointConnectionResource get(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName);

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    Response<PrivateEndpointConnectionResource> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        String ifNoneMatch,
        Context context);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName, Context context);

    /**
     * Gets a private endpoint connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    PrivateEndpointConnectionResource getById(String id);

    /**
     * Gets a private endpoint connection.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    Response<PrivateEndpointConnectionResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Deletes a private endpoint connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a private endpoint connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PrivateEndpointConnectionResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new PrivateEndpointConnectionResource definition.
     */
    PrivateEndpointConnectionResource.DefinitionStages.Blank define(String name);
}
