// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Workspaces. */
public interface Workspaces {
    /**
     * Gets a list of Workspaces associated with the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Workspaces associated with the given subscription.
     */
    PagedIterable<Workspace> list();

    /**
     * Gets a list of Workspaces associated with the given subscription.
     *
     * @param maxResults The maximum number of items to return in the response. A maximum of 1000 files can be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Workspaces associated with the given subscription.
     */
    PagedIterable<Workspace> list(Integer maxResults, Context context);

    /**
     * Gets a list of Workspaces within the specified resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Workspaces within the specified resource group.
     */
    PagedIterable<Workspace> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Workspaces within the specified resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param maxResults The maximum number of items to return in the response. A maximum of 1000 files can be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Workspaces within the specified resource group.
     */
    PagedIterable<Workspace> listByResourceGroup(String resourceGroupName, Integer maxResults, Context context);

    /**
     * Deletes a Workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Deletes a Workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets information about a Workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Workspace.
     */
    Workspace getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Gets information about a Workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Workspace.
     */
    Response<Workspace> getByResourceGroupWithResponse(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets information about a Workspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Workspace.
     */
    Workspace getById(String id);

    /**
     * Gets information about a Workspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Workspace.
     */
    Response<Workspace> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Workspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Workspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Workspace resource.
     *
     * @param name resource name.
     * @return the first stage of the new Workspace definition.
     */
    Workspace.DefinitionStages.Blank define(String name);
}
