// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSkuDefinitionInner;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuCapacity;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuDefinition;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuDefinitionSku;

public final class IntegrationServiceEnvironmentSkuDefinitionImpl
    implements IntegrationServiceEnvironmentSkuDefinition {
    private IntegrationServiceEnvironmentSkuDefinitionInner innerObject;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    IntegrationServiceEnvironmentSkuDefinitionImpl(
        IntegrationServiceEnvironmentSkuDefinitionInner innerObject,
        com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public IntegrationServiceEnvironmentSkuDefinitionSku sku() {
        return this.innerModel().sku();
    }

    public IntegrationServiceEnvironmentSkuCapacity capacity() {
        return this.innerModel().capacity();
    }

    public IntegrationServiceEnvironmentSkuDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
