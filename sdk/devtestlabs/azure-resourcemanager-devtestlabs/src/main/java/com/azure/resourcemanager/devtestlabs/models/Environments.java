// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Environments. */
public interface Environments {
    /**
     * List environments in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<DtlEnvironment> list(String resourceGroupName, String labName, String username);

    /**
     * List environments in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param expand Specify the $expand query. Example: 'properties($select=deploymentProperties)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<DtlEnvironment> list(
        String resourceGroupName,
        String labName,
        String username,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get environment.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment.
     */
    DtlEnvironment get(String resourceGroupName, String labName, String username, String name);

    /**
     * Get environment.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the environment.
     * @param expand Specify the $expand query. Example: 'properties($select=deploymentProperties)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment.
     */
    Response<DtlEnvironment> getWithResponse(
        String resourceGroupName, String labName, String username, String name, String expand, Context context);

    /**
     * Delete environment. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String username, String name);

    /**
     * Delete environment. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String username, String name, Context context);

    /**
     * Get environment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment.
     */
    DtlEnvironment getById(String id);

    /**
     * Get environment.
     *
     * @param id the resource ID.
     * @param expand Specify the $expand query. Example: 'properties($select=deploymentProperties)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment.
     */
    Response<DtlEnvironment> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Delete environment. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete environment. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DtlEnvironment resource.
     *
     * @param name resource name.
     * @return the first stage of the new DtlEnvironment definition.
     */
    DtlEnvironment.DefinitionStages.Blank define(String name);
}
