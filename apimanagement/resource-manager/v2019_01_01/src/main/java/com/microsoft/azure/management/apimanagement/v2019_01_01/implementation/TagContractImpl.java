/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.TagContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class TagContractImpl extends CreatableUpdatableImpl<TagContract, TagContractInner, TagContractImpl> implements TagContract, TagContract.Definition, TagContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String apiId;
    private String operationId;
    private String tagId;

    TagContractImpl(String name, ApiManagementManager manager) {
        super(name, new TagContractInner());
        this.manager = manager;
        // Set resource name
        this.tagId = name;
        //
    }

    TagContractImpl(TagContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.tagId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.apiId = IdParsingUtils.getValueFromIdByName(inner.id(), "apis");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operations");
        this.tagId = IdParsingUtils.getValueFromIdByName(inner.id(), "tags");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TagContract> createResourceAsync() {
        TagsInner client = this.manager().inner().tags();
        return client.assignToOperationAsync(this.resourceGroupName, this.serviceName, this.apiId, this.operationId, this.tagId)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<TagContract> updateResourceAsync() {
        TagsInner client = this.manager().inner().tags();
        return client.assignToOperationAsync(this.resourceGroupName, this.serviceName, this.apiId, this.operationId, this.tagId)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TagContractInner> getInnerAsync() {
        TagsInner client = this.manager().inner().tags();
        return client.getByOperationAsync(this.resourceGroupName, this.serviceName, this.apiId, this.operationId, this.tagId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String displayName() {
        return this.inner().displayName();
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

    @Override
    public TagContractImpl withExistingOperation(String resourceGroupName, String serviceName, String apiId, String operationId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        this.operationId = operationId;
        return this;
    }

}
