// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.fluent.models.RecommendedActionSessionsOperationStatusInner;
import com.azure.resourcemanager.mysql.models.RecommendedActionSessionsOperationStatus;
import java.time.OffsetDateTime;

public final class RecommendedActionSessionsOperationStatusImpl implements RecommendedActionSessionsOperationStatus {
    private RecommendedActionSessionsOperationStatusInner innerObject;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    RecommendedActionSessionsOperationStatusImpl(
        RecommendedActionSessionsOperationStatusInner innerObject,
        com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public String status() {
        return this.innerModel().status();
    }

    public RecommendedActionSessionsOperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
