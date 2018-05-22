/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.RunWorkflowWorkflowRun;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.Correlation;
import org.joda.time.DateTime;
import java.util.Map;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowOutputParameter;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowRunTrigger;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowStatus;

class RunWorkflowWorkflowRunImpl extends IndexableRefreshableWrapperImpl<RunWorkflowWorkflowRun, WorkflowRunInner> implements RunWorkflowWorkflowRun {
    private final LogicManager manager;
    private String resourceGroupName;
    private String workflowName;
    private String runName;
    private String operationId;

    RunWorkflowWorkflowRunImpl(WorkflowRunInner inner,  LogicManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workflowName = IdParsingUtils.getValueFromIdByName(inner.id(), "workflows");
        this.runName = IdParsingUtils.getValueFromIdByName(inner.id(), "runs");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operations");
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<WorkflowRunInner> getInnerAsync() {
        WorkflowRunOperationsInner client = this.manager().inner().workflowRunOperations();
        return client.getAsync(this.resourceGroupName, this.workflowName, this.runName, this.operationId);
    }



    @Override
    public String code() {
        return this.inner().code();
    }

    @Override
    public Correlation correlation() {
        return this.inner().correlation();
    }

    @Override
    public String correlationId() {
        return this.inner().correlationId();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public Object error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, WorkflowOutputParameter> outputs() {
        return this.inner().outputs();
    }

    @Override
    public WorkflowRunTrigger response() {
        return this.inner().response();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public WorkflowStatus status() {
        return this.inner().status();
    }

    @Override
    public WorkflowRunTrigger trigger() {
        return this.inner().trigger();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime waitEndTime() {
        return this.inner().waitEndTime();
    }

    @Override
    public ResourceReferenceInner workflow() {
        return this.inner().workflow();
    }

}
