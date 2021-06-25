// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ArcSettings. */
public interface ArcSettings {
    /**
     * Get ArcSetting resources of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcSetting resources of HCI Cluster.
     */
    PagedIterable<ArcSetting> listByCluster(String resourceGroupName, String clusterName);

    /**
     * Get ArcSetting resources of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcSetting resources of HCI Cluster.
     */
    PagedIterable<ArcSetting> listByCluster(String resourceGroupName, String clusterName, Context context);

    /**
     * Get ArcSetting resource details of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcSetting resource details of HCI Cluster.
     */
    ArcSetting get(String resourceGroupName, String clusterName, String arcSettingName);

    /**
     * Get ArcSetting resource details of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcSetting resource details of HCI Cluster.
     */
    Response<ArcSetting> getWithResponse(
        String resourceGroupName, String clusterName, String arcSettingName, Context context);

    /**
     * Delete ArcSetting resource details of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String arcSettingName);

    /**
     * Delete ArcSetting resource details of HCI Cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param arcSettingName The name of the proxy resource holding details of HCI ArcSetting information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String arcSettingName, Context context);

    /**
     * Get ArcSetting resource details of HCI Cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcSetting resource details of HCI Cluster.
     */
    ArcSetting getById(String id);

    /**
     * Get ArcSetting resource details of HCI Cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcSetting resource details of HCI Cluster.
     */
    Response<ArcSetting> getByIdWithResponse(String id, Context context);

    /**
     * Delete ArcSetting resource details of HCI Cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete ArcSetting resource details of HCI Cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ArcSetting resource.
     *
     * @param name resource name.
     * @return the first stage of the new ArcSetting definition.
     */
    ArcSetting.DefinitionStages.Blank define(String name);
}
