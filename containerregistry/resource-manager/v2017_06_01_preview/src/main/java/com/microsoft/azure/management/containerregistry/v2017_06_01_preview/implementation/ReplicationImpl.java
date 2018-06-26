/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.Replication;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.Status;

class ReplicationImpl extends CreatableUpdatableImpl<Replication, ReplicationInner, ReplicationImpl> implements Replication, Replication.Definition, Replication.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String replicationName;

    ReplicationImpl(String name, ContainerRegistryManager manager) {
        super(name, new ReplicationInner());
        this.manager = manager;
        // Set resource name
        this.replicationName = name;
        //
    }

    ReplicationImpl(ReplicationInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.replicationName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.replicationName = IdParsingUtils.getValueFromIdByName(inner.id(), "replications");
        //
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Replication> createResourceAsync() {
        ReplicationsInner client = this.manager().inner().replications();
        return client.createAsync(this.resourceGroupName, this.registryName, this.replicationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Replication> updateResourceAsync() {
        ReplicationsInner client = this.manager().inner().replications();
        return client.createAsync(this.resourceGroupName, this.registryName, this.replicationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ReplicationInner> getInnerAsync() {
        ReplicationsInner client = this.manager().inner().replications();
        return client.getAsync(this.resourceGroupName, this.registryName, this.replicationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Status status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ReplicationImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public ReplicationImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ReplicationImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
