// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.fluent.models.OperationValueInner;
import com.azure.resourcemanager.hybridcompute.models.OperationValue;

public final class OperationValueImpl implements OperationValue {
    private OperationValueInner innerObject;

    private final HybridComputeManager serviceManager;

    public OperationValueImpl(OperationValueInner innerObject, HybridComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String operation() {
        return this.innerModel().operation();
    }

    public String resource() {
        return this.innerModel().resource();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String provider() {
        return this.innerModel().provider();
    }

    public OperationValueInner innerModel() {
        return this.innerObject;
    }

    private HybridComputeManager manager() {
        return this.serviceManager;
    }
}
