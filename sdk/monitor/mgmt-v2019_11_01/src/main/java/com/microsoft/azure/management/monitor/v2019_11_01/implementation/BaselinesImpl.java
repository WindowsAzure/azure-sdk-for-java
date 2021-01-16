/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.Baselines;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.monitor.v2019_11_01.SingleMetricBaseline;

class BaselinesImpl extends WrapperImpl<BaselinesInner> implements Baselines {
    private final MonitorManager manager;

    BaselinesImpl(MonitorManager manager) {
        super(manager.inner().baselines());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SingleMetricBaseline> listAsync(String resourceUri) {
        BaselinesInner client = this.inner();
        return client.listAsync(resourceUri)
        .flatMap(new Func1<List<SingleMetricBaselineInner>, Observable<SingleMetricBaselineInner>>() {
            @Override
            public Observable<SingleMetricBaselineInner> call(List<SingleMetricBaselineInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SingleMetricBaselineInner, SingleMetricBaseline>() {
            @Override
            public SingleMetricBaseline call(SingleMetricBaselineInner inner) {
                return new SingleMetricBaselineImpl(inner, manager());
            }
        });
    }

}
