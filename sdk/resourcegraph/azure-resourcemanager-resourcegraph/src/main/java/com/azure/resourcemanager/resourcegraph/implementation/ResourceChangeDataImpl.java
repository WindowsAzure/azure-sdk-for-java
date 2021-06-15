// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.implementation;

import com.azure.resourcemanager.resourcegraph.fluent.models.ResourceChangeDataInner;
import com.azure.resourcemanager.resourcegraph.models.ChangeType;
import com.azure.resourcemanager.resourcegraph.models.ResourceChangeData;
import com.azure.resourcemanager.resourcegraph.models.ResourceChangeDataAfterSnapshot;
import com.azure.resourcemanager.resourcegraph.models.ResourceChangeDataBeforeSnapshot;
import com.azure.resourcemanager.resourcegraph.models.ResourcePropertyChange;
import java.util.Collections;
import java.util.List;

public final class ResourceChangeDataImpl implements ResourceChangeData {
    private ResourceChangeDataInner innerObject;

    private final com.azure.resourcemanager.resourcegraph.ResourceGraphManager serviceManager;

    ResourceChangeDataImpl(
        ResourceChangeDataInner innerObject,
        com.azure.resourcemanager.resourcegraph.ResourceGraphManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String changeId() {
        return this.innerModel().changeId();
    }

    public ResourceChangeDataBeforeSnapshot beforeSnapshot() {
        return this.innerModel().beforeSnapshot();
    }

    public ResourceChangeDataAfterSnapshot afterSnapshot() {
        return this.innerModel().afterSnapshot();
    }

    public ChangeType changeType() {
        return this.innerModel().changeType();
    }

    public List<ResourcePropertyChange> propertyChanges() {
        List<ResourcePropertyChange> inner = this.innerModel().propertyChanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceChangeDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager() {
        return this.serviceManager;
    }
}
