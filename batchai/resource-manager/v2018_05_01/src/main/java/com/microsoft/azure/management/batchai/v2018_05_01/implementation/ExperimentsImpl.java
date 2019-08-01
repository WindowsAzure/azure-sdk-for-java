/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batchai.v2018_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batchai.v2018_05_01.Experiments;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2018_05_01.Experiment;

class ExperimentsImpl extends WrapperImpl<ExperimentsInner> implements Experiments {
    private final BatchAIManager manager;

    ExperimentsImpl(BatchAIManager manager) {
        super(manager.inner().experiments());
        this.manager = manager;
    }

    public BatchAIManager manager() {
        return this.manager;
    }

    @Override
    public ExperimentImpl define(String name) {
        return wrapModel(name);
    }

    private ExperimentImpl wrapModel(ExperimentInner inner) {
        return  new ExperimentImpl(inner, manager());
    }

    private ExperimentImpl wrapModel(String name) {
        return new ExperimentImpl(name, this.manager());
    }

    @Override
    public Observable<Experiment> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        ExperimentsInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<ExperimentInner>, Iterable<ExperimentInner>>() {
            @Override
            public Iterable<ExperimentInner> call(Page<ExperimentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExperimentInner, Experiment>() {
            @Override
            public Experiment call(ExperimentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Experiment> getAsync(String resourceGroupName, String workspaceName, String experimentName) {
        ExperimentsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, experimentName)
        .map(new Func1<ExperimentInner, Experiment>() {
            @Override
            public Experiment call(ExperimentInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String experimentName) {
        ExperimentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, experimentName).toCompletable();
    }

}
