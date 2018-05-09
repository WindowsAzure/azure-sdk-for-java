/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.scheduler.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.scheduler.v2016_03_01.JobCollections;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.scheduler.v2016_03_01.JobCollectionDefinition;
import com.microsoft.azure.management.scheduler.v2016_03_01.Jobs;

class JobCollectionsImpl extends WrapperImpl<JobCollectionsInner> implements JobCollections {
    private PagedListConverter<JobCollectionDefinitionInner, JobCollectionDefinition> converter;
    private final SchedulerManager manager;

    JobCollectionsImpl(SchedulerManager manager) {
        super(manager.inner().jobCollections());
        this.manager = manager;
        this.converter = new PagedListConverter<JobCollectionDefinitionInner, JobCollectionDefinition>() {
            @Override
            public Observable<JobCollectionDefinition> typeConvertAsync(JobCollectionDefinitionInner inner) {
                return Observable.just((JobCollectionDefinition) wrapModel(inner));
            }
        };
    }

    @Override
    public Jobs jobs() {
        Jobs accessor = this.manager().jobs();
        return accessor;
    }

    public SchedulerManager manager() {
        return this.manager;
    }

    @Override
    public JobCollectionDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    private JobCollectionDefinitionImpl wrapModel(JobCollectionDefinitionInner inner) {
        return  new JobCollectionDefinitionImpl(inner, manager());
    }

    private JobCollectionDefinitionImpl wrapModel(String name) {
        return new JobCollectionDefinitionImpl(name, this.manager());
    }

    @Override
    public Completable enableAsync(String resourceGroupName, String jobCollectionName) {
        JobCollectionsInner client = this.inner();
        return client.enableAsync(resourceGroupName, jobCollectionName).toCompletable();
    }

    @Override
    public Completable disableAsync(String resourceGroupName, String jobCollectionName) {
        JobCollectionsInner client = this.inner();
        return client.disableAsync(resourceGroupName, jobCollectionName).toCompletable();
    }

    @Override
    public PagedList<JobCollectionDefinition> list() {
        JobCollectionsInner client = this.inner();
        return converter.convert(client.list());
    }

    private Observable<Page<JobCollectionDefinitionInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobCollectionsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<JobCollectionDefinitionInner>, Observable<Page<JobCollectionDefinitionInner>>>() {
            @Override
            public Observable<Page<JobCollectionDefinitionInner>> call(Page<JobCollectionDefinitionInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<JobCollectionDefinition> listAsync() {
        JobCollectionsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<JobCollectionDefinitionInner>, Observable<Page<JobCollectionDefinitionInner>>>() {
            @Override
            public Observable<Page<JobCollectionDefinitionInner>> call(Page<JobCollectionDefinitionInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<JobCollectionDefinitionInner>, Iterable<JobCollectionDefinitionInner>>() {
            @Override
            public Iterable<JobCollectionDefinitionInner> call(Page<JobCollectionDefinitionInner> page) {
                return page.items();
            }
       })
        .map(new Func1<JobCollectionDefinitionInner, JobCollectionDefinition>() {
            @Override
            public JobCollectionDefinition call(JobCollectionDefinitionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public PagedList<JobCollectionDefinition> listByResourceGroup(String resourceGroupName) {
        JobCollectionsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<JobCollectionDefinitionInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobCollectionsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<JobCollectionDefinitionInner>, Observable<Page<JobCollectionDefinitionInner>>>() {
            @Override
            public Observable<Page<JobCollectionDefinitionInner>> call(Page<JobCollectionDefinitionInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<JobCollectionDefinition> listByResourceGroupAsync(String resourceGroupName) {
        JobCollectionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<JobCollectionDefinitionInner>, Observable<Page<JobCollectionDefinitionInner>>>() {
            @Override
            public Observable<Page<JobCollectionDefinitionInner>> call(Page<JobCollectionDefinitionInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<JobCollectionDefinitionInner>, Iterable<JobCollectionDefinitionInner>>() {
            @Override
            public Iterable<JobCollectionDefinitionInner> call(Page<JobCollectionDefinitionInner> page) {
                return page.items();
            }
       })
        .map(new Func1<JobCollectionDefinitionInner, JobCollectionDefinition>() {
            @Override
            public JobCollectionDefinition call(JobCollectionDefinitionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    protected Observable<JobCollectionDefinitionInner> getInnerAsync(String resourceGroupName, String name) {
        JobCollectionsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    public JobCollectionDefinition getByResourceGroup(String resourceGroupName, String name) {
        return getByResourceGroupAsync(resourceGroupName, name).toBlocking().last();
    }

    @Override
    public ServiceFuture<JobCollectionDefinition> getByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<JobCollectionDefinition> callback) {
        return ServiceFuture.fromBody(getByResourceGroupAsync(resourceGroupName, name), callback);
    }

    @Override
    public Observable<JobCollectionDefinition> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getInnerAsync(resourceGroupName, name).map(new Func1<JobCollectionDefinitionInner, JobCollectionDefinition> () {
            @Override
            public JobCollectionDefinition call(JobCollectionDefinitionInner innerT) {
                return wrapModel(innerT);
            }
        });
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
    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.deleteByResourceGroupAsync(resourceGroupName, name).await();
    }

    @Override
    public Completable deleteByResourceGroupAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public ServiceFuture<Void> deleteByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteByResourceGroupAsync(resourceGroupName, name).andThen(Observable.<Void>just(null)), serviceCallback);
    }

}
