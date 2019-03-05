/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.ProtectionContainerMapping;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.CreateProtectionContainerMappingInputProperties;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.ProtectionContainerMappingProperties;
import rx.functions.Func1;

class ProtectionContainerMappingImpl extends CreatableUpdatableImpl<ProtectionContainerMapping, ProtectionContainerMappingInner, ProtectionContainerMappingImpl> implements ProtectionContainerMapping, ProtectionContainerMapping.Definition, ProtectionContainerMapping.Update {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String protectionContainerName;
    private String mappingName;
    private CreateProtectionContainerMappingInputProperties cproperties;
    private CreateProtectionContainerMappingInputProperties uproperties;

    ProtectionContainerMappingImpl(String name, RecoveryServicesManager manager) {
        super(name, new ProtectionContainerMappingInner());
        this.manager = manager;
        // Set resource name
        this.mappingName = name;
        //
        this.cproperties = new CreateProtectionContainerMappingInputProperties();
        this.uproperties = new CreateProtectionContainerMappingInputProperties();
    }

    ProtectionContainerMappingImpl(ProtectionContainerMappingInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.mappingName = inner.name();
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.protectionContainerName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectionContainers");
        this.mappingName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectionContainerMappings");
        //
        this.cproperties = new CreateProtectionContainerMappingInputProperties();
        this.uproperties = new CreateProtectionContainerMappingInputProperties();
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ProtectionContainerMapping> createResourceAsync() {
        ReplicationProtectionContainerMappingsInner client = this.manager().inner().replicationProtectionContainerMappings();
        return client.createAsync(this.fabricName, this.protectionContainerName, this.mappingName, this.cproperties)
            .map(new Func1<ProtectionContainerMappingInner, ProtectionContainerMappingInner>() {
               @Override
               public ProtectionContainerMappingInner call(ProtectionContainerMappingInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ProtectionContainerMapping> updateResourceAsync() {
        ReplicationProtectionContainerMappingsInner client = this.manager().inner().replicationProtectionContainerMappings();
        return client.createAsync(this.fabricName, this.protectionContainerName, this.mappingName, this.uproperties)
            .map(new Func1<ProtectionContainerMappingInner, ProtectionContainerMappingInner>() {
               @Override
               public ProtectionContainerMappingInner call(ProtectionContainerMappingInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ProtectionContainerMappingInner> getInnerAsync() {
        ReplicationProtectionContainerMappingsInner client = this.manager().inner().replicationProtectionContainerMappings();
        return client.getAsync(this.fabricName, this.protectionContainerName, this.mappingName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new CreateProtectionContainerMappingInputProperties();
        this.uproperties = new CreateProtectionContainerMappingInputProperties();
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
    public ProtectionContainerMappingProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ProtectionContainerMappingImpl withExistingReplicationProtectionContainer(String fabricName, String protectionContainerName) {
        this.fabricName = fabricName;
        this.protectionContainerName = protectionContainerName;
        return this;
    }

    @Override
    public ProtectionContainerMappingImpl withProperties(CreateProtectionContainerMappingInputProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
