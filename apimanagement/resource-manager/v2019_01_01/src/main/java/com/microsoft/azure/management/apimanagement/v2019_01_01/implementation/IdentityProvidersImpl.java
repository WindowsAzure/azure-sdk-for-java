/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.IdentityProviders;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.IdentityProviderContract;
import com.microsoft.azure.management.apimanagement.v2019_01_01.IdentityProviderType;

class IdentityProvidersImpl extends WrapperImpl<IdentityProvidersInner> implements IdentityProviders {
    private final ApiManagementManager manager;

    IdentityProvidersImpl(ApiManagementManager manager) {
        super(manager.inner().identityProviders());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public IdentityProviderContractImpl define(String name) {
        return wrapModel(name);
    }

    private IdentityProviderContractImpl wrapModel(IdentityProviderContractInner inner) {
        return  new IdentityProviderContractImpl(inner, manager());
    }

    private IdentityProviderContractImpl wrapModel(String name) {
        return new IdentityProviderContractImpl(name, this.manager());
    }

    @Override
    public Observable<IdentityProviderContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        IdentityProvidersInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<IdentityProviderContractInner>, Iterable<IdentityProviderContractInner>>() {
            @Override
            public Iterable<IdentityProviderContractInner> call(Page<IdentityProviderContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IdentityProviderContractInner, IdentityProviderContract>() {
            @Override
            public IdentityProviderContract call(IdentityProviderContractInner inner) {
                return new IdentityProviderContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, IdentityProviderType identityProviderName) {
        IdentityProvidersInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, identityProviderName).toCompletable();
    }

    @Override
    public Observable<IdentityProviderContract> getAsync(String resourceGroupName, String serviceName, IdentityProviderType identityProviderName) {
        IdentityProvidersInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, identityProviderName)
        .map(new Func1<IdentityProviderContractInner, IdentityProviderContract>() {
            @Override
            public IdentityProviderContract call(IdentityProviderContractInner inner) {
                return new IdentityProviderContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, IdentityProviderType identityProviderName, String ifMatch) {
        IdentityProvidersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, identityProviderName, ifMatch).toCompletable();
    }

}
