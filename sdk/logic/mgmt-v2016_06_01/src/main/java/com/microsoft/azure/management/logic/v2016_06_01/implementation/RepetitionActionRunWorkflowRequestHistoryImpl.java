/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.RepetitionActionRunWorkflowRequestHistory;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.RequestHistoryProperties;
import java.util.Map;

class RepetitionActionRunWorkflowRequestHistoryImpl extends IndexableRefreshableWrapperImpl<RepetitionActionRunWorkflowRequestHistory, RequestHistoryInner> implements RepetitionActionRunWorkflowRequestHistory {
    private final LogicManager manager;
    private String resourceGroupName;
    private String workflowName;
    private String runName;
    private String actionName;
    private String repetitionName;
    private String requestHistoryName;

    RepetitionActionRunWorkflowRequestHistoryImpl(RequestHistoryInner inner,  LogicManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workflowName = IdParsingUtils.getValueFromIdByName(inner.id(), "workflows");
        this.runName = IdParsingUtils.getValueFromIdByName(inner.id(), "runs");
        this.actionName = IdParsingUtils.getValueFromIdByName(inner.id(), "actions");
        this.repetitionName = IdParsingUtils.getValueFromIdByName(inner.id(), "repetitions");
        this.requestHistoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "requestHistories");
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RequestHistoryInner> getInnerAsync() {
        WorkflowRunActionRepetitionsRequestHistoriesInner client = this.manager().inner().workflowRunActionRepetitionsRequestHistories();
        return client.getAsync(this.resourceGroupName, this.workflowName, this.runName, this.actionName, this.repetitionName, this.requestHistoryName);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RequestHistoryProperties properties() {
        return this.inner().properties();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
