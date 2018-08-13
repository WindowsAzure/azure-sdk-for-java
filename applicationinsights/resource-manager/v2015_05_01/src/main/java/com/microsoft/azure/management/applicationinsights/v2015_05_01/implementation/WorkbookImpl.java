/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.Workbook;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.SharedTypeKind;
import java.util.List;
import java.util.Map;

class WorkbookImpl extends CreatableUpdatableImpl<Workbook, WorkbookInner, WorkbookImpl> implements Workbook, Workbook.Definition, Workbook.Update {
    private String resourceGroupName;
    private String resourceName;
    private final InsightsManager manager;

    WorkbookImpl(String name, InsightsManager manager) {
        super(name, new WorkbookInner());
        this.manager = manager;
        // Set resource name
        this.resourceName = name;
        //
    }

    WorkbookImpl(WorkbookInner inner, InsightsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.resourceName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroup");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workbooks");
        // set other parameters for create and update
    }

    @Override
    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Workbook> createResourceAsync() {
        WorkbooksInner client = this.manager().inner().workbooks();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Workbook> updateResourceAsync() {
        WorkbooksInner client = this.manager().inner().workbooks();
        return client.updateAsync(this.resourceGroupName, this.resourceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WorkbookInner> getInnerAsync() {
        WorkbooksInner client = this.manager().inner().workbooks();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String category() {
        return this.inner().category();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public SharedTypeKind kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String serializedData() {
        return this.inner().serializedData();
    }

    @Override
    public SharedTypeKind sharedTypeKind() {
        return this.inner().sharedTypeKind();
    }

    @Override
    public String sourceResourceId() {
        return this.inner().sourceResourceId();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String timeModified() {
        return this.inner().timeModified();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userId() {
        return this.inner().userId();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public String workbookId() {
        return this.inner().workbookId();
    }

    @Override
    public String workbookName() {
        return this.inner().workbookName();
    }

    @Override
    public List<String> workbookTags() {
        return this.inner().workbookTags();
    }

    @Override
    public WorkbookImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public WorkbookImpl withCategory(String category) {
        this.inner().withCategory(category);
        return this;
    }

    @Override
    public WorkbookImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public WorkbookImpl withSerializedData(String serializedData) {
        this.inner().withSerializedData(serializedData);
        return this;
    }

    @Override
    public WorkbookImpl withSharedTypeKind(SharedTypeKind sharedTypeKind) {
        this.inner().withSharedTypeKind(sharedTypeKind);
        return this;
    }

    @Override
    public WorkbookImpl withUserId(String userId) {
        this.inner().withUserId(userId);
        return this;
    }

    @Override
    public WorkbookImpl withWorkbookId(String workbookId) {
        this.inner().withWorkbookId(workbookId);
        return this;
    }

    @Override
    public WorkbookImpl withWorkbookName(String workbookName) {
        this.inner().withWorkbookName(workbookName);
        return this;
    }

    @Override
    public WorkbookImpl withKind(SharedTypeKind kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public WorkbookImpl withSourceResourceId(String sourceResourceId) {
        this.inner().withSourceResourceId(sourceResourceId);
        return this;
    }

    @Override
    public WorkbookImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public WorkbookImpl withVersion(String version) {
        this.inner().withVersion(version);
        return this;
    }

    @Override
    public WorkbookImpl withWorkbookTags(List<String> workbookTags) {
        this.inner().withWorkbookTags(workbookTags);
        return this;
    }

}
