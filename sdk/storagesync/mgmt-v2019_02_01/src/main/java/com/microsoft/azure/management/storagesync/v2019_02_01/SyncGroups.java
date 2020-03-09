/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2019_02_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.storagesync.v2019_02_01.implementation.SyncGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SyncGroups.
 */
public interface SyncGroups extends SupportsCreating<SyncGroup.DefinitionStages.Blank>, HasInner<SyncGroupsInner> {
    /**
     * Get a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SyncGroup> getAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName);

    /**
     * Get a SyncGroup List.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SyncGroup> listByStorageSyncServiceAsync(String resourceGroupName, String storageSyncServiceName);

    /**
     * Delete a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName);

}
