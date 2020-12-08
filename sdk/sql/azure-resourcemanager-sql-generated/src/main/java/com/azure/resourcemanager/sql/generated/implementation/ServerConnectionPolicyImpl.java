// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerConnectionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ConnectionPolicyName;
import com.azure.resourcemanager.sql.generated.models.ServerConnectionPolicy;
import com.azure.resourcemanager.sql.generated.models.ServerConnectionType;

public final class ServerConnectionPolicyImpl
    implements ServerConnectionPolicy, ServerConnectionPolicy.Definition, ServerConnectionPolicy.Update {
    private ServerConnectionPolicyInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String location() {
        return this.innerModel().location();
    }

    public ServerConnectionType connectionType() {
        return this.innerModel().connectionType();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServerConnectionPolicyInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private ConnectionPolicyName connectionPolicyName;

    public ServerConnectionPolicyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public ServerConnectionPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerConnectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, connectionPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ServerConnectionPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerConnectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, connectionPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public ServerConnectionPolicyImpl(ConnectionPolicyName name, SqlManager serviceManager) {
        this.innerObject = new ServerConnectionPolicyInner();
        this.serviceManager = serviceManager;
        this.connectionPolicyName = name;
    }

    public ServerConnectionPolicyImpl update() {
        return this;
    }

    public ServerConnectionPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerConnectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, connectionPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ServerConnectionPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerConnectionPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, connectionPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public ServerConnectionPolicyImpl(ServerConnectionPolicyInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.connectionPolicyName =
            ConnectionPolicyName.fromString(Utils.getValueFromIdByName(innerObject.id(), "connectionPolicies"));
    }

    public ServerConnectionPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerConnectionPolicies()
                .getWithResponse(resourceGroupName, serverName, connectionPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerConnectionPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerConnectionPolicies()
                .getWithResponse(resourceGroupName, serverName, connectionPolicyName, context)
                .getValue();
        return this;
    }

    public ServerConnectionPolicyImpl withConnectionType(ServerConnectionType connectionType) {
        this.innerModel().withConnectionType(connectionType);
        return this;
    }
}
