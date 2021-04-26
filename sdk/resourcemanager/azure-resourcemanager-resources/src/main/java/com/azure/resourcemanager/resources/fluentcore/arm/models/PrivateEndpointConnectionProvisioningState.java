// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.fluentcore.arm.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/** Defines values for PrivateEndpointConnectionProvisioningState. */
public final class PrivateEndpointConnectionProvisioningState
    extends ExpandableStringEnum<PrivateEndpointConnectionProvisioningState> {
    /** Static value Succeeded for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Creating for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState CREATING = fromString("Creating");

    /** Static value Deleting for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState DELETING = fromString("Deleting");

    /** Static value Failed for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a PrivateEndpointConnectionProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointConnectionProvisioningState.
     */
    @JsonCreator
    public static PrivateEndpointConnectionProvisioningState fromString(String name) {
        return fromString(name, PrivateEndpointConnectionProvisioningState.class);
    }

    /** @return known PrivateEndpointConnectionProvisioningState values. */
    public static Collection<PrivateEndpointConnectionProvisioningState> values() {
        return values(PrivateEndpointConnectionProvisioningState.class);
    }
}
