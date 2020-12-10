// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.models.ValidateCustomDomainOutputInner;
import com.azure.resourcemanager.cdn.generated.models.ValidateCustomDomainOutput;

public final class ValidateCustomDomainOutputImpl implements ValidateCustomDomainOutput {
    private ValidateCustomDomainOutputInner innerObject;

    private final CdnManager serviceManager;

    public ValidateCustomDomainOutputImpl(ValidateCustomDomainOutputInner innerObject, CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean customDomainValidated() {
        return this.innerModel().customDomainValidated();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public ValidateCustomDomainOutputInner innerModel() {
        return this.innerObject;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }
}
