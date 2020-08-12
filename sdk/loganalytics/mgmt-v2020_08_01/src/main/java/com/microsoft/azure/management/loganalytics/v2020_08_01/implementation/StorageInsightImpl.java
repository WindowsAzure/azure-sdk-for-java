/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.management.loganalytics.v2020_08_01.StorageInsight;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_08_01.StorageAccount;
import com.microsoft.azure.management.loganalytics.v2020_08_01.StorageInsightStatus;
import java.util.Map;

class StorageInsightImpl extends CreatableUpdatableImpl<StorageInsight, StorageInsightInner, StorageInsightImpl> implements StorageInsight, StorageInsight.Definition, StorageInsight.Update {
    private final LogAnalyticsManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String storageInsightName;

    StorageInsightImpl(String name, LogAnalyticsManager manager) {
        super(name, new StorageInsightInner());
        this.manager = manager;
        // Set resource name
        this.storageInsightName = name;
        //
    }

    StorageInsightImpl(StorageInsightInner inner, LogAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.storageInsightName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.storageInsightName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageInsightConfigs");
        //
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<StorageInsight> createResourceAsync() {
        StorageInsightConfigsInner client = this.manager().inner().storageInsightConfigs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.storageInsightName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StorageInsight> updateResourceAsync() {
        StorageInsightConfigsInner client = this.manager().inner().storageInsightConfigs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.storageInsightName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StorageInsightInner> getInnerAsync() {
        StorageInsightConfigsInner client = this.manager().inner().storageInsightConfigs();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.storageInsightName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> containers() {
        return this.inner().containers();
    }

    @Override
    public String eTag() {
        return this.inner().eTag();
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
    public StorageInsightStatus status() {
        return this.inner().status();
    }

    @Override
    public StorageAccount storageAccount() {
        return this.inner().storageAccount();
    }

    @Override
    public List<String> tables() {
        return this.inner().tables();
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
    public StorageInsightImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public StorageInsightImpl withStorageAccount(StorageAccount storageAccount) {
        this.inner().withStorageAccount(storageAccount);
        return this;
    }

    @Override
    public StorageInsightImpl withContainers(List<String> containers) {
        this.inner().withContainers(containers);
        return this;
    }

    @Override
    public StorageInsightImpl withETag(String eTag) {
        this.inner().withETag(eTag);
        return this;
    }

    @Override
    public StorageInsightImpl withTables(List<String> tables) {
        this.inner().withTables(tables);
        return this;
    }

    @Override
    public StorageInsightImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
