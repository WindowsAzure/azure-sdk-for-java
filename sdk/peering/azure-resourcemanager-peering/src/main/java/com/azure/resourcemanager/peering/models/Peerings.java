// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Peerings. */
public interface Peerings {
    /**
     * Gets an existing peering with the specified name under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing peering with the specified name under the given subscription and resource group.
     */
    Peering getByResourceGroup(String resourceGroupName, String peeringName);

    /**
     * Gets an existing peering with the specified name under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing peering with the specified name under the given subscription and resource group.
     */
    Response<Peering> getByResourceGroupWithResponse(String resourceGroupName, String peeringName, Context context);

    /**
     * Deletes an existing peering with the specified name under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String peeringName);

    /**
     * Deletes an existing peering with the specified name under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String peeringName, Context context);

    /**
     * Lists all of the peerings under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    PagedIterable<Peering> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the peerings under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    PagedIterable<Peering> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all of the peerings under the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    PagedIterable<Peering> list();

    /**
     * Lists all of the peerings under the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    PagedIterable<Peering> list(Context context);

    /**
     * Gets an existing peering with the specified name under the given subscription and resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing peering with the specified name under the given subscription and resource group.
     */
    Peering getById(String id);

    /**
     * Gets an existing peering with the specified name under the given subscription and resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing peering with the specified name under the given subscription and resource group.
     */
    Response<Peering> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing peering with the specified name under the given subscription and resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing peering with the specified name under the given subscription and resource group.
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
     * Begins definition for a new Peering resource.
     *
     * @param name resource name.
     * @return the first stage of the new Peering definition.
     */
    Peering.DefinitionStages.Blank define(String name);
}
