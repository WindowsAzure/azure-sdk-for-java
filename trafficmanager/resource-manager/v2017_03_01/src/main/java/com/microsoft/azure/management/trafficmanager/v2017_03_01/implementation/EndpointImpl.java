/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_03_01.implementation;

import com.microsoft.azure.management.trafficmanager.v2017_03_01.Endpoint;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class EndpointImpl extends WrapperImpl<EndpointInner> implements Endpoint {
    private final NetworkManager manager;
    EndpointImpl(EndpointInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String endpointLocation() {
        return this.inner().endpointLocation();
    }

    @Override
    public String endpointMonitorStatus() {
        return this.inner().endpointMonitorStatus();
    }

    @Override
    public String endpointStatus() {
        return this.inner().endpointStatus();
    }

    @Override
    public List<String> geoMapping() {
        return this.inner().geoMapping();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Long minChildEndpoints() {
        return this.inner().minChildEndpoints();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Long priority() {
        return this.inner().priority();
    }

    @Override
    public String target() {
        return this.inner().target();
    }

    @Override
    public String targetResourceId() {
        return this.inner().targetResourceId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Long weight() {
        return this.inner().weight();
    }

}
