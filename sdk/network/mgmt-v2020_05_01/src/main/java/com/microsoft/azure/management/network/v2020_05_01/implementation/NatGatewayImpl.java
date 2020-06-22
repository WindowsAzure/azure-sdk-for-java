/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_05_01.NatGateway;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_05_01.NatGatewaySku;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;

class NatGatewayImpl extends GroupableResourceCoreImpl<NatGateway, NatGatewayInner, NatGatewayImpl, NetworkManager> implements NatGateway, NatGateway.Definition, NatGateway.Update {
    NatGatewayImpl(String name, NatGatewayInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<NatGateway> createResourceAsync() {
        NatGatewaysInner client = this.manager().inner().natGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NatGateway> updateResourceAsync() {
        NatGatewaysInner client = this.manager().inner().natGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NatGatewayInner> getInnerAsync() {
        NatGatewaysInner client = this.manager().inner().natGateways();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<SubResource> publicIpAddresses() {
        return this.inner().publicIpAddresses();
    }

    @Override
    public List<SubResource> publicIpPrefixes() {
        return this.inner().publicIpPrefixes();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public NatGatewaySku sku() {
        return this.inner().sku();
    }

    @Override
    public List<SubResource> subnets() {
        return this.inner().subnets();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public NatGatewayImpl withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.inner().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    @Override
    public NatGatewayImpl withPublicIpAddresses(List<SubResource> publicIpAddresses) {
        this.inner().withPublicIpAddresses(publicIpAddresses);
        return this;
    }

    @Override
    public NatGatewayImpl withPublicIpPrefixes(List<SubResource> publicIpPrefixes) {
        this.inner().withPublicIpPrefixes(publicIpPrefixes);
        return this;
    }

    @Override
    public NatGatewayImpl withSku(NatGatewaySku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public NatGatewayImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

}
