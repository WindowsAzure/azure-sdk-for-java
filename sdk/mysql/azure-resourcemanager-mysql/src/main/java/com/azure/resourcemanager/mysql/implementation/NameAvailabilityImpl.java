// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.mysql.models.NameAvailability;

public final class NameAvailabilityImpl implements NameAvailability {
    private NameAvailabilityInner innerObject;

    private final MySqlManager serviceManager;

    NameAvailabilityImpl(NameAvailabilityInner innerObject, MySqlManager serviceManager) {
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

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
