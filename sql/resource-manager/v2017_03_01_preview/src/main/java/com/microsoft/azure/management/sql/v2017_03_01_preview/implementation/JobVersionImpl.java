/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.JobVersion;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class JobVersionImpl extends IndexableRefreshableWrapperImpl<JobVersion, JobVersionInner> implements JobVersion {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String jobAgentName;
    private String jobName;
    private int jobVersion;

    JobVersionImpl(JobVersionInner inner,  SqlManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.jobAgentName = IdParsingUtils.getValueFromIdByName(inner.id(), "jobAgents");
        this.jobName = IdParsingUtils.getValueFromIdByName(inner.id(), "jobs");
        this.jobVersion = IdParsingUtils.getValueFromIdByName(inner.id(), "versions");
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<JobVersionInner> getInnerAsync() {
        JobVersionsInner client = this.manager().inner().jobVersions();
        return client.getAsync(this.resourceGroupName, this.serverName, this.jobAgentName, this.jobName, this.jobVersion);
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
    public String type() {
        return this.inner().type();
    }

}
