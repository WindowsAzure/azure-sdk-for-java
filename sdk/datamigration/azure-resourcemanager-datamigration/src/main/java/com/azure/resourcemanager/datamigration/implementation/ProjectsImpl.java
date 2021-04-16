// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datamigration.fluent.ProjectsClient;
import com.azure.resourcemanager.datamigration.fluent.models.ProjectInner;
import com.azure.resourcemanager.datamigration.models.Project;
import com.azure.resourcemanager.datamigration.models.Projects;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProjectsImpl implements Projects {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProjectsImpl.class);

    private final ProjectsClient innerClient;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public ProjectsImpl(
        ProjectsClient innerClient, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Project> listByResourceGroup(String groupName, String serviceName) {
        PagedIterable<ProjectInner> inner = this.serviceClient().listByResourceGroup(groupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public PagedIterable<Project> listByResourceGroup(String groupName, String serviceName, Context context) {
        PagedIterable<ProjectInner> inner = this.serviceClient().listByResourceGroup(groupName, serviceName, context);
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public Project get(String groupName, String serviceName, String projectName) {
        ProjectInner inner = this.serviceClient().get(groupName, serviceName, projectName);
        if (inner != null) {
            return new ProjectImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Project> getWithResponse(
        String groupName, String serviceName, String projectName, Context context) {
        Response<ProjectInner> inner =
            this.serviceClient().getWithResponse(groupName, serviceName, projectName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProjectImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String groupName, String serviceName, String projectName) {
        this.serviceClient().delete(groupName, serviceName, projectName);
    }

    public Response<Void> deleteWithResponse(
        String groupName, String serviceName, String projectName, Boolean deleteRunningTasks, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(groupName, serviceName, projectName, deleteRunningTasks, context);
    }

    public Project getById(String id) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getWithResponse(groupName, serviceName, projectName, Context.NONE).getValue();
    }

    public Response<Project> getByIdWithResponse(String id, Context context) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getWithResponse(groupName, serviceName, projectName, context);
    }

    public void deleteById(String id) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        Boolean localDeleteRunningTasks = null;
        this.deleteWithResponse(groupName, serviceName, projectName, localDeleteRunningTasks, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Boolean deleteRunningTasks, Context context) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.deleteWithResponse(groupName, serviceName, projectName, deleteRunningTasks, context);
    }

    private ProjectsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }

    public ProjectImpl define(String name) {
        return new ProjectImpl(name, this.manager());
    }
}
