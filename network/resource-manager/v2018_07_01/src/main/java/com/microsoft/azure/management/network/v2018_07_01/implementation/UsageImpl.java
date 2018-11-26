/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.microsoft.azure.management.network.v2018_07_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_07_01.UsageName;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final NetworkManager manager;

    UsageImpl(UsageInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public long currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public long limit() {
        return this.inner().limit();
    }

    @Override
    public UsageName name() {
        return this.inner().name();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
