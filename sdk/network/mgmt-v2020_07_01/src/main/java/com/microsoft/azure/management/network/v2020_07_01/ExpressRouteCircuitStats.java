/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.ExpressRouteCircuitStatsInner;

/**
 * Type representing ExpressRouteCircuitStats.
 */
public interface ExpressRouteCircuitStats extends HasInner<ExpressRouteCircuitStatsInner>, HasManager<NetworkManager> {
    /**
     * @return the primarybytesIn value.
     */
    Long primarybytesIn();

    /**
     * @return the primarybytesOut value.
     */
    Long primarybytesOut();

    /**
     * @return the secondarybytesIn value.
     */
    Long secondarybytesIn();

    /**
     * @return the secondarybytesOut value.
     */
    Long secondarybytesOut();

}
