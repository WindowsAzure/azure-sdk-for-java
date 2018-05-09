/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Accounts;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CognitiveServicesAccount;
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
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CognitiveServicesAccountKeys;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.KeyName;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Skus;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Usages;

class AccountsImpl extends GroupableResourcesCoreImpl<CognitiveServicesAccount, CognitiveServicesAccountImpl, CognitiveServicesAccountInner, AccountsInner, CognitiveServicesManager>  implements Accounts {
    protected AccountsImpl(CognitiveServicesManager manager) {
        super(manager.inner().accounts(), manager);
    }

    @Override
    public Skus skus() {
        Skus accessor = this.manager().skus();
        return accessor;
    }

    @Override
    public Usages usages() {
        Usages accessor = this.manager().usages();
        return accessor;
    }

    @Override
    protected Observable<CognitiveServicesAccountInner> getInnerAsync(String resourceGroupName, String name) {
        AccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        AccountsInner client = this.inner();
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
    public PagedList<CognitiveServicesAccount> listByResourceGroup(String resourceGroupName) {
        AccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<CognitiveServicesAccountInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        AccountsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<Page<CognitiveServicesAccountInner>>>() {
            @Override
            public Observable<Page<CognitiveServicesAccountInner>> call(Page<CognitiveServicesAccountInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<CognitiveServicesAccount> listByResourceGroupAsync(String resourceGroupName) {
        AccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<Page<CognitiveServicesAccountInner>>>() {
            @Override
            public Observable<Page<CognitiveServicesAccountInner>> call(Page<CognitiveServicesAccountInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<CognitiveServicesAccountInner>, Iterable<CognitiveServicesAccountInner>>() {
            @Override
            public Iterable<CognitiveServicesAccountInner> call(Page<CognitiveServicesAccountInner> page) {
                return page.items();
            }
       })
        .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccount>() {
            @Override
            public CognitiveServicesAccount call(CognitiveServicesAccountInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public PagedList<CognitiveServicesAccount> list() {
        AccountsInner client = this.inner();
        return this.wrapList(client.list());
    }

    private Observable<Page<CognitiveServicesAccountInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        AccountsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<Page<CognitiveServicesAccountInner>>>() {
            @Override
            public Observable<Page<CognitiveServicesAccountInner>> call(Page<CognitiveServicesAccountInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<CognitiveServicesAccount> listAsync() {
        AccountsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<Page<CognitiveServicesAccountInner>>>() {
            @Override
            public Observable<Page<CognitiveServicesAccountInner>> call(Page<CognitiveServicesAccountInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<CognitiveServicesAccountInner>, Iterable<CognitiveServicesAccountInner>>() {
            @Override
            public Iterable<CognitiveServicesAccountInner> call(Page<CognitiveServicesAccountInner> page) {
                return page.items();
            }
       })
        .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccount>() {
            @Override
            public CognitiveServicesAccount call(CognitiveServicesAccountInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public CognitiveServicesAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<CognitiveServicesAccountKeys> listKeysAsync(String resourceGroupName, String accountName) {
        AccountsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, accountName)
        .map(new Func1<CognitiveServicesAccountKeysInner, CognitiveServicesAccountKeys>() {
            @Override
            public CognitiveServicesAccountKeys call(CognitiveServicesAccountKeysInner inner) {
                return new CognitiveServicesAccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CognitiveServicesAccountKeys> regenerateKeyAsync(String resourceGroupName, String accountName, KeyName keyName) {
        AccountsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, accountName, keyName)
        .map(new Func1<CognitiveServicesAccountKeysInner, CognitiveServicesAccountKeys>() {
            @Override
            public CognitiveServicesAccountKeys call(CognitiveServicesAccountKeysInner inner) {
                return new CognitiveServicesAccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    protected CognitiveServicesAccountImpl wrapModel(CognitiveServicesAccountInner inner) {
        return  new CognitiveServicesAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected CognitiveServicesAccountImpl wrapModel(String name) {
        return new CognitiveServicesAccountImpl(name, new CognitiveServicesAccountInner(), this.manager());
    }

}
