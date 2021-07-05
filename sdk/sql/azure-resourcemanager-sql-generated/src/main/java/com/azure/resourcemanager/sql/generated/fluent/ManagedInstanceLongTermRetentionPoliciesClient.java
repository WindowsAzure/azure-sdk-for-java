// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceLongTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceLongTermRetentionPolicyName;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedInstanceLongTermRetentionPoliciesClient.
 */
public interface ManagedInstanceLongTermRetentionPoliciesClient {
    /**
     * Gets a managed database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstanceLongTermRetentionPolicyInner get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedInstanceLongTermRetentionPolicyName policyName);

    /**
     * Gets a managed database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedInstanceLongTermRetentionPolicyInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedInstanceLongTermRetentionPolicyName policyName,
        Context context);

    /**
     * Sets a managed database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @param parameters The long term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedInstanceLongTermRetentionPolicyInner>, ManagedInstanceLongTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String databaseName,
            ManagedInstanceLongTermRetentionPolicyName policyName,
            ManagedInstanceLongTermRetentionPolicyInner parameters);

    /**
     * Sets a managed database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @param parameters The long term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedInstanceLongTermRetentionPolicyInner>, ManagedInstanceLongTermRetentionPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            String databaseName,
            ManagedInstanceLongTermRetentionPolicyName policyName,
            ManagedInstanceLongTermRetentionPolicyInner parameters,
            Context context);

    /**
     * Sets a managed database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @param parameters The long term retention policy info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstanceLongTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedInstanceLongTermRetentionPolicyName policyName,
        ManagedInstanceLongTermRetentionPolicyInner parameters);

    /**
     * Sets a managed database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param policyName The policy name. Should always be Default.
     * @param parameters The long term retention policy info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedInstanceLongTermRetentionPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        ManagedInstanceLongTermRetentionPolicyName policyName,
        ManagedInstanceLongTermRetentionPolicyInner parameters,
        Context context);

    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedInstanceLongTermRetentionPolicyInner> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName);

    /**
     * Gets a database's long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's long term retention policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedInstanceLongTermRetentionPolicyInner> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName, Context context);
}
