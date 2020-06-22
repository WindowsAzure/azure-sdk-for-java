/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.VirtualHubRouteTableV2;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.VirtualHubRouteV2;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;

class VirtualHubRouteTableV2Impl extends CreatableUpdatableImpl<VirtualHubRouteTableV2, VirtualHubRouteTableV2Inner, VirtualHubRouteTableV2Impl> implements VirtualHubRouteTableV2, VirtualHubRouteTableV2.Definition, VirtualHubRouteTableV2.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualHubName;
    private String routeTableName;

    VirtualHubRouteTableV2Impl(String name, NetworkManager manager) {
        super(name, new VirtualHubRouteTableV2Inner());
        this.manager = manager;
        // Set resource name
        this.routeTableName = name;
        //
    }

    VirtualHubRouteTableV2Impl(VirtualHubRouteTableV2Inner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.routeTableName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualHubs");
        this.routeTableName = IdParsingUtils.getValueFromIdByName(inner.id(), "routeTables");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualHubRouteTableV2> createResourceAsync() {
        VirtualHubRouteTableV2sInner client = this.manager().inner().virtualHubRouteTableV2s();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.routeTableName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualHubRouteTableV2> updateResourceAsync() {
        VirtualHubRouteTableV2sInner client = this.manager().inner().virtualHubRouteTableV2s();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.routeTableName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualHubRouteTableV2Inner> getInnerAsync() {
        VirtualHubRouteTableV2sInner client = this.manager().inner().virtualHubRouteTableV2s();
        return client.getAsync(this.resourceGroupName, this.virtualHubName, this.routeTableName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> attachedConnections() {
        return this.inner().attachedConnections();
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<VirtualHubRouteV2> routes() {
        return this.inner().routes();
    }

    @Override
    public VirtualHubRouteTableV2Impl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    @Override
    public VirtualHubRouteTableV2Impl withAttachedConnections(List<String> attachedConnections) {
        this.inner().withAttachedConnections(attachedConnections);
        return this;
    }

    @Override
    public VirtualHubRouteTableV2Impl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public VirtualHubRouteTableV2Impl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public VirtualHubRouteTableV2Impl withRoutes(List<VirtualHubRouteV2> routes) {
        this.inner().withRoutes(routes);
        return this;
    }

}
