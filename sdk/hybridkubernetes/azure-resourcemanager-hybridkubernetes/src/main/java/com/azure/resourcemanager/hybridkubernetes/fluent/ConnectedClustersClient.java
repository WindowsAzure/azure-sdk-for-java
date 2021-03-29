// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridkubernetes.fluent.models.ConnectedClusterInner;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterPatch;

/** An instance of this class provides access to all the operations defined in ConnectedClustersClient. */
public interface ConnectedClustersClient {
    /**
     * API to register a new Kubernetes cluster and create a tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param connectedCluster Parameters supplied to Create a Connected Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ConnectedClusterInner>, ConnectedClusterInner> beginCreate(
        String resourceGroupName, String clusterName, ConnectedClusterInner connectedCluster);

    /**
     * API to register a new Kubernetes cluster and create a tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param connectedCluster Parameters supplied to Create a Connected Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ConnectedClusterInner>, ConnectedClusterInner> beginCreate(
        String resourceGroupName, String clusterName, ConnectedClusterInner connectedCluster, Context context);

    /**
     * API to register a new Kubernetes cluster and create a tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param connectedCluster Parameters supplied to Create a Connected Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedClusterInner create(String resourceGroupName, String clusterName, ConnectedClusterInner connectedCluster);

    /**
     * API to register a new Kubernetes cluster and create a tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param connectedCluster Parameters supplied to Create a Connected Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedClusterInner create(
        String resourceGroupName, String clusterName, ConnectedClusterInner connectedCluster, Context context);

    /**
     * API to update certain properties of the connected cluster resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param connectedClusterPatch Parameters supplied to update Connected Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedClusterInner update(
        String resourceGroupName, String clusterName, ConnectedClusterPatch connectedClusterPatch);

    /**
     * API to update certain properties of the connected cluster resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param connectedClusterPatch Parameters supplied to update Connected Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectedClusterInner> updateWithResponse(
        String resourceGroupName, String clusterName, ConnectedClusterPatch connectedClusterPatch, Context context);

    /**
     * Returns the properties of the specified connected cluster, including name, identity, properties, and additional
     * cluster details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Returns the properties of the specified connected cluster, including name, identity, properties, and additional
     * cluster details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a connected cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectedClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, Context context);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Delete a connected cluster, removing the tracked resource in Azure Resource Manager (ARM).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kubernetes cluster on which get is called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * API to enumerate registered connected K8s clusters under a Resource Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * API to enumerate registered connected K8s clusters under a Resource Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * API to enumerate registered connected K8s clusters under a Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedClusterInner> list();

    /**
     * API to enumerate registered connected K8s clusters under a Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of connected Clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedClusterInner> list(Context context);
}
