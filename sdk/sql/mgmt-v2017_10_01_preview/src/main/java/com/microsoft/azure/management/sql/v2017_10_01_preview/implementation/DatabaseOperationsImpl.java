/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_10_01_preview.DatabaseOperations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import java.util.UUID;
import com.microsoft.azure.management.sql.v2017_10_01_preview.DatabaseOperation;

class DatabaseOperationsImpl extends WrapperImpl<DatabaseOperationsInner> implements DatabaseOperations {
    private final SqlManager manager;

    DatabaseOperationsImpl(SqlManager manager) {
        super(manager.inner().databaseOperations());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private DatabaseOperationImpl wrapModel(DatabaseOperationInner inner) {
        return  new DatabaseOperationImpl(inner, manager());
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String serverName, String databaseName, UUID operationId) {
        DatabaseOperationsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, serverName, databaseName, operationId).toCompletable();
    }

    @Override
    public Observable<DatabaseOperation> listByDatabaseAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        DatabaseOperationsInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMapIterable(new Func1<Page<DatabaseOperationInner>, Iterable<DatabaseOperationInner>>() {
            @Override
            public Iterable<DatabaseOperationInner> call(Page<DatabaseOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DatabaseOperationInner, DatabaseOperation>() {
            @Override
            public DatabaseOperation call(DatabaseOperationInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
