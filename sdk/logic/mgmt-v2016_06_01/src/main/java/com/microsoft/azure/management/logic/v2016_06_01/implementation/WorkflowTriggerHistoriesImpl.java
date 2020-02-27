/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerHistories;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerHistory;

class WorkflowTriggerHistoriesImpl extends WrapperImpl<WorkflowTriggerHistoriesInner> implements WorkflowTriggerHistories {
    private final LogicManager manager;

    WorkflowTriggerHistoriesImpl(LogicManager manager) {
        super(manager.inner().workflowTriggerHistories());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private WorkflowTriggerHistoryImpl wrapModel(WorkflowTriggerHistoryInner inner) {
        return  new WorkflowTriggerHistoryImpl(inner, manager());
    }

    @Override
    public Completable resubmitAsync(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        WorkflowTriggerHistoriesInner client = this.inner();
        return client.resubmitAsync(resourceGroupName, workflowName, triggerName, historyName).toCompletable();
    }

    @Override
    public Observable<WorkflowTriggerHistory> listAsync(final String resourceGroupName, final String workflowName, final String triggerName) {
        WorkflowTriggerHistoriesInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName, triggerName)
        .flatMapIterable(new Func1<Page<WorkflowTriggerHistoryInner>, Iterable<WorkflowTriggerHistoryInner>>() {
            @Override
            public Iterable<WorkflowTriggerHistoryInner> call(Page<WorkflowTriggerHistoryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowTriggerHistoryInner, WorkflowTriggerHistory>() {
            @Override
            public WorkflowTriggerHistory call(WorkflowTriggerHistoryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<WorkflowTriggerHistory> getAsync(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        WorkflowTriggerHistoriesInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, triggerName, historyName)
        .flatMap(new Func1<WorkflowTriggerHistoryInner, Observable<WorkflowTriggerHistory>>() {
            @Override
            public Observable<WorkflowTriggerHistory> call(WorkflowTriggerHistoryInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((WorkflowTriggerHistory)wrapModel(inner));
                }
            }
       });
    }

}
