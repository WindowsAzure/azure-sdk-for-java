/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.PeerRouteList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.PeerRoute;

class PeerRouteListImpl extends WrapperImpl<PeerRouteListInner> implements PeerRouteList {
    private final NetworkManager manager;
    PeerRouteListImpl(PeerRouteListInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<PeerRoute> value() {
        return this.inner().value();
    }

}
