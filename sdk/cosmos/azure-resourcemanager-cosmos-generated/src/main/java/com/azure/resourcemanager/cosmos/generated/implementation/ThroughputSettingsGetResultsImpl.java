// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.fluent.models.ThroughputSettingsGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.ThroughputSettingsGetResults;
import java.util.Collections;
import java.util.Map;

public final class ThroughputSettingsGetResultsImpl implements ThroughputSettingsGetResults {
    private ThroughputSettingsGetResultsInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    ThroughputSettingsGetResultsImpl(
        ThroughputSettingsGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
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

    public ThroughputSettingsGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public ThroughputSettingsGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
