/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Application;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ApplicationProperties;

class ApplicationImpl extends CreatableUpdatableImpl<Application, ApplicationInner, ApplicationImpl> implements Application, Application.Definition, Application.Update {
    private final HDInsightManager manager;
    private String resourceGroupName;
    private String clusterName;
    private String applicationName;

    ApplicationImpl(String name, HDInsightManager manager) {
        super(name, new ApplicationInner());
        this.manager = manager;
        // Set resource name
        this.applicationName = name;
        //
    }

    ApplicationImpl(ApplicationInner inner, HDInsightManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.applicationName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.clusterName = IdParsingUtils.getValueFromIdByName(inner.id(), "clusters");
        this.applicationName = IdParsingUtils.getValueFromIdByName(inner.id(), "applications");
        //
    }

    @Override
    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Application> createResourceAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.createAsync(this.resourceGroupName, this.clusterName, this.applicationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Application> updateResourceAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.createAsync(this.resourceGroupName, this.clusterName, this.applicationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationInner> getInnerAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.getAsync(this.resourceGroupName, this.clusterName, this.applicationName);
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public ApplicationProperties properties() {
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
    public ApplicationImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    @Override
    public ApplicationImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public ApplicationImpl withProperties(ApplicationProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

    @Override
    public ApplicationImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
