// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of InstanceFailoverGroups. */
public interface InstanceFailoverGroups {
    /**
     * Gets a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a failover group.
     */
    InstanceFailoverGroup get(String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Gets a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a failover group.
     */
    Response<InstanceFailoverGroup> getWithResponse(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Deletes a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Deletes a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Lists the failover groups in a location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of instance failover groups.
     */
    PagedIterable<InstanceFailoverGroup> listByLocation(String resourceGroupName, String locationName);

    /**
     * Lists the failover groups in a location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of instance failover groups.
     */
    PagedIterable<InstanceFailoverGroup> listByLocation(String resourceGroupName, String locationName, Context context);

    /**
     * Fails over from the current primary managed instance to this managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    InstanceFailoverGroup failover(String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Fails over from the current primary managed instance to this managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    InstanceFailoverGroup failover(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Fails over from the current primary managed instance to this managed instance. This operation might result in
     * data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    InstanceFailoverGroup forceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Fails over from the current primary managed instance to this managed instance. This operation might result in
     * data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    InstanceFailoverGroup forceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Gets a failover group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a failover group.
     */
    InstanceFailoverGroup getById(String id);

    /**
     * Gets a failover group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a failover group.
     */
    Response<InstanceFailoverGroup> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a failover group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a failover group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new InstanceFailoverGroup resource.
     *
     * @param name resource name.
     * @return the first stage of the new InstanceFailoverGroup definition.
     */
    InstanceFailoverGroup.DefinitionStages.Blank define(String name);
}
