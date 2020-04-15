/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.PrivateDnsZoneGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.PrivateDnsZoneConfig;

class PrivateDnsZoneGroupImpl extends CreatableUpdatableImpl<PrivateDnsZoneGroup, PrivateDnsZoneGroupInner, PrivateDnsZoneGroupImpl> implements PrivateDnsZoneGroup, PrivateDnsZoneGroup.Definition, PrivateDnsZoneGroup.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String privateEndpointName;
    private String privateDnsZoneGroupName;

    PrivateDnsZoneGroupImpl(String name, NetworkManager manager) {
        super(name, new PrivateDnsZoneGroupInner());
        this.manager = manager;
        // Set resource name
        this.privateDnsZoneGroupName = name;
        //
    }

    PrivateDnsZoneGroupImpl(PrivateDnsZoneGroupInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.privateDnsZoneGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.privateEndpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateEndpoints");
        this.privateDnsZoneGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateDnsZoneGroups");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateDnsZoneGroup> createResourceAsync() {
        PrivateDnsZoneGroupsInner client = this.manager().inner().privateDnsZoneGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.privateEndpointName, this.privateDnsZoneGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateDnsZoneGroup> updateResourceAsync() {
        PrivateDnsZoneGroupsInner client = this.manager().inner().privateDnsZoneGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.privateEndpointName, this.privateDnsZoneGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateDnsZoneGroupInner> getInnerAsync() {
        PrivateDnsZoneGroupsInner client = this.manager().inner().privateDnsZoneGroups();
        return client.getAsync(this.resourceGroupName, this.privateEndpointName, this.privateDnsZoneGroupName);
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
    public List<PrivateDnsZoneConfig> privateDnsZoneConfigs() {
        return this.inner().privateDnsZoneConfigs();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PrivateDnsZoneGroupImpl withExistingPrivateEndpoint(String resourceGroupName, String privateEndpointName) {
        this.resourceGroupName = resourceGroupName;
        this.privateEndpointName = privateEndpointName;
        return this;
    }

    @Override
    public PrivateDnsZoneGroupImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public PrivateDnsZoneGroupImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public PrivateDnsZoneGroupImpl withPrivateDnsZoneConfigs(List<PrivateDnsZoneConfig> privateDnsZoneConfigs) {
        this.inner().withPrivateDnsZoneConfigs(privateDnsZoneConfigs);
        return this;
    }

}
