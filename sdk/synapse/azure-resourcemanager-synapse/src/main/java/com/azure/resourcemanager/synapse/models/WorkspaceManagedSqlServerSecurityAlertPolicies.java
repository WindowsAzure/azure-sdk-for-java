// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WorkspaceManagedSqlServerSecurityAlertPolicies. */
public interface WorkspaceManagedSqlServerSecurityAlertPolicies {
    /**
     * Get a workspace managed sql server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's security alert policy.
     */
    ServerSecurityAlertPolicy get(
        String resourceGroupName, String workspaceName, SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName);

    /**
     * Get a workspace managed sql server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's security alert policy.
     */
    Response<ServerSecurityAlertPolicy> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        Context context);

    /**
     * Get workspace managed sql server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's threat detection policies.
     */
    PagedIterable<ServerSecurityAlertPolicy> list(String resourceGroupName, String workspaceName);

    /**
     * Get workspace managed sql server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace managed sql server's threat detection policies.
     */
    PagedIterable<ServerSecurityAlertPolicy> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Get a workspace managed sql server's security alert policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's security alert policy.
     */
    ServerSecurityAlertPolicy getById(String id);

    /**
     * Get a workspace managed sql server's security alert policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace managed sql server's security alert policy.
     */
    Response<ServerSecurityAlertPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServerSecurityAlertPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ServerSecurityAlertPolicy definition.
     */
    ServerSecurityAlertPolicy.DefinitionStages.Blank define(SecurityAlertPolicyNameAutoGenerated name);
}
