// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.loganalytics.fluent.models.ClusterInner;
import com.azure.resourcemanager.loganalytics.models.ClusterPatch;

/** An instance of this class provides access to all the operations defined in ClustersClient. */
public interface ClustersClient {
    /**
     * Gets Log Analytics clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Analytics clusters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets Log Analytics clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Analytics clusters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the Log Analytics clusters in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Analytics clusters in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list();

    /**
     * Gets the Log Analytics clusters in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Analytics clusters in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list(Context context);

    /**
     * Create or update a Log Analytics cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Log Analytics cluster.
     * @param parameters The parameters required to create or update a Log Analytics cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Log Analytics cluster resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Create or update a Log Analytics cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Log Analytics cluster.
     * @param parameters The parameters required to create or update a Log Analytics cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Log Analytics cluster resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Create or update a Log Analytics cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Log Analytics cluster.
     * @param parameters The parameters required to create or update a Log Analytics cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Log Analytics cluster resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Create or update a Log Analytics cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Log Analytics cluster.
     * @param parameters The parameters required to create or update a Log Analytics cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Log Analytics cluster resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Deletes a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName);

    /**
     * Deletes a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, Context context);

    /**
     * Deletes a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Deletes a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets a Log Analytics cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Log Analytics cluster instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Gets a Log Analytics cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Log Analytics cluster instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Updates a Log Analytics cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @param parameters The parameters required to patch a Log Analytics cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Log Analytics cluster resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterPatch parameters);

    /**
     * Updates a Log Analytics cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @param parameters The parameters required to patch a Log Analytics cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the top level Log Analytics cluster resource container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> updateWithResponse(
        String resourceGroupName, String clusterName, ClusterPatch parameters, Context context);
}
