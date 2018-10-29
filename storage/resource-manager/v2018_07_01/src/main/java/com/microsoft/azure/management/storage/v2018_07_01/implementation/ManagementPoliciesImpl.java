/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2018_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2018_07_01.ManagementPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.storage.v2018_07_01.StorageAccountManagementPolicies;

class ManagementPoliciesImpl extends WrapperImpl<ManagementPoliciesInner> implements ManagementPolicies {
    private final StorageManager manager;

    ManagementPoliciesImpl(StorageManager manager) {
        super(manager.inner().managementPolicies());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public StorageAccountManagementPoliciesImpl define(String name) {
        return wrapModel(name);
    }

    private StorageAccountManagementPoliciesImpl wrapModel(StorageAccountManagementPoliciesInner inner) {
        return  new StorageAccountManagementPoliciesImpl(inner, manager());
    }

    private StorageAccountManagementPoliciesImpl wrapModel(String name) {
        return new StorageAccountManagementPoliciesImpl(name, this.manager());
    }

    @Override
    public Observable<StorageAccountManagementPolicies> getAsync(String resourceGroupName, String accountName) {
        ManagementPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName)
        .map(new Func1<StorageAccountManagementPoliciesInner, StorageAccountManagementPolicies>() {
            @Override
            public StorageAccountManagementPolicies call(StorageAccountManagementPoliciesInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName) {
        ManagementPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName).toCompletable();
    }

}
