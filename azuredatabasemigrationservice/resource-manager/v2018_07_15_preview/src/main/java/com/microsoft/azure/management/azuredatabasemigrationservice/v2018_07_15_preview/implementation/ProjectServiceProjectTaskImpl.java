/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation;

import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ProjectServiceProjectTask;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ProjectTaskProperties;

class ProjectServiceProjectTaskImpl extends CreatableUpdatableImpl<ProjectServiceProjectTask, ProjectTaskInner, ProjectServiceProjectTaskImpl> implements ProjectServiceProjectTask, ProjectServiceProjectTask.Definition, ProjectServiceProjectTask.Update {
    private final DataMigrationManager manager;
    private String groupName;
    private String serviceName;
    private String projectName;
    private String taskName;

    ProjectServiceProjectTaskImpl(String name, DataMigrationManager manager) {
        super(name, new ProjectTaskInner());
        this.manager = manager;
        // Set resource name
        this.taskName = name;
        //
    }

    ProjectServiceProjectTaskImpl(ProjectTaskInner inner, DataMigrationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.taskName = inner.name();
        // set resource ancestor and positional variables
        this.groupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "services");
        this.projectName = IdParsingUtils.getValueFromIdByName(inner.id(), "projects");
        this.taskName = IdParsingUtils.getValueFromIdByName(inner.id(), "tasks");
        //
    }

    @Override
    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ProjectServiceProjectTask> createResourceAsync() {
        TasksInner client = this.manager().inner().tasks();
        return client.createOrUpdateAsync(this.groupName, this.serviceName, this.projectName, this.taskName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ProjectServiceProjectTask> updateResourceAsync() {
        TasksInner client = this.manager().inner().tasks();
        return client.updateAsync(this.groupName, this.serviceName, this.projectName, this.taskName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ProjectTaskInner> getInnerAsync() {
        TasksInner client = this.manager().inner().tasks();
        return client.getAsync(this.groupName, this.serviceName, this.projectName, this.taskName);
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
    public ProjectTaskProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ProjectServiceProjectTaskImpl withExistingProject(String groupName, String serviceName, String projectName) {
        this.groupName = groupName;
        this.serviceName = serviceName;
        this.projectName = projectName;
        return this;
    }

    @Override
    public ProjectServiceProjectTaskImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public ProjectServiceProjectTaskImpl withProperties(ProjectTaskProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
