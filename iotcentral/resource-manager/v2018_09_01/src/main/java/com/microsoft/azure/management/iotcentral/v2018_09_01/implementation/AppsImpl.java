/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.iotcentral.v2018_09_01.Apps;
import com.microsoft.azure.management.iotcentral.v2018_09_01.App;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.iotcentral.v2018_09_01.AppAvailabilityInfo;

class AppsImpl extends GroupableResourcesCoreImpl<App, AppImpl, AppInner, AppsInner, IoTCentralManager>  implements Apps {
    protected AppsImpl(IoTCentralManager manager) {
        super(manager.inner().apps(), manager);
    }

    @Override
    protected Observable<AppInner> getInnerAsync(String resourceGroupName, String name) {
        AppsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        AppsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<App> listByResourceGroup(String resourceGroupName) {
        AppsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<App> listByResourceGroupAsync(String resourceGroupName) {
        AppsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AppInner>, Iterable<AppInner>>() {
            @Override
            public Iterable<AppInner> call(Page<AppInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppInner, App>() {
            @Override
            public App call(AppInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<App> list() {
        AppsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<App> listAsync() {
        AppsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AppInner>, Iterable<AppInner>>() {
            @Override
            public Iterable<AppInner> call(Page<AppInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppInner, App>() {
            @Override
            public App call(AppInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public AppImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<AppAvailabilityInfo> checkNameAvailabilityAsync() {
        AppsInner client = this.inner();
        return client.checkNameAvailabilityAsync()
        .map(new Func1<AppAvailabilityInfoInner, AppAvailabilityInfo>() {
            @Override
            public AppAvailabilityInfo call(AppAvailabilityInfoInner inner) {
                return new AppAvailabilityInfoImpl(inner, manager());
            }
        });
    }

    @Override
    protected AppImpl wrapModel(AppInner inner) {
        return  new AppImpl(inner.name(), inner, manager());
    }

    @Override
    protected AppImpl wrapModel(String name) {
        return new AppImpl(name, new AppInner(), this.manager());
    }

}
