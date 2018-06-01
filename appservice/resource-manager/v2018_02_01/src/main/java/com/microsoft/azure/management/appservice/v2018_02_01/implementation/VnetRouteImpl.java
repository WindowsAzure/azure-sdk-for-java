/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.VnetRoute;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.RouteType;

class VnetRouteImpl extends CreatableUpdatableImpl<VnetRoute, VnetRouteInner, VnetRouteImpl> implements VnetRoute, VnetRoute.Definition, VnetRoute.Update {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String vnetName;
    private String routeName;

    VnetRouteImpl(String name, AppServiceManager manager) {
        super(name, new VnetRouteInner());
        this.manager = manager;
        // Set resource name
        this.routeName = name;
        //
    }

    VnetRouteImpl(VnetRouteInner inner, AppServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.routeName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "serverfarms");
        this.vnetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkConnections");
        this.routeName = IdParsingUtils.getValueFromIdByName(inner.id(), "routes");
        //
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VnetRoute> createResourceAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return client.createOrUpdateVnetRouteAsync(this.resourceGroupName, this.name, this.vnetName, this.routeName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VnetRoute> updateResourceAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return client.updateVnetRouteAsync(this.resourceGroupName, this.name, this.vnetName, this.routeName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VnetRouteInner> getInnerAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String endAddress() {
        return this.inner().endAddress();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RouteType routeType() {
        return this.inner().routeType();
    }

    @Override
    public String startAddress() {
        return this.inner().startAddress();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VnetRouteImpl withExistingVirtualNetworkConnection(String resourceGroupName, String name, String vnetName) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.vnetName = vnetName;
        return this;
    }

    @Override
    public VnetRouteImpl withEndAddress(String endAddress) {
        this.inner().withEndAddress(endAddress);
        return this;
    }

    @Override
    public VnetRouteImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public VnetRouteImpl withRouteType(RouteType routeType) {
        this.inner().withRouteType(routeType);
        return this;
    }

    @Override
    public VnetRouteImpl withStartAddress(String startAddress) {
        this.inner().withStartAddress(startAddress);
        return this;
    }

}
