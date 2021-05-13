// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LinuxOsState. */
public final class LinuxOsState extends ExpandableStringEnum<LinuxOsState> {
    /** Static value NonDeprovisioned for LinuxOsState. */
    public static final LinuxOsState NON_DEPROVISIONED = fromString("NonDeprovisioned");

    /** Static value DeprovisionRequested for LinuxOsState. */
    public static final LinuxOsState DEPROVISION_REQUESTED = fromString("DeprovisionRequested");

    /** Static value DeprovisionApplied for LinuxOsState. */
    public static final LinuxOsState DEPROVISION_APPLIED = fromString("DeprovisionApplied");

    /**
     * Creates or finds a LinuxOsState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LinuxOsState.
     */
    @JsonCreator
    public static LinuxOsState fromString(String name) {
        return fromString(name, LinuxOsState.class);
    }

    /** @return known LinuxOsState values. */
    public static Collection<LinuxOsState> values() {
        return values(LinuxOsState.class);
    }
}
