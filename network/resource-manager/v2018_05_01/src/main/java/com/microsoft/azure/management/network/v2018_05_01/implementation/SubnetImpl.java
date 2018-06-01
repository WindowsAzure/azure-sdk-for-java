/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.Subnet;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.ServiceEndpointPropertiesFormat;
import com.microsoft.azure.management.network.v2018_05_01.IPConfiguration;
import com.microsoft.azure.management.network.v2018_05_01.ResourceNavigationLink;
import com.microsoft.azure.management.network.v2018_05_01.NetworkSecurityGroup;
import com.microsoft.azure.management.network.v2018_05_01.RouteTable;

class SubnetImpl extends CreatableUpdatableImpl<Subnet, SubnetInner, SubnetImpl> implements Subnet, Subnet.Definition, Subnet.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualNetworkName;
    private String subnetName;

    SubnetImpl(String name, NetworkManager manager) {
        super(name, new SubnetInner());
        this.manager = manager;
        // Set resource name
        this.subnetName = name;
        //
    }

    SubnetImpl(SubnetInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.subnetName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualNetworkName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworks");
        this.subnetName = IdParsingUtils.getValueFromIdByName(inner.id(), "subnets");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Subnet> createResourceAsync() {
        SubnetsInner client = this.manager().inner().subnets();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualNetworkName, this.subnetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Subnet> updateResourceAsync() {
        SubnetsInner client = this.manager().inner().subnets();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualNetworkName, this.subnetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SubnetInner> getInnerAsync() {
        SubnetsInner client = this.manager().inner().subnets();
        return client.getAsync(this.resourceGroupName, this.virtualNetworkName, this.subnetName);
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
    public List<IPConfiguration> ipConfigurations() {
        return this.inner().ipConfigurations();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkSecurityGroup networkSecurityGroup() {
        NetworkSecurityGroupInner inner = this.inner().networkSecurityGroup();
        if (inner != null) {
            return  new NetworkSecurityGroupImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<ResourceNavigationLink> resourceNavigationLinks() {
        return this.inner().resourceNavigationLinks();
    }

    @Override
    public RouteTable routeTable() {
        RouteTableInner inner = this.inner().routeTable();
        if (inner != null) {
            return  new RouteTableImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        return this.inner().serviceEndpoints();
    }

    @Override
    public SubnetImpl withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualNetworkName = virtualNetworkName;
        return this;
    }

    @Override
    public SubnetImpl withAddressPrefix(String addressPrefix) {
        this.inner().withAddressPrefix(addressPrefix);
        return this;
    }

    @Override
    public SubnetImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public SubnetImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public SubnetImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public SubnetImpl withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.inner().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    @Override
    public SubnetImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public SubnetImpl withResourceNavigationLinks(List<ResourceNavigationLink> resourceNavigationLinks) {
        this.inner().withResourceNavigationLinks(resourceNavigationLinks);
        return this;
    }

    @Override
    public SubnetImpl withRouteTable(RouteTableInner routeTable) {
        this.inner().withRouteTable(routeTable);
        return this;
    }

    @Override
    public SubnetImpl withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints) {
        this.inner().withServiceEndpoints(serviceEndpoints);
        return this;
    }

}
