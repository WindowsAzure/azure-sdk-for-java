/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.NetworkMapping;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.UpdateNetworkMappingInputProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.CreateNetworkMappingInputProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.NetworkMappingProperties;
import rx.functions.Func1;

class NetworkMappingImpl extends CreatableUpdatableImpl<NetworkMapping, NetworkMappingInner, NetworkMappingImpl> implements NetworkMapping, NetworkMapping.Definition, NetworkMapping.Update {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String networkName;
    private String networkMappingName;
    private CreateNetworkMappingInputProperties cproperties;
    private UpdateNetworkMappingInputProperties uproperties;

    NetworkMappingImpl(String name, RecoveryServicesManager manager) {
        super(name, new NetworkMappingInner());
        this.manager = manager;
        // Set resource name
        this.networkMappingName = name;
        //
        this.cproperties = new CreateNetworkMappingInputProperties();
        this.uproperties = new UpdateNetworkMappingInputProperties();
    }

    NetworkMappingImpl(NetworkMappingInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.networkMappingName = inner.name();
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.networkName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationNetworks");
        this.networkMappingName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationNetworkMappings");
        //
        this.cproperties = new CreateNetworkMappingInputProperties();
        this.uproperties = new UpdateNetworkMappingInputProperties();
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NetworkMapping> createResourceAsync() {
        ReplicationNetworkMappingsInner client = this.manager().inner().replicationNetworkMappings();
        return client.createAsync(this.fabricName, this.networkName, this.networkMappingName, this.cproperties)
            .map(new Func1<NetworkMappingInner, NetworkMappingInner>() {
               @Override
               public NetworkMappingInner call(NetworkMappingInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkMapping> updateResourceAsync() {
        ReplicationNetworkMappingsInner client = this.manager().inner().replicationNetworkMappings();
        return client.updateAsync(this.fabricName, this.networkName, this.networkMappingName, this.uproperties)
            .map(new Func1<NetworkMappingInner, NetworkMappingInner>() {
               @Override
               public NetworkMappingInner call(NetworkMappingInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkMappingInner> getInnerAsync() {
        ReplicationNetworkMappingsInner client = this.manager().inner().replicationNetworkMappings();
        return client.getAsync(this.fabricName, this.networkName, this.networkMappingName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new CreateNetworkMappingInputProperties();
        this.uproperties = new UpdateNetworkMappingInputProperties();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkMappingProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public NetworkMappingImpl withExistingReplicationNetwork(String fabricName, String networkName) {
        this.fabricName = fabricName;
        this.networkName = networkName;
        return this;
    }

    @Override
    public NetworkMappingImpl withProperties(CreateNetworkMappingInputProperties properties) {
        this.cproperties = properties;
        return this;
    }

    @Override
    public NetworkMappingImpl withProperties(UpdateNetworkMappingInputProperties properties) {
        this.uproperties = properties;
        return this;
    }

}
