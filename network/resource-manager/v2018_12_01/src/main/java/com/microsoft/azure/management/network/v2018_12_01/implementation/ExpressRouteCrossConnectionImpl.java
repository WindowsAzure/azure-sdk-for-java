/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCrossConnection;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCircuitReference;
import com.microsoft.azure.management.network.v2018_12_01.ServiceProviderProvisioningState;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCrossConnectionPeering;

class ExpressRouteCrossConnectionImpl extends GroupableResourceCoreImpl<ExpressRouteCrossConnection, ExpressRouteCrossConnectionInner, ExpressRouteCrossConnectionImpl, NetworkManager> implements ExpressRouteCrossConnection, ExpressRouteCrossConnection.Definition, ExpressRouteCrossConnection.Update {
    ExpressRouteCrossConnectionImpl(String name, ExpressRouteCrossConnectionInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ExpressRouteCrossConnection> createResourceAsync() {
        ExpressRouteCrossConnectionsInner client = this.manager().inner().expressRouteCrossConnections();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteCrossConnection> updateResourceAsync() {
        ExpressRouteCrossConnectionsInner client = this.manager().inner().expressRouteCrossConnections();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteCrossConnectionInner> getInnerAsync() {
        ExpressRouteCrossConnectionsInner client = this.manager().inner().expressRouteCrossConnections();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Integer bandwidthInMbps() {
        return this.inner().bandwidthInMbps();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.inner().expressRouteCircuit();
    }

    @Override
    public String peeringLocation() {
        return this.inner().peeringLocation();
    }

    @Override
    public List<ExpressRouteCrossConnectionPeering> peerings() {
        List<ExpressRouteCrossConnectionPeering> lst = new ArrayList<ExpressRouteCrossConnectionPeering>();
        if (this.inner().peerings() != null) {
            for (ExpressRouteCrossConnectionPeeringInner inner : this.inner().peerings()) {
                lst.add( new ExpressRouteCrossConnectionPeeringImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String primaryAzurePort() {
        return this.inner().primaryAzurePort();
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
    public String serviceProviderNotes() {
        return this.inner().serviceProviderNotes();
    }

    @Override
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.inner().serviceProviderProvisioningState();
    }

    @Override
    public Integer sTag() {
        return this.inner().sTag();
    }

    @Override
    public ExpressRouteCrossConnectionImpl withBandwidthInMbps(Integer bandwidthInMbps) {
        this.inner().withBandwidthInMbps(bandwidthInMbps);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionImpl withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit) {
        this.inner().withExpressRouteCircuit(expressRouteCircuit);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionImpl withPeeringLocation(String peeringLocation) {
        this.inner().withPeeringLocation(peeringLocation);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionImpl withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        this.inner().withPeerings(peerings);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionImpl withServiceProviderNotes(String serviceProviderNotes) {
        this.inner().withServiceProviderNotes(serviceProviderNotes);
        return this;
    }

    @Override
    public ExpressRouteCrossConnectionImpl withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.inner().withServiceProviderProvisioningState(serviceProviderProvisioningState);
        return this;
    }

}
