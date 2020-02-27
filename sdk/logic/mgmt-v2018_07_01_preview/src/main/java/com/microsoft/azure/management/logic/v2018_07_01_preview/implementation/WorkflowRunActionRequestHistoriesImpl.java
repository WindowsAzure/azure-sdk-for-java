/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRequestHistories;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2018_07_01_preview.ActionRunWorkflowRequestHistory;

class WorkflowRunActionRequestHistoriesImpl extends WrapperImpl<WorkflowRunActionRequestHistoriesInner> implements WorkflowRunActionRequestHistories {
    private final LogicManager manager;

    WorkflowRunActionRequestHistoriesImpl(LogicManager manager) {
        super(manager.inner().workflowRunActionRequestHistories());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private ActionRunWorkflowRequestHistoryImpl wrapModel(RequestHistoryInner inner) {
        return  new ActionRunWorkflowRequestHistoryImpl(inner, manager());
    }

    @Override
    public Observable<ActionRunWorkflowRequestHistory> listAsync(final String resourceGroupName, final String workflowName, final String runName, final String actionName) {
        WorkflowRunActionRequestHistoriesInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName, runName, actionName)
        .flatMapIterable(new Func1<Page<RequestHistoryInner>, Iterable<RequestHistoryInner>>() {
            @Override
            public Iterable<RequestHistoryInner> call(Page<RequestHistoryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RequestHistoryInner, ActionRunWorkflowRequestHistory>() {
            @Override
            public ActionRunWorkflowRequestHistory call(RequestHistoryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ActionRunWorkflowRequestHistory> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String requestHistoryName) {
        WorkflowRunActionRequestHistoriesInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName, actionName, requestHistoryName)
        .flatMap(new Func1<RequestHistoryInner, Observable<ActionRunWorkflowRequestHistory>>() {
            @Override
            public Observable<ActionRunWorkflowRequestHistory> call(RequestHistoryInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ActionRunWorkflowRequestHistory)wrapModel(inner));
                }
            }
       });
    }

}
