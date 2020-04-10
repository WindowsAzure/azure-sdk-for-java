/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.DatabaseAccountRegions;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.DatabaseAccountMetric;

class DatabaseAccountRegionsImpl extends WrapperImpl<DatabaseAccountRegionsInner> implements DatabaseAccountRegions {
    private final CosmosDBManager manager;

    DatabaseAccountRegionsImpl(CosmosDBManager manager) {
        super(manager.inner().databaseAccountRegions());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String region, String filter) {
        DatabaseAccountRegionsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, region, filter)
        .flatMap(new Func1<List<MetricInner>, Observable<MetricInner>>() {
            @Override
            public Observable<MetricInner> call(List<MetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricInner, DatabaseAccountMetric>() {
            @Override
            public DatabaseAccountMetric call(MetricInner inner) {
                return new DatabaseAccountMetricImpl(inner, manager());
            }
        });
    }

}
