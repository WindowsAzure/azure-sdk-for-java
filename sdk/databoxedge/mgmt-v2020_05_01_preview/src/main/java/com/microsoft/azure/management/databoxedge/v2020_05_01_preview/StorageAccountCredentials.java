/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation.StorageAccountCredentialsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing StorageAccountCredentials.
 */
public interface StorageAccountCredentials extends SupportsCreating<StorageAccountCredential.DefinitionStages.Blank>, HasInner<StorageAccountCredentialsInner> {
    /**
     * Gets the properties of the specified storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountCredential> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Gets all the storage account credentials in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountCredential> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

    /**
     * Deletes the storage account credential.
     *
     * @param deviceName The device name.
     * @param name The storage account credential name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String name, String resourceGroupName);

}
