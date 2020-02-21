/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_11_01.PrivateEndpoint;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_11_01.PrivateLinkServiceConnection;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_11_01.NetworkInterface;
import com.microsoft.azure.management.network.v2019_11_01.Subnet;

class PrivateEndpointImpl extends GroupableResourceCoreImpl<PrivateEndpoint, PrivateEndpointInner, PrivateEndpointImpl, NetworkManager> implements PrivateEndpoint, PrivateEndpoint.Definition, PrivateEndpoint.Update {
    PrivateEndpointImpl(String name, PrivateEndpointInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PrivateEndpoint> createResourceAsync() {
        PrivateEndpointsInner client = this.manager().inner().privateEndpoints();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateEndpoint> updateResourceAsync() {
        PrivateEndpointsInner client = this.manager().inner().privateEndpoints();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateEndpointInner> getInnerAsync() {
        PrivateEndpointsInner client = this.manager().inner().privateEndpoints();
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
    public List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections() {
        return this.inner().manualPrivateLinkServiceConnections();
    }

    @Override
    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterface> lst = new ArrayList<NetworkInterface>();
        if (this.inner().networkInterfaces() != null) {
            for (NetworkInterfaceInner inner : this.inner().networkInterfaces()) {
                lst.add( new NetworkInterfaceImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<PrivateLinkServiceConnection> privateLinkServiceConnections() {
        return this.inner().privateLinkServiceConnections();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Subnet subnet() {
        SubnetInner inner = this.inner().subnet();
        if (inner != null) {
            return  new SubnetImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public PrivateEndpointImpl withManualPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections) {
        this.inner().withManualPrivateLinkServiceConnections(manualPrivateLinkServiceConnections);
        return this;
    }

    @Override
    public PrivateEndpointImpl withPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> privateLinkServiceConnections) {
        this.inner().withPrivateLinkServiceConnections(privateLinkServiceConnections);
        return this;
    }

    @Override
    public PrivateEndpointImpl withSubnet(SubnetInner subnet) {
        this.inner().withSubnet(subnet);
        return this;
    }

}
