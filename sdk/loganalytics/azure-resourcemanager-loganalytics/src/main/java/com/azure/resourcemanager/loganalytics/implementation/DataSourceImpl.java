// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.models.DataSourceInner;
import com.azure.resourcemanager.loganalytics.models.DataSource;
import com.azure.resourcemanager.loganalytics.models.DataSourceKind;
import java.util.Collections;
import java.util.Map;

public final class DataSourceImpl implements DataSource, DataSource.Definition, DataSource.Update {
    private DataSourceInner innerObject;

    private final LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public DataSourceKind kind() {
        return this.innerModel().kind();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public DataSourceInner innerModel() {
        return this.innerObject;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String dataSourceName;

    public DataSourceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public DataSource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataSources()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataSource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataSources()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public DataSourceImpl(String name, LogAnalyticsManager serviceManager) {
        this.innerObject = new DataSourceInner();
        this.serviceManager = serviceManager;
        this.dataSourceName = name;
    }

    public DataSourceImpl update() {
        return this;
    }

    public DataSource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataSources()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataSource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataSources()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataSourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public DataSourceImpl(DataSourceInner innerObject, LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.dataSourceName = Utils.getValueFromIdByName(innerObject.id(), "dataSources");
    }

    public DataSource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataSources()
                .getWithResponse(resourceGroupName, workspaceName, dataSourceName, Context.NONE)
                .getValue();
        return this;
    }

    public DataSource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataSources()
                .getWithResponse(resourceGroupName, workspaceName, dataSourceName, context)
                .getValue();
        return this;
    }

    public DataSourceImpl withProperties(Object properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public DataSourceImpl withKind(DataSourceKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public DataSourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public DataSourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
