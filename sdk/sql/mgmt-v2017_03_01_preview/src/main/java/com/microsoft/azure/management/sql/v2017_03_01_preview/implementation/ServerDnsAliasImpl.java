/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerDnsAlias;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class ServerDnsAliasImpl extends CreatableUpdatableImpl<ServerDnsAlias, ServerDnsAliasInner, ServerDnsAliasImpl> implements ServerDnsAlias, ServerDnsAlias.Definition, ServerDnsAlias.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String dnsAliasName;

    ServerDnsAliasImpl(String name, SqlManager manager) {
        super(name, new ServerDnsAliasInner());
        this.manager = manager;
        // Set resource name
        this.dnsAliasName = name;
        //
    }

    ServerDnsAliasImpl(ServerDnsAliasInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.dnsAliasName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.dnsAliasName = IdParsingUtils.getValueFromIdByName(inner.id(), "dnsAliases");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServerDnsAlias> createResourceAsync() {
        ServerDnsAliasesInner client = this.manager().inner().serverDnsAliases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.dnsAliasName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServerDnsAlias> updateResourceAsync() {
        ServerDnsAliasesInner client = this.manager().inner().serverDnsAliases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.dnsAliasName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerDnsAliasInner> getInnerAsync() {
        ServerDnsAliasesInner client = this.manager().inner().serverDnsAliases();
        return client.getAsync(this.resourceGroupName, this.serverName, this.dnsAliasName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String azureDnsRecord() {
        return this.inner().azureDnsRecord();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServerDnsAliasImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

}
