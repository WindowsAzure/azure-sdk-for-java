// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSubnetNetworkHealthInner;
import java.util.List;

/** An immutable client-side representation of IntegrationServiceEnvironmentSubnetNetworkHealth. */
public interface IntegrationServiceEnvironmentSubnetNetworkHealth {
    /**
     * Gets the outboundNetworkDependencies property: The outbound network dependencies.
     *
     * @return the outboundNetworkDependencies value.
     */
    List<IntegrationServiceEnvironmentNetworkDependency> outboundNetworkDependencies();

    /**
     * Gets the outboundNetworkHealth property: The integration service environment network health.
     *
     * @return the outboundNetworkHealth value.
     */
    IntegrationServiceEnvironmentNetworkDependencyHealth outboundNetworkHealth();

    /**
     * Gets the networkDependencyHealthState property: The integration service environment network health state.
     *
     * @return the networkDependencyHealthState value.
     */
    IntegrationServiceEnvironmentNetworkEndPointAccessibilityState networkDependencyHealthState();

    /**
     * Gets the inner
     * com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSubnetNetworkHealthInner object.
     *
     * @return the inner object.
     */
    IntegrationServiceEnvironmentSubnetNetworkHealthInner innerModel();
}
