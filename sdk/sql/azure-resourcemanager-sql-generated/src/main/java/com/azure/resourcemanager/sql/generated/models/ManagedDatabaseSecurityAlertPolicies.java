// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedDatabaseSecurityAlertPolicies. */
public interface ManagedDatabaseSecurityAlertPolicies {
    /**
     * Gets a managed database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's security alert policy.
     */
    ManagedDatabaseSecurityAlertPolicy get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName);

    /**
     * Gets a managed database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's security alert policy.
     */
    Response<ManagedDatabaseSecurityAlertPolicy> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        SecurityAlertPolicyName securityAlertPolicyName,
        Context context);

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policies are defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed database's security alert policies.
     */
    PagedIterable<ManagedDatabaseSecurityAlertPolicy> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName);

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policies are defined.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed database's security alert policies.
     */
    PagedIterable<ManagedDatabaseSecurityAlertPolicy> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName, Context context);

    /**
     * Gets a managed database's security alert policy.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's security alert policy.
     */
    ManagedDatabaseSecurityAlertPolicy getById(String id);

    /**
     * Gets a managed database's security alert policy.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's security alert policy.
     */
    Response<ManagedDatabaseSecurityAlertPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedDatabaseSecurityAlertPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedDatabaseSecurityAlertPolicy definition.
     */
    ManagedDatabaseSecurityAlertPolicy.DefinitionStages.Blank define(SecurityAlertPolicyName name);
}
