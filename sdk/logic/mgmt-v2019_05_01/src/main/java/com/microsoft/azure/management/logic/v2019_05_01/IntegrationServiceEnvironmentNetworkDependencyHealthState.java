/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IntegrationServiceEnvironmentNetworkDependencyHealthState.
 */
public final class IntegrationServiceEnvironmentNetworkDependencyHealthState extends ExpandableStringEnum<IntegrationServiceEnvironmentNetworkDependencyHealthState> {
    /** Static value NotSpecified for IntegrationServiceEnvironmentNetworkDependencyHealthState. */
    public static final IntegrationServiceEnvironmentNetworkDependencyHealthState NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Healthy for IntegrationServiceEnvironmentNetworkDependencyHealthState. */
    public static final IntegrationServiceEnvironmentNetworkDependencyHealthState HEALTHY = fromString("Healthy");

    /** Static value Unhealthy for IntegrationServiceEnvironmentNetworkDependencyHealthState. */
    public static final IntegrationServiceEnvironmentNetworkDependencyHealthState UNHEALTHY = fromString("Unhealthy");

    /** Static value Unknown for IntegrationServiceEnvironmentNetworkDependencyHealthState. */
    public static final IntegrationServiceEnvironmentNetworkDependencyHealthState UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a IntegrationServiceEnvironmentNetworkDependencyHealthState from its string representation.
     * @param name a name to look for
     * @return the corresponding IntegrationServiceEnvironmentNetworkDependencyHealthState
     */
    @JsonCreator
    public static IntegrationServiceEnvironmentNetworkDependencyHealthState fromString(String name) {
        return fromString(name, IntegrationServiceEnvironmentNetworkDependencyHealthState.class);
    }

    /**
     * @return known IntegrationServiceEnvironmentNetworkDependencyHealthState values
     */
    public static Collection<IntegrationServiceEnvironmentNetworkDependencyHealthState> values() {
        return values(IntegrationServiceEnvironmentNetworkDependencyHealthState.class);
    }
}
