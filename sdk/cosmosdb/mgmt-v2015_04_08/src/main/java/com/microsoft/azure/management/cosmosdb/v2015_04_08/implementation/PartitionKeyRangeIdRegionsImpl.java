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
import com.microsoft.azure.management.cosmosdb.v2015_04_08.PartitionKeyRangeIdRegions;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.PartitionMetric;

class PartitionKeyRangeIdRegionsImpl extends WrapperImpl<PartitionKeyRangeIdRegionsInner> implements PartitionKeyRangeIdRegions {
    private final CosmosDBManager manager;

    PartitionKeyRangeIdRegionsImpl(CosmosDBManager manager) {
        super(manager.inner().partitionKeyRangeIdRegions());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PartitionMetric> listMetricsAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String partitionKeyRangeId, String filter) {
        PartitionKeyRangeIdRegionsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, partitionKeyRangeId, filter)
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

}
