// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.resourcemanager.mediaservices.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.fluent.models.EntityNameAvailabilityCheckOutputInner;
import com.azure.resourcemanager.mediaservices.models.EntityNameAvailabilityCheckOutput;

public final class EntityNameAvailabilityCheckOutputImpl implements EntityNameAvailabilityCheckOutput {
    private EntityNameAvailabilityCheckOutputInner innerObject;

    private final MediaservicesManager serviceManager;

    public EntityNameAvailabilityCheckOutputImpl(
        EntityNameAvailabilityCheckOutputInner innerObject, MediaservicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public EntityNameAvailabilityCheckOutputInner innerModel() {
        return this.innerObject;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }
}
