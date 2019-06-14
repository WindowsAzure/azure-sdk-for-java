/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Policys;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicyCollection;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.OperationApiPolicyContract;

class PolicysImpl extends WrapperImpl<PolicysInner> implements Policys {
    private final ApiManagementManager manager;

    PolicysImpl(ApiManagementManager manager) {
        super(manager.inner().policys());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public PolicyContractImpl define(String name) {
        return wrapModel(name);
    }

    private PolicyContractImpl wrapModel(PolicyContractInner inner) {
        return  new PolicyContractImpl(inner, manager());
    }

    private PolicyContractImpl wrapModel(String name) {
        return new PolicyContractImpl(name, this.manager());
    }

    @Override
    public Observable<PolicyCollection> listByServiceAsync(String resourceGroupName, String serviceName) {
        PolicysInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .map(new Func1<PolicyCollectionInner, PolicyCollection>() {
            @Override
            public PolicyCollection call(PolicyCollectionInner inner) {
                return new PolicyCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName) {
        PolicysInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Observable<OperationApiPolicyContract> getAsync(String resourceGroupName, String serviceName) {
        PolicysInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName)
        .map(new Func1<PolicyContractInner, OperationApiPolicyContract>() {
            @Override
            public OperationApiPolicyContract call(PolicyContractInner inner) {
                return new OperationApiPolicyContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String ifMatch) {
        PolicysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, ifMatch).toCompletable();
    }

}
