/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SchemaContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class SchemaContractImpl extends CreatableUpdatableImpl<SchemaContract, SchemaContractInner, SchemaContractImpl> implements SchemaContract, SchemaContract.Definition, SchemaContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String apiId;
    private String schemaId;
    private String cifMatch;
    private String uifMatch;

    SchemaContractImpl(String name, ApiManagementManager manager) {
        super(name, new SchemaContractInner());
        this.manager = manager;
        // Set resource name
        this.schemaId = name;
        //
    }

    SchemaContractImpl(SchemaContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.schemaId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.apiId = IdParsingUtils.getValueFromIdByName(inner.id(), "apis");
        this.schemaId = IdParsingUtils.getValueFromIdByName(inner.id(), "schemas");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SchemaContract> createResourceAsync() {
        ApiSchemasInner client = this.manager().inner().apiSchemas();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.schemaId, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SchemaContract> updateResourceAsync() {
        ApiSchemasInner client = this.manager().inner().apiSchemas();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.schemaId, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SchemaContractInner> getInnerAsync() {
        ApiSchemasInner client = this.manager().inner().apiSchemas();
        return client.getAsync(this.resourceGroupName, this.serviceName, this.apiId, this.schemaId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String contentType() {
        return this.inner().contentType();
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
    public String value() {
        return this.inner().value();
    }

    @Override
    public SchemaContractImpl withExistingApi(String resourceGroupName, String serviceName, String apiId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        return this;
    }

    @Override
    public SchemaContractImpl withContentType(String contentType) {
        this.inner().withContentType(contentType);
        return this;
    }

    @Override
    public SchemaContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public SchemaContractImpl withValue(String value) {
        this.inner().withValue(value);
        return this;
    }

}
