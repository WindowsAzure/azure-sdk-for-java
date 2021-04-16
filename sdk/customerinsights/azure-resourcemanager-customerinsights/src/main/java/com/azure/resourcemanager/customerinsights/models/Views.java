// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Views. */
public interface Views {
    /**
     * Gets all available views for given user in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param userId The user ID. Use * to retrieve hub level views.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available views for given user in the specified hub.
     */
    PagedIterable<ViewResourceFormat> listByHub(String resourceGroupName, String hubName, String userId);

    /**
     * Gets all available views for given user in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param userId The user ID. Use * to retrieve hub level views.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available views for given user in the specified hub.
     */
    PagedIterable<ViewResourceFormat> listByHub(
        String resourceGroupName, String hubName, String userId, Context context);

    /**
     * Gets a view in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a view in the hub.
     */
    ViewResourceFormat get(String resourceGroupName, String hubName, String viewName, String userId);

    /**
     * Gets a view in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a view in the hub.
     */
    Response<ViewResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String viewName, String userId, Context context);

    /**
     * Deletes a view in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hubName, String viewName, String userId);

    /**
     * Deletes a view in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param viewName The name of the view.
     * @param userId The user ID. Use * to retrieve hub level view.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String hubName, String viewName, String userId, Context context);

    /**
     * Begins definition for a new ViewResourceFormat resource.
     *
     * @param name resource name.
     * @return the first stage of the new ViewResourceFormat definition.
     */
    ViewResourceFormat.DefinitionStages.Blank define(String name);
}
