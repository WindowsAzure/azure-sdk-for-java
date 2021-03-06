// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DedicatedCloudNodes. */
public interface DedicatedCloudNodes {
    /**
     * Returns list of dedicate cloud nodes within subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model.
     */
    PagedIterable<DedicatedCloudNode> list();

    /**
     * Returns list of dedicate cloud nodes within subscription.
     *
     * @param filter The filter to apply on the list operation.
     * @param top The maximum number of record sets to return.
     * @param skipToken to be used by nextLink implementation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model.
     */
    PagedIterable<DedicatedCloudNode> list(String filter, Integer top, String skipToken, Context context);

    /**
     * Returns list of dedicate cloud nodes within resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model.
     */
    PagedIterable<DedicatedCloudNode> listByResourceGroup(String resourceGroupName);

    /**
     * Returns list of dedicate cloud nodes within resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param filter The filter to apply on the list operation.
     * @param top The maximum number of record sets to return.
     * @param skipToken to be used by nextLink implementation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of dedicated nodes response model.
     */
    PagedIterable<DedicatedCloudNode> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, String skipToken, Context context);

    /**
     * Returns dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    DedicatedCloudNode getByResourceGroup(String resourceGroupName, String dedicatedCloudNodeName);

    /**
     * Returns dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    Response<DedicatedCloudNode> getByResourceGroupWithResponse(
        String resourceGroupName, String dedicatedCloudNodeName, Context context);

    /**
     * Delete dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String dedicatedCloudNodeName);

    /**
     * Delete dedicated cloud node.
     *
     * @param resourceGroupName The name of the resource group.
     * @param dedicatedCloudNodeName dedicated cloud node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String dedicatedCloudNodeName, Context context);

    /**
     * Returns dedicated cloud node.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    DedicatedCloudNode getById(String id);

    /**
     * Returns dedicated cloud node.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dedicated cloud node model.
     */
    Response<DedicatedCloudNode> getByIdWithResponse(String id, Context context);

    /**
     * Delete dedicated cloud node.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete dedicated cloud node.
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
     * Begins definition for a new DedicatedCloudNode resource.
     *
     * @param name resource name.
     * @return the first stage of the new DedicatedCloudNode definition.
     */
    DedicatedCloudNode.DefinitionStages.Blank define(String name);
}
