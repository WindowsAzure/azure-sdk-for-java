/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_03_01.implementation.BandwidthSchedulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BandwidthSchedules.
 */
public interface BandwidthSchedules extends SupportsCreating<BandwidthSchedule.DefinitionStages.Blank>, HasInner<BandwidthSchedulesInner> {
    /**
     * Gets the properties of the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BandwidthSchedule> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Gets all the bandwidth schedules for a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BandwidthSchedule> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

    /**
     * Deletes the specified bandwidth schedule.
     *
     * @param deviceName The device name.
     * @param name The bandwidth schedule name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String name, String resourceGroupName);

}
