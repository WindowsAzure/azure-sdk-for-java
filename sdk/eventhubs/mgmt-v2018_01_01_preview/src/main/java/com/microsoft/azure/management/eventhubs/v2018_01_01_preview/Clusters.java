/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.ClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Clusters.
 */
public interface Clusters extends SupportsCreating<Cluster.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Cluster>, SupportsListingByResourceGroup<Cluster>, HasInner<ClustersInner> {
    /**
     * List the quantity of available pre-provisioned Event Hubs Clusters, indexed by Azure region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailableCluster> listAsync();

    /**
     * List all Event Hubs Namespace IDs in an Event Hubs Dedicated Cluster.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EHNamespaceIdListResult> listNamespacesAsync(String resourceGroupName, String clusterName);

}
