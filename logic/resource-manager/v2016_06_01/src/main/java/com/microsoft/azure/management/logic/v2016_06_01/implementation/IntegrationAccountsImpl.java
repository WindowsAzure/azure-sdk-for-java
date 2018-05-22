/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccounts;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccount;
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
import java.util.List;
import com.microsoft.azure.management.logic.v2016_06_01.CallbackUrl;
import com.microsoft.azure.management.logic.v2016_06_01.KeyVaultKey;
import com.microsoft.azure.management.logic.v2016_06_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2016_06_01.ListKeyVaultKeysDefinition;
import com.microsoft.azure.management.logic.v2016_06_01.TrackingEventsDefinition;

class IntegrationAccountsImpl extends GroupableResourcesCoreImpl<IntegrationAccount, IntegrationAccountImpl, IntegrationAccountInner, IntegrationAccountsInner, LogicManager>  implements IntegrationAccounts {
    protected IntegrationAccountsImpl(LogicManager manager) {
        super(manager.inner().integrationAccounts(), manager);
    }

    @Override
    protected Observable<IntegrationAccountInner> getInnerAsync(String resourceGroupName, String name) {
        IntegrationAccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        IntegrationAccountsInner client = this.inner();
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
    public PagedList<IntegrationAccount> listByResourceGroup(String resourceGroupName) {
        IntegrationAccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<IntegrationAccountInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        IntegrationAccountsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<IntegrationAccountInner>, Observable<Page<IntegrationAccountInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountInner>> call(Page<IntegrationAccountInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IntegrationAccount> listByResourceGroupAsync(String resourceGroupName) {
        IntegrationAccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<IntegrationAccountInner>, Observable<Page<IntegrationAccountInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountInner>> call(Page<IntegrationAccountInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IntegrationAccountInner>, Iterable<IntegrationAccountInner>>() {
            @Override
            public Iterable<IntegrationAccountInner> call(Page<IntegrationAccountInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IntegrationAccountInner, IntegrationAccount>() {
            @Override
            public IntegrationAccount call(IntegrationAccountInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public PagedList<IntegrationAccount> list() {
        IntegrationAccountsInner client = this.inner();
        return this.wrapList(client.list());
    }

    private Observable<Page<IntegrationAccountInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        IntegrationAccountsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<IntegrationAccountInner>, Observable<Page<IntegrationAccountInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountInner>> call(Page<IntegrationAccountInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IntegrationAccount> listAsync() {
        IntegrationAccountsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<IntegrationAccountInner>, Observable<Page<IntegrationAccountInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountInner>> call(Page<IntegrationAccountInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IntegrationAccountInner>, Iterable<IntegrationAccountInner>>() {
            @Override
            public Iterable<IntegrationAccountInner> call(Page<IntegrationAccountInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IntegrationAccountInner, IntegrationAccount>() {
            @Override
            public IntegrationAccount call(IntegrationAccountInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public IntegrationAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<CallbackUrl> getCallbackUrlAsync(String resourceGroupName, String integrationAccountName, GetCallbackUrlParameters parameters) {
        IntegrationAccountsInner client = this.inner();
        return client.getCallbackUrlAsync(resourceGroupName, integrationAccountName, parameters)
        .map(new Func1<CallbackUrlInner, CallbackUrl>() {
            @Override
            public CallbackUrl call(CallbackUrlInner inner) {
                return new CallbackUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<KeyVaultKey> listKeyVaultKeysAsync(String resourceGroupName, String integrationAccountName, ListKeyVaultKeysDefinition listKeyVaultKeys) {
        IntegrationAccountsInner client = this.inner();
        return client.listKeyVaultKeysAsync(resourceGroupName, integrationAccountName, listKeyVaultKeys)
        .flatMap(new Func1<List<KeyVaultKeyInner>, Observable<KeyVaultKeyInner>>() {
            @Override
            public Observable<KeyVaultKeyInner> call(List<KeyVaultKeyInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<KeyVaultKeyInner, KeyVaultKey>() {
            @Override
            public KeyVaultKey call(KeyVaultKeyInner inner) {
                return new KeyVaultKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable logTrackingEventsAsync(String resourceGroupName, String integrationAccountName, TrackingEventsDefinition logTrackingEvents) {
        IntegrationAccountsInner client = this.inner();
        return client.logTrackingEventsAsync(resourceGroupName, integrationAccountName, logTrackingEvents).toCompletable();
    }

    @Override
    public Observable<IntegrationAccount> regenerateAccessKeyAsync(String resourceGroupName, String integrationAccountName) {
        IntegrationAccountsInner client = this.inner();
        return client.regenerateAccessKeyAsync(resourceGroupName, integrationAccountName)
        .map(new Func1<IntegrationAccountInner, IntegrationAccount>() {
            @Override
            public IntegrationAccount call(IntegrationAccountInner inner) {
                return new IntegrationAccountImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    protected IntegrationAccountImpl wrapModel(IntegrationAccountInner inner) {
        return  new IntegrationAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected IntegrationAccountImpl wrapModel(String name) {
        return new IntegrationAccountImpl(name, new IntegrationAccountInner(), this.manager());
    }

}
