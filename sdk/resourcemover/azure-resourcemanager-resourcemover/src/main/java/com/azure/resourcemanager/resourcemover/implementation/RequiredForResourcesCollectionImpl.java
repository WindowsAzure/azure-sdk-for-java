// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.implementation;

import com.azure.resourcemanager.resourcemover.ResourceMoverManager;
import com.azure.resourcemanager.resourcemover.fluent.models.RequiredForResourcesCollectionInner;
import com.azure.resourcemanager.resourcemover.models.RequiredForResourcesCollection;
import java.util.Collections;
import java.util.List;

public final class RequiredForResourcesCollectionImpl implements RequiredForResourcesCollection {
    private RequiredForResourcesCollectionInner innerObject;

    private final ResourceMoverManager serviceManager;

    RequiredForResourcesCollectionImpl(
        RequiredForResourcesCollectionInner innerObject, ResourceMoverManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> sourceIds() {
        List<String> inner = this.innerModel().sourceIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RequiredForResourcesCollectionInner innerModel() {
        return this.innerObject;
    }

    private ResourceMoverManager manager() {
        return this.serviceManager;
    }
}
