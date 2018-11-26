/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2018_07_01.VpnSite;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_07_01.DeviceProperties;
import com.microsoft.azure.management.network.v2018_07_01.AddressSpace;
import com.microsoft.azure.management.network.v2018_07_01.BgpSettings;
import com.microsoft.azure.management.network.v2018_07_01.ProvisioningState;

class VpnSiteImpl extends GroupableResourceCoreImpl<VpnSite, VpnSiteInner, VpnSiteImpl, NetworkManager> implements VpnSite, VpnSite.Definition, VpnSite.Update {
    VpnSiteImpl(String name, VpnSiteInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VpnSite> createResourceAsync() {
        VpnSitesInner client = this.manager().inner().vpnSites();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VpnSite> updateResourceAsync() {
        VpnSitesInner client = this.manager().inner().vpnSites();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VpnSiteInner> getInnerAsync() {
        VpnSitesInner client = this.manager().inner().vpnSites();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AddressSpace addressSpace() {
        return this.inner().addressSpace();
    }

    @Override
    public BgpSettings bgpProperties() {
        return this.inner().bgpProperties();
    }

    @Override
    public DeviceProperties deviceProperties() {
        return this.inner().deviceProperties();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String ipAddress() {
        return this.inner().ipAddress();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String siteKey() {
        return this.inner().siteKey();
    }

    @Override
    public SubResource virtualWAN() {
        return this.inner().virtualWAN();
    }

    @Override
    public VpnSiteImpl withAddressSpace(AddressSpace addressSpace) {
        this.inner().withAddressSpace(addressSpace);
        return this;
    }

    @Override
    public VpnSiteImpl withBgpProperties(BgpSettings bgpProperties) {
        this.inner().withBgpProperties(bgpProperties);
        return this;
    }

    @Override
    public VpnSiteImpl withDeviceProperties(DeviceProperties deviceProperties) {
        this.inner().withDeviceProperties(deviceProperties);
        return this;
    }

    @Override
    public VpnSiteImpl withIpAddress(String ipAddress) {
        this.inner().withIpAddress(ipAddress);
        return this;
    }

    @Override
    public VpnSiteImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public VpnSiteImpl withSiteKey(String siteKey) {
        this.inner().withSiteKey(siteKey);
        return this;
    }

    @Override
    public VpnSiteImpl withVirtualWAN(SubResource virtualWAN) {
        this.inner().withVirtualWAN(virtualWAN);
        return this;
    }

}
