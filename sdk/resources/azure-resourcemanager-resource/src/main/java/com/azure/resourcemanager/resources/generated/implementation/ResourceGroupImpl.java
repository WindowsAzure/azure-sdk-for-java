// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupInner;
import com.azure.resourcemanager.resources.generated.models.ResourceGroup;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupPatchable;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupProperties;
import java.util.Collections;
import java.util.Map;

public final class ResourceGroupImpl implements ResourceGroup, ResourceGroup.Definition, ResourceGroup.Update {
    private ResourceGroupInner innerObject;

    private final ResourceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public ResourceGroupProperties properties() {
        return this.innerModel().properties();
    }

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public ResourceGroupInner innerModel() {
        return this.innerObject;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private ResourceGroupPatchable updateParameters;

    public ResourceGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .createOrUpdateWithResponse(resourceGroupName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .createOrUpdateWithResponse(resourceGroupName, innerObject, context)
                .getValue();
        return this;
    }

    public ResourceGroupImpl(String name, ResourceManager serviceManager) {
        this.innerObject = new ResourceGroupInner();
        this.serviceManager = serviceManager;
        this.resourceGroupName = name;
    }

    public ResourceGroupImpl update() {
        this.updateParameters = new ResourceGroupPatchable();
        return this;
    }

    public ResourceGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .updateWithResponse(resourceGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .updateWithResponse(resourceGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    public ResourceGroupImpl(ResourceGroupInner innerObject, ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
    }

    public ResourceGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGroups()
                .getWithResponse(resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGroup refresh(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getResourceGroups().getWithResponse(resourceGroupName, context).getValue();
        return this;
    }

    public ResourceGroupImpl withProperties(ResourceGroupProperties properties) {
        if (isInCreateMode()) {
            this.innerModel().withProperties(properties);
            return this;
        } else {
            this.updateParameters.withProperties(properties);
            return this;
        }
    }

    public ResourceGroupImpl withLocation(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ResourceGroupImpl withName(String name) {
        this.updateParameters.withName(name);
        return this;
    }

    public ResourceGroupImpl withManagedBy(String managedBy) {
        if (isInCreateMode()) {
            this.innerModel().withManagedBy(managedBy);
            return this;
        } else {
            this.updateParameters.withManagedBy(managedBy);
            return this;
        }
    }

    public ResourceGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
