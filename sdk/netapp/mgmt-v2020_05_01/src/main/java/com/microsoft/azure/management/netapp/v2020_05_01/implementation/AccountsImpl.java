/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.netapp.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.netapp.v2020_05_01.Accounts;
import com.microsoft.azure.management.netapp.v2020_05_01.NetAppAccount;
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

class AccountsImpl extends GroupableResourcesCoreImpl<NetAppAccount, NetAppAccountImpl, NetAppAccountInner, AccountsInner, NetAppManager>  implements Accounts {
    protected AccountsImpl(NetAppManager manager) {
        super(manager.inner().accounts(), manager);
    }

    @Override
    protected Observable<NetAppAccountInner> getInnerAsync(String resourceGroupName, String name) {
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
    public PagedList<NetAppAccount> listByResourceGroup(String resourceGroupName) {
        AccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<NetAppAccount> listByResourceGroupAsync(String resourceGroupName) {
        AccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<NetAppAccountInner>, Observable<NetAppAccountInner>>() {
            @Override
            public Observable<NetAppAccountInner> call(Page<NetAppAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<NetAppAccountInner, NetAppAccount>() {
            @Override
            public NetAppAccount call(NetAppAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public NetAppAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected NetAppAccountImpl wrapModel(NetAppAccountInner inner) {
        return  new NetAppAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected NetAppAccountImpl wrapModel(String name) {
        return new NetAppAccountImpl(name, new NetAppAccountInner(), this.manager());
    }

}
