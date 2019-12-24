/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ProtectionContainer;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.CreateProtectionContainerInputProperties;
import java.util.List;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ProtectionContainerProperties;
import rx.functions.Func1;

class ProtectionContainerImpl extends CreatableUpdatableImpl<ProtectionContainer, ProtectionContainerInner, ProtectionContainerImpl> implements ProtectionContainer, ProtectionContainer.Definition, ProtectionContainer.Update {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String protectionContainerName;
    private CreateProtectionContainerInputProperties cproperties;
    private CreateProtectionContainerInputProperties uproperties;

    ProtectionContainerImpl(String name, RecoveryServicesManager manager) {
        super(name, new ProtectionContainerInner());
        this.manager = manager;
        // Set resource name
        this.protectionContainerName = name;
        //
        this.cproperties = new CreateProtectionContainerInputProperties();
        this.uproperties = new CreateProtectionContainerInputProperties();
    }

    ProtectionContainerImpl(ProtectionContainerInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.protectionContainerName = inner.name();
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.protectionContainerName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectionContainers");
        //
        this.cproperties = new CreateProtectionContainerInputProperties();
        this.uproperties = new CreateProtectionContainerInputProperties();
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ProtectionContainer> createResourceAsync() {
        ReplicationProtectionContainersInner client = this.manager().inner().replicationProtectionContainers();
        return client.createAsync(this.fabricName, this.protectionContainerName, this.cproperties)
            .map(new Func1<ProtectionContainerInner, ProtectionContainerInner>() {
               @Override
               public ProtectionContainerInner call(ProtectionContainerInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ProtectionContainer> updateResourceAsync() {
        ReplicationProtectionContainersInner client = this.manager().inner().replicationProtectionContainers();
        return client.createAsync(this.fabricName, this.protectionContainerName, this.uproperties)
            .map(new Func1<ProtectionContainerInner, ProtectionContainerInner>() {
               @Override
               public ProtectionContainerInner call(ProtectionContainerInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ProtectionContainerInner> getInnerAsync() {
        ReplicationProtectionContainersInner client = this.manager().inner().replicationProtectionContainers();
        return client.getAsync(this.fabricName, this.protectionContainerName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new CreateProtectionContainerInputProperties();
        this.uproperties = new CreateProtectionContainerInputProperties();
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
    public ProtectionContainerProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ProtectionContainerImpl withExistingReplicationFabric(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    @Override
    public ProtectionContainerImpl withProperties(CreateProtectionContainerInputProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
