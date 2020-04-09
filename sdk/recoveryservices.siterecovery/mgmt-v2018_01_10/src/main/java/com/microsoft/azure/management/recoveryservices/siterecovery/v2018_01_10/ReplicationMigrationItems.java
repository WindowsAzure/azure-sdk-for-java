/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationMigrationItemsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationMigrationItems.
 */
public interface ReplicationMigrationItems extends SupportsCreating<MigrationItem.DefinitionStages.Blank>, HasInner<ReplicationMigrationItemsInner> {
    /**
     * Migrate item.
     * The operation to initiate migration of the item.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param properties Migrate input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationItem> migrateAsync(String fabricName, String protectionContainerName, String migrationItemName, MigrateInputProperties properties);

    /**
     * Resynchronizes replication.
     * The operation to resynchronize replication of an ASR migration item.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param properties Resync input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationItem> resyncAsync(String fabricName, String protectionContainerName, String migrationItemName, ResyncInputProperties properties);

    /**
     * Test migrate item.
     * The operation to initiate test migration of the item.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param properties Test migrate input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationItem> testMigrateAsync(String fabricName, String protectionContainerName, String migrationItemName, TestMigrateInputProperties properties);

    /**
     * Test migrate cleanup.
     * The operation to initiate test migrate cleanup.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param properties Test migrate cleanup input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationItem> testMigrateCleanupAsync(String fabricName, String protectionContainerName, String migrationItemName, TestMigrateCleanupInputProperties properties);

    /**
     * Gets the list of migration items in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationItem> listAsync();

    /**
     * Gets the details of a migration item.
     *
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationItem> getAsync(String fabricName, String protectionContainerName, String migrationItemName);

    /**
     * Gets the list of migration items in the protection container.
     * Gets the list of ASR migration items in the protection container.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MigrationItem> listByReplicationProtectionContainersAsync(final String fabricName, final String protectionContainerName);

    /**
     * Delete the migration item.
     * The operation to delete an ASR migration item.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String fabricName, String protectionContainerName, String migrationItemName);

}
