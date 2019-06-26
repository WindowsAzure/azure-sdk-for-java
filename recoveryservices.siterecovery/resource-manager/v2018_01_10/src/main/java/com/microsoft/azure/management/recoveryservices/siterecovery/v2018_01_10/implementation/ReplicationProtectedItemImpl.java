/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationProtectedItem;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.UpdateReplicationProtectedItemInputProperties;
import java.util.List;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.EnableProtectionInputProperties;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationProtectedItemProperties;
import rx.functions.Func1;

class ReplicationProtectedItemImpl extends CreatableUpdatableImpl<ReplicationProtectedItem, ReplicationProtectedItemInner, ReplicationProtectedItemImpl> implements ReplicationProtectedItem, ReplicationProtectedItem.Definition, ReplicationProtectedItem.Update {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String protectionContainerName;
    private String replicatedProtectedItemName;
    private EnableProtectionInputProperties cproperties;
    private UpdateReplicationProtectedItemInputProperties uproperties;

    ReplicationProtectedItemImpl(String name, RecoveryServicesManager manager) {
        super(name, new ReplicationProtectedItemInner());
        this.manager = manager;
        // Set resource name
        this.replicatedProtectedItemName = name;
        //
        this.cproperties = new EnableProtectionInputProperties();
        this.uproperties = new UpdateReplicationProtectedItemInputProperties();
    }

    ReplicationProtectedItemImpl(ReplicationProtectedItemInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.replicatedProtectedItemName = inner.name();
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.protectionContainerName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectionContainers");
        this.replicatedProtectedItemName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectedItems");
        //
        this.cproperties = new EnableProtectionInputProperties();
        this.uproperties = new UpdateReplicationProtectedItemInputProperties();
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ReplicationProtectedItem> createResourceAsync() {
        ReplicationProtectedItemsInner client = this.manager().inner().replicationProtectedItems();
        return client.createAsync(this.fabricName, this.protectionContainerName, this.replicatedProtectedItemName, this.cproperties)
            .map(new Func1<ReplicationProtectedItemInner, ReplicationProtectedItemInner>() {
               @Override
               public ReplicationProtectedItemInner call(ReplicationProtectedItemInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ReplicationProtectedItem> updateResourceAsync() {
        ReplicationProtectedItemsInner client = this.manager().inner().replicationProtectedItems();
        return client.updateAsync(this.fabricName, this.protectionContainerName, this.replicatedProtectedItemName, this.uproperties)
            .map(new Func1<ReplicationProtectedItemInner, ReplicationProtectedItemInner>() {
               @Override
               public ReplicationProtectedItemInner call(ReplicationProtectedItemInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ReplicationProtectedItemInner> getInnerAsync() {
        ReplicationProtectedItemsInner client = this.manager().inner().replicationProtectedItems();
        return client.getAsync(this.fabricName, this.protectionContainerName, this.replicatedProtectedItemName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new EnableProtectionInputProperties();
        this.uproperties = new UpdateReplicationProtectedItemInputProperties();
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
    public ReplicationProtectedItemProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ReplicationProtectedItemImpl withExistingReplicationProtectionContainer(String fabricName, String protectionContainerName) {
        this.fabricName = fabricName;
        this.protectionContainerName = protectionContainerName;
        return this;
    }

    @Override
    public ReplicationProtectedItemImpl withProperties(EnableProtectionInputProperties properties) {
        this.cproperties = properties;
        return this;
    }

    @Override
    public ReplicationProtectedItemImpl withProperties(UpdateReplicationProtectedItemInputProperties properties) {
        this.uproperties = properties;
        return this;
    }

}
