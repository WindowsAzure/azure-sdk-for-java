// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PeeringProvisioningState. */
public final class PeeringProvisioningState extends ExpandableStringEnum<PeeringProvisioningState> {
    /** Static value Succeeded for PeeringProvisioningState. */
    public static final PeeringProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Updating for PeeringProvisioningState. */
    public static final PeeringProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for PeeringProvisioningState. */
    public static final PeeringProvisioningState DELETING = fromString("Deleting");

    /** Static value Failed for PeeringProvisioningState. */
    public static final PeeringProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a PeeringProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PeeringProvisioningState.
     */
    @JsonCreator
    public static PeeringProvisioningState fromString(String name) {
        return fromString(name, PeeringProvisioningState.class);
    }

    /** @return known PeeringProvisioningState values. */
    public static Collection<PeeringProvisioningState> values() {
        return values(PeeringProvisioningState.class);
    }
}
