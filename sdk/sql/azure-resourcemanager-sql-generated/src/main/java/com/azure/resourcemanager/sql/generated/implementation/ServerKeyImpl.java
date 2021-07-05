// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerKeyInner;
import com.azure.resourcemanager.sql.generated.models.ServerKey;
import com.azure.resourcemanager.sql.generated.models.ServerKeyType;
import java.time.OffsetDateTime;

public final class ServerKeyImpl implements ServerKey, ServerKey.Definition, ServerKey.Update {
    private ServerKeyInner innerObject;

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

    public String kind() {
        return this.innerModel().kind();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String subregion() {
        return this.innerModel().subregion();
    }

    public ServerKeyType serverKeyType() {
        return this.innerModel().serverKeyType();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public Boolean autoRotationEnabled() {
        return this.innerModel().autoRotationEnabled();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServerKeyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String keyName;

    public ServerKeyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public ServerKey create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(resourceGroupName, serverName, keyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerKey create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(resourceGroupName, serverName, keyName, this.innerModel(), context);
        return this;
    }

    ServerKeyImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ServerKeyInner();
        this.serviceManager = serviceManager;
        this.keyName = name;
    }

    public ServerKeyImpl update() {
        return this;
    }

    public ServerKey apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(resourceGroupName, serverName, keyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerKey apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .createOrUpdate(resourceGroupName, serverName, keyName, this.innerModel(), context);
        return this;
    }

    ServerKeyImpl(ServerKeyInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.keyName = Utils.getValueFromIdByName(innerObject.id(), "keys");
    }

    public ServerKey refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .getWithResponse(resourceGroupName, serverName, keyName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerKey refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerKeys()
                .getWithResponse(resourceGroupName, serverName, keyName, context)
                .getValue();
        return this;
    }

    public ServerKeyImpl withServerKeyType(ServerKeyType serverKeyType) {
        this.innerModel().withServerKeyType(serverKeyType);
        return this;
    }

    public ServerKeyImpl withUri(String uri) {
        this.innerModel().withUri(uri);
        return this;
    }
}
