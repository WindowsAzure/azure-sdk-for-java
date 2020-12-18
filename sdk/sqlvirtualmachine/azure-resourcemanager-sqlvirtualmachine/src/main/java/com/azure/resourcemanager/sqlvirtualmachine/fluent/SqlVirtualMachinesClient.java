// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineInner;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachineUpdate;

/** An instance of this class provides access to all the operations defined in SqlVirtualMachinesClient. */
public interface SqlVirtualMachinesClient {
    /**
     * Gets the list of sql virtual machines in a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of sql virtual machines in a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineInner> listBySqlVmGroup(String resourceGroupName, String sqlVirtualMachineGroupName);

    /**
     * Gets the list of sql virtual machines in a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of sql virtual machines in a SQL virtual machine group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineInner> listBySqlVmGroup(
        String resourceGroupName, String sqlVirtualMachineGroupName, Context context);

    /**
     * Gets all SQL virtual machines in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineInner> list();

    /**
     * Gets all SQL virtual machines in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineInner> list(Context context);

    /**
     * Gets a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineInner getByResourceGroup(String resourceGroupName, String sqlVirtualMachineName);

    /**
     * Gets a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SqlVirtualMachineInner> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlVirtualMachineName, String expand, Context context);

    /**
     * Creates or updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineInner>, SqlVirtualMachineInner> beginCreateOrUpdate(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineInner parameters);

    /**
     * Creates or updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineInner>, SqlVirtualMachineInner> beginCreateOrUpdate(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineInner parameters, Context context);

    /**
     * Creates or updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineInner createOrUpdate(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineInner parameters);

    /**
     * Creates or updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineInner createOrUpdate(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineInner parameters, Context context);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String sqlVirtualMachineName);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String sqlVirtualMachineName, Context context);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlVirtualMachineName);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlVirtualMachineName, Context context);

    /**
     * Updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineInner>, SqlVirtualMachineInner> beginUpdate(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineUpdate parameters);

    /**
     * Updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SqlVirtualMachineInner>, SqlVirtualMachineInner> beginUpdate(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineUpdate parameters, Context context);

    /**
     * Updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineInner update(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineUpdate parameters);

    /**
     * Updates a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SqlVirtualMachineInner update(
        String resourceGroupName, String sqlVirtualMachineName, SqlVirtualMachineUpdate parameters, Context context);

    /**
     * Gets all SQL virtual machines in a resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all SQL virtual machines in a resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SqlVirtualMachineInner> listByResourceGroup(String resourceGroupName, Context context);
}
