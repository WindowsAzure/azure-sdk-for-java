// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.implementation;

import com.azure.resourcemanager.iotcentral.fluent.models.OperationInner;
import com.azure.resourcemanager.iotcentral.models.Operation;
import com.azure.resourcemanager.iotcentral.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.iotcentral.IotCentralManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iotcentral.IotCentralManager manager() {
        return this.serviceManager;
    }
}
