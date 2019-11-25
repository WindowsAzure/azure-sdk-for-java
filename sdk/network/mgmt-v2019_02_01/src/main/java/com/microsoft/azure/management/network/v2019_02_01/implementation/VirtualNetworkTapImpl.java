/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_02_01.VirtualNetworkTap;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_02_01.FrontendIPConfiguration;
import com.microsoft.azure.management.network.v2019_02_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_02_01.NetworkInterfaceTapConfiguration;

class VirtualNetworkTapImpl extends GroupableResourceCoreImpl<VirtualNetworkTap, VirtualNetworkTapInner, VirtualNetworkTapImpl, NetworkManager> implements VirtualNetworkTap, VirtualNetworkTap.Definition, VirtualNetworkTap.Update {
    VirtualNetworkTapImpl(String name, VirtualNetworkTapInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualNetworkTap> createResourceAsync() {
        VirtualNetworkTapsInner client = this.manager().inner().virtualNetworkTaps();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetworkTap> updateResourceAsync() {
        VirtualNetworkTapsInner client = this.manager().inner().virtualNetworkTaps();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkTapInner> getInnerAsync() {
        VirtualNetworkTapsInner client = this.manager().inner().virtualNetworkTaps();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public FrontendIPConfiguration destinationLoadBalancerFrontEndIPConfiguration() {
        FrontendIPConfigurationInner inner = this.inner().destinationLoadBalancerFrontEndIPConfiguration();
        if (inner != null) {
            return  new FrontendIPConfigurationImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public VirtualMachineScaleSetNetworkInterfaceIPConfiguration destinationNetworkInterfaceIPConfiguration() {
        NetworkInterfaceIPConfigurationInner inner = this.inner().destinationNetworkInterfaceIPConfiguration();
        if (inner != null) {
            return  new VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Integer destinationPort() {
        return this.inner().destinationPort();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations() {
        List<NetworkInterfaceTapConfiguration> lst = new ArrayList<NetworkInterfaceTapConfiguration>();
        if (this.inner().networkInterfaceTapConfigurations() != null) {
            for (NetworkInterfaceTapConfigurationInner inner : this.inner().networkInterfaceTapConfigurations()) {
                lst.add( new NetworkInterfaceTapConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public VirtualNetworkTapImpl withDestinationLoadBalancerFrontEndIPConfiguration(FrontendIPConfigurationInner destinationLoadBalancerFrontEndIPConfiguration) {
        this.inner().withDestinationLoadBalancerFrontEndIPConfiguration(destinationLoadBalancerFrontEndIPConfiguration);
        return this;
    }

    @Override
    public VirtualNetworkTapImpl withDestinationNetworkInterfaceIPConfiguration(NetworkInterfaceIPConfigurationInner destinationNetworkInterfaceIPConfiguration) {
        this.inner().withDestinationNetworkInterfaceIPConfiguration(destinationNetworkInterfaceIPConfiguration);
        return this;
    }

    @Override
    public VirtualNetworkTapImpl withDestinationPort(Integer destinationPort) {
        this.inner().withDestinationPort(destinationPort);
        return this;
    }

    @Override
    public VirtualNetworkTapImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

}
