// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncAgentLinkedDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.SyncAgentLinkedDatabase;
import com.azure.resourcemanager.sql.generated.models.SyncMemberDbType;

public final class SyncAgentLinkedDatabaseImpl implements SyncAgentLinkedDatabase {
    private SyncAgentLinkedDatabaseInner innerObject;

    private final SqlManager serviceManager;

    public SyncAgentLinkedDatabaseImpl(SyncAgentLinkedDatabaseInner innerObject, SqlManager serviceManager) {
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

    public SyncMemberDbType databaseType() {
        return this.innerModel().databaseType();
    }

    public String databaseId() {
        return this.innerModel().databaseId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String serverName() {
        return this.innerModel().serverName();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String username() {
        return this.innerModel().username();
    }

    public SyncAgentLinkedDatabaseInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
