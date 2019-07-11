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
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationStorageClassificationMappingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationStorageClassificationMappings.
 */
public interface ReplicationStorageClassificationMappings extends SupportsCreating<StorageClassificationMapping.DefinitionStages.Blank>, HasInner<ReplicationStorageClassificationMappingsInner> {
    /**
     * Gets the list of storage classification mappings objects under a vault.
     * Lists the storage classification mappings in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageClassificationMapping> listAsync();

    /**
     * Gets the details of a storage classification mapping.
     * Gets the details of the specified storage classification mapping.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageClassificationMapping> getAsync(String fabricName, String storageClassificationName, String storageClassificationMappingName);

    /**
     * Gets the list of storage classification mappings objects under a storage.
     * Lists the storage classification mappings for the fabric.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageClassificationMapping> listByReplicationStorageClassificationsAsync(final String fabricName, final String storageClassificationName);

    /**
     * Delete a storage classification mapping.
     * The operation to delete a storage classification mapping.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param storageClassificationMappingName Storage classification mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String fabricName, String storageClassificationName, String storageClassificationMappingName);

}
