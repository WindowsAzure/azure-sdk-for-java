// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mysql.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.mysql.models.SecurityAlertPolicyName;

/** An instance of this class provides access to all the operations defined in ServerSecurityAlertPoliciesClient. */
public interface ServerSecurityAlertPoliciesClient {
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner get(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerSecurityAlertPolicyInner> getWithResponse(
        String resourceGroupName, String serverName, SecurityAlertPolicyName securityAlertPolicyName, Context context);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerSecurityAlertPolicyInner>, ServerSecurityAlertPolicyInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters,
        Context context);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param securityAlertPolicyName The name of the threat detection policy.
     * @param parameters The server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        SecurityAlertPolicyName securityAlertPolicyName,
        ServerSecurityAlertPolicyInner parameters,
        Context context);

    /**
     * Get the server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's threat detection policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerSecurityAlertPolicyInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Get the server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's threat detection policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerSecurityAlertPolicyInner> listByServer(
        String resourceGroupName, String serverName, Context context);
}
