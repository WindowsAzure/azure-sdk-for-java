/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_04_01.PrivateLinkService;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_04_01.PrivateLinkServiceIpConfiguration;
import com.microsoft.azure.management.network.v2019_04_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_04_01.PrivateLinkServicePropertiesVisibility;
import com.microsoft.azure.management.network.v2019_04_01.PrivateLinkServicePropertiesAutoApproval;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_04_01.FrontendIPConfiguration;
import com.microsoft.azure.management.network.v2019_04_01.NetworkInterface;
import com.microsoft.azure.management.network.v2019_04_01.PrivateEndpointConnection;

class PrivateLinkServiceImpl extends GroupableResourceCoreImpl<PrivateLinkService, PrivateLinkServiceInner, PrivateLinkServiceImpl, NetworkManager> implements PrivateLinkService, PrivateLinkService.Definition, PrivateLinkService.Update {
    PrivateLinkServiceImpl(String name, PrivateLinkServiceInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PrivateLinkService> createResourceAsync() {
        PrivateLinkServicesInner client = this.manager().inner().privateLinkServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateLinkService> updateResourceAsync() {
        PrivateLinkServicesInner client = this.manager().inner().privateLinkServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateLinkServiceInner> getInnerAsync() {
        PrivateLinkServicesInner client = this.manager().inner().privateLinkServices();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String alias() {
        return this.inner().alias();
    }

    @Override
    public PrivateLinkServicePropertiesAutoApproval autoApproval() {
        return this.inner().autoApproval();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<String> fqdns() {
        return this.inner().fqdns();
    }

    @Override
    public List<PrivateLinkServiceIpConfiguration> ipConfigurations() {
        return this.inner().ipConfigurations();
    }

    @Override
    public List<FrontendIPConfiguration> loadBalancerFrontendIpConfigurations() {
        List<FrontendIPConfiguration> lst = new ArrayList<FrontendIPConfiguration>();
        if (this.inner().loadBalancerFrontendIpConfigurations() != null) {
            for (FrontendIPConfigurationInner inner : this.inner().loadBalancerFrontendIpConfigurations()) {
                lst.add( new FrontendIPConfigurationImpl(inner, manager()));
            }
        }
        return lst;
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
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnection> lst = new ArrayList<PrivateEndpointConnection>();
        if (this.inner().privateEndpointConnections() != null) {
            for (PrivateEndpointConnectionInner inner : this.inner().privateEndpointConnections()) {
                lst.add( new PrivateEndpointConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PrivateLinkServicePropertiesVisibility visibility() {
        return this.inner().visibility();
    }

    @Override
    public PrivateLinkServiceImpl withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval) {
        this.inner().withAutoApproval(autoApproval);
        return this;
    }

    @Override
    public PrivateLinkServiceImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public PrivateLinkServiceImpl withFqdns(List<String> fqdns) {
        this.inner().withFqdns(fqdns);
        return this;
    }

    @Override
    public PrivateLinkServiceImpl withIpConfigurations(List<PrivateLinkServiceIpConfiguration> ipConfigurations) {
        this.inner().withIpConfigurations(ipConfigurations);
        return this;
    }

    @Override
    public PrivateLinkServiceImpl withLoadBalancerFrontendIpConfigurations(List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations) {
        this.inner().withLoadBalancerFrontendIpConfigurations(loadBalancerFrontendIpConfigurations);
        return this;
    }

    @Override
    public PrivateLinkServiceImpl withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.inner().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    @Override
    public PrivateLinkServiceImpl withVisibility(PrivateLinkServicePropertiesVisibility visibility) {
        this.inner().withVisibility(visibility);
        return this;
    }

}
