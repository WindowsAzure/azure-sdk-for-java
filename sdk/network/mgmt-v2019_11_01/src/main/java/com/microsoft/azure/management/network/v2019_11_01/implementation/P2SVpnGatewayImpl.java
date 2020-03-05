/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_11_01.P2SVpnGateway;
import rx.Observable;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.P2SConnectionConfiguration;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_11_01.VpnClientConnectionHealth;

class P2SVpnGatewayImpl extends GroupableResourceCoreImpl<P2SVpnGateway, P2SVpnGatewayInner, P2SVpnGatewayImpl, NetworkManager> implements P2SVpnGateway, P2SVpnGateway.Definition, P2SVpnGateway.Update {
    P2SVpnGatewayImpl(String name, P2SVpnGatewayInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<P2SVpnGateway> createResourceAsync() {
        P2sVpnGatewaysInner client = this.manager().inner().p2sVpnGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<P2SVpnGateway> updateResourceAsync() {
        P2sVpnGatewaysInner client = this.manager().inner().p2sVpnGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<P2SVpnGatewayInner> getInnerAsync() {
        P2sVpnGatewaysInner client = this.manager().inner().p2sVpnGateways();
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
    public List<P2SConnectionConfiguration> p2SConnectionConfigurations() {
        return this.inner().p2SConnectionConfigurations();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SubResource virtualHub() {
        return this.inner().virtualHub();
    }

    @Override
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.inner().vpnClientConnectionHealth();
    }

    @Override
    public Integer vpnGatewayScaleUnit() {
        return this.inner().vpnGatewayScaleUnit();
    }

    @Override
    public SubResource vpnServerConfiguration() {
        return this.inner().vpnServerConfiguration();
    }

    @Override
    public P2SVpnGatewayImpl withP2SConnectionConfigurations(List<P2SConnectionConfiguration> p2SConnectionConfigurations) {
        this.inner().withP2SConnectionConfigurations(p2SConnectionConfigurations);
        return this;
    }

    @Override
    public P2SVpnGatewayImpl withVirtualHub(SubResource virtualHub) {
        this.inner().withVirtualHub(virtualHub);
        return this;
    }

    @Override
    public P2SVpnGatewayImpl withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.inner().withVpnGatewayScaleUnit(vpnGatewayScaleUnit);
        return this;
    }

    @Override
    public P2SVpnGatewayImpl withVpnServerConfiguration(SubResource vpnServerConfiguration) {
        this.inner().withVpnServerConfiguration(vpnServerConfiguration);
        return this;
    }

}
