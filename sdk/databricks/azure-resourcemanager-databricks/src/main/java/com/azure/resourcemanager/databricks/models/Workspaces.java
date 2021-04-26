// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Workspaces. */
public interface Workspaces {
    /**
     * Gets the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workspace.
     */
    Workspace getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Gets the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workspace.
     */
    Response<Workspace> getByResourceGroupWithResponse(String resourceGroupName, String workspaceName, Context context);

    /**
     * Deletes the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Deletes the workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets all the workspaces within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the workspaces within a resource group.
     */
    PagedIterable<Workspace> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the workspaces within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the workspaces within a resource group.
     */
    PagedIterable<Workspace> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the workspaces within a subscription.
     *
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the workspaces within a subscription.
     */
    PagedIterable<Workspace> list();

    /**
     * Gets all the workspaces within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the workspaces within a subscription.
     */
    PagedIterable<Workspace> list(Context context);

    /**
     * Gets the workspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workspace.
     */
    Workspace getById(String id);

    /**
     * Gets the workspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workspace.
     */
    Response<Workspace> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the workspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the workspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
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
