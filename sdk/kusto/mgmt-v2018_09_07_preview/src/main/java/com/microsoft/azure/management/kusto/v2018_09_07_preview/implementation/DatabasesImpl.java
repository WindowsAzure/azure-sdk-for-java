/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.Databases;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.DatabasePrincipal;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.DatabasePrincipalListResult;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.Database;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.CheckNameResult;

class DatabasesImpl extends WrapperImpl<DatabasesInner> implements Databases {
    private final KustoManager manager;

    DatabasesImpl(KustoManager manager) {
        super(manager.inner().databases());
        this.manager = manager;
    }

    public KustoManager manager() {
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
    public Observable<DatabasePrincipal> listPrincipalsAsync(String resourceGroupName, String clusterName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.listPrincipalsAsync(resourceGroupName, clusterName, databaseName)
        .flatMap(new Func1<List<DatabasePrincipalInner>, Observable<DatabasePrincipalInner>>() {
            @Override
            public Observable<DatabasePrincipalInner> call(List<DatabasePrincipalInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DatabasePrincipalInner, DatabasePrincipal>() {
            @Override
            public DatabasePrincipal call(DatabasePrincipalInner inner) {
                return new DatabasePrincipalImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DatabasePrincipalListResult> addPrincipalsAsync(String resourceGroupName, String clusterName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.addPrincipalsAsync(resourceGroupName, clusterName, databaseName)
        .map(new Func1<DatabasePrincipalListResultInner, DatabasePrincipalListResult>() {
            @Override
            public DatabasePrincipalListResult call(DatabasePrincipalListResultInner inner) {
                return new DatabasePrincipalListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DatabasePrincipalListResult> removePrincipalsAsync(String resourceGroupName, String clusterName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.removePrincipalsAsync(resourceGroupName, clusterName, databaseName)
        .map(new Func1<DatabasePrincipalListResultInner, DatabasePrincipalListResult>() {
            @Override
            public DatabasePrincipalListResult call(DatabasePrincipalListResultInner inner) {
                return new DatabasePrincipalListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Database> listByClusterAsync(String resourceGroupName, String clusterName) {
        DatabasesInner client = this.inner();
        return client.listByClusterAsync(resourceGroupName, clusterName)
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
    public Observable<Database> getAsync(String resourceGroupName, String clusterName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName, databaseName)
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
    public Completable deleteAsync(String resourceGroupName, String clusterName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterName, databaseName).toCompletable();
    }

    @Override
    public Observable<CheckNameResult> checkNameAvailabilityAsync(String resourceGroupName, String clusterName, String name) {
        DatabasesInner client = this.inner();
        return client.checkNameAvailabilityAsync(resourceGroupName, clusterName, name)
        .map(new Func1<CheckNameResultInner, CheckNameResult>() {
            @Override
            public CheckNameResult call(CheckNameResultInner inner) {
                return new CheckNameResultImpl(inner, manager());
            }
        });
    }

}
