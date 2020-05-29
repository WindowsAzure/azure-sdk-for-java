/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.AgentPool;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.AgentPoolUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.OS;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.ProvisioningState;
import rx.functions.Func1;

class AgentPoolImpl extends CreatableUpdatableImpl<AgentPool, AgentPoolInner, AgentPoolImpl> implements AgentPool, AgentPool.Definition, AgentPool.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String agentPoolName;
    private AgentPoolUpdateParameters updateParameter;

    AgentPoolImpl(String name, ContainerRegistryManager manager) {
        super(name, new AgentPoolInner());
        this.manager = manager;
        // Set resource name
        this.agentPoolName = name;
        //
        this.updateParameter = new AgentPoolUpdateParameters();
    }

    AgentPoolImpl(AgentPoolInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.agentPoolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.agentPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "agentPools");
        //
        this.updateParameter = new AgentPoolUpdateParameters();
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AgentPool> createResourceAsync() {
        AgentPoolsInner client = this.manager().inner().agentPools();
        return client.createAsync(this.resourceGroupName, this.registryName, this.agentPoolName, this.inner())
            .map(new Func1<AgentPoolInner, AgentPoolInner>() {
               @Override
               public AgentPoolInner call(AgentPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AgentPool> updateResourceAsync() {
        AgentPoolsInner client = this.manager().inner().agentPools();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.agentPoolName, this.updateParameter)
            .map(new Func1<AgentPoolInner, AgentPoolInner>() {
               @Override
               public AgentPoolInner call(AgentPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AgentPoolInner> getInnerAsync() {
        AgentPoolsInner client = this.manager().inner().agentPools();
        return client.getAsync(this.resourceGroupName, this.registryName, this.agentPoolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AgentPoolUpdateParameters();
    }

    @Override
    public Integer count() {
        return this.inner().count();
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
    public OS os() {
        return this.inner().os();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String tier() {
        return this.inner().tier();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String virtualNetworkSubnetResourceId() {
        return this.inner().virtualNetworkSubnetResourceId();
    }

    @Override
    public AgentPoolImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public AgentPoolImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public AgentPoolImpl withOs(OS os) {
        this.inner().withOs(os);
        return this;
    }

    @Override
    public AgentPoolImpl withTier(String tier) {
        this.inner().withTier(tier);
        return this;
    }

    @Override
    public AgentPoolImpl withVirtualNetworkSubnetResourceId(String virtualNetworkSubnetResourceId) {
        this.inner().withVirtualNetworkSubnetResourceId(virtualNetworkSubnetResourceId);
        return this;
    }

    @Override
    public AgentPoolImpl withCount(Integer count) {
        if (isInCreateMode()) {
            this.inner().withCount(count);
        } else {
            this.updateParameter.withCount(count);
        }
        return this;
    }

    @Override
    public AgentPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
