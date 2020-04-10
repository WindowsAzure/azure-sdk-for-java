/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.ExpressRouteConnectionList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class ExpressRouteConnectionListImpl extends WrapperImpl<ExpressRouteConnectionListInner> implements ExpressRouteConnectionList {
    private final NetworkManager manager;
    ExpressRouteConnectionListImpl(ExpressRouteConnectionListInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<ExpressRouteConnectionInner> value() {
        return this.inner().value();
    }

}
