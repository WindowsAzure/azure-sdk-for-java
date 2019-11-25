/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.resources.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2016_06_01.Tenants;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2016_06_01.TenantIdDescription;

class TenantsImpl extends WrapperImpl<TenantsInner> implements Tenants {
    private final Manager manager;

    TenantsImpl(Manager manager) {
        super(manager.inner().tenants());
        this.manager = manager;
    }

    public Manager manager() {
        return this.manager;
    }

    @Override
    public Observable<TenantIdDescription> listAsync() {
        TenantsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<TenantIdDescriptionInner>, Iterable<TenantIdDescriptionInner>>() {
            @Override
            public Iterable<TenantIdDescriptionInner> call(Page<TenantIdDescriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TenantIdDescriptionInner, TenantIdDescription>() {
            @Override
            public TenantIdDescription call(TenantIdDescriptionInner inner) {
                return new TenantIdDescriptionImpl(inner, manager());
            }
        });
    }

}
