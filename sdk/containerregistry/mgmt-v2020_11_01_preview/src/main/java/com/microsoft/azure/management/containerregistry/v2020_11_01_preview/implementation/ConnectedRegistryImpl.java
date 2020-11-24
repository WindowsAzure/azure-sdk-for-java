/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ConnectedRegistry;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ConnectedRegistryUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.SystemData;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ConnectedRegistryMode;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ConnectionState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ActivationProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.ParentProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.LoginServerProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.LoggingProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.StatusDetailProperties;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.SyncUpdateProperties;
import rx.functions.Func1;

class ConnectedRegistryImpl extends CreatableUpdatableImpl<ConnectedRegistry, ConnectedRegistryInner, ConnectedRegistryImpl> implements ConnectedRegistry, ConnectedRegistry.Definition, ConnectedRegistry.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String connectedRegistryName;
    private ConnectedRegistryUpdateParameters updateParameter;

    ConnectedRegistryImpl(String name, ContainerRegistryManager manager) {
        super(name, new ConnectedRegistryInner());
        this.manager = manager;
        // Set resource name
        this.connectedRegistryName = name;
        //
        this.updateParameter = new ConnectedRegistryUpdateParameters();
    }

    ConnectedRegistryImpl(ConnectedRegistryInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.connectedRegistryName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.connectedRegistryName = IdParsingUtils.getValueFromIdByName(inner.id(), "connectedRegistries");
        //
        this.updateParameter = new ConnectedRegistryUpdateParameters();
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ConnectedRegistry> createResourceAsync() {
        ConnectedRegistriesInner client = this.manager().inner().connectedRegistries();
        return client.createAsync(this.resourceGroupName, this.registryName, this.connectedRegistryName, this.inner())
            .map(new Func1<ConnectedRegistryInner, ConnectedRegistryInner>() {
               @Override
               public ConnectedRegistryInner call(ConnectedRegistryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ConnectedRegistry> updateResourceAsync() {
        ConnectedRegistriesInner client = this.manager().inner().connectedRegistries();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.connectedRegistryName, this.updateParameter)
            .map(new Func1<ConnectedRegistryInner, ConnectedRegistryInner>() {
               @Override
               public ConnectedRegistryInner call(ConnectedRegistryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ConnectedRegistryInner> getInnerAsync() {
        ConnectedRegistriesInner client = this.manager().inner().connectedRegistries();
        return client.getAsync(this.resourceGroupName, this.registryName, this.connectedRegistryName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ConnectedRegistryUpdateParameters();
    }

    @Override
    public ActivationProperties activation() {
        return this.inner().activation();
    }

    @Override
    public List<String> clientTokenIds() {
        return this.inner().clientTokenIds();
    }

    @Override
    public ConnectionState connectionState() {
        return this.inner().connectionState();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastActivityTime() {
        return this.inner().lastActivityTime();
    }

    @Override
    public LoggingProperties logging() {
        return this.inner().logging();
    }

    @Override
    public LoginServerProperties loginServer() {
        return this.inner().loginServer();
    }

    @Override
    public ConnectedRegistryMode mode() {
        return this.inner().mode();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ParentProperties parent() {
        return this.inner().parent();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<StatusDetailProperties> statusDetails() {
        return this.inner().statusDetails();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public ConnectedRegistryImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    @Override
    public ConnectedRegistryImpl withMode(ConnectedRegistryMode mode) {
        this.inner().withMode(mode);
        return this;
    }

    @Override
    public ConnectedRegistryImpl withParent(ParentProperties parent) {
        this.inner().withParent(parent);
        return this;
    }

    @Override
    public ConnectedRegistryImpl withLoginServer(LoginServerProperties loginServer) {
        this.inner().withLoginServer(loginServer);
        return this;
    }

    @Override
    public ConnectedRegistryImpl withSyncProperties(SyncUpdateProperties syncProperties) {
        this.updateParameter.withSyncProperties(syncProperties);
        return this;
    }

    @Override
    public ConnectedRegistryImpl withClientTokenIds(List<String> clientTokenIds) {
        if (isInCreateMode()) {
            this.inner().withClientTokenIds(clientTokenIds);
        } else {
            this.updateParameter.withClientTokenIds(clientTokenIds);
        }
        return this;
    }

    @Override
    public ConnectedRegistryImpl withLogging(LoggingProperties logging) {
        if (isInCreateMode()) {
            this.inner().withLogging(logging);
        } else {
            this.updateParameter.withLogging(logging);
        }
        return this;
    }

}
