// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.SyncAgentKeyPropertiesInner;
import com.azure.resourcemanager.sql.generated.models.SyncAgentKeyProperties;

public final class SyncAgentKeyPropertiesImpl implements SyncAgentKeyProperties {
    private SyncAgentKeyPropertiesInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    SyncAgentKeyPropertiesImpl(
        SyncAgentKeyPropertiesInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String syncAgentKey() {
        return this.innerModel().syncAgentKey();
    }

    public SyncAgentKeyPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
