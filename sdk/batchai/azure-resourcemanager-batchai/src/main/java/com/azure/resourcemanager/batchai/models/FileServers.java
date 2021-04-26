// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of FileServers. */
public interface FileServers {
    /**
     * Deletes a File Server.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param fileServerName The name of the file server within the specified resource group. File server names can only
     *     contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be
     *     from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String fileServerName);

    /**
     * Deletes a File Server.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param fileServerName The name of the file server within the specified resource group. File server names can only
     *     contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be
     *     from 1 through 64 characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String fileServerName, Context context);

    /**
     * Gets information about a File Server.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param fileServerName The name of the file server within the specified resource group. File server names can only
     *     contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be
     *     from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a File Server.
     */
    FileServer get(String resourceGroupName, String workspaceName, String fileServerName);

    /**
     * Gets information about a File Server.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param fileServerName The name of the file server within the specified resource group. File server names can only
     *     contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be
     *     from 1 through 64 characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a File Server.
     */
    Response<FileServer> getWithResponse(
        String resourceGroupName, String workspaceName, String fileServerName, Context context);

    /**
     * Gets a list of File Servers associated with the specified workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of File Servers associated with the specified workspace.
     */
    PagedIterable<FileServer> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Gets a list of File Servers associated with the specified workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param maxResults The maximum number of items to return in the response. A maximum of 1000 files can be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of File Servers associated with the specified workspace.
     */
    PagedIterable<FileServer> listByWorkspace(
        String resourceGroupName, String workspaceName, Integer maxResults, Context context);

    /**
     * Gets information about a File Server.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a File Server.
     */
    FileServer getById(String id);

    /**
     * Gets information about a File Server.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a File Server.
     */
    Response<FileServer> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a File Server.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a File Server.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FileServer resource.
     *
     * @param name resource name.
     * @return the first stage of the new FileServer definition.
     */
    FileServer.DefinitionStages.Blank define(String name);
}
