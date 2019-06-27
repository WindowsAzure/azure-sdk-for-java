/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.IssueContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.apimanagement.v2019_01_01.State;

class IssueContractImpl extends CreatableUpdatableImpl<IssueContract, IssueContractInner, IssueContractImpl> implements IssueContract, IssueContract.Definition, IssueContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String apiId;
    private String issueId;
    private String cifMatch;
    private String uifMatch;

    IssueContractImpl(String name, ApiManagementManager manager) {
        super(name, new IssueContractInner());
        this.manager = manager;
        // Set resource name
        this.issueId = name;
        //
    }

    IssueContractImpl(IssueContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.issueId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.apiId = IdParsingUtils.getValueFromIdByName(inner.id(), "apis");
        this.issueId = IdParsingUtils.getValueFromIdByName(inner.id(), "issues");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IssueContract> createResourceAsync() {
        ApiIssuesInner client = this.manager().inner().apiIssues();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.issueId, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IssueContract> updateResourceAsync() {
        ApiIssuesInner client = this.manager().inner().apiIssues();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.issueId, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IssueContractInner> getInnerAsync() {
        ApiIssuesInner client = this.manager().inner().apiIssues();
        return client.getAsync(this.resourceGroupName, this.serviceName, this.apiId, this.issueId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String apiId() {
        return this.inner().apiId();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String description() {
        return this.inner().description();
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
    public State state() {
        return this.inner().state();
    }

    @Override
    public String title() {
        return this.inner().title();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userId() {
        return this.inner().userId();
    }

    @Override
    public IssueContractImpl withExistingApi(String resourceGroupName, String serviceName, String apiId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        return this;
    }

    @Override
    public IssueContractImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public IssueContractImpl withTitle(String title) {
        this.inner().withTitle(title);
        return this;
    }

    @Override
    public IssueContractImpl withUserId(String userId) {
        this.inner().withUserId(userId);
        return this;
    }

    @Override
    public IssueContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public IssueContractImpl withApiId(String apiId) {
        this.inner().withApiId(apiId);
        return this;
    }

    @Override
    public IssueContractImpl withCreatedDate(DateTime createdDate) {
        this.inner().withCreatedDate(createdDate);
        return this;
    }

    @Override
    public IssueContractImpl withState(State state) {
        this.inner().withState(state);
        return this;
    }

}
