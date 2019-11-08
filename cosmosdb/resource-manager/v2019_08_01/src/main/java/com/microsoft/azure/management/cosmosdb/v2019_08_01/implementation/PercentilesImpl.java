/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.Percentiles;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.PercentileMetric;

class PercentilesImpl extends WrapperImpl<PercentilesInner> implements Percentiles {
    private final CosmosDBManager manager;

    PercentilesImpl(CosmosDBManager manager) {
        super(manager.inner().percentiles());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PercentileMetric> listMetricsAsync(String resourceGroupName, String accountName, String filter) {
        PercentilesInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, filter)
        .flatMap(new Func1<List<PercentileMetricInner>, Observable<PercentileMetricInner>>() {
            @Override
            public Observable<PercentileMetricInner> call(List<PercentileMetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PercentileMetricInner, PercentileMetric>() {
            @Override
            public PercentileMetric call(PercentileMetricInner inner) {
                return new PercentileMetricImpl(inner, manager());
            }
        });
    }

}
