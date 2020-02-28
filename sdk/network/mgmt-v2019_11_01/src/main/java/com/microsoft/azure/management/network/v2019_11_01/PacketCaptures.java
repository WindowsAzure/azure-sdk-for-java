/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_11_01.implementation.PacketCapturesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PacketCaptures.
 */
public interface PacketCaptures extends SupportsCreating<PacketCaptureResult.DefinitionStages.Blank>, HasInner<PacketCapturesInner> {
    /**
     * Stops a specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName);

    /**
     * Query the status of a running packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param packetCaptureName The name given to the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PacketCaptureQueryStatusResult> getStatusAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName);

    /**
     * Gets a packet capture session by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PacketCaptureResult> getAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName);

    /**
     * Lists all packet capture sessions within the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PacketCaptureResult> listAsync(String resourceGroupName, String networkWatcherName);

    /**
     * Deletes the specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String networkWatcherName, String packetCaptureName);

}
