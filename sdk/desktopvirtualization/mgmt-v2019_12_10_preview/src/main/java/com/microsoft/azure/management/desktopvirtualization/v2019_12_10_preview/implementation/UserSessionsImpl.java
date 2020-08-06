/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.UserSessions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.UserSession;

class UserSessionsImpl extends WrapperImpl<UserSessionsInner> implements UserSessions {
    private final DesktopVirtualizationManager manager;

    UserSessionsImpl(DesktopVirtualizationManager manager) {
        super(manager.inner().userSessions());
        this.manager = manager;
    }

    public DesktopVirtualizationManager manager() {
        return this.manager;
    }

    private UserSessionImpl wrapModel(UserSessionInner inner) {
        return  new UserSessionImpl(inner, manager());
    }

    @Override
    public Observable<UserSession> getAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId) {
        UserSessionsInner client = this.inner();
        return client.getAsync(resourceGroupName, hostPoolName, sessionHostName, userSessionId)
        .map(new Func1<UserSessionInner, UserSession>() {
            @Override
            public UserSession call(UserSessionInner inner) {
                return new UserSessionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId) {
        UserSessionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, hostPoolName, sessionHostName, userSessionId).toCompletable();
    }

    @Override
    public Observable<UserSession> listAsync(final String resourceGroupName, final String hostPoolName, final String sessionHostName) {
        UserSessionsInner client = this.inner();
        return client.listAsync(resourceGroupName, hostPoolName, sessionHostName)
        .flatMapIterable(new Func1<Page<UserSessionInner>, Iterable<UserSessionInner>>() {
            @Override
            public Iterable<UserSessionInner> call(Page<UserSessionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UserSessionInner, UserSession>() {
            @Override
            public UserSession call(UserSessionInner inner) {
                return new UserSessionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable disconnectAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId) {
        UserSessionsInner client = this.inner();
        return client.disconnectAsync(resourceGroupName, hostPoolName, sessionHostName, userSessionId).toCompletable();
    }

    @Override
    public Completable sendMessageMethodAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId) {
        UserSessionsInner client = this.inner();
        return client.sendMessageMethodAsync(resourceGroupName, hostPoolName, sessionHostName, userSessionId).toCompletable();
    }

    @Override
    public Observable<UserSession> listByHostPoolAsync(final String resourceGroupName, final String hostPoolName) {
        UserSessionsInner client = this.inner();
        return client.listByHostPoolAsync(resourceGroupName, hostPoolName)
        .flatMapIterable(new Func1<Page<UserSessionInner>, Iterable<UserSessionInner>>() {
            @Override
            public Iterable<UserSessionInner> call(Page<UserSessionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UserSessionInner, UserSession>() {
            @Override
            public UserSession call(UserSessionInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
