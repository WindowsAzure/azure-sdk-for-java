/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01;

import rx.Observable;
import com.microsoft.azure.management.peering.v2020_04_01.implementation.ReceivedRoutesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReceivedRoutes.
 */
public interface ReceivedRoutes extends HasInner<ReceivedRoutesInner> {
    /**
     * Lists the prefixes received over the specified peering under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringReceivedRoute> listByPeeringAsync(final String resourceGroupName, final String peeringName);

}
