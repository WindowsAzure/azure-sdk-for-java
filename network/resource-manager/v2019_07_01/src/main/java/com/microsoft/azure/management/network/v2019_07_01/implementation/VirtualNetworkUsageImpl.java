/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.management.network.v2019_07_01.VirtualNetworkUsage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_07_01.VirtualNetworkUsageName;

class VirtualNetworkUsageImpl extends WrapperImpl<VirtualNetworkUsageInner> implements VirtualNetworkUsage {
    private final NetworkManager manager;

    VirtualNetworkUsageImpl(VirtualNetworkUsageInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public Double currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Double limit() {
        return this.inner().limit();
    }

    @Override
    public VirtualNetworkUsageName name() {
        return this.inner().name();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
