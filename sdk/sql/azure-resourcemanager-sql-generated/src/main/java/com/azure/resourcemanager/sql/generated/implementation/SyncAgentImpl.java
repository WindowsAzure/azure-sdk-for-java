// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncAgentInner;
import com.azure.resourcemanager.sql.generated.models.SyncAgent;
import com.azure.resourcemanager.sql.generated.models.SyncAgentKeyProperties;
import com.azure.resourcemanager.sql.generated.models.SyncAgentState;
import java.time.OffsetDateTime;

public final class SyncAgentImpl implements SyncAgent, SyncAgent.Definition, SyncAgent.Update {
    private SyncAgentInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String syncDatabaseId() {
        return this.innerModel().syncDatabaseId();
    }

    public OffsetDateTime lastAliveTime() {
        return this.innerModel().lastAliveTime();
    }

    public SyncAgentState state() {
        return this.innerModel().state();
    }

    public Boolean isUpToDate() {
        return this.innerModel().isUpToDate();
    }

    public OffsetDateTime expiryTime() {
        return this.innerModel().expiryTime();
    }

    public String version() {
        return this.innerModel().version();
    }

    public SyncAgentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String syncAgentName;

    public SyncAgentImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public SyncAgent create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncAgents()
                .createOrUpdate(resourceGroupName, serverName, syncAgentName, this.innerModel(), Context.NONE);
        return this;
    }

    public SyncAgent create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncAgents()
                .createOrUpdate(resourceGroupName, serverName, syncAgentName, this.innerModel(), context);
        return this;
    }

    SyncAgentImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new SyncAgentInner();
        this.serviceManager = serviceManager;
        this.syncAgentName = name;
    }

    public SyncAgentImpl update() {
        return this;
    }

    public SyncAgent apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncAgents()
                .createOrUpdate(resourceGroupName, serverName, syncAgentName, this.innerModel(), Context.NONE);
        return this;
    }

    public SyncAgent apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncAgents()
                .createOrUpdate(resourceGroupName, serverName, syncAgentName, this.innerModel(), context);
        return this;
    }

    SyncAgentImpl(SyncAgentInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.syncAgentName = Utils.getValueFromIdByName(innerObject.id(), "syncAgents");
    }

    public SyncAgent refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncAgents()
                .getWithResponse(resourceGroupName, serverName, syncAgentName, Context.NONE)
                .getValue();
        return this;
    }

    public SyncAgent refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncAgents()
                .getWithResponse(resourceGroupName, serverName, syncAgentName, context)
                .getValue();
        return this;
    }

    public SyncAgentKeyProperties generateKey() {
        return serviceManager.syncAgents().generateKey(resourceGroupName, serverName, syncAgentName);
    }

    public Response<SyncAgentKeyProperties> generateKeyWithResponse(Context context) {
        return serviceManager
            .syncAgents()
            .generateKeyWithResponse(resourceGroupName, serverName, syncAgentName, context);
    }

    public SyncAgentImpl withSyncDatabaseId(String syncDatabaseId) {
        this.innerModel().withSyncDatabaseId(syncDatabaseId);
        return this;
    }
}
