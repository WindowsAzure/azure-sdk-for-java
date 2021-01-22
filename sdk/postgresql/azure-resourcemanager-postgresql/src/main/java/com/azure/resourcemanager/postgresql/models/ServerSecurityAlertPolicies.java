// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ServerSecurityAlertPolicies. */
public interface ServerSecurityAlertPolicies {
    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    ServerSecurityAlertPolicy get(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName);

    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    Response<ServerSecurityAlertPolicy> getWithResponse(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName, Context context);

    /**
     * Get a server's security alert policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    ServerSecurityAlertPolicy getById(String id);

    /**
     * Get a server's security alert policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server's security alert policy.
     */
    Response<ServerSecurityAlertPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServerSecurityAlertPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ServerSecurityAlertPolicy definition.
     */
    ServerSecurityAlertPolicy.DefinitionStages.Blank define(SecurityAlertPolicyName name);
}
