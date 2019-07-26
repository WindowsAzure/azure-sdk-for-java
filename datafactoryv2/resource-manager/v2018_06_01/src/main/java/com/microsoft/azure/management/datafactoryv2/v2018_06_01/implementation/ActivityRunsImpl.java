/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ActivityRuns;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ActivityRunsQueryResponse;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.RunFilterParameters;

class ActivityRunsImpl extends WrapperImpl<ActivityRunsInner> implements ActivityRuns {
    private final DataFactoryManager manager;

    ActivityRunsImpl(DataFactoryManager manager) {
        super(manager.inner().activityRuns());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ActivityRunsQueryResponse> queryByPipelineRunAsync(String resourceGroupName, String factoryName, String runId, RunFilterParameters filterParameters) {
        ActivityRunsInner client = this.inner();
        return client.queryByPipelineRunAsync(resourceGroupName, factoryName, runId, filterParameters)
        .map(new Func1<ActivityRunsQueryResponseInner, ActivityRunsQueryResponse>() {
            @Override
            public ActivityRunsQueryResponse call(ActivityRunsQueryResponseInner inner) {
                return new ActivityRunsQueryResponseImpl(inner, manager());
            }
        });
    }

}
