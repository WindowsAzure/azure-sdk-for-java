// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.models.GenericResourceInner;
import com.azure.resourcemanager.resources.generated.models.GenericResource;
import com.azure.resourcemanager.resources.generated.models.Identity;
import com.azure.resourcemanager.resources.generated.models.Plan;
import com.azure.resourcemanager.resources.generated.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class GenericResourceImpl implements GenericResource {
    private GenericResourceInner innerObject;

    private final ResourceManager serviceManager;

    public GenericResourceImpl(GenericResourceInner innerObject, ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

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
            return Collections.emptyMap();
        }
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public GenericResourceInner innerModel() {
        return this.innerObject;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }
}
