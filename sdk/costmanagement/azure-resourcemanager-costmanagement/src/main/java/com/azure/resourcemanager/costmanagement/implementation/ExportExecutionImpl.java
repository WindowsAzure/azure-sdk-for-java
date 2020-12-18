// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.fluent.models.CommonExportPropertiesInner;
import com.azure.resourcemanager.costmanagement.fluent.models.ExportExecutionInner;
import com.azure.resourcemanager.costmanagement.models.CommonExportProperties;
import com.azure.resourcemanager.costmanagement.models.ExecutionStatus;
import com.azure.resourcemanager.costmanagement.models.ExecutionType;
import com.azure.resourcemanager.costmanagement.models.ExportExecution;
import java.time.OffsetDateTime;

public final class ExportExecutionImpl implements ExportExecution {
    private ExportExecutionInner innerObject;

    private final CostManagementManager serviceManager;

    ExportExecutionImpl(ExportExecutionInner innerObject, CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ExecutionType executionType() {
        return this.innerModel().executionType();
    }

    public ExecutionStatus status() {
        return this.innerModel().status();
    }

    public String submittedBy() {
        return this.innerModel().submittedBy();
    }

    public OffsetDateTime submittedTime() {
        return this.innerModel().submittedTime();
    }

    public OffsetDateTime processingStartTime() {
        return this.innerModel().processingStartTime();
    }

    public OffsetDateTime processingEndTime() {
        return this.innerModel().processingEndTime();
    }

    public String fileName() {
        return this.innerModel().fileName();
    }

    public CommonExportProperties runSettings() {
        CommonExportPropertiesInner inner = this.innerModel().runSettings();
        if (inner != null) {
            return new CommonExportPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ExportExecutionInner innerModel() {
        return this.innerObject;
    }

    private CostManagementManager manager() {
        return this.serviceManager;
    }
}
