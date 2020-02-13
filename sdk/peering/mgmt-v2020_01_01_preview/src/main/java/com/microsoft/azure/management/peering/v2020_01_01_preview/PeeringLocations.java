/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview;

import rx.Observable;
import com.microsoft.azure.management.peering.v2020_01_01_preview.implementation.PeeringLocationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PeeringLocations.
 */
public interface PeeringLocations extends HasInner<PeeringLocationsInner> {
    /**
     * Lists all of the available peering locations for the specified kind of peering.
     *
     * @param kind The kind of the peering. Possible values include: 'Direct', 'Exchange'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringLocation> listAsync(final String kind);

}
