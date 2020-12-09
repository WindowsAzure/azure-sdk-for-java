// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.implementation;

import com.azure.resourcemanager.databox.DataBoxManager;
import com.azure.resourcemanager.databox.fluent.models.OperationInner;
import com.azure.resourcemanager.databox.models.Operation;
import com.azure.resourcemanager.databox.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final DataBoxManager serviceManager;

    public OperationImpl(OperationInner innerObject, DataBoxManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private DataBoxManager manager() {
        return this.serviceManager;
    }
}
