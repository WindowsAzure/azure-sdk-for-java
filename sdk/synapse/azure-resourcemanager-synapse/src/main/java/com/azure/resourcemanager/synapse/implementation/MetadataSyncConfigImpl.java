// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.MetadataSyncConfigInner;
import com.azure.resourcemanager.synapse.models.MetadataSyncConfig;

public final class MetadataSyncConfigImpl implements MetadataSyncConfig {
    private MetadataSyncConfigInner innerObject;

    private final SynapseManager serviceManager;

    public MetadataSyncConfigImpl(MetadataSyncConfigInner innerObject, SynapseManager serviceManager) {
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

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public Integer syncIntervalInMinutes() {
        return this.innerModel().syncIntervalInMinutes();
    }

    public MetadataSyncConfigInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
