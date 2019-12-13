/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccounts;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccount;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccountKeys;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccountEnumerateSkusResult;

class CognitiveServicesAccountsImpl extends WrapperImpl<CognitiveServicesAccountsInner> implements CognitiveServicesAccounts {
    private final CognitiveServicesManager manager;

    CognitiveServicesAccountsImpl(CognitiveServicesManager manager) {
        super(manager.inner().cognitiveServicesAccounts());
        this.manager = manager;
    }

    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public CognitiveServicesAccountImpl defineAccount(String name) {
        return wrapAccountModel(name);
    }

    private CognitiveServicesAccountImpl wrapAccountModel(String name) {
        return new CognitiveServicesAccountImpl(name, new CognitiveServicesAccountInner(), this.manager());
    }

    private CognitiveServicesAccountImpl wrapCognitiveServicesAccountModel(CognitiveServicesAccountInner inner) {
        return  new CognitiveServicesAccountImpl(inner.name(), inner, manager());
    }

    private Observable<CognitiveServicesAccountInner> getCognitiveServicesAccountInnerUsingCognitiveServicesAccountsInnerAsync(String resourceGroupName, String name) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    public Observable<CognitiveServicesAccount> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getCognitiveServicesAccountInnerUsingCognitiveServicesAccountsInnerAsync(resourceGroupName, name).flatMap(new Func1<CognitiveServicesAccountInner, Observable<CognitiveServicesAccount>> () {
            @Override
            public Observable<CognitiveServicesAccount> call(CognitiveServicesAccountInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return  Observable.just((CognitiveServicesAccount)wrapCognitiveServicesAccountModel(inner));
                }
            }
        });
    }

    @Override
    public Observable<CognitiveServicesAccount> listByResourceGroupAsync(String resourceGroupName) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<CognitiveServicesAccountInner>>() {
            @Override
            public Observable<CognitiveServicesAccountInner> call(Page<CognitiveServicesAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccount>() {
            @Override
            public CognitiveServicesAccount call(CognitiveServicesAccountInner inner) {
                return wrapCognitiveServicesAccountModel(inner);
            }
        });
    }

    @Override
    public Observable<CognitiveServicesAccount> listAsync() {
        CognitiveServicesAccountsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<CognitiveServicesAccountInner>, Observable<CognitiveServicesAccountInner>>() {
            @Override
            public Observable<CognitiveServicesAccountInner> call(Page<CognitiveServicesAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<CognitiveServicesAccountInner, CognitiveServicesAccount>() {
            @Override
            public CognitiveServicesAccount call(CognitiveServicesAccountInner inner) {
                return wrapCognitiveServicesAccountModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<CognitiveServicesAccountKeys> listKeysAsync(String resourceGroupName, String accountName) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, accountName)
        .map(new Func1<CognitiveServicesAccountKeysInner, CognitiveServicesAccountKeys>() {
            @Override
            public CognitiveServicesAccountKeys call(CognitiveServicesAccountKeysInner inner) {
                return new CognitiveServicesAccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CognitiveServicesAccountKeys> regenerateKeyAsync(String resourceGroupName, String accountName) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, accountName)
        .map(new Func1<CognitiveServicesAccountKeysInner, CognitiveServicesAccountKeys>() {
            @Override
            public CognitiveServicesAccountKeys call(CognitiveServicesAccountKeysInner inner) {
                return new CognitiveServicesAccountKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CognitiveServicesAccountEnumerateSkusResult> listSkusAsync(String resourceGroupName, String accountName) {
        CognitiveServicesAccountsInner client = this.inner();
        return client.listSkusAsync(resourceGroupName, accountName)
        .map(new Func1<CognitiveServicesAccountEnumerateSkusResultInner, CognitiveServicesAccountEnumerateSkusResult>() {
            @Override
            public CognitiveServicesAccountEnumerateSkusResult call(CognitiveServicesAccountEnumerateSkusResultInner inner) {
                return new CognitiveServicesAccountEnumerateSkusResultImpl(inner, manager());
            }
        });
    }

}
