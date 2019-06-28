/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.implementation.WorkspacesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Workspaces.
 */
public interface Workspaces extends SupportsCreating<Workspace.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Workspace>, SupportsListingByResourceGroup<Workspace>, SupportsListing<Workspace>, HasInner<WorkspacesInner> {
    /**
     * Lists all the keys associated with this workspace. This includes keys for the storage account, app insights and password for container registry.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListWorkspaceKeysResult> listKeysAsync(String resourceGroupName, String workspaceName);

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and password for container registry.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resyncKeysAsync(String resourceGroupName, String workspaceName);

}
