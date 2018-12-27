/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitPeering;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRoutePeeringType;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRoutePeeringState;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitPeeringConfig;
import com.microsoft.azure.management.network.v2018_05_01.Ipv6ExpressRouteCircuitPeeringConfig;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitConnection;
import com.microsoft.azure.management.network.v2018_05_01.RouteFilter;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitStats;

class ExpressRouteCircuitPeeringImpl extends CreatableUpdatableImpl<ExpressRouteCircuitPeering, ExpressRouteCircuitPeeringInner, ExpressRouteCircuitPeeringImpl> implements ExpressRouteCircuitPeering, ExpressRouteCircuitPeering.Definition, ExpressRouteCircuitPeering.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String circuitName;
    private String peeringName;

    ExpressRouteCircuitPeeringImpl(String name, NetworkManager manager) {
        super(name, new ExpressRouteCircuitPeeringInner());
        this.manager = manager;
        // Set resource name
        this.peeringName = name;
        //
    }

    ExpressRouteCircuitPeeringImpl(ExpressRouteCircuitPeeringInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.peeringName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.circuitName = IdParsingUtils.getValueFromIdByName(inner.id(), "expressRouteCircuits");
        this.peeringName = IdParsingUtils.getValueFromIdByName(inner.id(), "peerings");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExpressRouteCircuitPeering> createResourceAsync() {
        ExpressRouteCircuitPeeringsInner client = this.manager().inner().expressRouteCircuitPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.circuitName, this.peeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteCircuitPeering> updateResourceAsync() {
        ExpressRouteCircuitPeeringsInner client = this.manager().inner().expressRouteCircuitPeerings();
        return client.createOrUpdateAsync(this.resourceGroupName, this.circuitName, this.peeringName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteCircuitPeeringInner> getInnerAsync() {
        ExpressRouteCircuitPeeringsInner client = this.manager().inner().expressRouteCircuitPeerings();
        return client.getAsync(this.resourceGroupName, this.circuitName, this.peeringName);
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
    public List<ExpressRouteCircuitConnection> connections() {
        List<ExpressRouteCircuitConnection> lst = new ArrayList<ExpressRouteCircuitConnection>();
        if (this.inner().connections() != null) {
            for (ExpressRouteCircuitConnectionInner inner : this.inner().connections()) {
                lst.add( new ExpressRouteCircuitConnectionImpl(inner, manager()));
            }
        }
        return lst;
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
    public RouteFilter routeFilter() {
        RouteFilterInner inner = this.inner().routeFilter();
        if (inner != null) {
            return  new RouteFilterImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
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
    public ExpressRouteCircuitStats stats() {
        ExpressRouteCircuitStatsInner inner = this.inner().stats();
        if (inner != null) {
            return  new ExpressRouteCircuitStatsImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Integer vlanId() {
        return this.inner().vlanId();
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withExistingExpressRouteCircuit(String resourceGroupName, String circuitName) {
        this.resourceGroupName = resourceGroupName;
        this.circuitName = circuitName;
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withAzureASN(Integer azureASN) {
        this.inner().withAzureASN(azureASN);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withConnections(List<ExpressRouteCircuitConnectionInner> connections) {
        this.inner().withConnections(connections);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withGatewayManagerEtag(String gatewayManagerEtag) {
        this.inner().withGatewayManagerEtag(gatewayManagerEtag);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        this.inner().withIpv6PeeringConfig(ipv6PeeringConfig);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withLastModifiedBy(String lastModifiedBy) {
        this.inner().withLastModifiedBy(lastModifiedBy);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.inner().withMicrosoftPeeringConfig(microsoftPeeringConfig);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withPeerASN(Long peerASN) {
        this.inner().withPeerASN(peerASN);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withPeeringType(ExpressRoutePeeringType peeringType) {
        this.inner().withPeeringType(peeringType);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withPrimaryAzurePort(String primaryAzurePort) {
        this.inner().withPrimaryAzurePort(primaryAzurePort);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.inner().withPrimaryPeerAddressPrefix(primaryPeerAddressPrefix);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withRouteFilter(RouteFilterInner routeFilter) {
        this.inner().withRouteFilter(routeFilter);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withSecondaryAzurePort(String secondaryAzurePort) {
        this.inner().withSecondaryAzurePort(secondaryAzurePort);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.inner().withSecondaryPeerAddressPrefix(secondaryPeerAddressPrefix);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withSharedKey(String sharedKey) {
        this.inner().withSharedKey(sharedKey);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withState(ExpressRoutePeeringState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withStats(ExpressRouteCircuitStatsInner stats) {
        this.inner().withStats(stats);
        return this;
    }

    @Override
    public ExpressRouteCircuitPeeringImpl withVlanId(Integer vlanId) {
        this.inner().withVlanId(vlanId);
        return this;
    }

}
