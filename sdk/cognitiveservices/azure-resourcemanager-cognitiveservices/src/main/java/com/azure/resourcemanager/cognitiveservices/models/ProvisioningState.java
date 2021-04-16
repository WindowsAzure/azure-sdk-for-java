// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProvisioningState. */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /** Static value Creating for ProvisioningState. */
    public static final ProvisioningState CREATING = fromString("Creating");

    /** Static value ResolvingDNS for ProvisioningState. */
    public static final ProvisioningState RESOLVING_DNS = fromString("ResolvingDNS");

    /** Static value Moving for ProvisioningState. */
    public static final ProvisioningState MOVING = fromString("Moving");

    /** Static value Deleting for ProvisioningState. */
    public static final ProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for ProvisioningState. */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ProvisioningState. */
    public static final ProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a ProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisioningState.
     */
    @JsonCreator
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /** @return known ProvisioningState values. */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
