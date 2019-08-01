/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowVersions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowVersion;

class WorkflowVersionsImpl extends WrapperImpl<WorkflowVersionsInner> implements WorkflowVersions {
    private final LogicManager manager;

    WorkflowVersionsImpl(LogicManager manager) {
        super(manager.inner().workflowVersions());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private WorkflowVersionImpl wrapModel(WorkflowVersionInner inner) {
        return  new WorkflowVersionImpl(inner, manager());
    }

    @Override
    public Observable<WorkflowVersion> listAsync(final String resourceGroupName, final String workflowName) {
        WorkflowVersionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName)
        .flatMapIterable(new Func1<Page<WorkflowVersionInner>, Iterable<WorkflowVersionInner>>() {
            @Override
            public Iterable<WorkflowVersionInner> call(Page<WorkflowVersionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowVersionInner, WorkflowVersion>() {
            @Override
            public WorkflowVersion call(WorkflowVersionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<WorkflowVersion> getAsync(String resourceGroupName, String workflowName, String versionId) {
        WorkflowVersionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, versionId)
        .map(new Func1<WorkflowVersionInner, WorkflowVersion>() {
            @Override
            public WorkflowVersion call(WorkflowVersionInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
