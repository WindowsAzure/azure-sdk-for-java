// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.implementation;

import com.azure.resourcemanager.relay.RelayManager;
import com.azure.resourcemanager.relay.fluent.models.OperationInner;
import com.azure.resourcemanager.relay.models.Operation;
import com.azure.resourcemanager.relay.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final RelayManager serviceManager;

    OperationImpl(OperationInner innerObject, RelayManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private RelayManager manager() {
        return this.serviceManager;
    }
}
