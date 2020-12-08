// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ServerConnectionPolicies. */
public interface ServerConnectionPolicies {
    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    ServerConnectionPolicy get(String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName);

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    Response<ServerConnectionPolicy> getWithResponse(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName, Context context);

    /**
     * Gets the server's secure connection policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    ServerConnectionPolicy getById(String id);

    /**
     * Gets the server's secure connection policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    Response<ServerConnectionPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServerConnectionPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ServerConnectionPolicy definition.
     */
    ServerConnectionPolicy.DefinitionStages.Blank define(ConnectionPolicyName name);
}
