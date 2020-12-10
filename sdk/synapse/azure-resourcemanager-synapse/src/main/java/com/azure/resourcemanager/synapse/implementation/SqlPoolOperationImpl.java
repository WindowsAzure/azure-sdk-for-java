// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolOperationInner;
import com.azure.resourcemanager.synapse.models.ManagementOperationState;
import com.azure.resourcemanager.synapse.models.SqlPoolOperation;
import java.time.OffsetDateTime;

public final class SqlPoolOperationImpl implements SqlPoolOperation {
    private SqlPoolOperationInner innerObject;

    private final SynapseManager serviceManager;

    public SqlPoolOperationImpl(SqlPoolOperationInner innerObject, SynapseManager serviceManager) {
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

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String operation() {
        return this.innerModel().operation();
    }

    public String operationFriendlyName() {
        return this.innerModel().operationFriendlyName();
    }

    public Integer percentComplete() {
        return this.innerModel().percentComplete();
    }

    public String serverName() {
        return this.innerModel().serverName();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public ManagementOperationState state() {
        return this.innerModel().state();
    }

    public Integer errorCode() {
        return this.innerModel().errorCode();
    }

    public String errorDescription() {
        return this.innerModel().errorDescription();
    }

    public Integer errorSeverity() {
        return this.innerModel().errorSeverity();
    }

    public Boolean isUserError() {
        return this.innerModel().isUserError();
    }

    public OffsetDateTime estimatedCompletionTime() {
        return this.innerModel().estimatedCompletionTime();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Boolean isCancellable() {
        return this.innerModel().isCancellable();
    }

    public SqlPoolOperationInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
