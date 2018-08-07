/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_06_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_06_01.ExpressRouteServiceProviders;
import com.microsoft.azure.management.network.v2018_06_01.ExpressRouteServiceProvider;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ExpressRouteServiceProvidersImpl extends GroupableResourcesCoreImpl<ExpressRouteServiceProvider, ExpressRouteServiceProviderImpl, ExpressRouteServiceProviderInner, ExpressRouteServiceProvidersInner, NetworkManager>  implements ExpressRouteServiceProviders {
    protected ExpressRouteServiceProvidersImpl(NetworkManager manager) {
        super(manager.inner().expressRouteServiceProviders(), manager);
    }

    @Override
    protected Observable<ExpressRouteServiceProviderInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ExpressRouteServiceProvidersInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<ExpressRouteServiceProvider> list() {
        ExpressRouteServiceProvidersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ExpressRouteServiceProvider> listAsync() {
        ExpressRouteServiceProvidersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ExpressRouteServiceProviderInner>, Iterable<ExpressRouteServiceProviderInner>>() {
            @Override
            public Iterable<ExpressRouteServiceProviderInner> call(Page<ExpressRouteServiceProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRouteServiceProviderInner, ExpressRouteServiceProvider>() {
            @Override
            public ExpressRouteServiceProvider call(ExpressRouteServiceProviderInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    protected ExpressRouteServiceProviderImpl wrapModel(ExpressRouteServiceProviderInner inner) {
        return  new ExpressRouteServiceProviderImpl(inner.name(), inner, manager());
    }

    @Override
    protected ExpressRouteServiceProviderImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
