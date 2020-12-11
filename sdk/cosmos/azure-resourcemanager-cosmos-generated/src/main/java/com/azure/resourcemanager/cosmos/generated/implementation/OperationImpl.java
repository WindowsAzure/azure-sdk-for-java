// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.cosmos.generated.models.Operation;
import com.azure.resourcemanager.cosmos.generated.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final CosmosDBManager serviceManager;

    public OperationImpl(OperationInner innerObject, CosmosDBManager serviceManager) {
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

    private CosmosDBManager manager() {
        return this.serviceManager;
    }
}
