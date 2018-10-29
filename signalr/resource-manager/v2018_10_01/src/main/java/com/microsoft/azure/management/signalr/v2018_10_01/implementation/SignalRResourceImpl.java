/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_10_01.implementation;

import com.microsoft.azure.management.signalr.v2018_10_01.SignalRResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.signalr.v2018_10_01.ProvisioningState;
import com.microsoft.azure.management.signalr.v2018_10_01.ResourceSku;
import java.util.Map;

class SignalRResourceImpl extends WrapperImpl<SignalRResourceInner> implements SignalRResource {
    private final SignalRServiceManager manager;
    SignalRResourceImpl(SignalRResourceInner inner, SignalRServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SignalRServiceManager manager() {
        return this.manager;
    }

    @Override
    public String externalIP() {
        return this.inner().externalIP();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
    }

    @Override
    public String hostNamePrefix() {
        return this.inner().hostNamePrefix();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Integer publicPort() {
        return this.inner().publicPort();
    }

    @Override
    public Integer serverPort() {
        return this.inner().serverPort();
    }

    @Override
    public ResourceSku sku() {
        return this.inner().sku();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

}
