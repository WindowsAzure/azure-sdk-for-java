/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.management.network.v2019_02_01.Route;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_02_01.RouteNextHopType;

class RouteImpl extends CreatableUpdatableImpl<Route, RouteInner, RouteImpl> implements Route, Route.Definition, Route.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String routeTableName;
    private String routeName;

    RouteImpl(String name, NetworkManager manager) {
        super(name, new RouteInner());
        this.manager = manager;
        // Set resource name
        this.routeName = name;
        //
    }

    RouteImpl(RouteInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.routeName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.routeTableName = IdParsingUtils.getValueFromIdByName(inner.id(), "routeTables");
        this.routeName = IdParsingUtils.getValueFromIdByName(inner.id(), "routes");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Route> createResourceAsync() {
        RoutesInner client = this.manager().inner().routes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.routeTableName, this.routeName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Route> updateResourceAsync() {
        RoutesInner client = this.manager().inner().routes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.routeTableName, this.routeName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RouteInner> getInnerAsync() {
        RoutesInner client = this.manager().inner().routes();
        return client.getAsync(this.resourceGroupName, this.routeTableName, this.routeName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String addressPrefix() {
        return this.inner().addressPrefix();
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
    public String nextHopIpAddress() {
        return this.inner().nextHopIpAddress();
    }

    @Override
    public RouteNextHopType nextHopType() {
        return this.inner().nextHopType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public RouteImpl withExistingRouteTable(String resourceGroupName, String routeTableName) {
        this.resourceGroupName = resourceGroupName;
        this.routeTableName = routeTableName;
        return this;
    }

    @Override
    public RouteImpl withNextHopType(RouteNextHopType nextHopType) {
        this.inner().withNextHopType(nextHopType);
        return this;
    }

    @Override
    public RouteImpl withAddressPrefix(String addressPrefix) {
        this.inner().withAddressPrefix(addressPrefix);
        return this;
    }

    @Override
    public RouteImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public RouteImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public RouteImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public RouteImpl withNextHopIpAddress(String nextHopIpAddress) {
        this.inner().withNextHopIpAddress(nextHopIpAddress);
        return this;
    }

    @Override
    public RouteImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

}
