/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.mixedreality.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.mixedreality.v2020_05_01.SpatialAnchorsAccounts;
import com.microsoft.azure.management.mixedreality.v2020_05_01.SpatialAnchorsAccount;
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
import com.microsoft.azure.management.mixedreality.v2020_05_01.AccountKeys;

class SpatialAnchorsAccountsImpl extends GroupableResourcesCoreImpl<SpatialAnchorsAccount, SpatialAnchorsAccountImpl, SpatialAnchorsAccountInner, SpatialAnchorsAccountsInner, MixedRealityManager>  implements SpatialAnchorsAccounts {
    protected SpatialAnchorsAccountsImpl(MixedRealityManager manager) {
        super(manager.inner().spatialAnchorsAccounts(), manager);
    }

    @Override
    protected Observable<SpatialAnchorsAccountInner> getInnerAsync(String resourceGroupName, String name) {
        SpatialAnchorsAccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        SpatialAnchorsAccountsInner client = this.inner();
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
    public PagedList<SpatialAnchorsAccount> listByResourceGroup(String resourceGroupName) {
        SpatialAnchorsAccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<SpatialAnchorsAccount> listByResourceGroupAsync(String resourceGroupName) {
        SpatialAnchorsAccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<SpatialAnchorsAccountInner>, Iterable<SpatialAnchorsAccountInner>>() {
            @Override
            public Iterable<SpatialAnchorsAccountInner> call(Page<SpatialAnchorsAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SpatialAnchorsAccountInner, SpatialAnchorsAccount>() {
            @Override
            public SpatialAnchorsAccount call(SpatialAnchorsAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<SpatialAnchorsAccount> list() {
        SpatialAnchorsAccountsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<SpatialAnchorsAccount> listAsync() {
        SpatialAnchorsAccountsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SpatialAnchorsAccountInner>, Iterable<SpatialAnchorsAccountInner>>() {
            @Override
            public Iterable<SpatialAnchorsAccountInner> call(Page<SpatialAnchorsAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SpatialAnchorsAccountInner, SpatialAnchorsAccount>() {
            @Override
            public SpatialAnchorsAccount call(SpatialAnchorsAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public SpatialAnchorsAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<AccountKeys> listKeysAsync(String resourceGroupName, String accountName) {
        SpatialAnchorsAccountsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, accountName)
        .map(new Func1<AccountKeysInner, AccountKeys>() {
            @Override
            public AccountKeys call(AccountKeysInner inner) {
                return new AccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AccountKeys> regenerateKeysAsync(String resourceGroupName, String accountName) {
        SpatialAnchorsAccountsInner client = this.inner();
        return client.regenerateKeysAsync(resourceGroupName, accountName)
        .map(new Func1<AccountKeysInner, AccountKeys>() {
            @Override
            public AccountKeys call(AccountKeysInner inner) {
                return new AccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    protected SpatialAnchorsAccountImpl wrapModel(SpatialAnchorsAccountInner inner) {
        return  new SpatialAnchorsAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected SpatialAnchorsAccountImpl wrapModel(String name) {
        return new SpatialAnchorsAccountImpl(name, new SpatialAnchorsAccountInner(), this.manager());
    }

}
