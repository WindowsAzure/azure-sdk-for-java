/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PipelineRuns;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PipelineRun;

class PipelineRunsImpl extends WrapperImpl<PipelineRunsInner> implements PipelineRuns {
    private final ContainerRegistryManager manager;

    PipelineRunsImpl(ContainerRegistryManager manager) {
        super(manager.inner().pipelineRuns());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public PipelineRunImpl define(String name) {
        return wrapModel(name);
    }

    private PipelineRunImpl wrapModel(PipelineRunInner inner) {
        return  new PipelineRunImpl(inner, manager());
    }

    private PipelineRunImpl wrapModel(String name) {
        return new PipelineRunImpl(name, this.manager());
    }

    @Override
    public Observable<PipelineRun> listAsync(final String resourceGroupName, final String registryName) {
        PipelineRunsInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<PipelineRunInner>, Iterable<PipelineRunInner>>() {
            @Override
            public Iterable<PipelineRunInner> call(Page<PipelineRunInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PipelineRunInner, PipelineRun>() {
            @Override
            public PipelineRun call(PipelineRunInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<PipelineRun> getAsync(String resourceGroupName, String registryName, String pipelineRunName) {
        PipelineRunsInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, pipelineRunName)
        .flatMap(new Func1<PipelineRunInner, Observable<PipelineRun>>() {
            @Override
            public Observable<PipelineRun> call(PipelineRunInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PipelineRun)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String pipelineRunName) {
        PipelineRunsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, pipelineRunName).toCompletable();
    }

}
