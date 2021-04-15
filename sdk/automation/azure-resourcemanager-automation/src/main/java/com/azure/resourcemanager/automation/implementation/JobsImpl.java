// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.JobsClient;
import com.azure.resourcemanager.automation.fluent.models.JobCollectionItemInner;
import com.azure.resourcemanager.automation.fluent.models.JobInner;
import com.azure.resourcemanager.automation.models.Job;
import com.azure.resourcemanager.automation.models.JobCollectionItem;
import com.azure.resourcemanager.automation.models.Jobs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class JobsImpl implements Jobs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobsImpl.class);

    private final JobsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public JobsImpl(JobsClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public String getOutput(String resourceGroupName, String automationAccountName, String jobName) {
        return this.serviceClient().getOutput(resourceGroupName, automationAccountName, jobName);
    }

    public Response<String> getOutputWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context) {
        return this
            .serviceClient()
            .getOutputWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public String getRunbookContent(String resourceGroupName, String automationAccountName, String jobName) {
        return this.serviceClient().getRunbookContent(resourceGroupName, automationAccountName, jobName);
    }

    public Response<String> getRunbookContentWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context) {
        return this
            .serviceClient()
            .getRunbookContentWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public void suspend(String resourceGroupName, String automationAccountName, String jobName) {
        this.serviceClient().suspend(resourceGroupName, automationAccountName, jobName);
    }

    public Response<Void> suspendWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context) {
        return this
            .serviceClient()
            .suspendWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public void stop(String resourceGroupName, String automationAccountName, String jobName) {
        this.serviceClient().stop(resourceGroupName, automationAccountName, jobName);
    }

    public Response<Void> stopWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context) {
        return this
            .serviceClient()
            .stopWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public Job get(String resourceGroupName, String automationAccountName, String jobName) {
        JobInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, jobName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Job> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context) {
        Response<JobInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<JobCollectionItem> listByAutomationAccount(
        String resourceGroupName, String automationAccountName) {
        PagedIterable<JobCollectionItemInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new JobCollectionItemImpl(inner1, this.manager()));
    }

    public PagedIterable<JobCollectionItem> listByAutomationAccount(
        String resourceGroupName,
        String automationAccountName,
        String filter,
        String clientRequestId,
        Context context) {
        PagedIterable<JobCollectionItemInner> inner =
            this
                .serviceClient()
                .listByAutomationAccount(resourceGroupName, automationAccountName, filter, clientRequestId, context);
        return Utils.mapPage(inner, inner1 -> new JobCollectionItemImpl(inner1, this.manager()));
    }

    public void resume(String resourceGroupName, String automationAccountName, String jobName) {
        this.serviceClient().resume(resourceGroupName, automationAccountName, jobName);
    }

    public Response<Void> resumeWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String clientRequestId,
        Context context) {
        return this
            .serviceClient()
            .resumeWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    public Job getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        String localClientRequestId = null;
        return this
            .getWithResponse(resourceGroupName, automationAccountName, jobName, localClientRequestId, Context.NONE)
            .getValue();
    }

    public Response<Job> getByIdWithResponse(String id, String clientRequestId, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, jobName, clientRequestId, context);
    }

    private JobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public JobImpl define(String name) {
        return new JobImpl(name, this.manager());
    }
}
