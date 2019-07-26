/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.ActivityRuns;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.ActivityRun;

class ActivityRunsImpl extends WrapperImpl<ActivityRunsInner> implements ActivityRuns {
    private final DataFactoryManager manager;

    ActivityRunsImpl(DataFactoryManager manager) {
        super(manager.inner().activityRuns());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    private ActivityRunImpl wrapModel(ActivityRunInner inner) {
        return  new ActivityRunImpl(inner, manager());
    }

    @Override
    public Observable<ActivityRun> listByPipelineRunAsync(final String resourceGroupName, final String factoryName, final String runId, final DateTime startTime, final DateTime endTime) {
        ActivityRunsInner client = this.inner();
        return client.listByPipelineRunAsync(resourceGroupName, factoryName, runId, startTime, endTime)
        .flatMapIterable(new Func1<Page<ActivityRunInner>, Iterable<ActivityRunInner>>() {
            @Override
            public Iterable<ActivityRunInner> call(Page<ActivityRunInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ActivityRunInner, ActivityRun>() {
            @Override
            public ActivityRun call(ActivityRunInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
