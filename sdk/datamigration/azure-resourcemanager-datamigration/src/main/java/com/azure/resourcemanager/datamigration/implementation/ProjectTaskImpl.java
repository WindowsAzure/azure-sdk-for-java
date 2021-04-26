// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datamigration.fluent.models.ProjectTaskInner;
import com.azure.resourcemanager.datamigration.models.ProjectTask;
import com.azure.resourcemanager.datamigration.models.ProjectTaskProperties;

public final class ProjectTaskImpl implements ProjectTask, ProjectTask.Definition, ProjectTask.Update {
    private ProjectTaskInner innerObject;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ProjectTaskProperties properties() {
        return this.innerModel().properties();
    }

    public ProjectTaskInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }

    private String groupName;

    private String serviceName;

    private String projectName;

    private String taskName;

    public ProjectTaskImpl withExistingProject(String groupName, String serviceName, String projectName) {
        this.groupName = groupName;
        this.serviceName = serviceName;
        this.projectName = projectName;
        return this;
    }

    public ProjectTask create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTasks()
                .createOrUpdateWithResponse(
                    groupName, serviceName, projectName, taskName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProjectTask create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTasks()
                .createOrUpdateWithResponse(groupName, serviceName, projectName, taskName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProjectTaskImpl(String name, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = new ProjectTaskInner();
        this.serviceManager = serviceManager;
        this.taskName = name;
    }

    public ProjectTaskImpl update() {
        return this;
    }

    public ProjectTask apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTasks()
                .updateWithResponse(groupName, serviceName, projectName, taskName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProjectTask apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTasks()
                .updateWithResponse(groupName, serviceName, projectName, taskName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProjectTaskImpl(
        ProjectTaskInner innerObject, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.groupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
        this.projectName = Utils.getValueFromIdByName(innerObject.id(), "projects");
        this.taskName = Utils.getValueFromIdByName(innerObject.id(), "tasks");
    }

    public ProjectTask refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTasks()
                .getWithResponse(groupName, serviceName, projectName, taskName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public ProjectTask refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTasks()
                .getWithResponse(groupName, serviceName, projectName, taskName, localExpand, context)
                .getValue();
        return this;
    }

    public ProjectTask cancel() {
        return serviceManager.tasks().cancel(groupName, serviceName, projectName, taskName);
    }

    public Response<ProjectTask> cancelWithResponse(Context context) {
        return serviceManager.tasks().cancelWithResponse(groupName, serviceName, projectName, taskName, context);
    }

    public ProjectTaskImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ProjectTaskImpl withProperties(ProjectTaskProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
