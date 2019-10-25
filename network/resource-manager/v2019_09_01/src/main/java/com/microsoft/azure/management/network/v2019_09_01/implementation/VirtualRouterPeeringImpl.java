/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.management.network.v2019_09_01.VirtualRouterPeering;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;

class VirtualRouterPeeringImpl extends CreatableUpdatableImpl<VirtualRouterPeering, VirtualRouterPeeringInner, VirtualRouterPeeringImpl> implements VirtualRouterPeering, VirtualRouterPeering.Definition, VirtualRouterPeering.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualRouterName;
    private String peeringName;

    VirtualRouterPeeringImpl(String name, NetworkManager manager) {
        super(name, new VirtualRouterPeeringInner());
        this.manager = manager;
        // Set resource name
        this.peeringName = name;
        //
    }

    VirtualRouterPeeringImpl(VirtualRouterPeeringInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.peeringName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualRouterName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualRouters");
        this.peeringName = IdParsingUtils.getValueFromIdByName(inner.id(), "peerings");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualRouterPeering> createResourceAsync() {
        VirtualRouterPeeringsInner client = this.manager().inner().virtualRouterPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualRouterName, this.peeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualRouterPeering> updateResourceAsync() {
        VirtualRouterPeeringsInner client = this.manager().inner().virtualRouterPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualRouterName, this.peeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualRouterPeeringInner> getInnerAsync() {
        VirtualRouterPeeringsInner client = this.manager().inner().virtualRouterPeerings();
        return client.getAsync(this.resourceGroupName, this.virtualRouterName, this.peeringName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public Long peerAsn() {
        return this.inner().peerAsn();
    }

    @Override
    public String peerIp() {
        return this.inner().peerIp();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VirtualRouterPeeringImpl withExistingVirtualRouter(String resourceGroupName, String virtualRouterName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualRouterName = virtualRouterName;
        return this;
    }

    @Override
    public VirtualRouterPeeringImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public VirtualRouterPeeringImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public VirtualRouterPeeringImpl withPeerAsn(Long peerAsn) {
        this.inner().withPeerAsn(peerAsn);
        return this;
    }

    @Override
    public VirtualRouterPeeringImpl withPeerIp(String peerIp) {
        this.inner().withPeerIp(peerIp);
        return this;
    }

}
