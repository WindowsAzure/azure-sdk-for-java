// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.generated.models.CheckNameAvailabilityOutput;

public final class CheckNameAvailabilityOutputImpl implements CheckNameAvailabilityOutput {
    private CheckNameAvailabilityOutputInner innerObject;

    private final CdnManager serviceManager;

    public CheckNameAvailabilityOutputImpl(CheckNameAvailabilityOutputInner innerObject, CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityOutputInner innerModel() {
        return this.innerObject;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }
}
