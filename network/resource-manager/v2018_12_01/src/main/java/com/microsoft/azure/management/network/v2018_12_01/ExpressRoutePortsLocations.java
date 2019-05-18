/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_12_01.implementation.ExpressRoutePortsLocationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRoutePortsLocations.
 */
public interface ExpressRoutePortsLocations extends SupportsListing<ExpressRoutePortsLocation>, HasInner<ExpressRoutePortsLocationsInner> {
    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRoutePortsLocation> getAsync(String locationName);

}
