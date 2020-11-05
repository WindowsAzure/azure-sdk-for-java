/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Direction.
 */
public final class Direction extends ExpandableStringEnum<Direction> {
    /** Static value Inbound for Direction. */
    public static final Direction INBOUND = fromString("Inbound");

    /** Static value Outbound for Direction. */
    public static final Direction OUTBOUND = fromString("Outbound");

    /**
     * Creates or finds a Direction from its string representation.
     * @param name a name to look for
     * @return the corresponding Direction
     */
    @JsonCreator
    public static Direction fromString(String name) {
        return fromString(name, Direction.class);
    }

    /**
     * @return known Direction values
     */
    public static Collection<Direction> values() {
        return values(Direction.class);
    }
}
