/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerListCallbackUrlQueries;
import java.util.List;

class WorkflowTriggerCallbackUrlImpl extends WrapperImpl<WorkflowTriggerCallbackUrlInner> implements WorkflowTriggerCallbackUrl {
    private final LogicManager manager;
    WorkflowTriggerCallbackUrlImpl(WorkflowTriggerCallbackUrlInner inner, LogicManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public String basePath() {
        return this.inner().basePath();
    }

    @Override
    public String method() {
        return this.inner().method();
    }

    @Override
    public WorkflowTriggerListCallbackUrlQueries queries() {
        return this.inner().queries();
    }

    @Override
    public String relativePath() {
        return this.inner().relativePath();
    }

    @Override
    public List<String> relativePathParameters() {
        return this.inner().relativePathParameters();
    }

    @Override
    public String value() {
        return this.inner().value();
    }

}
