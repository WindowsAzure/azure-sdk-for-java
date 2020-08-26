/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Fabric;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.FabricCreationInputProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.FabricProperties;
import rx.functions.Func1;

class FabricImpl extends CreatableUpdatableImpl<Fabric, FabricInner, FabricImpl> implements Fabric, Fabric.Definition, Fabric.Update {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private FabricCreationInputProperties cproperties;
    private FabricCreationInputProperties uproperties;

    FabricImpl(String name, RecoveryServicesManager manager) {
        super(name, new FabricInner());
        this.manager = manager;
        // Set resource name
        this.fabricName = name;
        //
        this.cproperties = new FabricCreationInputProperties();
        this.uproperties = new FabricCreationInputProperties();
    }

    FabricImpl(FabricInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.fabricName = inner.name();
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        //
        this.cproperties = new FabricCreationInputProperties();
        this.uproperties = new FabricCreationInputProperties();
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Fabric> createResourceAsync() {
        ReplicationFabricsInner client = this.manager().inner().replicationFabrics();
        return client.createAsync(this.fabricName, this.cproperties)
            .map(new Func1<FabricInner, FabricInner>() {
               @Override
               public FabricInner call(FabricInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Fabric> updateResourceAsync() {
        ReplicationFabricsInner client = this.manager().inner().replicationFabrics();
        return client.createAsync(this.fabricName, this.uproperties)
            .map(new Func1<FabricInner, FabricInner>() {
               @Override
               public FabricInner call(FabricInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FabricInner> getInnerAsync() {
        ReplicationFabricsInner client = this.manager().inner().replicationFabrics();
        return client.getAsync(this.fabricName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new FabricCreationInputProperties();
        this.uproperties = new FabricCreationInputProperties();
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
    public FabricProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FabricImpl withExistingVault() {
        return this;
    }

    @Override
    public FabricImpl withProperties(FabricCreationInputProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
