/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.Probe;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_07_01.ProbeProtocol;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;

class ProbeImpl extends IndexableRefreshableWrapperImpl<Probe, ProbeInner> implements Probe {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String loadBalancerName;
    private String probeName;

    ProbeImpl(ProbeInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.loadBalancerName = IdParsingUtils.getValueFromIdByName(inner.id(), "loadBalancers");
        this.probeName = IdParsingUtils.getValueFromIdByName(inner.id(), "probes");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProbeInner> getInnerAsync() {
        LoadBalancerProbesInner client = this.manager().inner().loadBalancerProbes();
        return client.getAsync(this.resourceGroupName, this.loadBalancerName, this.probeName);
    }



    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer intervalInSeconds() {
        return this.inner().intervalInSeconds();
    }

    @Override
    public List<SubResource> loadBalancingRules() {
        return this.inner().loadBalancingRules();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer numberOfProbes() {
        return this.inner().numberOfProbes();
    }

    @Override
    public int port() {
        return this.inner().port();
    }

    @Override
    public ProbeProtocol protocol() {
        return this.inner().protocol();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String requestPath() {
        return this.inner().requestPath();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
