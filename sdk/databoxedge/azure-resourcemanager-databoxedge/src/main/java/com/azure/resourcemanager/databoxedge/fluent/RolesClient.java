// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databoxedge.fluent.models.RoleInner;

/** An instance of this class provides access to all the operations defined in RolesClient. */
public interface RolesClient {
    /**
     * Lists all the roles configured in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the roles on the Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Lists all the roles configured in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the roles on the Data Box Edge device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context);

    /**
     * Gets a specific role by name.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific role by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleInner get(String deviceName, String name, String resourceGroupName);

    /**
     * Gets a specific role by name.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific role by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleInner> getWithResponse(String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Create or update a role.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param role Compute role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute role.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RoleInner>, RoleInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, RoleInner role);

    /**
     * Create or update a role.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param role Compute role.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute role.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RoleInner>, RoleInner> beginCreateOrUpdate(
        String deviceName, String name, String resourceGroupName, RoleInner role, Context context);

    /**
     * Create or update a role.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param role Compute role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute role.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleInner createOrUpdate(String deviceName, String name, String resourceGroupName, RoleInner role);

    /**
     * Create or update a role.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param role Compute role.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compute role.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleInner createOrUpdate(String deviceName, String name, String resourceGroupName, RoleInner role, Context context);

    /**
     * Deletes the role on the device.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the role on the device.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String deviceName, String name, String resourceGroupName, Context context);

    /**
     * Deletes the role on the device.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName);

    /**
     * Deletes the role on the device.
     *
     * @param deviceName The device name.
     * @param name The role name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String deviceName, String name, String resourceGroupName, Context context);
}
