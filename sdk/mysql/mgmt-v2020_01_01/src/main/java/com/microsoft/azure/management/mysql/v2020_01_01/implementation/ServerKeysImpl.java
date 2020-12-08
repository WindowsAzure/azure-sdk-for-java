/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mysql.v2020_01_01.ServerKeys;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mysql.v2020_01_01.ServerKey;

class ServerKeysImpl extends WrapperImpl<ServerKeysInner> implements ServerKeys {
    private final MySQLManager manager;

    ServerKeysImpl(MySQLManager manager) {
        super(manager.inner().serverKeys());
        this.manager = manager;
    }

    public MySQLManager manager() {
        return this.manager;
    }

    @Override
    public ServerKeyImpl define(String name) {
        return wrapModel(name);
    }

    private ServerKeyImpl wrapModel(ServerKeyInner inner) {
        return  new ServerKeyImpl(inner, manager());
    }

    private ServerKeyImpl wrapModel(String name) {
        return new ServerKeyImpl(name, this.manager());
    }

    @Override
    public Observable<ServerKey> listAsync(final String resourceGroupName, final String serverName) {
        ServerKeysInner client = this.inner();
        return client.listAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<ServerKeyInner>, Iterable<ServerKeyInner>>() {
            @Override
            public Iterable<ServerKeyInner> call(Page<ServerKeyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServerKeyInner, ServerKey>() {
            @Override
            public ServerKey call(ServerKeyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerKey> getAsync(String resourceGroupName, String serverName, String keyName) {
        ServerKeysInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, keyName)
        .flatMap(new Func1<ServerKeyInner, Observable<ServerKey>>() {
            @Override
            public Observable<ServerKey> call(ServerKeyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ServerKey)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String serverName, String keyName, String resourceGroupName) {
        ServerKeysInner client = this.inner();
        return client.deleteAsync(serverName, keyName, resourceGroupName).toCompletable();
    }

}
