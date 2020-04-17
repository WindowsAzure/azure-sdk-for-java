/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.implementation.VirtualRouterPeeringsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualRouterPeerings.
 */
public interface VirtualRouterPeerings extends SupportsCreating<VirtualRouterPeering.DefinitionStages.Blank>, HasInner<VirtualRouterPeeringsInner> {
    /**
     * Gets the specified Virtual Router Peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the Virtual Router Peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualRouterPeering> getAsync(String resourceGroupName, String virtualRouterName, String peeringName);

    /**
     * Lists all Virtual Router Peerings in a Virtual Router resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualRouterPeering> listAsync(final String resourceGroupName, final String virtualRouterName);

    /**
     * Deletes the specified peering from a Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String virtualRouterName, String peeringName);

}
