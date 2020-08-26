/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mariadb.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mariadb.v2020_01_01.Databases;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.mariadb.v2020_01_01.Database;

class DatabasesImpl extends WrapperImpl<DatabasesInner> implements Databases {
    private final MariaDBManager manager;

    DatabasesImpl(MariaDBManager manager) {
        super(manager.inner().databases());
        this.manager = manager;
    }

    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    public DatabaseImpl define(String name) {
        return wrapModel(name);
    }

    private DatabaseImpl wrapModel(DatabaseInner inner) {
        return  new DatabaseImpl(inner, manager());
    }

    private DatabaseImpl wrapModel(String name) {
        return new DatabaseImpl(name, this.manager());
    }

    @Override
    public Observable<Database> listByServerAsync(String resourceGroupName, String serverName) {
        DatabasesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<DatabaseInner>, Observable<DatabaseInner>>() {
            @Override
            public Observable<DatabaseInner> call(List<DatabaseInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DatabaseInner, Database>() {
            @Override
            public Database call(DatabaseInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Database> getAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<DatabaseInner, Observable<Database>>() {
            @Override
            public Observable<Database> call(DatabaseInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Database)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, databaseName).toCompletable();
    }

}
