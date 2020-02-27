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
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunOperations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.logic.v2018_07_01_preview.RunWorkflowWorkflowRun;

class WorkflowRunOperationsImpl extends WrapperImpl<WorkflowRunOperationsInner> implements WorkflowRunOperations {
    private final LogicManager manager;

    WorkflowRunOperationsImpl(LogicManager manager) {
        super(manager.inner().workflowRunOperations());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private RunWorkflowWorkflowRunImpl wrapModel(WorkflowRunInner inner) {
        return  new RunWorkflowWorkflowRunImpl(inner, manager());
    }

    @Override
    public Observable<RunWorkflowWorkflowRun> getAsync(String resourceGroupName, String workflowName, String runName, String operationId) {
        WorkflowRunOperationsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName, operationId)
        .flatMap(new Func1<WorkflowRunInner, Observable<RunWorkflowWorkflowRun>>() {
            @Override
            public Observable<RunWorkflowWorkflowRun> call(WorkflowRunInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((RunWorkflowWorkflowRun)wrapModel(inner));
                }
            }
       });
    }

}
