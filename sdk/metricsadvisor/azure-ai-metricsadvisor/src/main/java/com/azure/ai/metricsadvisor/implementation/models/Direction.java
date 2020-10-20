// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Direction. */
public final class Direction extends ExpandableStringEnum<Direction> {
    /** Static value Both for Direction. */
    public static final Direction BOTH = fromString("Both");

    /** Static value Down for Direction. */
    public static final Direction DOWN = fromString("Down");

    /** Static value Up for Direction. */
    public static final Direction UP = fromString("Up");

    /**
     * Creates or finds a Direction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Direction.
     */
    @JsonCreator
    public static Direction fromString(String name) {
        return fromString(name, Direction.class);
    }

    /** @return known Direction values. */
    public static Collection<Direction> values() {
        return values(Direction.class);
    }
}
