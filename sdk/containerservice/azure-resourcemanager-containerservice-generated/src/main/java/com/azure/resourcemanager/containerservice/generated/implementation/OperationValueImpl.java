// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.resourcemanager.containerservice.generated.ContainerServiceManager;
import com.azure.resourcemanager.containerservice.generated.fluent.models.OperationValueInner;
import com.azure.resourcemanager.containerservice.generated.models.OperationValue;

public final class OperationValueImpl implements OperationValue {
    private OperationValueInner innerObject;

    private final ContainerServiceManager serviceManager;

    OperationValueImpl(OperationValueInner innerObject, ContainerServiceManager serviceManager) {
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

    private ContainerServiceManager manager() {
        return this.serviceManager;
    }
}
