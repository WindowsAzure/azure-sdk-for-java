// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.SourceControlConfigurationInner;

/** Resource collection API of SourceControlConfigurations. */
public interface SourceControlConfigurations {
    /**
     * Gets details of the Source Control Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Source Control Configuration.
     */
    SourceControlConfiguration get(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName);

    /**
     * Gets details of the Source Control Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Source Control Configuration.
     */
    Response<SourceControlConfiguration> getWithResponse(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        Context context);

    /**
     * Create a new Kubernetes Source Control Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @param sourceControlConfiguration Properties necessary to Create KubernetesConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SourceControl Configuration object returned in Get &amp; Put response.
     */
    SourceControlConfiguration createOrUpdate(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        SourceControlConfigurationInner sourceControlConfiguration);

    /**
     * Create a new Kubernetes Source Control Configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @param sourceControlConfiguration Properties necessary to Create KubernetesConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SourceControl Configuration object returned in Get &amp; Put response.
     */
    Response<SourceControlConfiguration> createOrUpdateWithResponse(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        SourceControlConfigurationInner sourceControlConfiguration,
        Context context);

    /**
     * This will delete the YAML file used to set up the Source control configuration, thus stopping future sync from
     * the source repo.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName);

    /**
     * This will delete the YAML file used to set up the Source control configuration, thus stopping future sync from
     * the source repo.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param sourceControlConfigurationName Name of the Source Control Configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        Context context);

    /**
     * List all Source Control Configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Source Control Configurations.
     */
    PagedIterable<SourceControlConfiguration> list(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName);

    /**
     * List all Source Control Configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Source Control Configurations.
     */
    PagedIterable<SourceControlConfiguration> list(
        String resourceGroupName,
        SourceControlConfigurationsClusterRp clusterRp,
        SourceControlConfigurationsClusterResourceName clusterResourceName,
        String clusterName,
        Context context);
}
