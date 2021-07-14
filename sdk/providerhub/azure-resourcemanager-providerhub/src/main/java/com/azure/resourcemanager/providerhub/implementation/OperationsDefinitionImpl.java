// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.fluent.models.OperationsDefinitionInner;
import com.azure.resourcemanager.providerhub.models.OperationsDefinition;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionActionType;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionDisplay;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionOrigin;

public final class OperationsDefinitionImpl implements OperationsDefinition {
    private OperationsDefinitionInner innerObject;

    private final com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager;

    OperationsDefinitionImpl(
        OperationsDefinitionInner innerObject,
        com.azure.resourcemanager.providerhub.ProviderHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationsDefinitionOrigin origin() {
        return this.innerModel().origin();
    }

    public OperationsDefinitionDisplay display() {
        return this.innerModel().display();
    }

    public OperationsDefinitionActionType actionType() {
        return this.innerModel().actionType();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationsDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.providerhub.ProviderHubManager manager() {
        return this.serviceManager;
    }
}
