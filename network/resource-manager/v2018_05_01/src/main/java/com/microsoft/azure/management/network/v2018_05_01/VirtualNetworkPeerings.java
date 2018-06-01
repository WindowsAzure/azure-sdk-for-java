/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_05_01.implementation.VirtualNetworkPeeringsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualNetworkPeerings.
 */
public interface VirtualNetworkPeerings extends SupportsCreating<VirtualNetworkPeering.DefinitionStages.Blank>, HasInner<VirtualNetworkPeeringsInner> {
    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkPeering> getAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkPeering> listAsync(final String resourceGroupName, final String virtualNetworkName);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

}
