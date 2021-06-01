// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.VerificationCodeResponseInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.VerificationCodeResponse;
import com.azure.resourcemanager.deviceprovisioningservices.models.VerificationCodeResponseProperties;

public final class VerificationCodeResponseImpl implements VerificationCodeResponse {
    private VerificationCodeResponseInner innerObject;

    private final com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager;

    VerificationCodeResponseImpl(
        VerificationCodeResponseInner innerObject,
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager) {
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

    public String etag() {
        return this.innerModel().etag();
    }

    public VerificationCodeResponseProperties properties() {
        return this.innerModel().properties();
    }

    public VerificationCodeResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager() {
        return this.serviceManager;
    }
}
