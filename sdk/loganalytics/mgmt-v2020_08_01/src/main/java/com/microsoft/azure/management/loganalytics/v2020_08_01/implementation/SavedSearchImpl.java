/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.management.loganalytics.v2020_08_01.SavedSearch;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_08_01.Tag;

class SavedSearchImpl extends CreatableUpdatableImpl<SavedSearch, SavedSearchInner, SavedSearchImpl> implements SavedSearch, SavedSearch.Definition, SavedSearch.Update {
    private final LogAnalyticsManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String savedSearchId;

    SavedSearchImpl(String name, LogAnalyticsManager manager) {
        super(name, new SavedSearchInner());
        this.manager = manager;
        // Set resource name
        this.savedSearchId = name;
        //
    }

    SavedSearchImpl(SavedSearchInner inner, LogAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.savedSearchId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.savedSearchId = IdParsingUtils.getValueFromIdByName(inner.id(), "savedSearches");
        //
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SavedSearch> createResourceAsync() {
        SavedSearchesInner client = this.manager().inner().savedSearches();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.savedSearchId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SavedSearch> updateResourceAsync() {
        SavedSearchesInner client = this.manager().inner().savedSearches();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.savedSearchId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SavedSearchInner> getInnerAsync() {
        SavedSearchesInner client = this.manager().inner().savedSearches();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.savedSearchId);
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
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String functionAlias() {
        return this.inner().functionAlias();
    }

    @Override
    public String functionParameters() {
        return this.inner().functionParameters();
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
    public String query() {
        return this.inner().query();
    }

    @Override
    public List<Tag> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Long version() {
        return this.inner().version();
    }

    @Override
    public SavedSearchImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public SavedSearchImpl withCategory(String category) {
        this.inner().withCategory(category);
        return this;
    }

    @Override
    public SavedSearchImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public SavedSearchImpl withQuery(String query) {
        this.inner().withQuery(query);
        return this;
    }

    @Override
    public SavedSearchImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public SavedSearchImpl withFunctionAlias(String functionAlias) {
        this.inner().withFunctionAlias(functionAlias);
        return this;
    }

    @Override
    public SavedSearchImpl withFunctionParameters(String functionParameters) {
        this.inner().withFunctionParameters(functionParameters);
        return this;
    }

    @Override
    public SavedSearchImpl withTags(List<Tag> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public SavedSearchImpl withVersion(Long version) {
        this.inner().withVersion(version);
        return this;
    }

}
