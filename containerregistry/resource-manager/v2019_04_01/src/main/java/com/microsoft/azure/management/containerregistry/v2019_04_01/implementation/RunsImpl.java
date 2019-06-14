/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_04_01.Runs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.containerregistry.v2019_04_01.RunGetLogResult;
import com.microsoft.azure.management.containerregistry.v2019_04_01.Run;

class RunsImpl extends WrapperImpl<RunsInner> implements Runs {
    private final ContainerRegistryManager manager;

    RunsImpl(ContainerRegistryManager manager) {
        super(manager.inner().runs());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    private RunImpl wrapModel(RunInner inner) {
        return  new RunImpl(inner, manager());
    }

    @Override
    public Observable<RunGetLogResult> getLogSasUrlAsync(String resourceGroupName, String registryName, String runId) {
        RunsInner client = this.inner();
        return client.getLogSasUrlAsync(resourceGroupName, registryName, runId)
        .map(new Func1<RunGetLogResultInner, RunGetLogResult>() {
            @Override
            public RunGetLogResult call(RunGetLogResultInner inner) {
                return new RunGetLogResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String registryName, String runId) {
        RunsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, registryName, runId).toCompletable();
    }

    @Override
    public Observable<Run> listAsync(final String resourceGroupName, final String registryName) {
        RunsInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<RunInner>, Iterable<RunInner>>() {
            @Override
            public Iterable<RunInner> call(Page<RunInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RunInner, Run>() {
            @Override
            public Run call(RunInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Run> getAsync(String resourceGroupName, String registryName, String runId) {
        RunsInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, runId)
        .map(new Func1<RunInner, Run>() {
            @Override
            public Run call(RunInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
