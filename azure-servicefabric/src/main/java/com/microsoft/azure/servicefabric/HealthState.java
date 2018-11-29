/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HealthState.
 */
public final class HealthState extends ExpandableStringEnum<HealthState> {
    /** Static value Invalid for HealthState. */
    public static final HealthState INVALID = fromString("Invalid");

    /** Static value Ok for HealthState. */
    public static final HealthState OK = fromString("Ok");

    /** Static value Warning for HealthState. */
    public static final HealthState WARNING = fromString("Warning");

    /** Static value Error for HealthState. */
    public static final HealthState ERROR = fromString("Error");

    /** Static value Unknown for HealthState. */
    public static final HealthState UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a HealthState from its string representation.
     * @param name a name to look for
     * @return the corresponding HealthState
     */
    @JsonCreator
    public static HealthState fromString(String name) {
        return fromString(name, HealthState.class);
    }

    /**
     * @return known HealthState values
     */
    public static Collection<HealthState> values() {
        return values(HealthState.class);
    }
}
