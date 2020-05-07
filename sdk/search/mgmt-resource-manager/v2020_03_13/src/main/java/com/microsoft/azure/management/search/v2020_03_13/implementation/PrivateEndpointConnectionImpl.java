/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_03_13.implementation;

import com.microsoft.azure.management.search.v2020_03_13.PrivateEndpointConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.search.v2020_03_13.SearchManagementRequestOptions;
import java.util.UUID;
import com.microsoft.azure.management.search.v2020_03_13.PrivateEndpointConnectionProperties;
import rx.functions.Func1;

class PrivateEndpointConnectionImpl extends CreatableUpdatableImpl<PrivateEndpointConnection, PrivateEndpointConnectionInner, PrivateEndpointConnectionImpl> implements PrivateEndpointConnection, PrivateEndpointConnection.Update {
    private final SearchManager manager;
    private String resourceGroupName;
    private String searchServiceName;
    private String privateEndpointConnectionName;
    private SearchManagementRequestOptions usearchManagementRequestOptions;

    PrivateEndpointConnectionImpl(String name, SearchManager manager) {
        super(name, new PrivateEndpointConnectionInner());
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = name;
        //
        this.usearchManagementRequestOptions = new SearchManagementRequestOptions();
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner inner, SearchManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.privateEndpointConnectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.searchServiceName = IdParsingUtils.getValueFromIdByName(inner.id(), "searchServices");
        this.privateEndpointConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateEndpointConnections");
        //
        this.usearchManagementRequestOptions = new SearchManagementRequestOptions();
    }

    @Override
    public SearchManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateEndpointConnection> createResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<PrivateEndpointConnection> updateResourceAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.updateAsync(this.resourceGroupName, this.searchServiceName, this.privateEndpointConnectionName, this.inner(), this.usearchManagementRequestOptions)
            .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnectionInner>() {
               @Override
               public PrivateEndpointConnectionInner call(PrivateEndpointConnectionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateEndpointConnectionInner> getInnerAsync() {
        PrivateEndpointConnectionsInner client = this.manager().inner().privateEndpointConnections();
        return client.getAsync(this.resourceGroupName, this.searchServiceName, this.privateEndpointConnectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.usearchManagementRequestOptions = new SearchManagementRequestOptions();
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
    public PrivateEndpointConnectionProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PrivateEndpointConnectionImpl withSearchManagementRequestOptions(SearchManagementRequestOptions searchManagementRequestOptions) {
        this.usearchManagementRequestOptions = searchManagementRequestOptions;
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public PrivateEndpointConnectionImpl withProperties(PrivateEndpointConnectionProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
