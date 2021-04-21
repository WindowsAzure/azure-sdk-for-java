// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolConnectionPolicyInner;
import com.azure.resourcemanager.synapse.models.ConnectionPolicyName;

/** An instance of this class provides access to all the operations defined in SqlPoolConnectionPoliciesClient. */
public interface SqlPoolConnectionPoliciesClient {
    /**
     * Get a Sql pool's connection policy, which is used with table auditing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's connection policy, which is used with table auditing.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlPoolConnectionPolicyInner get(
        String resourceGroupName, String workspaceName, String sqlPoolName, ConnectionPolicyName connectionPolicyName);

    /**
     * Get a Sql pool's connection policy, which is used with table auditing.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Sql pool's connection policy, which is used with table auditing.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SqlPoolConnectionPolicyInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        ConnectionPolicyName connectionPolicyName,
        Context context);
}
