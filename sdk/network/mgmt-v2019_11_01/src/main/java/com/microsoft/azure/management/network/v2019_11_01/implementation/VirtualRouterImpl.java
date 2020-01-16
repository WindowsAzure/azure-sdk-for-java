/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_11_01.VirtualRouter;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;

class VirtualRouterImpl extends GroupableResourceCoreImpl<VirtualRouter, VirtualRouterInner, VirtualRouterImpl, NetworkManager> implements VirtualRouter, VirtualRouter.Definition, VirtualRouter.Update {
    VirtualRouterImpl(String name, VirtualRouterInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualRouter> createResourceAsync() {
        VirtualRoutersInner client = this.manager().inner().virtualRouters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualRouter> updateResourceAsync() {
        VirtualRoutersInner client = this.manager().inner().virtualRouters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualRouterInner> getInnerAsync() {
        VirtualRoutersInner client = this.manager().inner().virtualRouters();
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
    public SubResource hostedGateway() {
        return this.inner().hostedGateway();
    }

    @Override
    public SubResource hostedSubnet() {
        return this.inner().hostedSubnet();
    }

    @Override
    public List<SubResource> peerings() {
        return this.inner().peerings();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Long virtualRouterAsn() {
        return this.inner().virtualRouterAsn();
    }

    @Override
    public List<String> virtualRouterIps() {
        return this.inner().virtualRouterIps();
    }

    @Override
    public VirtualRouterImpl withHostedGateway(SubResource hostedGateway) {
        this.inner().withHostedGateway(hostedGateway);
        return this;
    }

    @Override
    public VirtualRouterImpl withHostedSubnet(SubResource hostedSubnet) {
        this.inner().withHostedSubnet(hostedSubnet);
        return this;
    }

    @Override
    public VirtualRouterImpl withVirtualRouterAsn(Long virtualRouterAsn) {
        this.inner().withVirtualRouterAsn(virtualRouterAsn);
        return this;
    }

    @Override
    public VirtualRouterImpl withVirtualRouterIps(List<String> virtualRouterIps) {
        this.inner().withVirtualRouterIps(virtualRouterIps);
        return this;
    }

}
