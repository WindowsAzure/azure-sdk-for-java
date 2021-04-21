// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AllocationState. */
public final class AllocationState extends ExpandableStringEnum<AllocationState> {
    /** Static value Steady for AllocationState. */
    public static final AllocationState STEADY = fromString("Steady");

    /** Static value Resizing for AllocationState. */
    public static final AllocationState RESIZING = fromString("Resizing");

    /**
     * Creates or finds a AllocationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AllocationState.
     */
    @JsonCreator
    public static AllocationState fromString(String name) {
        return fromString(name, AllocationState.class);
    }

    /** @return known AllocationState values. */
    public static Collection<AllocationState> values() {
        return values(AllocationState.class);
    }
}
