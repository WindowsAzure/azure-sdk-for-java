/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.datafactory.v2018_06_01.DataFlowFolder;
import rx.functions.Func1;

class DataFlowResourceImpl extends CreatableUpdatableImpl<DataFlowResource, DataFlowResourceInner, DataFlowResourceImpl> implements DataFlowResource, DataFlowResource.Definition, DataFlowResource.Update {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String dataFlowName;
    private String cifMatch;
    private DataFlowInner cproperties;
    private String uifMatch;
    private DataFlowInner uproperties;

    DataFlowResourceImpl(String name, DataFactoryManager manager) {
        super(name, new DataFlowResourceInner());
        this.manager = manager;
        // Set resource name
        this.dataFlowName = name;
        //
        this.cproperties = new DataFlowInner();
        this.uproperties = new DataFlowInner();
    }

    DataFlowResourceImpl(DataFlowResourceInner inner, DataFactoryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.dataFlowName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.factoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "factories");
        this.dataFlowName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataflows");
        //
        this.cproperties = new DataFlowInner();
        this.uproperties = new DataFlowInner();
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DataFlowResource> createResourceAsync() {
        DataFlowsInner client = this.manager().inner().dataFlows();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.dataFlowName, this.cproperties, this.cifMatch)
            .map(new Func1<DataFlowResourceInner, DataFlowResourceInner>() {
               @Override
               public DataFlowResourceInner call(DataFlowResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DataFlowResource> updateResourceAsync() {
        DataFlowsInner client = this.manager().inner().dataFlows();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.dataFlowName, this.uproperties, this.uifMatch)
            .map(new Func1<DataFlowResourceInner, DataFlowResourceInner>() {
               @Override
               public DataFlowResourceInner call(DataFlowResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DataFlowResourceInner> getInnerAsync() {
        DataFlowsInner client = this.manager().inner().dataFlows();
        return client.getAsync(this.resourceGroupName, this.factoryName, this.dataFlowName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new DataFlowInner();
        this.uproperties = new DataFlowInner();
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
    public DataFlowInner properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DataFlowResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    @Override
    public DataFlowResourceImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public DataFlowResourceImpl withProperties(DataFlowInner properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
