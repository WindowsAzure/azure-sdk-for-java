// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationJobsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.JobInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Job;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.JobQueryParameter;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationJobs;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeJobParams;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationJobsImpl implements ReplicationJobs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationJobsImpl.class);

    private final ReplicationJobsClient innerClient;

    private final SiteRecoveryManager serviceManager;

    public ReplicationJobsImpl(ReplicationJobsClient innerClient, SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Job> list(String resourceName, String resourceGroupName) {
        PagedIterable<JobInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return inner.mapPage(inner1 -> new JobImpl(inner1, this.manager()));
    }

    public PagedIterable<Job> list(String resourceName, String resourceGroupName, String filter, Context context) {
        PagedIterable<JobInner> inner = this.serviceClient().list(resourceName, resourceGroupName, filter, context);
        return inner.mapPage(inner1 -> new JobImpl(inner1, this.manager()));
    }

    public Job get(String resourceName, String resourceGroupName, String jobName) {
        JobInner inner = this.serviceClient().get(resourceName, resourceGroupName, jobName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Job> getWithResponse(
        String resourceName, String resourceGroupName, String jobName, Context context) {
        Response<JobInner> inner =
            this.serviceClient().getWithResponse(resourceName, resourceGroupName, jobName, context);
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

    public Job cancel(String resourceName, String resourceGroupName, String jobName) {
        JobInner inner = this.serviceClient().cancel(resourceName, resourceGroupName, jobName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job cancel(String resourceName, String resourceGroupName, String jobName, Context context) {
        JobInner inner = this.serviceClient().cancel(resourceName, resourceGroupName, jobName, context);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job restart(String resourceName, String resourceGroupName, String jobName) {
        JobInner inner = this.serviceClient().restart(resourceName, resourceGroupName, jobName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job restart(String resourceName, String resourceGroupName, String jobName, Context context) {
        JobInner inner = this.serviceClient().restart(resourceName, resourceGroupName, jobName, context);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job resume(String resourceName, String resourceGroupName, String jobName, ResumeJobParams resumeJobParams) {
        JobInner inner = this.serviceClient().resume(resourceName, resourceGroupName, jobName, resumeJobParams);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job resume(
        String resourceName,
        String resourceGroupName,
        String jobName,
        ResumeJobParams resumeJobParams,
        Context context) {
        JobInner inner =
            this.serviceClient().resume(resourceName, resourceGroupName, jobName, resumeJobParams, context);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job export(String resourceName, String resourceGroupName, JobQueryParameter jobQueryParameter) {
        JobInner inner = this.serviceClient().export(resourceName, resourceGroupName, jobQueryParameter);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job export(
        String resourceName, String resourceGroupName, JobQueryParameter jobQueryParameter, Context context) {
        JobInner inner = this.serviceClient().export(resourceName, resourceGroupName, jobQueryParameter, context);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ReplicationJobsClient serviceClient() {
        return this.innerClient;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
