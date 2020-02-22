/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EffectiveRouteState.
 */
public final class EffectiveRouteState extends ExpandableStringEnum<EffectiveRouteState> {
    /** Static value Active for EffectiveRouteState. */
    public static final EffectiveRouteState ACTIVE = fromString("Active");

    /** Static value Invalid for EffectiveRouteState. */
    public static final EffectiveRouteState INVALID = fromString("Invalid");

    /**
     * Creates or finds a EffectiveRouteState from its string representation.
     * @param name a name to look for
     * @return the corresponding EffectiveRouteState
     */
    @JsonCreator
    public static EffectiveRouteState fromString(String name) {
        return fromString(name, EffectiveRouteState.class);
    }

    /**
     * @return known EffectiveRouteState values
     */
    public static Collection<EffectiveRouteState> values() {
        return values(EffectiveRouteState.class);
    }
}
