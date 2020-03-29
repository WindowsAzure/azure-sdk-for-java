/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiReleaseContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;

class ApiReleaseContractImpl extends CreatableUpdatableImpl<ApiReleaseContract, ApiReleaseContractInner, ApiReleaseContractImpl> implements ApiReleaseContract, ApiReleaseContract.Definition, ApiReleaseContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String apiId;
    private String releaseId;
    private String cifMatch;
    private String uifMatch;

    ApiReleaseContractImpl(String name, ApiManagementManager manager) {
        super(name, new ApiReleaseContractInner());
        this.manager = manager;
        // Set resource name
        this.releaseId = name;
        //
    }

    ApiReleaseContractImpl(ApiReleaseContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.releaseId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.apiId = IdParsingUtils.getValueFromIdByName(inner.id(), "apis");
        this.releaseId = IdParsingUtils.getValueFromIdByName(inner.id(), "releases");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApiReleaseContract> createResourceAsync() {
        ApiReleasesInner client = this.manager().inner().apiReleases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.releaseId, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApiReleaseContract> updateResourceAsync() {
        ApiReleasesInner client = this.manager().inner().apiReleases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.releaseId, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApiReleaseContractInner> getInnerAsync() {
        ApiReleasesInner client = this.manager().inner().apiReleases();
        return client.getAsync(this.resourceGroupName, this.serviceName, this.apiId, this.releaseId);
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
    public DateTime createdDateTime() {
        return this.inner().createdDateTime();
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
    public String notes() {
        return this.inner().notes();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime updatedDateTime() {
        return this.inner().updatedDateTime();
    }

    @Override
    public ApiReleaseContractImpl withExistingApi(String resourceGroupName, String serviceName, String apiId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        return this;
    }

    @Override
    public ApiReleaseContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public ApiReleaseContractImpl withApiId(String apiId) {
        this.inner().withApiId(apiId);
        return this;
    }

    @Override
    public ApiReleaseContractImpl withNotes(String notes) {
        this.inner().withNotes(notes);
        return this;
    }

}
