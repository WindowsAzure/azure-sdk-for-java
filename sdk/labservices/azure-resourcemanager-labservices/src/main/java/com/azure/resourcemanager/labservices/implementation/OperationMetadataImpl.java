// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.resourcemanager.labservices.fluent.models.OperationMetadataInner;
import com.azure.resourcemanager.labservices.models.OperationMetadata;
import com.azure.resourcemanager.labservices.models.OperationMetadataDisplay;

public final class OperationMetadataImpl implements OperationMetadata {
    private OperationMetadataInner innerObject;

    private final com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager;

    OperationMetadataImpl(
        OperationMetadataInner innerObject, com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationMetadataDisplay display() {
        return this.innerModel().display();
    }

    public OperationMetadataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.labservices.ManagedLabsManager manager() {
        return this.serviceManager;
    }
}
