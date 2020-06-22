/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview.implementation;

import com.microsoft.azure.management.avs.v2019_08_09_preview.Cluster;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.avs.v2019_08_09_preview.ClusterProperties;
import java.util.List;
import rx.functions.Func1;

class ClusterImpl extends CreatableUpdatableImpl<Cluster, ClusterInner, ClusterImpl> implements Cluster, Cluster.Definition, Cluster.Update {
    private final AVSManager manager;
    private String resourceGroupName;
    private String privateCloudName;
    private String clusterName;
    private ClusterProperties cproperties;
    private ClusterProperties uproperties;

    ClusterImpl(String name, AVSManager manager) {
        super(name, new ClusterInner());
        this.manager = manager;
        // Set resource name
        this.clusterName = name;
        //
        this.cproperties = new ClusterProperties();
        this.uproperties = new ClusterProperties();
    }

    ClusterImpl(ClusterInner inner, AVSManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.clusterName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.privateCloudName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateClouds");
        this.clusterName = IdParsingUtils.getValueFromIdByName(inner.id(), "clusters");
        //
        this.cproperties = new ClusterProperties();
        this.uproperties = new ClusterProperties();
    }

    @Override
    public AVSManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Cluster> createResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.createOrUpdateAsync(this.resourceGroupName, this.privateCloudName, this.clusterName, this.cproperties)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Cluster> updateResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.updateAsync(this.resourceGroupName, this.privateCloudName, this.clusterName, this.uproperties)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.getAsync(this.resourceGroupName, this.privateCloudName, this.clusterName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new ClusterProperties();
        this.uproperties = new ClusterProperties();
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
    public ClusterProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ClusterImpl withExistingPrivateCloud(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    @Override
    public ClusterImpl withProperties(ClusterProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
