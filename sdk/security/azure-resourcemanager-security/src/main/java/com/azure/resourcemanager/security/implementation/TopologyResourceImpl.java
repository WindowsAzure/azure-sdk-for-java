// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.TopologyResourceInner;
import com.azure.resourcemanager.security.models.TopologyResource;
import com.azure.resourcemanager.security.models.TopologySingleResource;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class TopologyResourceImpl implements TopologyResource {
    private TopologyResourceInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    TopologyResourceImpl(
        TopologyResourceInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
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

    public OffsetDateTime calculatedDateTime() {
        return this.innerModel().calculatedDateTime();
    }

    public List<TopologySingleResource> topologyResources() {
        List<TopologySingleResource> inner = this.innerModel().topologyResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String location() {
        return this.innerModel().location();
    }

    public TopologyResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
