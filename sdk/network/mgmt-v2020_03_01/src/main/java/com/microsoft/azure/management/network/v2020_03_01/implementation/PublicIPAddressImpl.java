/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.PublicIPAddress;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.PublicIPAddressSku;
import com.microsoft.azure.management.network.v2020_03_01.IPAllocationMethod;
import com.microsoft.azure.management.network.v2020_03_01.IPVersion;
import com.microsoft.azure.management.network.v2020_03_01.IPConfiguration;
import com.microsoft.azure.management.network.v2020_03_01.PublicIPAddressDnsSettings;
import com.microsoft.azure.management.network.v2020_03_01.DdosSettings;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.IpTag;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;

class PublicIPAddressImpl extends GroupableResourceCoreImpl<PublicIPAddress, PublicIPAddressInner, PublicIPAddressImpl, NetworkManager> implements PublicIPAddress, PublicIPAddress.Definition, PublicIPAddress.Update {
    PublicIPAddressImpl(String name, PublicIPAddressInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PublicIPAddress> createResourceAsync() {
        PublicIPAddressesInner client = this.manager().inner().publicIPAddresses();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PublicIPAddress> updateResourceAsync() {
        PublicIPAddressesInner client = this.manager().inner().publicIPAddresses();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PublicIPAddressInner> getInnerAsync() {
        PublicIPAddressesInner client = this.manager().inner().publicIPAddresses();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DdosSettings ddosSettings() {
        return this.inner().ddosSettings();
    }

    @Override
    public PublicIPAddressDnsSettings dnsSettings() {
        return this.inner().dnsSettings();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public Integer idleTimeoutInMinutes() {
        return this.inner().idleTimeoutInMinutes();
    }

    @Override
    public String ipAddress() {
        return this.inner().ipAddress();
    }

    @Override
    public IPConfiguration ipConfiguration() {
        return this.inner().ipConfiguration();
    }

    @Override
    public List<IpTag> ipTags() {
        return this.inner().ipTags();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public IPVersion publicIPAddressVersion() {
        return this.inner().publicIPAddressVersion();
    }

    @Override
    public IPAllocationMethod publicIPAllocationMethod() {
        return this.inner().publicIPAllocationMethod();
    }

    @Override
    public SubResource publicIPPrefix() {
        return this.inner().publicIPPrefix();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public PublicIPAddressSku sku() {
        return this.inner().sku();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public PublicIPAddressImpl withDdosSettings(DdosSettings ddosSettings) {
        this.inner().withDdosSettings(ddosSettings);
        return this;
    }

    @Override
    public PublicIPAddressImpl withDnsSettings(PublicIPAddressDnsSettings dnsSettings) {
        this.inner().withDnsSettings(dnsSettings);
        return this;
    }

    @Override
    public PublicIPAddressImpl withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.inner().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    @Override
    public PublicIPAddressImpl withIpAddress(String ipAddress) {
        this.inner().withIpAddress(ipAddress);
        return this;
    }

    @Override
    public PublicIPAddressImpl withIpTags(List<IpTag> ipTags) {
        this.inner().withIpTags(ipTags);
        return this;
    }

    @Override
    public PublicIPAddressImpl withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.inner().withPublicIPAddressVersion(publicIPAddressVersion);
        return this;
    }

    @Override
    public PublicIPAddressImpl withPublicIPAllocationMethod(IPAllocationMethod publicIPAllocationMethod) {
        this.inner().withPublicIPAllocationMethod(publicIPAllocationMethod);
        return this;
    }

    @Override
    public PublicIPAddressImpl withPublicIPPrefix(SubResource publicIPPrefix) {
        this.inner().withPublicIPPrefix(publicIPPrefix);
        return this;
    }

    @Override
    public PublicIPAddressImpl withSku(PublicIPAddressSku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public PublicIPAddressImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

}
