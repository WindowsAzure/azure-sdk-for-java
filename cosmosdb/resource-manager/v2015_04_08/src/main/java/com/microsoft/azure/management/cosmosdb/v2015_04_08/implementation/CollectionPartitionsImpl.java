/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.CollectionPartitions;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.PartitionMetric;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.PartitionUsage;

class CollectionPartitionsImpl extends WrapperImpl<CollectionPartitionsInner> implements CollectionPartitions {
    private final DocumentDBManager manager;

    CollectionPartitionsImpl(DocumentDBManager manager) {
        super(manager.inner().collectionPartitions());
        this.manager = manager;
    }

    public DocumentDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PartitionMetric> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        CollectionPartitionsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter)
        .flatMap(new Func1<List<PartitionMetricInner>, Observable<PartitionMetricInner>>() {
            @Override
            public Observable<PartitionMetricInner> call(List<PartitionMetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PartitionMetricInner, PartitionMetric>() {
            @Override
            public PartitionMetric call(PartitionMetricInner inner) {
                return new PartitionMetricImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PartitionUsage> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        CollectionPartitionsInner client = this.inner();
        return client.listUsagesAsync(resourceGroupName, accountName, databaseRid, collectionRid)
        .flatMap(new Func1<List<PartitionUsageInner>, Observable<PartitionUsageInner>>() {
            @Override
            public Observable<PartitionUsageInner> call(List<PartitionUsageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PartitionUsageInner, PartitionUsage>() {
            @Override
            public PartitionUsage call(PartitionUsageInner inner) {
                return new PartitionUsageImpl(inner, manager());
            }
        });
    }

}
