/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PropertyContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;

class PropertyContractImpl extends CreatableUpdatableImpl<PropertyContract, PropertyContractInner, PropertyContractImpl> implements PropertyContract, PropertyContract.Definition, PropertyContract.Update {
    private String resourceGroupName;
    private String serviceName;
    private String propId;
    private String cifMatch;
    private String uifMatch;
    private final ApiManagementManager manager;

    PropertyContractImpl(String name, ApiManagementManager manager) {
        super(name, new PropertyContractInner());
        this.manager = manager;
        // Set resource name
        this.propId = name;
        //
    }

    PropertyContractImpl(PropertyContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.propId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.propId = IdParsingUtils.getValueFromIdByName(inner.id(), "properties");
        // set other parameters for create and update
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PropertyContract> createResourceAsync() {
        PropertysInner client = this.manager().inner().propertys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.propId, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PropertyContract> updateResourceAsync() {
        PropertysInner client = this.manager().inner().propertys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.propId, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PropertyContractInner> getInnerAsync() {
        PropertysInner client = this.manager().inner().propertys();
        return null; // NOP getInnerAsync implementation as get is not supported
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
    public Boolean secret() {
        return this.inner().secret();
    }

    @Override
    public List<String> tags() {
        return this.inner().tags();
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
    public PropertyContractImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public PropertyContractImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public PropertyContractImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public PropertyContractImpl withValue(String value) {
        this.inner().withValue(value);
        return this;
    }

    @Override
    public PropertyContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public PropertyContractImpl withSecret(Boolean secret) {
        this.inner().withSecret(secret);
        return this;
    }

    @Override
    public PropertyContractImpl withTags(List<String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
