/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCrossConnectionPeering;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRoutePeeringType;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRoutePeeringState;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitPeeringConfig;
import com.microsoft.azure.management.network.v2018_05_01.Ipv6ExpressRouteCircuitPeeringConfig;

class ExpressRouteCrossConnectionPeeringImpl extends CreatableUpdatableImpl<ExpressRouteCrossConnectionPeering, ExpressRouteCrossConnectionPeeringInner, ExpressRouteCrossConnectionPeeringImpl> implements ExpressRouteCrossConnectionPeering, ExpressRouteCrossConnectionPeering.Definition, ExpressRouteCrossConnectionPeering.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String crossConnectionName;
    private String peeringName;

    ExpressRouteCrossConnectionPeeringImpl(String name, NetworkManager manager) {
        super(name, new ExpressRouteCrossConnectionPeeringInner());
        this.manager = manager;
        // Set resource name
        this.peeringName = name;
        //
    }

    ExpressRouteCrossConnectionPeeringImpl(ExpressRouteCrossConnectionPeeringInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.peeringName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.crossConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "expressRouteCrossConnections");
        this.peeringName = IdParsingUtils.getValueFromIdByName(inner.id(), "peerings");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExpressRouteCrossConnectionPeering> createResourceAsync() {
        ExpressRouteCrossConnectionPeeringsInner client = this.manager().inner().expressRouteCrossConnectionPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.crossConnectionName, this.peeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteCrossConnectionPeering> updateResourceAsync() {
        ExpressRouteCrossConnectionPeeringsInner client = this.manager().inner().expressRouteCrossConnectionPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.crossConnectionName, this.peeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteCrossConnectionPeeringInner> getInnerAsync() {
        ExpressRouteCrossConnectionPeeringsInner client = this.manager().inner().expressRouteCrossConnectionPeerings();
        return client.getAsync(this.resourceGroupName, this.crossConnectionName, this.peeringName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Integer azureASN() {
        return this.inner().azureASN();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String gatewayManagerEtag() {
        return this.inner().gatewayManagerEtag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.inner().ipv6PeeringConfig();
    }

    @Override
    public String lastModifiedBy() {
        return this.inner().lastModifiedBy();
    }

    @Override
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.inner().microsoftPeeringConfig();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Long peerASN() {
        return this.inner().peerASN();
    }

    @Override
    public ExpressRoutePeeringType peeringType() {
        return this.inner().peeringType();
    }

    @Override
    public String primaryAzurePort() {
        return this.inner().primaryAzurePort();
    }

    @Override
    public String primaryPeerAddressPrefix() {
        return this.inner().primaryPeerAddressPrefix();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String secondaryAzurePort() {
        return this.inner().secondaryAzurePort();
    }

    @Override
    public String secondaryPeerAddressPrefix() {
        return this.inner().secondaryPeerAddressPrefix();
    }

    @Override
    public String sharedKey() {
        return this.inner().sharedKey();
    }

    @Override
    public ExpressRoutePeeringState state() {
        return this.inner().state();
    }

    @Override
    public Integer vlanId() {
        return this.inner().vlanId();
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withExistingExpressRouteCrossConnection(String resourceGroupName, String crossConnectionName) {
        this.resourceGroupName = resourceGroupName;
        this.crossConnectionName = crossConnectionName;
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withGatewayManagerEtag(String gatewayManagerEtag) {
        this.inner().withGatewayManagerEtag(gatewayManagerEtag);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        this.inner().withIpv6PeeringConfig(ipv6PeeringConfig);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withLastModifiedBy(String lastModifiedBy) {
        this.inner().withLastModifiedBy(lastModifiedBy);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.inner().withMicrosoftPeeringConfig(microsoftPeeringConfig);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withPeerASN(Long peerASN) {
        this.inner().withPeerASN(peerASN);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withPeeringType(ExpressRoutePeeringType peeringType) {
        this.inner().withPeeringType(peeringType);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.inner().withPrimaryPeerAddressPrefix(primaryPeerAddressPrefix);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.inner().withSecondaryPeerAddressPrefix(secondaryPeerAddressPrefix);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withSharedKey(String sharedKey) {
        this.inner().withSharedKey(sharedKey);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withState(ExpressRoutePeeringState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionPeeringImpl withVlanId(Integer vlanId) {
        this.inner().withVlanId(vlanId);
        return this;
    }

}
