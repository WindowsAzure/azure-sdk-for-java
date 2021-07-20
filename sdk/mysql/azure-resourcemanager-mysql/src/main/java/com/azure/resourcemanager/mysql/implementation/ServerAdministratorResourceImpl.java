// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.fluent.models.ServerAdministratorResourceInner;
import com.azure.resourcemanager.mysql.models.ServerAdministratorResource;
import java.util.UUID;

public final class ServerAdministratorResourceImpl implements ServerAdministratorResource {
    private ServerAdministratorResourceInner innerObject;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    ServerAdministratorResourceImpl(
        ServerAdministratorResourceInner innerObject, com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
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

    public String administratorType() {
        return this.innerModel().administratorType();
    }

    public String login() {
        return this.innerModel().login();
    }

    public UUID sid() {
        return this.innerModel().sid();
    }

    public UUID tenantId() {
        return this.innerModel().tenantId();
    }

    public ServerAdministratorResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
