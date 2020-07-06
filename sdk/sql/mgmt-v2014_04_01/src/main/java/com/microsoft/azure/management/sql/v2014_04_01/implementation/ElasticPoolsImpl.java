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
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPools;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPool;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolServerMetric;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolServerMetricDefinition;

class ElasticPoolsImpl extends WrapperImpl<ElasticPoolsInner> implements ElasticPools {
    private final SqlManager manager;

    ElasticPoolsImpl(SqlManager manager) {
        super(manager.inner().elasticPools());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ElasticPoolImpl define(String name) {
        return wrapModel(name);
    }

    private ElasticPoolImpl wrapModel(ElasticPoolInner inner) {
        return  new ElasticPoolImpl(inner, manager());
    }

    private ElasticPoolImpl wrapModel(String name) {
        return new ElasticPoolImpl(name, this.manager());
    }

    @Override
    public Observable<ElasticPool> listByServerAsync(String resourceGroupName, String serverName) {
        ElasticPoolsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<ElasticPoolInner>, Observable<ElasticPoolInner>>() {
            @Override
            public Observable<ElasticPoolInner> call(List<ElasticPoolInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ElasticPoolInner, ElasticPool>() {
            @Override
            public ElasticPool call(ElasticPoolInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ElasticPool> getAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        ElasticPoolsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, elasticPoolName)
        .flatMap(new Func1<ElasticPoolInner, Observable<ElasticPool>>() {
            @Override
            public Observable<ElasticPool> call(ElasticPoolInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ElasticPool)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        ElasticPoolsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, elasticPoolName).toCompletable();
    }

    private ElasticPoolServerMetricImpl wrapElasticPoolServerMetricModel(MetricInner inner) {
        return  new ElasticPoolServerMetricImpl(inner, manager());
    }

    private ElasticPoolServerMetricDefinitionImpl wrapElasticPoolServerMetricDefinitionModel(MetricDefinitionInner inner) {
        return  new ElasticPoolServerMetricDefinitionImpl(inner, manager());
    }

    @Override
    public Observable<ElasticPoolServerMetric> listMetricsAsync(String resourceGroupName, String serverName, String elasticPoolName, String filter) {
        ElasticPoolsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, serverName, elasticPoolName, filter)
        .flatMap(new Func1<List<MetricInner>, Observable<MetricInner>>() {
            @Override
            public Observable<MetricInner> call(List<MetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricInner, ElasticPoolServerMetric>() {
            @Override
            public ElasticPoolServerMetric call(MetricInner inner) {
                return wrapElasticPoolServerMetricModel(inner);
            }
        });
    }

    @Override
    public Observable<ElasticPoolServerMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        ElasticPoolsInner client = this.inner();
        return client.listMetricDefinitionsAsync(resourceGroupName, serverName, elasticPoolName)
        .flatMap(new Func1<List<MetricDefinitionInner>, Observable<MetricDefinitionInner>>() {
            @Override
            public Observable<MetricDefinitionInner> call(List<MetricDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricDefinitionInner, ElasticPoolServerMetricDefinition>() {
            @Override
            public ElasticPoolServerMetricDefinition call(MetricDefinitionInner inner) {
                return wrapElasticPoolServerMetricDefinitionModel(inner);
            }
        });
    }

}
