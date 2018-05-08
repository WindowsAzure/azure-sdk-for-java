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
import com.microsoft.azure.management.logic.v2016_06_01.ScopeRepetitions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowRunActionRepetitionDefinitionCollection;
import com.microsoft.azure.management.logic.v2016_06_01.ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel;

class ScopeRepetitionsImpl extends WrapperImpl<WorkflowRunActionScopedRepetitionsInner> implements ScopeRepetitions {
    private final LogicManager manager;

    ScopeRepetitionsImpl(LogicManager manager) {
        super(manager.inner().workflowRunActionScopedRepetitions());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModelImpl wrapModel(WorkflowRunActionRepetitionDefinitionInner inner) {
        return  new ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModelImpl(inner, manager());
    }

    @Override
    public Observable<WorkflowRunActionRepetitionDefinitionCollection> listAsync(String resourceGroupName, String workflowName, String runName, String actionName) {
        WorkflowRunActionScopedRepetitionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName, runName, actionName)
        .map(new Func1<WorkflowRunActionRepetitionDefinitionCollectionInner, WorkflowRunActionRepetitionDefinitionCollection>() {
            @Override
            public WorkflowRunActionRepetitionDefinitionCollection call(WorkflowRunActionRepetitionDefinitionCollectionInner inner) {
                return new WorkflowRunActionRepetitionDefinitionCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel> getByActionAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName) {
        WorkflowRunActionScopedRepetitionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
        .map(new Func1<WorkflowRunActionRepetitionDefinitionInner, ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel>() {
            @Override
            public ActionRunWorkflowWorkflowRunActionRepetitionDefinitionModel call(WorkflowRunActionRepetitionDefinitionInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
