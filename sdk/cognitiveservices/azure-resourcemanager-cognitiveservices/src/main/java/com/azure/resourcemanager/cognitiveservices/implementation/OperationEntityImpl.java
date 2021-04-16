// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.resourcemanager.cognitiveservices.fluent.models.OperationEntityInner;
import com.azure.resourcemanager.cognitiveservices.models.OperationDisplayInfo;
import com.azure.resourcemanager.cognitiveservices.models.OperationEntity;

public final class OperationEntityImpl implements OperationEntity {
    private OperationEntityInner innerObject;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    OperationEntityImpl(
        OperationEntityInner innerObject,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplayInfo display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
