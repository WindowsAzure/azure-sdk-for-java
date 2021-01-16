/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Availability.
 */
public final class Availability extends ExpandableStringEnum<Availability> {
    /** Static value Available for Availability. */
    public static final Availability AVAILABLE = fromString("Available");

    /** Static value Unavailable for Availability. */
    public static final Availability UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates or finds a Availability from its string representation.
     * @param name a name to look for
     * @return the corresponding Availability
     */
    @JsonCreator
    public static Availability fromString(String name) {
        return fromString(name, Availability.class);
    }

    /**
     * @return known Availability values
     */
    public static Collection<Availability> values() {
        return values(Availability.class);
    }
}
