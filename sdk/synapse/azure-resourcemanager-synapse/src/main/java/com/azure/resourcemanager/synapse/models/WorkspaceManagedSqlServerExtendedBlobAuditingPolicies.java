// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WorkspaceManagedSqlServerExtendedBlobAuditingPolicies. */
public interface WorkspaceManagedSqlServerExtendedBlobAuditingPolicies {
    /**
     * Get a workspace SQL server's extended blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace SQL server's extended blob auditing policy.
     */
    ExtendedServerBlobAuditingPolicy get(
        String resourceGroupName, String workspaceName, BlobAuditingPolicyName blobAuditingPolicyName);

    /**
     * Get a workspace SQL server's extended blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param blobAuditingPolicyName The name of the blob auditing policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace SQL server's extended blob auditing policy.
     */
    Response<ExtendedServerBlobAuditingPolicy> getWithResponse(
        String resourceGroupName, String workspaceName, BlobAuditingPolicyName blobAuditingPolicyName, Context context);

    /**
     * List workspace managed sql server's extended blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server extended auditing settings.
     */
    PagedIterable<ExtendedServerBlobAuditingPolicy> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * List workspace managed sql server's extended blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server extended auditing settings.
     */
    PagedIterable<ExtendedServerBlobAuditingPolicy> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Get a workspace SQL server's extended blob auditing policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace SQL server's extended blob auditing policy.
     */
    ExtendedServerBlobAuditingPolicy getById(String id);

    /**
     * Get a workspace SQL server's extended blob auditing policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace SQL server's extended blob auditing policy.
     */
    Response<ExtendedServerBlobAuditingPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ExtendedServerBlobAuditingPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ExtendedServerBlobAuditingPolicy definition.
     */
    ExtendedServerBlobAuditingPolicy.DefinitionStages.Blank define(BlobAuditingPolicyName name);
}