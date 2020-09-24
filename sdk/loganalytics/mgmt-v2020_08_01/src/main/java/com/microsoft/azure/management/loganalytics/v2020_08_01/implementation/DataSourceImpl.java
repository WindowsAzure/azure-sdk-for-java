/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.management.loganalytics.v2020_08_01.DataSource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_08_01.DataSourceKind;
import java.util.Map;

class DataSourceImpl extends CreatableUpdatableImpl<DataSource, DataSourceInner, DataSourceImpl> implements DataSource, DataSource.Definition, DataSource.Update {
    private final LogAnalyticsManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String dataSourceName;

    DataSourceImpl(String name, LogAnalyticsManager manager) {
        super(name, new DataSourceInner());
        this.manager = manager;
        // Set resource name
        this.dataSourceName = name;
        //
    }

    DataSourceImpl(DataSourceInner inner, LogAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.dataSourceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.dataSourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataSources");
        //
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DataSource> createResourceAsync() {
        DataSourcesInner client = this.manager().inner().dataSources();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.dataSourceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DataSource> updateResourceAsync() {
        DataSourcesInner client = this.manager().inner().dataSources();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.dataSourceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DataSourceInner> getInnerAsync() {
        DataSourcesInner client = this.manager().inner().dataSources();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.dataSourceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DataSourceKind kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Object properties() {
        return this.inner().properties();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DataSourceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public DataSourceImpl withKind(DataSourceKind kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public DataSourceImpl withProperties(Object properties) {
        this.inner().withProperties(properties);
        return this;
    }

    @Override
    public DataSourceImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public DataSourceImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
