// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSubnetNetworkHealthInner;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentNetworkDependency;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentNetworkDependencyHealth;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentNetworkEndPointAccessibilityState;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSubnetNetworkHealth;
import java.util.Collections;
import java.util.List;

public final class IntegrationServiceEnvironmentSubnetNetworkHealthImpl
    implements IntegrationServiceEnvironmentSubnetNetworkHealth {
    private IntegrationServiceEnvironmentSubnetNetworkHealthInner innerObject;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    IntegrationServiceEnvironmentSubnetNetworkHealthImpl(
        IntegrationServiceEnvironmentSubnetNetworkHealthInner innerObject,
        com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<IntegrationServiceEnvironmentNetworkDependency> outboundNetworkDependencies() {
        List<IntegrationServiceEnvironmentNetworkDependency> inner = this.innerModel().outboundNetworkDependencies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IntegrationServiceEnvironmentNetworkDependencyHealth outboundNetworkHealth() {
        return this.innerModel().outboundNetworkHealth();
    }

    public IntegrationServiceEnvironmentNetworkEndPointAccessibilityState networkDependencyHealthState() {
        return this.innerModel().networkDependencyHealthState();
    }

    public IntegrationServiceEnvironmentSubnetNetworkHealthInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
