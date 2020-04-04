// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for PrivateEndpointProvisioningState.
 */
public final class PrivateEndpointProvisioningState extends ExpandableStringEnum<PrivateEndpointProvisioningState> {
    /**
     * Static value Approving for PrivateEndpointProvisioningState.
     */
    public static final PrivateEndpointProvisioningState APPROVING = fromString("Approving");

    /**
     * Static value Ready for PrivateEndpointProvisioningState.
     */
    public static final PrivateEndpointProvisioningState READY = fromString("Ready");

    /**
     * Static value Dropping for PrivateEndpointProvisioningState.
     */
    public static final PrivateEndpointProvisioningState DROPPING = fromString("Dropping");

    /**
     * Static value Failed for PrivateEndpointProvisioningState.
     */
    public static final PrivateEndpointProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Rejecting for PrivateEndpointProvisioningState.
     */
    public static final PrivateEndpointProvisioningState REJECTING = fromString("Rejecting");

    /**
     * Creates or finds a PrivateEndpointProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointProvisioningState.
     */
    @JsonCreator
    public static PrivateEndpointProvisioningState fromString(String name) {
        return fromString(name, PrivateEndpointProvisioningState.class);
    }

    /**
     * @return known PrivateEndpointProvisioningState values.
     */
    public static Collection<PrivateEndpointProvisioningState> values() {
        return values(PrivateEndpointProvisioningState.class);
    }
}
