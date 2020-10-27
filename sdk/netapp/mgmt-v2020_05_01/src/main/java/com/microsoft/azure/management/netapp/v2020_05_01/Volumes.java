/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_05_01.implementation.VolumesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Volumes.
 */
public interface Volumes extends SupportsCreating<Volume.DefinitionStages.Blank>, HasInner<VolumesInner> {
    /**
     * Revert a volume to one of its snapshots.
     * Revert a volume to the snapshot specified in the body.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable revertAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Break volume replication.
     * Break the replication connection on the destination volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable breakReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Resync volume replication.
     * Resync the connection on the destination volume. If the operation is ran on the source volume it will reverse-resync the connection and sync from source to destination.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resyncReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Delete volume replication.
     * Delete the replication connection on the destination volume, and send release to the source replication.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Authorize source volume replication.
     * Authorize the replication connection on the source volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable authorizeReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * ReInitialize volume replication.
     * Re-Initializes the replication connection on the destination volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable reInitializeReplicationAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Change pool for volume.
     * Moves volume to another pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @param newPoolResourceId Resource id of the pool to move volume to
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable poolChangeAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String newPoolResourceId);

    /**
     * Describe a volume.
     * Get the details of the specified volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Volume> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Describe all volumes.
     * List all volumes within the capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Volume> listAsync(String resourceGroupName, String accountName, String poolName);

    /**
     * Delete a volume.
     * Delete the specified volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Get volume replication status.
     * Get the status of the replication.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationStatus> replicationStatusMethodAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

}
