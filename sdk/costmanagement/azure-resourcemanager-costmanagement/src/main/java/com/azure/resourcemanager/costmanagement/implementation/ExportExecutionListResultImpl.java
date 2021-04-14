// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.resourcemanager.costmanagement.fluent.models.ExportExecutionListResultInner;
import com.azure.resourcemanager.costmanagement.models.ExportExecution;
import com.azure.resourcemanager.costmanagement.models.ExportExecutionListResult;
import java.util.Collections;
import java.util.List;

public final class ExportExecutionListResultImpl implements ExportExecutionListResult {
    private ExportExecutionListResultInner innerObject;

    private final com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager;

    ExportExecutionListResultImpl(
        ExportExecutionListResultInner innerObject,
        com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ExportExecution> value() {
        List<ExportExecution> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ExportExecutionListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.CostManagementManager manager() {
        return this.serviceManager;
    }
}
