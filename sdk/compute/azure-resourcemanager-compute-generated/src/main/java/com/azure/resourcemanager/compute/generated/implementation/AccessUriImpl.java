// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.AccessUriInner;
import com.azure.resourcemanager.compute.generated.models.AccessUri;

public final class AccessUriImpl implements AccessUri {
    private AccessUriInner innerObject;

    private final ComputeManager serviceManager;

    AccessUriImpl(AccessUriInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String accessSas() {
        return this.innerModel().accessSas();
    }

    public AccessUriInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
