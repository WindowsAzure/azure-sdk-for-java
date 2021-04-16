/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.VirtualNetworkPeering;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_08_01.AddressSpace;
import com.microsoft.azure.management.network.v2020_08_01.VirtualNetworkBgpCommunities;
import com.microsoft.azure.management.network.v2020_08_01.VirtualNetworkPeeringState;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;

class VirtualNetworkPeeringImpl extends CreatableUpdatableImpl<VirtualNetworkPeering, VirtualNetworkPeeringInner, VirtualNetworkPeeringImpl> implements VirtualNetworkPeering, VirtualNetworkPeering.Definition, VirtualNetworkPeering.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualNetworkName;
    private String virtualNetworkPeeringName;

    VirtualNetworkPeeringImpl(String name, NetworkManager manager) {
        super(name, new VirtualNetworkPeeringInner());
        this.manager = manager;
        // Set resource name
        this.virtualNetworkPeeringName = name;
        //
    }

    VirtualNetworkPeeringImpl(VirtualNetworkPeeringInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.virtualNetworkPeeringName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualNetworkName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworks");
        this.virtualNetworkPeeringName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkPeerings");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualNetworkPeering> createResourceAsync() {
        VirtualNetworkPeeringsInner client = this.manager().inner().virtualNetworkPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualNetworkName, this.virtualNetworkPeeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetworkPeering> updateResourceAsync() {
        VirtualNetworkPeeringsInner client = this.manager().inner().virtualNetworkPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualNetworkName, this.virtualNetworkPeeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkPeeringInner> getInnerAsync() {
        VirtualNetworkPeeringsInner client = this.manager().inner().virtualNetworkPeerings();
        return client.getAsync(this.resourceGroupName, this.virtualNetworkName, this.virtualNetworkPeeringName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean allowForwardedTraffic() {
        return this.inner().allowForwardedTraffic();
    }

    @Override
    public Boolean allowGatewayTransit() {
        return this.inner().allowGatewayTransit();
    }

    @Override
    public Boolean allowVirtualNetworkAccess() {
        return this.inner().allowVirtualNetworkAccess();
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
    public VirtualNetworkPeeringState peeringState() {
        return this.inner().peeringState();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public AddressSpace remoteAddressSpace() {
        return this.inner().remoteAddressSpace();
    }

    @Override
    public VirtualNetworkBgpCommunities remoteBgpCommunities() {
        return this.inner().remoteBgpCommunities();
    }

    @Override
    public SubResource remoteVirtualNetwork() {
        return this.inner().remoteVirtualNetwork();
    }

    @Override
    public Boolean useRemoteGateways() {
        return this.inner().useRemoteGateways();
    }

    @Override
    public VirtualNetworkPeeringImpl withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualNetworkName = virtualNetworkName;
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withAllowForwardedTraffic(Boolean allowForwardedTraffic) {
        this.inner().withAllowForwardedTraffic(allowForwardedTraffic);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withAllowGatewayTransit(Boolean allowGatewayTransit) {
        this.inner().withAllowGatewayTransit(allowGatewayTransit);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
        this.inner().withAllowVirtualNetworkAccess(allowVirtualNetworkAccess);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withPeeringState(VirtualNetworkPeeringState peeringState) {
        this.inner().withPeeringState(peeringState);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withRemoteAddressSpace(AddressSpace remoteAddressSpace) {
        this.inner().withRemoteAddressSpace(remoteAddressSpace);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withRemoteBgpCommunities(VirtualNetworkBgpCommunities remoteBgpCommunities) {
        this.inner().withRemoteBgpCommunities(remoteBgpCommunities);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.inner().withRemoteVirtualNetwork(remoteVirtualNetwork);
        return this;
    }

    @Override
    public VirtualNetworkPeeringImpl withUseRemoteGateways(Boolean useRemoteGateways) {
        this.inner().withUseRemoteGateways(useRemoteGateways);
        return this;
    }

}
