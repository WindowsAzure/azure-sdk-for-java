// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.implementation;

import com.azure.resourcemanager.healthbot.HealthbotManager;
import com.azure.resourcemanager.healthbot.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.healthbot.models.OperationDetail;
import com.azure.resourcemanager.healthbot.models.OperationDisplay;

public final class OperationDetailImpl implements OperationDetail {
    private OperationDetailInner innerObject;

    private final HealthbotManager serviceManager;

    public OperationDetailImpl(OperationDetailInner innerObject, HealthbotManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
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

    public OperationDetailInner innerModel() {
        return this.innerObject;
    }

    private HealthbotManager manager() {
        return this.serviceManager;
    }
}
