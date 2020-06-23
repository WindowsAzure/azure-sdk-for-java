/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedService;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.LinkedServiceEntityStatus;
import java.util.Map;

class LinkedServiceImpl extends CreatableUpdatableImpl<LinkedService, LinkedServiceInner, LinkedServiceImpl> implements LinkedService, LinkedService.Definition, LinkedService.Update {
    private final LogAnalyticsManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String linkedServiceName;

    LinkedServiceImpl(String name, LogAnalyticsManager manager) {
        super(name, new LinkedServiceInner());
        this.manager = manager;
        // Set resource name
        this.linkedServiceName = name;
        //
    }

    LinkedServiceImpl(LinkedServiceInner inner, LogAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.linkedServiceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.linkedServiceName = IdParsingUtils.getValueFromIdByName(inner.id(), "linkedServices");
        //
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LinkedService> createResourceAsync() {
        LinkedServicesInner client = this.manager().inner().linkedServices();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.linkedServiceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LinkedService> updateResourceAsync() {
        LinkedServicesInner client = this.manager().inner().linkedServices();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.linkedServiceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LinkedServiceInner> getInnerAsync() {
        LinkedServicesInner client = this.manager().inner().linkedServices();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.linkedServiceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public LinkedServiceEntityStatus provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceId() {
        return this.inner().resourceId();
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
    public String writeAccessResourceId() {
        return this.inner().writeAccessResourceId();
    }

    @Override
    public LinkedServiceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public LinkedServiceImpl withProvisioningState(LinkedServiceEntityStatus provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public LinkedServiceImpl withResourceId(String resourceId) {
        this.inner().withResourceId(resourceId);
        return this;
    }

    @Override
    public LinkedServiceImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public LinkedServiceImpl withWriteAccessResourceId(String writeAccessResourceId) {
        this.inner().withWriteAccessResourceId(writeAccessResourceId);
        return this;
    }

}
