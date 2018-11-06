/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.management.network.v2018_08_01.NetworkInterfaceTapConfiguration;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_08_01.VirtualNetworkTap;

class NetworkInterfaceTapConfigurationImpl extends CreatableUpdatableImpl<NetworkInterfaceTapConfiguration, NetworkInterfaceTapConfigurationInner, NetworkInterfaceTapConfigurationImpl> implements NetworkInterfaceTapConfiguration, NetworkInterfaceTapConfiguration.Definition, NetworkInterfaceTapConfiguration.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String networkInterfaceName;
    private String tapConfigurationName;

    NetworkInterfaceTapConfigurationImpl(String name, NetworkManager manager) {
        super(name, new NetworkInterfaceTapConfigurationInner());
        this.manager = manager;
        // Set resource name
        this.tapConfigurationName = name;
        //
    }

    NetworkInterfaceTapConfigurationImpl(NetworkInterfaceTapConfigurationInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.tapConfigurationName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.networkInterfaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkInterfaces");
        this.tapConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "tapConfigurations");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NetworkInterfaceTapConfiguration> createResourceAsync() {
        NetworkInterfaceTapConfigurationsInner client = this.manager().inner().networkInterfaceTapConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkInterfaceName, this.tapConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkInterfaceTapConfiguration> updateResourceAsync() {
        NetworkInterfaceTapConfigurationsInner client = this.manager().inner().networkInterfaceTapConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkInterfaceName, this.tapConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkInterfaceTapConfigurationInner> getInnerAsync() {
        NetworkInterfaceTapConfigurationsInner client = this.manager().inner().networkInterfaceTapConfigurations();
        return client.getAsync(this.resourceGroupName, this.networkInterfaceName, this.tapConfigurationName);
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
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VirtualNetworkTap virtualNetworkTap() {
        VirtualNetworkTapInner inner = this.inner().virtualNetworkTap();
        if (inner != null) {
            return  new VirtualNetworkTapImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public NetworkInterfaceTapConfigurationImpl withExistingNetworkInterface(String resourceGroupName, String networkInterfaceName) {
        this.resourceGroupName = resourceGroupName;
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }

    @Override
    public NetworkInterfaceTapConfigurationImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public NetworkInterfaceTapConfigurationImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public NetworkInterfaceTapConfigurationImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public NetworkInterfaceTapConfigurationImpl withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap) {
        this.inner().withVirtualNetworkTap(virtualNetworkTap);
        return this;
    }

}
