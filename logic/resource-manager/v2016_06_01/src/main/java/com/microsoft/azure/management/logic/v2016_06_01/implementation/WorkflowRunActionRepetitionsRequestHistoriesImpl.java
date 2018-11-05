/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowRunActionRepetitionsRequestHistories;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.RequestHistoryListResult;
import com.microsoft.azure.management.logic.v2016_06_01.RequestHistory;

class WorkflowRunActionRepetitionsRequestHistoriesImpl extends WrapperImpl<WorkflowRunActionRepetitionsRequestHistoriesInner> implements WorkflowRunActionRepetitionsRequestHistories {
    private final LogicManager manager;

    WorkflowRunActionRepetitionsRequestHistoriesImpl(LogicManager manager) {
        super(manager.inner().workflowRunActionRepetitionsRequestHistories());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RequestHistoryListResult> listAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        WorkflowRunActionRepetitionsRequestHistoriesInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
        .map(new Func1<RequestHistoryListResultInner, RequestHistoryListResult>() {
            @Override
            public RequestHistoryListResult call(RequestHistoryListResultInner inner) {
                return new RequestHistoryListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RequestHistory> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName, String requestHistoryName) {
        WorkflowRunActionRepetitionsRequestHistoriesInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName)
        .map(new Func1<RequestHistoryInner, RequestHistory>() {
            @Override
            public RequestHistory call(RequestHistoryInner inner) {
                return new RequestHistoryImpl(inner, manager());
            }
        });
    }

}
