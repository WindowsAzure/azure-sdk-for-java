/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.VirtualNetwork;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.AddressSpace;
import com.microsoft.azure.management.network.v2020_03_01.DhcpOptions;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.VirtualNetworkBgpCommunities;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_03_01.Subnet;
import com.microsoft.azure.management.network.v2020_03_01.VirtualNetworkPeering;

class VirtualNetworkImpl extends GroupableResourceCoreImpl<VirtualNetwork, VirtualNetworkInner, VirtualNetworkImpl, NetworkManager> implements VirtualNetwork, VirtualNetwork.Definition, VirtualNetwork.Update {
    VirtualNetworkImpl(String name, VirtualNetworkInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualNetwork> createResourceAsync() {
        VirtualNetworksInner client = this.manager().inner().virtualNetworks();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetwork> updateResourceAsync() {
        VirtualNetworksInner client = this.manager().inner().virtualNetworks();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkInner> getInnerAsync() {
        VirtualNetworksInner client = this.manager().inner().virtualNetworks();
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
    public VirtualNetworkBgpCommunities bgpCommunities() {
        return this.inner().bgpCommunities();
    }

    @Override
    public SubResource ddosProtectionPlan() {
        return this.inner().ddosProtectionPlan();
    }

    @Override
    public DhcpOptions dhcpOptions() {
        return this.inner().dhcpOptions();
    }

    @Override
    public Boolean enableDdosProtection() {
        return this.inner().enableDdosProtection();
    }

    @Override
    public Boolean enableVmProtection() {
        return this.inner().enableVmProtection();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<SubResource> ipAllocations() {
        return this.inner().ipAllocations();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
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
    public List<VirtualNetworkPeering> virtualNetworkPeerings() {
        List<VirtualNetworkPeering> lst = new ArrayList<VirtualNetworkPeering>();
        if (this.inner().virtualNetworkPeerings() != null) {
            for (VirtualNetworkPeeringInner inner : this.inner().virtualNetworkPeerings()) {
                lst.add( new VirtualNetworkPeeringImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public VirtualNetworkImpl withAddressSpace(AddressSpace addressSpace) {
        this.inner().withAddressSpace(addressSpace);
        return this;
    }

    @Override
    public VirtualNetworkImpl withBgpCommunities(VirtualNetworkBgpCommunities bgpCommunities) {
        this.inner().withBgpCommunities(bgpCommunities);
        return this;
    }

    @Override
    public VirtualNetworkImpl withDdosProtectionPlan(SubResource ddosProtectionPlan) {
        this.inner().withDdosProtectionPlan(ddosProtectionPlan);
        return this;
    }

    @Override
    public VirtualNetworkImpl withDhcpOptions(DhcpOptions dhcpOptions) {
        this.inner().withDhcpOptions(dhcpOptions);
        return this;
    }

    @Override
    public VirtualNetworkImpl withEnableDdosProtection(Boolean enableDdosProtection) {
        this.inner().withEnableDdosProtection(enableDdosProtection);
        return this;
    }

    @Override
    public VirtualNetworkImpl withEnableVmProtection(Boolean enableVmProtection) {
        this.inner().withEnableVmProtection(enableVmProtection);
        return this;
    }

    @Override
    public VirtualNetworkImpl withIpAllocations(List<SubResource> ipAllocations) {
        this.inner().withIpAllocations(ipAllocations);
        return this;
    }

    @Override
    public VirtualNetworkImpl withSubnets(List<SubnetInner> subnets) {
        this.inner().withSubnets(subnets);
        return this;
    }

    @Override
    public VirtualNetworkImpl withVirtualNetworkPeerings(List<VirtualNetworkPeeringInner> virtualNetworkPeerings) {
        this.inner().withVirtualNetworkPeerings(virtualNetworkPeerings);
        return this;
    }

}
