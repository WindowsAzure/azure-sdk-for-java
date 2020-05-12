/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.ExpressRouteCircuitStats;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ExpressRouteCircuitStatsImpl extends WrapperImpl<ExpressRouteCircuitStatsInner> implements ExpressRouteCircuitStats {
    private final NetworkManager manager;
    ExpressRouteCircuitStatsImpl(ExpressRouteCircuitStatsInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Long primarybytesIn() {
        return this.inner().primarybytesIn();
    }

    @Override
    public Long primarybytesOut() {
        return this.inner().primarybytesOut();
    }

    @Override
    public Long secondarybytesIn() {
        return this.inner().secondarybytesIn();
    }

    @Override
    public Long secondarybytesOut() {
        return this.inner().secondarybytesOut();
    }

}
