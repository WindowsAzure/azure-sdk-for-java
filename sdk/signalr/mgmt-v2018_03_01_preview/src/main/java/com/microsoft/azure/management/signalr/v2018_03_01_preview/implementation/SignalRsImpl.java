/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.signalr.v2018_03_01_preview.SignalRs;
import com.microsoft.azure.management.signalr.v2018_03_01_preview.SignalRResource;
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
import com.microsoft.azure.management.signalr.v2018_03_01_preview.SignalRKeys;
import com.microsoft.azure.management.signalr.v2018_03_01_preview.NameAvailability;

class SignalRsImpl extends GroupableResourcesCoreImpl<SignalRResource, SignalRResourceImpl, SignalRResourceInner, SignalRsInner, SignalRManager>  implements SignalRs {
    protected SignalRsImpl(SignalRManager manager) {
        super(manager.inner().signalRs(), manager);
    }

    @Override
    protected Observable<SignalRResourceInner> getInnerAsync(String resourceGroupName, String name) {
        SignalRsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        SignalRsInner client = this.inner();
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
    public PagedList<SignalRResource> listByResourceGroup(String resourceGroupName) {
        SignalRsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<SignalRResourceInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        SignalRsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<SignalRResourceInner>, Observable<Page<SignalRResourceInner>>>() {
            @Override
            public Observable<Page<SignalRResourceInner>> call(Page<SignalRResourceInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<SignalRResource> listByResourceGroupAsync(String resourceGroupName) {
        SignalRsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<SignalRResourceInner>, Observable<Page<SignalRResourceInner>>>() {
            @Override
            public Observable<Page<SignalRResourceInner>> call(Page<SignalRResourceInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<SignalRResourceInner>, Iterable<SignalRResourceInner>>() {
            @Override
            public Iterable<SignalRResourceInner> call(Page<SignalRResourceInner> page) {
                return page.items();
            }
       })
        .map(new Func1<SignalRResourceInner, SignalRResource>() {
            @Override
            public SignalRResource call(SignalRResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public PagedList<SignalRResource> list() {
        SignalRsInner client = this.inner();
        return this.wrapList(client.list());
    }

    private Observable<Page<SignalRResourceInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        SignalRsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<SignalRResourceInner>, Observable<Page<SignalRResourceInner>>>() {
            @Override
            public Observable<Page<SignalRResourceInner>> call(Page<SignalRResourceInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<SignalRResource> listAsync() {
        SignalRsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<SignalRResourceInner>, Observable<Page<SignalRResourceInner>>>() {
            @Override
            public Observable<Page<SignalRResourceInner>> call(Page<SignalRResourceInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<SignalRResourceInner>, Iterable<SignalRResourceInner>>() {
            @Override
            public Iterable<SignalRResourceInner> call(Page<SignalRResourceInner> page) {
                return page.items();
            }
       })
        .map(new Func1<SignalRResourceInner, SignalRResource>() {
            @Override
            public SignalRResource call(SignalRResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public SignalRResourceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<SignalRKeys> listKeysAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, resourceName)
        .map(new Func1<SignalRKeysInner, SignalRKeys>() {
            @Override
            public SignalRKeys call(SignalRKeysInner inner) {
                return new SignalRKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SignalRKeys> regenerateKeyAsync(String resourceGroupName, String resourceName) {
        SignalRsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, resourceName)
        .map(new Func1<SignalRKeysInner, SignalRKeys>() {
            @Override
            public SignalRKeys call(SignalRKeysInner inner) {
                return new SignalRKeysImpl(inner, manager());
            }
        });
    }

    @Override
    protected SignalRResourceImpl wrapModel(SignalRResourceInner inner) {
        return  new SignalRResourceImpl(inner.name(), inner, manager());
    }

    @Override
    protected SignalRResourceImpl wrapModel(String name) {
        return new SignalRResourceImpl(name, new SignalRResourceInner(), this.manager());
    }

    @Override
    public Observable<NameAvailability> checkNameAvailabilityAsync(String location) {
        SignalRsInner client = this.inner();
        return client.checkNameAvailabilityAsync(location)
        .map(new Func1<NameAvailabilityInner, NameAvailability>() {
            @Override
            public NameAvailability call(NameAvailabilityInner inner) {
                return new NameAvailabilityImpl(inner, manager());
            }
        });
    }

}
