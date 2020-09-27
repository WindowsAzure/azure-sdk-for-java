/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.SiteVnetGateway;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class SiteVnetGatewayImpl extends CreatableUpdatableImpl<SiteVnetGateway, VnetGatewayInner, SiteVnetGatewayImpl> implements SiteVnetGateway, SiteVnetGateway.Definition, SiteVnetGateway.Update {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String vnetName;
    private String gatewayName;
    private String slot;

    SiteVnetGatewayImpl(String name, AppServiceManager manager) {
        super(name, new VnetGatewayInner());
        this.manager = manager;
        // Set resource name
        this.gatewayName = name;
        //
    }

    SiteVnetGatewayImpl(VnetGatewayInner inner, AppServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.gatewayName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.vnetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkConnections");
        this.gatewayName = IdParsingUtils.getValueFromIdByName(inner.id(), "gateways");
        this.slot = IdParsingUtils.getValueFromIdByName(inner.id(), "slots");
        //
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SiteVnetGateway> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateVnetConnectionGatewaySlotAsync(this.resourceGroupName, this.name, this.vnetName, this.gatewayName, this.slot, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SiteVnetGateway> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.updateVnetConnectionGatewaySlotAsync(this.resourceGroupName, this.name, this.vnetName, this.gatewayName, this.slot, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VnetGatewayInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getVnetConnectionGatewaySlotAsync(this.resourceGroupName, this.name, this.vnetName, this.gatewayName, this.slot);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public String type() {
        return this.inner().type();
    }

    @Override
    public String vnetName() {
        return this.inner().vnetName();
    }

    @Override
    public String vpnPackageUri() {
        return this.inner().vpnPackageUri();
    }

    @Override
    public SiteVnetGatewayImpl withExistingVirtualNetworkConnection(String resourceGroupName, String name, String vnetName, String slot) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.vnetName = vnetName;
        this.slot = slot;
        return this;
    }

    @Override
    public SiteVnetGatewayImpl withVpnPackageUri(String vpnPackageUri) {
        this.inner().withVpnPackageUri(vpnPackageUri);
        return this;
    }

    @Override
    public SiteVnetGatewayImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public SiteVnetGatewayImpl withVnetName(String vnetName) {
        this.inner().withVnetName(vnetName);
        return this;
    }

}
