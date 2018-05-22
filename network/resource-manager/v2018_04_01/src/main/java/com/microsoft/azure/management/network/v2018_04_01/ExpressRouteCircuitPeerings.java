/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_04_01.implementation.ExpressRouteCircuitPeeringsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRouteCircuitPeerings.
 */
public interface ExpressRouteCircuitPeerings extends SupportsCreating<ExpressRouteCircuitPeering.DefinitionStages.Blank>, HasInner<ExpressRouteCircuitPeeringsInner> {
    /**
     * Gets the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitPeering> getAsync(String resourceGroupName, String circuitName, String peeringName);

    /**
     * Gets all peerings in a specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitPeering> listAsync(final String resourceGroupName, final String circuitName);

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String circuitName, String peeringName);

}
