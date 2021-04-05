/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.HybridConnection;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;

class HybridConnectionImpl extends WrapperImpl<HybridConnectionInner> implements HybridConnection {
    private final AppServiceManager manager;

    HybridConnectionImpl(HybridConnectionInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public String hostname() {
        return this.inner().hostname();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer port() {
        return this.inner().port();
    }

    @Override
    public String relayArmUri() {
        return this.inner().relayArmUri();
    }

    @Override
    public String relayName() {
        return this.inner().relayName();
    }

    @Override
    public String sendKeyName() {
        return this.inner().sendKeyName();
    }

    @Override
    public String sendKeyValue() {
        return this.inner().sendKeyValue();
    }

    @Override
    public String serviceBusNamespace() {
        return this.inner().serviceBusNamespace();
    }

    @Override
    public String serviceBusSuffix() {
        return this.inner().serviceBusSuffix();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
