/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.BgpConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_07_01.HubBgpConnectionStatus;

class BgpConnectionImpl extends CreatableUpdatableImpl<BgpConnection, BgpConnectionInner, BgpConnectionImpl> implements BgpConnection, BgpConnection.Definition, BgpConnection.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualHubName;
    private String connectionName;

    BgpConnectionImpl(String name, NetworkManager manager) {
        super(name, new BgpConnectionInner());
        this.manager = manager;
        // Set resource name
        this.connectionName = name;
        //
    }

    BgpConnectionImpl(BgpConnectionInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.connectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualHubs");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "bgpConnections");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BgpConnection> createResourceAsync() {
        VirtualHubBgpConnectionsInner client = this.manager().inner().virtualHubBgpConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BgpConnection> updateResourceAsync() {
        VirtualHubBgpConnectionsInner client = this.manager().inner().virtualHubBgpConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BgpConnectionInner> getInnerAsync() {
        VirtualHubBgpConnectionsInner client = this.manager().inner().virtualHubBgpConnections();
        return client.getAsync(this.resourceGroupName, this.virtualHubName, this.connectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public HubBgpConnectionStatus connectionState() {
        return this.inner().connectionState();
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
    public BgpConnectionImpl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    @Override
    public BgpConnectionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public BgpConnectionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public BgpConnectionImpl withPeerAsn(Long peerAsn) {
        this.inner().withPeerAsn(peerAsn);
        return this;
    }

    @Override
    public BgpConnectionImpl withPeerIp(String peerIp) {
        this.inner().withPeerIp(peerIp);
        return this;
    }

}
