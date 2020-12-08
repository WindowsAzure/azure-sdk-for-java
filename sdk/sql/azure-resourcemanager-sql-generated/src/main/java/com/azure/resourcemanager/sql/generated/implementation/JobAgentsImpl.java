// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.JobAgentsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.JobAgentInner;
import com.azure.resourcemanager.sql.generated.models.JobAgent;
import com.azure.resourcemanager.sql.generated.models.JobAgents;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class JobAgentsImpl implements JobAgents {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobAgentsImpl.class);

    private final JobAgentsClient innerClient;

    private final SqlManager serviceManager;

    public JobAgentsImpl(JobAgentsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<JobAgent> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<JobAgentInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new JobAgentImpl(inner1, this.manager()));
    }

    public PagedIterable<JobAgent> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<JobAgentInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new JobAgentImpl(inner1, this.manager()));
    }

    public JobAgent get(String resourceGroupName, String serverName, String jobAgentName) {
        JobAgentInner inner = this.serviceClient().get(resourceGroupName, serverName, jobAgentName);
        if (inner != null) {
            return new JobAgentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobAgent> getWithResponse(
        String resourceGroupName, String serverName, String jobAgentName, Context context) {
        Response<JobAgentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, jobAgentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobAgentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String jobAgentName) {
        this.serviceClient().delete(resourceGroupName, serverName, jobAgentName);
    }

    public void delete(String resourceGroupName, String serverName, String jobAgentName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, jobAgentName, context);
    }

    public JobAgent getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, jobAgentName, Context.NONE).getValue();
    }

    public Response<JobAgent> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, jobAgentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        this.delete(resourceGroupName, serverName, jobAgentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        this.delete(resourceGroupName, serverName, jobAgentName, context);
    }

    private JobAgentsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public JobAgentImpl define(String name) {
        return new JobAgentImpl(name, this.manager());
    }
}
