// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ExtendedSqlPoolBlobAuditingPolicies. */
public interface ExtendedSqlPoolBlobAuditingPolicies {
    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool's blob auditing policy.
     */
    ExtendedSqlPoolBlobAuditingPolicy get(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool's blob auditing policy.
     */
    Response<ExtendedSqlPoolBlobAuditingPolicy> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql pool extended auditing settings.
     */
    PagedIterable<ExtendedSqlPoolBlobAuditingPolicy> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Lists extended auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql pool extended auditing settings.
     */
    PagedIterable<ExtendedSqlPoolBlobAuditingPolicy> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool's blob auditing policy.
     */
    ExtendedSqlPoolBlobAuditingPolicy getById(String id);

    /**
     * Gets an extended Sql pool's blob auditing policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an extended Sql pool's blob auditing policy.
     */
    Response<ExtendedSqlPoolBlobAuditingPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ExtendedSqlPoolBlobAuditingPolicy resource.
     *
     * @return the first stage of the new ExtendedSqlPoolBlobAuditingPolicy definition.
     */
    ExtendedSqlPoolBlobAuditingPolicy.DefinitionStages.Blank define();
}
