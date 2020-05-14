/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.sql.v2018_06_01_preview.ServerAzureADAdministrator;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.UUID;

class ServerAzureADAdministratorImpl extends CreatableUpdatableImpl<ServerAzureADAdministrator, ServerAzureADAdministratorInner, ServerAzureADAdministratorImpl> implements ServerAzureADAdministrator, ServerAzureADAdministrator.Definition, ServerAzureADAdministrator.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;

    ServerAzureADAdministratorImpl(String name, SqlManager manager) {
        super(name, new ServerAzureADAdministratorInner());
        this.manager = manager;
        // Set resource name
        this.serverName = name;
        //
    }

    ServerAzureADAdministratorImpl(ServerAzureADAdministratorInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serverName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServerAzureADAdministrator> createResourceAsync() {
        ServerAzureADAdministratorsInner client = this.manager().inner().serverAzureADAdministrators();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServerAzureADAdministrator> updateResourceAsync() {
        ServerAzureADAdministratorsInner client = this.manager().inner().serverAzureADAdministrators();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerAzureADAdministratorInner> getInnerAsync() {
        ServerAzureADAdministratorsInner client = this.manager().inner().serverAzureADAdministrators();
        return client.getAsync(this.resourceGroupName, this.serverName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String administratorType() {
        return this.inner().administratorType();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String login() {
        return this.inner().login();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public UUID sid() {
        return this.inner().sid();
    }

    @Override
    public UUID tenantId() {
        return this.inner().tenantId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServerAzureADAdministratorImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ServerAzureADAdministratorImpl withAdministratorType(String administratorType) {
        this.inner().withAdministratorType(administratorType);
        return this;
    }

    @Override
    public ServerAzureADAdministratorImpl withLogin(String login) {
        this.inner().withLogin(login);
        return this;
    }

    @Override
    public ServerAzureADAdministratorImpl withSid(UUID sid) {
        this.inner().withSid(sid);
        return this;
    }

    @Override
    public ServerAzureADAdministratorImpl withTenantId(UUID tenantId) {
        this.inner().withTenantId(tenantId);
        return this;
    }

}
