/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2018_06_01.PipelineRuns;
import rx.Observable;
import rx.functions.Func1;
import rx.Completable;
import com.microsoft.azure.management.datafactory.v2018_06_01.PipelineRun;
import com.microsoft.azure.management.datafactory.v2018_06_01.PipelineRunsQueryResponse;
import com.microsoft.azure.management.datafactory.v2018_06_01.RunFilterParameters;

class PipelineRunsImpl extends WrapperImpl<PipelineRunsInner> implements PipelineRuns {
    private final DataFactoryManager manager;

    PipelineRunsImpl(DataFactoryManager manager) {
        super(manager.inner().pipelineRuns());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    private PipelineRunImpl wrapModel(PipelineRunInner inner) {
        return  new PipelineRunImpl(inner, manager());
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String factoryName, String runId) {
        PipelineRunsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, factoryName, runId).toCompletable();
    }

    @Override
    public Observable<PipelineRun> getAsync(String resourceGroupName, String factoryName, String runId) {
        PipelineRunsInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, runId)
        .map(new Func1<PipelineRunInner, PipelineRun>() {
            @Override
            public PipelineRun call(PipelineRunInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<PipelineRunsQueryResponse> queryByFactoryAsync(String resourceGroupName, String factoryName, RunFilterParameters filterParameters) {
        PipelineRunsInner client = this.inner();
        return client.queryByFactoryAsync(resourceGroupName, factoryName, filterParameters)
        .map(new Func1<PipelineRunsQueryResponseInner, PipelineRunsQueryResponse>() {
            @Override
            public PipelineRunsQueryResponse call(PipelineRunsQueryResponseInner inner) {
                return new PipelineRunsQueryResponseImpl(inner, manager());
            }
        });
    }

}
