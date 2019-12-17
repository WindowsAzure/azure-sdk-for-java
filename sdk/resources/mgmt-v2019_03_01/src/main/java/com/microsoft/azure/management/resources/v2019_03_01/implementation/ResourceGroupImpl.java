/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_03_01.implementation;

import com.microsoft.azure.management.resources.v2019_03_01.ResourceGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.resources.v2019_03_01.ResourceGroupPatchable;
import java.util.Map;
import com.microsoft.azure.management.resources.v2019_03_01.ResourceGroupProperties;
import rx.functions.Func1;

class ResourceGroupImpl extends CreatableUpdatableImpl<ResourceGroup, ResourceGroupInner, ResourceGroupImpl> implements ResourceGroup, ResourceGroup.Definition, ResourceGroup.Update {
    private final ResourcesManager manager;
    private String resourceGroupName;
    private ResourceGroupPatchable updateParameter;

    ResourceGroupImpl(String name, ResourcesManager manager) {
        super(name, new ResourceGroupInner());
        this.manager = manager;
        // Set resource name
        this.resourceGroupName = name;
        //
        this.updateParameter = new ResourceGroupPatchable();
    }

    ResourceGroupImpl(ResourceGroupInner inner, ResourcesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.resourceGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        //
        this.updateParameter = new ResourceGroupPatchable();
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ResourceGroup> createResourceAsync() {
        ResourceGroupsInner client = this.manager().inner().resourceGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.inner())
            .map(new Func1<ResourceGroupInner, ResourceGroupInner>() {
               @Override
               public ResourceGroupInner call(ResourceGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ResourceGroup> updateResourceAsync() {
        ResourceGroupsInner client = this.manager().inner().resourceGroups();
        return client.updateAsync(this.resourceGroupName, this.updateParameter)
            .map(new Func1<ResourceGroupInner, ResourceGroupInner>() {
               @Override
               public ResourceGroupInner call(ResourceGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ResourceGroupInner> getInnerAsync() {
        ResourceGroupsInner client = this.manager().inner().resourceGroups();
        return client.getAsync(this.resourceGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ResourceGroupPatchable();
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
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ResourceGroupProperties properties() {
        return this.inner().properties();
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
    public ResourceGroupImpl withExistingSubscription() {
        return this;
    }

    @Override
    public ResourceGroupImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ResourceGroupImpl withName(String name) {
        this.updateParameter.withName(name);
        return this;
    }

    @Override
    public ResourceGroupImpl withManagedBy(String managedBy) {
        if (isInCreateMode()) {
            this.inner().withManagedBy(managedBy);
        } else {
            this.updateParameter.withManagedBy(managedBy);
        }
        return this;
    }

    @Override
    public ResourceGroupImpl withProperties(ResourceGroupProperties properties) {
        if (isInCreateMode()) {
            this.inner().withProperties(properties);
        } else {
            this.updateParameter.withProperties(properties);
        }
        return this;
    }

    @Override
    public ResourceGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
