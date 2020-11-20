/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolWorkloadClassifiers;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkloadClassifier;

class SqlPoolWorkloadClassifiersImpl extends WrapperImpl<SqlPoolWorkloadClassifiersInner> implements SqlPoolWorkloadClassifiers {
    private final SynapseManager manager;

    SqlPoolWorkloadClassifiersImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolWorkloadClassifiers());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public WorkloadClassifierImpl define(String name) {
        return wrapModel(name);
    }

    private WorkloadClassifierImpl wrapModel(WorkloadClassifierInner inner) {
        return  new WorkloadClassifierImpl(inner, manager());
    }

    private WorkloadClassifierImpl wrapModel(String name) {
        return new WorkloadClassifierImpl(name, this.manager());
    }

    @Override
    public Observable<WorkloadClassifier> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String workloadGroupName) {
        SqlPoolWorkloadClassifiersInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName)
        .flatMapIterable(new Func1<Page<WorkloadClassifierInner>, Iterable<WorkloadClassifierInner>>() {
            @Override
            public Iterable<WorkloadClassifierInner> call(Page<WorkloadClassifierInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkloadClassifierInner, WorkloadClassifier>() {
            @Override
            public WorkloadClassifier call(WorkloadClassifierInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<WorkloadClassifier> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName, String workloadClassifierName) {
        SqlPoolWorkloadClassifiersInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, workloadClassifierName)
        .flatMap(new Func1<WorkloadClassifierInner, Observable<WorkloadClassifier>>() {
            @Override
            public Observable<WorkloadClassifier> call(WorkloadClassifierInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((WorkloadClassifier)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String workloadGroupName, String workloadClassifierName) {
        SqlPoolWorkloadClassifiersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, sqlPoolName, workloadGroupName, workloadClassifierName).toCompletable();
    }

}
