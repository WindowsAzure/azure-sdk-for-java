/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationStorageClassificationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationStorageClassifications.
 */
public interface ReplicationStorageClassifications extends HasInner<ReplicationStorageClassificationsInner> {
    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageClassification> listAsync();

    /**
     * Gets the details of a storage classification.
     * Gets the details of the specified storage classification.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageClassification> getAsync(String fabricName, String storageClassificationName);

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param fabricName Site name of interest.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageClassification> listByReplicationFabricsAsync(final String fabricName);

}
