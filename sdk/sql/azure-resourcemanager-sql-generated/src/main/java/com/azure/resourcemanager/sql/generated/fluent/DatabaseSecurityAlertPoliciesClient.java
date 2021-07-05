// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyName;

/** An instance of this class provides access to all the operations defined in DatabaseSecurityAlertPoliciesClient. */
public interface DatabaseSecurityAlertPoliciesClient {
    /**
     * Gets a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the security alert policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseSecurityAlertPolicyInner get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName);

    /**
     * Gets a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the security alert policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseSecurityAlertPolicyInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        Context context);

    /**
     * Creates or updates a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the security alert policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The database security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        DatabaseSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the security alert policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The database security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseSecurityAlertPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        DatabaseSecurityAlertPolicyInner parameters,
        Context context);

    /**
     * Gets a list of database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the security alert policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's security alert policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabaseSecurityAlertPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the security alert policy is defined.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's security alert policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabaseSecurityAlertPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
