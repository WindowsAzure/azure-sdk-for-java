/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.RestorePoints;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2017_03_01_preview.RestorePoint;

class RestorePointsImpl extends WrapperImpl<RestorePointsInner> implements RestorePoints {
    private final SqlManager manager;

    RestorePointsImpl(SqlManager manager) {
        super(manager.inner().restorePoints());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private RestorePointImpl wrapModel(RestorePointInner inner) {
        return  new RestorePointImpl(inner, manager());
    }

    @Override
    public Observable<RestorePoint> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        RestorePointsInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<RestorePointInner>, Observable<RestorePointInner>>() {
            @Override
            public Observable<RestorePointInner> call(List<RestorePointInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<RestorePointInner, RestorePoint>() {
            @Override
            public RestorePoint call(RestorePointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RestorePoint> getAsync(String resourceGroupName, String serverName, String databaseName, String restorePointName) {
        RestorePointsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName, restorePointName)
        .map(new Func1<RestorePointInner, RestorePoint>() {
            @Override
            public RestorePoint call(RestorePointInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String databaseName, String restorePointName) {
        RestorePointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, databaseName, restorePointName).toCompletable();
    }

    @Override
    public Observable<RestorePoint> createAsync(String resourceGroupName, String serverName, String databaseName, String restorePointLabel) {
        RestorePointsInner client = this.inner();
        return client.createAsync(resourceGroupName, serverName, databaseName, restorePointLabel)
        .map(new Func1<RestorePointInner, RestorePoint>() {
            @Override
            public RestorePoint call(RestorePointInner inner) {
                return new RestorePointImpl(inner, manager());
            }
        });
    }

}
