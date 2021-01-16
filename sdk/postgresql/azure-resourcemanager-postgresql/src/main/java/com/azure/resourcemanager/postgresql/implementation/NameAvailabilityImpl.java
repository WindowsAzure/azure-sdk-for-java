// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.implementation;

import com.azure.resourcemanager.postgresql.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.postgresql.models.NameAvailability;

public final class NameAvailabilityImpl implements NameAvailability {
    private NameAvailabilityInner innerObject;

    private final PostgreSqlManager serviceManager;

    NameAvailabilityImpl(NameAvailabilityInner innerObject, PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String message() {
        return this.innerModel().message();
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public NameAvailabilityInner innerModel() {
        return this.innerObject;
    }

    private PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
