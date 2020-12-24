// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.models.WaitStatisticInner;
import com.azure.resourcemanager.mysql.models.WaitStatistic;
import java.time.OffsetDateTime;

public final class WaitStatisticImpl implements WaitStatistic {
    private WaitStatisticInner innerObject;

    private final MySqlManager serviceManager;

    WaitStatisticImpl(WaitStatisticInner innerObject, MySqlManager serviceManager) {
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

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public String eventName() {
        return this.innerModel().eventName();
    }

    public String eventTypeName() {
        return this.innerModel().eventTypeName();
    }

    public Long queryId() {
        return this.innerModel().queryId();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public Long userId() {
        return this.innerModel().userId();
    }

    public Long count() {
        return this.innerModel().count();
    }

    public Double totalTimeInMs() {
        return this.innerModel().totalTimeInMs();
    }

    public WaitStatisticInner innerModel() {
        return this.innerObject;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
