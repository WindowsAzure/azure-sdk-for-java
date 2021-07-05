// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.JobExecutionInner;
import com.azure.resourcemanager.sql.generated.models.JobExecution;
import com.azure.resourcemanager.sql.generated.models.JobExecutionLifecycle;
import com.azure.resourcemanager.sql.generated.models.JobExecutionTarget;
import com.azure.resourcemanager.sql.generated.models.ProvisioningState;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class JobExecutionImpl implements JobExecution {
    private JobExecutionInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    JobExecutionImpl(JobExecutionInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
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

    public Integer jobVersion() {
        return this.innerModel().jobVersion();
    }

    public String stepName() {
        return this.innerModel().stepName();
    }

    public Integer stepId() {
        return this.innerModel().stepId();
    }

    public UUID jobExecutionId() {
        return this.innerModel().jobExecutionId();
    }

    public JobExecutionLifecycle lifecycle() {
        return this.innerModel().lifecycle();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime createTime() {
        return this.innerModel().createTime();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Integer currentAttempts() {
        return this.innerModel().currentAttempts();
    }

    public OffsetDateTime currentAttemptStartTime() {
        return this.innerModel().currentAttemptStartTime();
    }

    public String lastMessage() {
        return this.innerModel().lastMessage();
    }

    public JobExecutionTarget target() {
        return this.innerModel().target();
    }

    public JobExecutionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
