/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.HubRouteTable;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.HubRoute;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;

class HubRouteTableImpl extends CreatableUpdatableImpl<HubRouteTable, HubRouteTableInner, HubRouteTableImpl> implements HubRouteTable, HubRouteTable.Definition, HubRouteTable.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualHubName;
    private String routeTableName;

    HubRouteTableImpl(String name, NetworkManager manager) {
        super(name, new HubRouteTableInner());
        this.manager = manager;
        // Set resource name
        this.routeTableName = name;
        //
    }

    HubRouteTableImpl(HubRouteTableInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.routeTableName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualHubs");
        this.routeTableName = IdParsingUtils.getValueFromIdByName(inner.id(), "hubRouteTables");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<HubRouteTable> createResourceAsync() {
        HubRouteTablesInner client = this.manager().inner().hubRouteTables();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.routeTableName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<HubRouteTable> updateResourceAsync() {
        HubRouteTablesInner client = this.manager().inner().hubRouteTables();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.routeTableName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<HubRouteTableInner> getInnerAsync() {
        HubRouteTablesInner client = this.manager().inner().hubRouteTables();
        return client.getAsync(this.resourceGroupName, this.virtualHubName, this.routeTableName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> associatedConnections() {
        return this.inner().associatedConnections();
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
    public List<String> labels() {
        return this.inner().labels();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<String> propagatingConnections() {
        return this.inner().propagatingConnections();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<HubRoute> routes() {
        return this.inner().routes();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public HubRouteTableImpl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    @Override
    public HubRouteTableImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public HubRouteTableImpl withLabels(List<String> labels) {
        this.inner().withLabels(labels);
        return this;
    }

    @Override
    public HubRouteTableImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public HubRouteTableImpl withRoutes(List<HubRoute> routes) {
        this.inner().withRoutes(routes);
        return this;
    }

}
