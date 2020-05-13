/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_04_01.RouteTable;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_04_01.Route;
import com.microsoft.azure.management.network.v2020_04_01.Subnet;

class RouteTableImpl extends GroupableResourceCoreImpl<RouteTable, RouteTableInner, RouteTableImpl, NetworkManager> implements RouteTable, RouteTable.Definition, RouteTable.Update {
    RouteTableImpl(String name, RouteTableInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<RouteTable> createResourceAsync() {
        RouteTablesInner client = this.manager().inner().routeTables();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RouteTable> updateResourceAsync() {
        RouteTablesInner client = this.manager().inner().routeTables();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RouteTableInner> getInnerAsync() {
        RouteTablesInner client = this.manager().inner().routeTables();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean disableBgpRoutePropagation() {
        return this.inner().disableBgpRoutePropagation();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<Route> routes() {
        List<Route> lst = new ArrayList<Route>();
        if (this.inner().routes() != null) {
            for (RouteInner inner : this.inner().routes()) {
                lst.add( new RouteImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<Subnet> subnets() {
        List<Subnet> lst = new ArrayList<Subnet>();
        if (this.inner().subnets() != null) {
            for (SubnetInner inner : this.inner().subnets()) {
                lst.add( new SubnetImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public RouteTableImpl withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        this.inner().withDisableBgpRoutePropagation(disableBgpRoutePropagation);
        return this;
    }

    @Override
    public RouteTableImpl withRoutes(List<RouteInner> routes) {
        this.inner().withRoutes(routes);
        return this;
    }

}
