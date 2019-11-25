/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ProductPolicyContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicyContentFormat;

class ProductPolicyContractImpl extends CreatableUpdatableImpl<ProductPolicyContract, PolicyContractInner, ProductPolicyContractImpl> implements ProductPolicyContract, ProductPolicyContract.Definition, ProductPolicyContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String productId;
    private String cifMatch;
    private String uifMatch;

    ProductPolicyContractImpl(String name, ApiManagementManager manager) {
        super(name, new PolicyContractInner());
        this.manager = manager;
        // Set resource name
        this.productId = name;
        //
    }

    ProductPolicyContractImpl(PolicyContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.productId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.productId = IdParsingUtils.getValueFromIdByName(inner.id(), "products");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ProductPolicyContract> createResourceAsync() {
        ProductPolicysInner client = this.manager().inner().productPolicys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.productId, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ProductPolicyContract> updateResourceAsync() {
        ProductPolicysInner client = this.manager().inner().productPolicys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.productId, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PolicyContractInner> getInnerAsync() {
        ProductPolicysInner client = this.manager().inner().productPolicys();
        return client.getAsync(this.resourceGroupName, this.serviceName, this.productId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public PolicyContentFormat contentFormat() {
        return this.inner().contentFormat();
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
    public String policyContent() {
        return this.inner().policyContent();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ProductPolicyContractImpl withExistingProduct(String resourceGroupName, String serviceName, String productId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.productId = productId;
        return this;
    }

    @Override
    public ProductPolicyContractImpl withPolicyContent(String policyContent) {
        this.inner().withPolicyContent(policyContent);
        return this;
    }

    @Override
    public ProductPolicyContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public ProductPolicyContractImpl withContentFormat(PolicyContentFormat contentFormat) {
        this.inner().withContentFormat(contentFormat);
        return this;
    }

}
