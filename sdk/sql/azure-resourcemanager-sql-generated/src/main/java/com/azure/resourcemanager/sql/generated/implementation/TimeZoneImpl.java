// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.TimeZoneInner;
import com.azure.resourcemanager.sql.generated.models.TimeZone;

public final class TimeZoneImpl implements TimeZone {
    private TimeZoneInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    TimeZoneImpl(TimeZoneInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
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

    public String timeZoneId() {
        return this.innerModel().timeZoneId();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public TimeZoneInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
