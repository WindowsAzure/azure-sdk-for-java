/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContainerServiceOrchestratorTypes.
 */
public final class ContainerServiceOrchestratorTypes extends ExpandableStringEnum<ContainerServiceOrchestratorTypes> {
    /** Static value Kubernetes for ContainerServiceOrchestratorTypes. */
    public static final ContainerServiceOrchestratorTypes KUBERNETES = fromString("Kubernetes");

    /** Static value Swarm for ContainerServiceOrchestratorTypes. */
    public static final ContainerServiceOrchestratorTypes SWARM = fromString("Swarm");

    /** Static value DCOS for ContainerServiceOrchestratorTypes. */
    public static final ContainerServiceOrchestratorTypes DCOS = fromString("DCOS");

    /** Static value DockerCE for ContainerServiceOrchestratorTypes. */
    public static final ContainerServiceOrchestratorTypes DOCKER_CE = fromString("DockerCE");

    /** Static value Custom for ContainerServiceOrchestratorTypes. */
    public static final ContainerServiceOrchestratorTypes CUSTOM = fromString("Custom");

    /**
     * Creates or finds a ContainerServiceOrchestratorTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding ContainerServiceOrchestratorTypes
     */
    @JsonCreator
    public static ContainerServiceOrchestratorTypes fromString(String name) {
        return fromString(name, ContainerServiceOrchestratorTypes.class);
    }

    /**
     * @return known ContainerServiceOrchestratorTypes values
     */
    public static Collection<ContainerServiceOrchestratorTypes> values() {
        return values(ContainerServiceOrchestratorTypes.class);
    }
}
