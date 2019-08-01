/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountSessions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountSession;

class IntegrationAccountSessionsImpl extends WrapperImpl<IntegrationAccountSessionsInner> implements IntegrationAccountSessions {
    private final LogicManager manager;

    IntegrationAccountSessionsImpl(LogicManager manager) {
        super(manager.inner().integrationAccountSessions());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountSessionImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountSessionImpl wrapModel(IntegrationAccountSessionInner inner) {
        return  new IntegrationAccountSessionImpl(inner, manager());
    }

    private IntegrationAccountSessionImpl wrapModel(String name) {
        return new IntegrationAccountSessionImpl(name, this.manager());
    }

    @Override
    public Observable<IntegrationAccountSession> listAsync(final String resourceGroupName, final String integrationAccountName) {
        IntegrationAccountSessionsInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
        .flatMapIterable(new Func1<Page<IntegrationAccountSessionInner>, Iterable<IntegrationAccountSessionInner>>() {
            @Override
            public Iterable<IntegrationAccountSessionInner> call(Page<IntegrationAccountSessionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationAccountSessionInner, IntegrationAccountSession>() {
            @Override
            public IntegrationAccountSession call(IntegrationAccountSessionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationAccountSession> getAsync(String resourceGroupName, String integrationAccountName, String sessionName) {
        IntegrationAccountSessionsInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, sessionName)
        .map(new Func1<IntegrationAccountSessionInner, IntegrationAccountSession>() {
            @Override
            public IntegrationAccountSession call(IntegrationAccountSessionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String sessionName) {
        IntegrationAccountSessionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, sessionName).toCompletable();
    }

}
