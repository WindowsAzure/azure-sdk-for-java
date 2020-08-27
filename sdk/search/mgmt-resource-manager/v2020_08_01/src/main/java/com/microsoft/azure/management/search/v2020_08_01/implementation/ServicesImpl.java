/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.search.v2020_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.search.v2020_08_01.Services;
import com.microsoft.azure.management.search.v2020_08_01.SearchService;
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
import com.microsoft.azure.management.search.v2020_08_01.CheckNameAvailabilityOutput;

class ServicesImpl extends GroupableResourcesCoreImpl<SearchService, SearchServiceImpl, SearchServiceInner, ServicesInner, SearchManager>  implements Services {
    protected ServicesImpl(SearchManager manager) {
        super(manager.inner().services(), manager);
    }

    @Override
    protected Observable<SearchServiceInner> getInnerAsync(String resourceGroupName, String name) {
        ServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ServicesInner client = this.inner();
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
    public PagedList<SearchService> listByResourceGroup(String resourceGroupName) {
        ServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<SearchService> listByResourceGroupAsync(String resourceGroupName) {
        ServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<SearchServiceInner>, Iterable<SearchServiceInner>>() {
            @Override
            public Iterable<SearchServiceInner> call(Page<SearchServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SearchServiceInner, SearchService>() {
            @Override
            public SearchService call(SearchServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<SearchService> list() {
        ServicesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<SearchService> listAsync() {
        ServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SearchServiceInner>, Iterable<SearchServiceInner>>() {
            @Override
            public Iterable<SearchServiceInner> call(Page<SearchServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SearchServiceInner, SearchService>() {
            @Override
            public SearchService call(SearchServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public SearchServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<CheckNameAvailabilityOutput> checkNameAvailabilityAsync(String name) {
        ServicesInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<CheckNameAvailabilityOutputInner, CheckNameAvailabilityOutput>() {
            @Override
            public CheckNameAvailabilityOutput call(CheckNameAvailabilityOutputInner inner) {
                return new CheckNameAvailabilityOutputImpl(inner, manager());
            }
        });
    }

    @Override
    protected SearchServiceImpl wrapModel(SearchServiceInner inner) {
        return  new SearchServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected SearchServiceImpl wrapModel(String name) {
        return new SearchServiceImpl(name, new SearchServiceInner(), this.manager());
    }

}
