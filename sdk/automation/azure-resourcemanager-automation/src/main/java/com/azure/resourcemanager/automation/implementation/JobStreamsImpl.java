// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.JobStreamsClient;
import com.azure.resourcemanager.automation.fluent.models.JobStreamInner;
import com.azure.resourcemanager.automation.models.JobStream;
import com.azure.resourcemanager.automation.models.JobStreams;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class JobStreamsImpl implements JobStreams {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobStreamsImpl.class);

    private final JobStreamsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public JobStreamsImpl(
        JobStreamsClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public JobStream get(String resourceGroupName, String automationAccountName, String jobName, String jobStreamId) {
        JobStreamInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, jobName, jobStreamId);
        if (inner != null) {
            return new JobStreamImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobStream> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String jobStreamId,
        String clientRequestId,
        Context context) {
        Response<JobStreamInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, automationAccountName, jobName, jobStreamId, clientRequestId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobStreamImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<JobStream> listByJob(String resourceGroupName, String automationAccountName, String jobName) {
        PagedIterable<JobStreamInner> inner =
            this.serviceClient().listByJob(resourceGroupName, automationAccountName, jobName);
        return Utils.mapPage(inner, inner1 -> new JobStreamImpl(inner1, this.manager()));
    }

    public PagedIterable<JobStream> listByJob(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String filter,
        String clientRequestId,
        Context context) {
        PagedIterable<JobStreamInner> inner =
            this
                .serviceClient()
                .listByJob(resourceGroupName, automationAccountName, jobName, filter, clientRequestId, context);
        return Utils.mapPage(inner, inner1 -> new JobStreamImpl(inner1, this.manager()));
    }

    private JobStreamsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
