/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseUsages;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseUsage;

class DatabaseUsagesImpl extends WrapperImpl<DatabaseUsagesInner> implements DatabaseUsages {
    private final SqlManager manager;

    DatabaseUsagesImpl(SqlManager manager) {
        super(manager.inner().databaseUsages());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private DatabaseUsageImpl wrapModel(DatabaseUsageInner inner) {
        return  new DatabaseUsageImpl(inner, manager());
    }

    @Override
    public Observable<DatabaseUsage> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabaseUsagesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<DatabaseUsageInner>, Observable<DatabaseUsageInner>>() {
            @Override
            public Observable<DatabaseUsageInner> call(List<DatabaseUsageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DatabaseUsageInner, DatabaseUsage>() {
            @Override
            public DatabaseUsage call(DatabaseUsageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
