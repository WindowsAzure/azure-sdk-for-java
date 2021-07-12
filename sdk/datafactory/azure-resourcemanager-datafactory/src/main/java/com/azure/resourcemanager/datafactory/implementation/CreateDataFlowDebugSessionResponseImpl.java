// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.CreateDataFlowDebugSessionResponseInner;
import com.azure.resourcemanager.datafactory.models.CreateDataFlowDebugSessionResponse;

public final class CreateDataFlowDebugSessionResponseImpl implements CreateDataFlowDebugSessionResponse {
    private CreateDataFlowDebugSessionResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    CreateDataFlowDebugSessionResponseImpl(
        CreateDataFlowDebugSessionResponseInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String status() {
        return this.innerModel().status();
    }

    public String sessionId() {
        return this.innerModel().sessionId();
    }

    public CreateDataFlowDebugSessionResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
