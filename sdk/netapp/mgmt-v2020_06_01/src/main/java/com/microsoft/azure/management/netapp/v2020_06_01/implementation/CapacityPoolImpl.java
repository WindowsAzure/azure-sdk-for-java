/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01.implementation;

import com.microsoft.azure.management.netapp.v2020_06_01.CapacityPool;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_06_01.CapacityPoolPatch;
import com.microsoft.azure.management.netapp.v2020_06_01.ServiceLevel;
import com.microsoft.azure.management.netapp.v2020_06_01.QosType;
import java.util.Map;
import rx.functions.Func1;

class CapacityPoolImpl extends CreatableUpdatableImpl<CapacityPool, CapacityPoolInner, CapacityPoolImpl> implements CapacityPool, CapacityPool.Definition, CapacityPool.Update {
    private final NetAppManager manager;
    private String resourceGroupName;
    private String accountName;
    private String poolName;
    private CapacityPoolPatch updateParameter;

    CapacityPoolImpl(String name, NetAppManager manager) {
        super(name, new CapacityPoolInner());
        this.manager = manager;
        // Set resource name
        this.poolName = name;
        //
        this.updateParameter = new CapacityPoolPatch();
    }

    CapacityPoolImpl(CapacityPoolInner inner, NetAppManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.poolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "netAppAccounts");
        this.poolName = IdParsingUtils.getValueFromIdByName(inner.id(), "capacityPools");
        //
        this.updateParameter = new CapacityPoolPatch();
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CapacityPool> createResourceAsync() {
        PoolsInner client = this.manager().inner().pools();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.poolName, this.inner())
            .map(new Func1<CapacityPoolInner, CapacityPoolInner>() {
               @Override
               public CapacityPoolInner call(CapacityPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CapacityPool> updateResourceAsync() {
        PoolsInner client = this.manager().inner().pools();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.poolName, this.updateParameter)
            .map(new Func1<CapacityPoolInner, CapacityPoolInner>() {
               @Override
               public CapacityPoolInner call(CapacityPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CapacityPoolInner> getInnerAsync() {
        PoolsInner client = this.manager().inner().pools();
        return client.getAsync(this.resourceGroupName, this.accountName, this.poolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new CapacityPoolPatch();
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
    public String poolId() {
        return this.inner().poolId();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public QosType qosType() {
        return this.inner().qosType();
    }

    @Override
    public ServiceLevel serviceLevel() {
        return this.inner().serviceLevel();
    }

    @Override
    public long size() {
        return this.inner().size();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public Double totalThroughputMibps() {
        return this.inner().totalThroughputMibps();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Double utilizedThroughputMibps() {
        return this.inner().utilizedThroughputMibps();
    }

    @Override
    public CapacityPoolImpl withExistingNetAppAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public CapacityPoolImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public CapacityPoolImpl withServiceLevel(ServiceLevel serviceLevel) {
        this.inner().withServiceLevel(serviceLevel);
        return this;
    }

    @Override
    public CapacityPoolImpl withSize(long size) {
        this.inner().withSize(size);
        return this;
    }

    @Override
    public CapacityPoolImpl withSize(Long size) {
        this.updateParameter.withSize(size);
        return this;
    }

    @Override
    public CapacityPoolImpl withQosType(QosType qosType) {
        if (isInCreateMode()) {
            this.inner().withQosType(qosType);
        } else {
            this.updateParameter.withQosType(qosType);
        }
        return this;
    }

    @Override
    public CapacityPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
