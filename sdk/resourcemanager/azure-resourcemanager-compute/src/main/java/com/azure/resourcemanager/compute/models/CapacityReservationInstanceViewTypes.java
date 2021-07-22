// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CapacityReservationInstanceViewTypes. */
public final class CapacityReservationInstanceViewTypes
    extends ExpandableStringEnum<CapacityReservationInstanceViewTypes> {
    /** Static value instanceView for CapacityReservationInstanceViewTypes. */
    public static final CapacityReservationInstanceViewTypes INSTANCE_VIEW = fromString("instanceView");

    /**
     * Creates or finds a CapacityReservationInstanceViewTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CapacityReservationInstanceViewTypes.
     */
    @JsonCreator
    public static CapacityReservationInstanceViewTypes fromString(String name) {
        return fromString(name, CapacityReservationInstanceViewTypes.class);
    }

    /** @return known CapacityReservationInstanceViewTypes values. */
    public static Collection<CapacityReservationInstanceViewTypes> values() {
        return values(CapacityReservationInstanceViewTypes.class);
    }
}
