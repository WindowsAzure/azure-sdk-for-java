/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_04_01.ExpressRoutePortsLocations;
import com.microsoft.azure.management.network.v2019_04_01.ExpressRoutePortsLocation;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ExpressRoutePortsLocationsImpl extends GroupableResourcesCoreImpl<ExpressRoutePortsLocation, ExpressRoutePortsLocationImpl, ExpressRoutePortsLocationInner, ExpressRoutePortsLocationsInner, NetworkManager>  implements ExpressRoutePortsLocations {
    protected ExpressRoutePortsLocationsImpl(NetworkManager manager) {
        super(manager.inner().expressRoutePortsLocations(), manager);
    }

    @Override
    protected Observable<ExpressRoutePortsLocationInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ExpressRoutePortsLocationsInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<ExpressRoutePortsLocation> list() {
        ExpressRoutePortsLocationsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ExpressRoutePortsLocation> listAsync() {
        ExpressRoutePortsLocationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ExpressRoutePortsLocationInner>, Iterable<ExpressRoutePortsLocationInner>>() {
            @Override
            public Iterable<ExpressRoutePortsLocationInner> call(Page<ExpressRoutePortsLocationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRoutePortsLocationInner, ExpressRoutePortsLocation>() {
            @Override
            public ExpressRoutePortsLocation call(ExpressRoutePortsLocationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ExpressRoutePortsLocation> getAsync(String locationName) {
        ExpressRoutePortsLocationsInner client = this.inner();
        return client.getAsync(locationName)
        .map(new Func1<ExpressRoutePortsLocationInner, ExpressRoutePortsLocation>() {
            @Override
            public ExpressRoutePortsLocation call(ExpressRoutePortsLocationInner inner) {
                return new ExpressRoutePortsLocationImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    protected ExpressRoutePortsLocationImpl wrapModel(ExpressRoutePortsLocationInner inner) {
        return  new ExpressRoutePortsLocationImpl(inner.name(), inner, manager());
    }

    @Override
    protected ExpressRoutePortsLocationImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
