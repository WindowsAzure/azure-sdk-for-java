/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation.ClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Clusters.
 */
public interface Clusters extends SupportsCreating<Cluster.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Cluster>, SupportsListingByResourceGroup<Cluster>, SupportsListing<Cluster>, HasInner<ClustersInner> {
    /**
     * Executes script actions on the specified HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters for executing script actions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable executeScriptActionsAsync(String resourceGroupName, String clusterName, ExecuteScriptActionParameters parameters);

    /**
     * Resizes the specified HDInsight cluster to the specified size.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resizeAsync(String resourceGroupName, String clusterName);

}
