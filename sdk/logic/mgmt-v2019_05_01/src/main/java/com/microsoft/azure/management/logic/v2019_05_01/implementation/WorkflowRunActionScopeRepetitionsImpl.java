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
import com.microsoft.azure.management.logic.v2019_05_01.WorkflowRunActionScopeRepetitions;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.logic.v2019_05_01.ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel;

class WorkflowRunActionScopeRepetitionsImpl extends WrapperImpl<WorkflowRunActionScopeRepetitionsInner> implements WorkflowRunActionScopeRepetitions {
    private final LogicManager manager;

    WorkflowRunActionScopeRepetitionsImpl(LogicManager manager) {
        super(manager.inner().workflowRunActionScopeRepetitions());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModelImpl wrapModel(WorkflowRunActionRepetitionDefinitionInner inner) {
        return  new ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModelImpl(inner, manager());
    }

    @Override
    public Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel> listAsync(String resourceGroupName, String workflowName, String runName, String actionName) {
        WorkflowRunActionScopeRepetitionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName, runName, actionName)
        .flatMap(new Func1<List<WorkflowRunActionRepetitionDefinitionInner>, Observable<WorkflowRunActionRepetitionDefinitionInner>>() {
            @Override
            public Observable<WorkflowRunActionRepetitionDefinitionInner> call(List<WorkflowRunActionRepetitionDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<WorkflowRunActionRepetitionDefinitionInner, ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel>() {
            @Override
            public ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel call(WorkflowRunActionRepetitionDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        WorkflowRunActionScopeRepetitionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
        .flatMap(new Func1<WorkflowRunActionRepetitionDefinitionInner, Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel>>() {
            @Override
            public Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel> call(WorkflowRunActionRepetitionDefinitionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel)wrapModel(inner));
                }
            }
       });
    }

}
