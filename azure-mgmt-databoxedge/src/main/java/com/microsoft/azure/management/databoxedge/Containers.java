/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.implementation.ContainersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Containers.
 */
public interface Containers extends SupportsCreating<Container.DefinitionStages.Blank>, HasInner<ContainersInner> {
    /**
     * Refreshes the container metadata with the data from the cloud.
     *
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable refreshAsync(String deviceName, String storageAccountName, String containerName, String resourceGroupName);

    /**
     * Gets a container by name.
     *
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name
     * @param containerName The container Name
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Container> getAsync(String deviceName, String storageAccountName, String containerName, String resourceGroupName);

    /**
     * Lists all the containers of a storage Account in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The storage Account name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Container> listByStorageAccountAsync(final String deviceName, final String storageAccountName, final String resourceGroupName);

    /**
     * Deletes the container on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The Storage Account Name
     * @param containerName The container name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String storageAccountName, String containerName, String resourceGroupName);

}
