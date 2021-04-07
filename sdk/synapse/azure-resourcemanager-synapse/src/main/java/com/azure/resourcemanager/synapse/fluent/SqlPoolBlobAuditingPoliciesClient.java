// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolBlobAuditingPolicyInner;

/** An instance of this class provides access to all the operations defined in SqlPoolBlobAuditingPoliciesClient. */
public interface SqlPoolBlobAuditingPoliciesClient {
    /**
     * Get a SQL pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL pool's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlPoolBlobAuditingPolicyInner get(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Get a SQL pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL pool's blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SqlPoolBlobAuditingPolicyInner> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Creates or updates a SQL pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters The database blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlPoolBlobAuditingPolicyInner createOrUpdate(
        String resourceGroupName, String workspaceName, String sqlPoolName, SqlPoolBlobAuditingPolicyInner parameters);

    /**
     * Creates or updates a SQL pool's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters The database blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool blob auditing policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SqlPoolBlobAuditingPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        SqlPoolBlobAuditingPolicyInner parameters,
        Context context);

    /**
     * Lists auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlPoolBlobAuditingPolicyInner> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Lists auditing settings of a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool auditing settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlPoolBlobAuditingPolicyInner> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);
}
