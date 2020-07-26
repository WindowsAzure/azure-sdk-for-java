/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ScopeMap;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ScopeMapUpdateParameters;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;
import rx.functions.Func1;

class ScopeMapImpl extends CreatableUpdatableImpl<ScopeMap, ScopeMapInner, ScopeMapImpl> implements ScopeMap, ScopeMap.Definition, ScopeMap.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String scopeMapName;
    private ScopeMapUpdateParameters updateParameter;

    ScopeMapImpl(String name, ContainerRegistryManager manager) {
        super(name, new ScopeMapInner());
        this.manager = manager;
        // Set resource name
        this.scopeMapName = name;
        //
        this.updateParameter = new ScopeMapUpdateParameters();
    }

    ScopeMapImpl(ScopeMapInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.scopeMapName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.scopeMapName = IdParsingUtils.getValueFromIdByName(inner.id(), "scopeMaps");
        //
        this.updateParameter = new ScopeMapUpdateParameters();
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ScopeMap> createResourceAsync() {
        ScopeMapsInner client = this.manager().inner().scopeMaps();
        return client.createAsync(this.resourceGroupName, this.registryName, this.scopeMapName, this.inner())
            .map(new Func1<ScopeMapInner, ScopeMapInner>() {
               @Override
               public ScopeMapInner call(ScopeMapInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ScopeMap> updateResourceAsync() {
        ScopeMapsInner client = this.manager().inner().scopeMaps();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.scopeMapName, this.updateParameter)
            .map(new Func1<ScopeMapInner, ScopeMapInner>() {
               @Override
               public ScopeMapInner call(ScopeMapInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ScopeMapInner> getInnerAsync() {
        ScopeMapsInner client = this.manager().inner().scopeMaps();
        return client.getAsync(this.resourceGroupName, this.registryName, this.scopeMapName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ScopeMapUpdateParameters();
    }

    @Override
    public List<String> actions() {
        return this.inner().actions();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String description() {
        return this.inner().description();
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String scopeMapType() {
        return this.inner().scopeMapType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ScopeMapImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public ScopeMapImpl withActions(List<String> actions) {
        if (isInCreateMode()) {
            this.inner().withActions(actions);
        } else {
            this.updateParameter.withActions(actions);
        }
        return this;
    }

    @Override
    public ScopeMapImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

}
