/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.ProductGroupContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.GroupType;

class ProductGroupContractImpl extends CreatableUpdatableImpl<ProductGroupContract, GroupContractInner, ProductGroupContractImpl> implements ProductGroupContract, ProductGroupContract.Definition, ProductGroupContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String productId;
    private String groupId;

    ProductGroupContractImpl(String name, ApiManagementManager manager) {
        super(name, new GroupContractInner());
        this.manager = manager;
        // Set resource name
        this.groupId = name;
        //
    }

    ProductGroupContractImpl(GroupContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.groupId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.productId = IdParsingUtils.getValueFromIdByName(inner.id(), "products");
        this.groupId = IdParsingUtils.getValueFromIdByName(inner.id(), "groups");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ProductGroupContract> createResourceAsync() {
        ProductGroupsInner client = this.manager().inner().productGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.productId, this.groupId)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ProductGroupContract> updateResourceAsync() {
        ProductGroupsInner client = this.manager().inner().productGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.productId, this.groupId)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GroupContractInner> getInnerAsync() {
        ProductGroupsInner client = this.manager().inner().productGroups();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean builtIn() {
        return this.inner().builtIn();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String externalId() {
        return this.inner().externalId();
    }

    @Override
    public GroupType groupContractType() {
        return this.inner().groupContractType();
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
    public ProductGroupContractImpl withExistingProduct(String resourceGroupName, String serviceName, String productId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.productId = productId;
        return this;
    }

}
