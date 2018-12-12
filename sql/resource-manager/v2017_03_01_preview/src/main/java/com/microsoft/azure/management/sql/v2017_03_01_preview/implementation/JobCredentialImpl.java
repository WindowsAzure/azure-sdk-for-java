/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.JobCredential;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class JobCredentialImpl extends CreatableUpdatableImpl<JobCredential, JobCredentialInner, JobCredentialImpl> implements JobCredential, JobCredential.Definition, JobCredential.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String jobAgentName;
    private String credentialName;

    JobCredentialImpl(String name, SqlManager manager) {
        super(name, new JobCredentialInner());
        this.manager = manager;
        // Set resource name
        this.credentialName = name;
        //
    }

    JobCredentialImpl(JobCredentialInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.credentialName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.jobAgentName = IdParsingUtils.getValueFromIdByName(inner.id(), "jobAgents");
        this.credentialName = IdParsingUtils.getValueFromIdByName(inner.id(), "credentials");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<JobCredential> createResourceAsync() {
        JobCredentialsInner client = this.manager().inner().jobCredentials();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.jobAgentName, this.credentialName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<JobCredential> updateResourceAsync() {
        JobCredentialsInner client = this.manager().inner().jobCredentials();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.jobAgentName, this.credentialName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<JobCredentialInner> getInnerAsync() {
        JobCredentialsInner client = this.manager().inner().jobCredentials();
        return client.getAsync(this.resourceGroupName, this.serverName, this.jobAgentName, this.credentialName);
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
    public String password() {
        return this.inner().password();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String username() {
        return this.inner().username();
    }

    @Override
    public JobCredentialImpl withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.jobAgentName = jobAgentName;
        return this;
    }

    @Override
    public JobCredentialImpl withPassword(String password) {
        this.inner().withPassword(password);
        return this;
    }

    @Override
    public JobCredentialImpl withUsername(String username) {
        this.inner().withUsername(username);
        return this;
    }

}
