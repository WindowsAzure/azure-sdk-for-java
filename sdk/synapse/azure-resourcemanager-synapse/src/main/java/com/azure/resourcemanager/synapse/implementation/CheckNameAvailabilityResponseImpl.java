// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.synapse.models.CheckNameAvailabilityResponse;

public final class CheckNameAvailabilityResponseImpl implements CheckNameAvailabilityResponse {
    private CheckNameAvailabilityResponseInner innerObject;

    private final SynapseManager serviceManager;

    public CheckNameAvailabilityResponseImpl(
        CheckNameAvailabilityResponseInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String message() {
        return this.innerModel().message();
    }

    public Boolean available() {
        return this.innerModel().available();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String name() {
        return this.innerModel().name();
    }

    public CheckNameAvailabilityResponseInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
