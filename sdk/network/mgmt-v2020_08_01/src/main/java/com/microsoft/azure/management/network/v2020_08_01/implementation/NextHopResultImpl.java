/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.NextHopResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_08_01.NextHopType;

class NextHopResultImpl extends WrapperImpl<NextHopResultInner> implements NextHopResult {
    private final NetworkManager manager;
    NextHopResultImpl(NextHopResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String nextHopIpAddress() {
        return this.inner().nextHopIpAddress();
    }

    @Override
    public NextHopType nextHopType() {
        return this.inner().nextHopType();
    }

    @Override
    public String routeTableId() {
        return this.inner().routeTableId();
    }

}
