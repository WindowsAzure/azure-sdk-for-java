/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.Users;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2016_05_15.User;

class UsersImpl extends WrapperImpl<UsersInner> implements Users {
    private final DevTestLabManager manager;

    UsersImpl(DevTestLabManager manager) {
        super(manager.inner().users());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public UserImpl define(String name) {
        return wrapModel(name);
    }

    private UserImpl wrapModel(UserInner inner) {
        return  new UserImpl(inner, manager());
    }

    private UserImpl wrapModel(String name) {
        return new UserImpl(name, this.manager());
    }

    @Override
    public Observable<User> listAsync(final String resourceGroupName, final String labName) {
        UsersInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<UserInner>, Iterable<UserInner>>() {
            @Override
            public Iterable<UserInner> call(Page<UserInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UserInner, User>() {
            @Override
            public User call(UserInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<User> getAsync(String resourceGroupName, String labName, String name) {
        UsersInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, name)
        .map(new Func1<UserInner, User>() {
            @Override
            public User call(UserInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String name) {
        UsersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, name).toCompletable();
    }

}
