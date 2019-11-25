/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolActivities;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolActivity;

class ElasticPoolActivitiesImpl extends WrapperImpl<ElasticPoolActivitiesInner> implements ElasticPoolActivities {
    private final SqlManager manager;

    ElasticPoolActivitiesImpl(SqlManager manager) {
        super(manager.inner().elasticPoolActivities());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ElasticPoolActivity> listByElasticPoolAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        ElasticPoolActivitiesInner client = this.inner();
        return client.listByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName)
        .flatMap(new Func1<List<ElasticPoolActivityInner>, Observable<ElasticPoolActivityInner>>() {
            @Override
            public Observable<ElasticPoolActivityInner> call(List<ElasticPoolActivityInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ElasticPoolActivityInner, ElasticPoolActivity>() {
            @Override
            public ElasticPoolActivity call(ElasticPoolActivityInner inner) {
                return new ElasticPoolActivityImpl(inner, manager());
            }
        });
    }

}
