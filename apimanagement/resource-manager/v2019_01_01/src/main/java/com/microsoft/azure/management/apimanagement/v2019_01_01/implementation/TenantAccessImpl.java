/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.TenantAccess;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.AccessInformationContract;

class TenantAccessImpl extends WrapperImpl<TenantAccessInner> implements TenantAccess {
    private final ApiManagementManager manager;

    TenantAccessImpl(ApiManagementManager manager) {
        super(manager.inner().tenantAccess());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName) {
        TenantAccessInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Observable<AccessInformationContract> getAsync(String resourceGroupName, String serviceName) {
        TenantAccessInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName)
        .map(new Func1<AccessInformationContractInner, AccessInformationContract>() {
            @Override
            public AccessInformationContract call(AccessInformationContractInner inner) {
                return new AccessInformationContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String serviceName, String ifMatch) {
        TenantAccessInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName, ifMatch).toCompletable();
    }

    @Override
    public Completable regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName) {
        TenantAccessInner client = this.inner();
        return client.regeneratePrimaryKeyAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Completable regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName) {
        TenantAccessInner client = this.inner();
        return client.regenerateSecondaryKeyAsync(resourceGroupName, serviceName).toCompletable();
    }

}
