/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.Databases;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.DatabasisDatabaseAccountMetricDefinition;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.DatabasisDatabaseAccountMetric;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.DatabasisDatabaseAccountUsage;

class DatabasesImpl extends WrapperImpl<DatabasesInner> implements Databases {
    private final CosmosDBManager manager;

    DatabasesImpl(CosmosDBManager manager) {
        super(manager.inner().databases());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    private DatabasisDatabaseAccountMetricDefinitionImpl wrapDatabasisDatabaseAccountMetricDefinitionModel(MetricDefinitionInner inner) {
        return  new DatabasisDatabaseAccountMetricDefinitionImpl(inner, manager());
    }

    private DatabasisDatabaseAccountMetricImpl wrapDatabasisDatabaseAccountMetricModel(MetricInner inner) {
        return  new DatabasisDatabaseAccountMetricImpl(inner, manager());
    }

    private DatabasisDatabaseAccountUsageImpl wrapDatabasisDatabaseAccountUsageModel(UsageInner inner) {
        return  new DatabasisDatabaseAccountUsageImpl(inner, manager());
    }

    @Override
    public Observable<DatabasisDatabaseAccountMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String accountName, String databaseRid) {
        DatabasesInner client = this.inner();
        return client.listMetricDefinitionsAsync(resourceGroupName, accountName, databaseRid)
        .flatMap(new Func1<List<MetricDefinitionInner>, Observable<MetricDefinitionInner>>() {
            @Override
            public Observable<MetricDefinitionInner> call(List<MetricDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricDefinitionInner, DatabasisDatabaseAccountMetricDefinition>() {
            @Override
            public DatabasisDatabaseAccountMetricDefinition call(MetricDefinitionInner inner) {
                return wrapDatabasisDatabaseAccountMetricDefinitionModel(inner);
            }
        });
    }

    @Override
    public Observable<DatabasisDatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String filter) {
        DatabasesInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, databaseRid, filter)
        .flatMap(new Func1<List<MetricInner>, Observable<MetricInner>>() {
            @Override
            public Observable<MetricInner> call(List<MetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricInner, DatabasisDatabaseAccountMetric>() {
            @Override
            public DatabasisDatabaseAccountMetric call(MetricInner inner) {
                return wrapDatabasisDatabaseAccountMetricModel(inner);
            }
        });
    }

    @Override
    public Observable<DatabasisDatabaseAccountUsage> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid) {
        DatabasesInner client = this.inner();
        return client.listUsagesAsync(resourceGroupName, accountName, databaseRid)
        .flatMap(new Func1<List<UsageInner>, Observable<UsageInner>>() {
            @Override
            public Observable<UsageInner> call(List<UsageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<UsageInner, DatabasisDatabaseAccountUsage>() {
            @Override
            public DatabasisDatabaseAccountUsage call(UsageInner inner) {
                return wrapDatabasisDatabaseAccountUsageModel(inner);
            }
        });
    }

}
