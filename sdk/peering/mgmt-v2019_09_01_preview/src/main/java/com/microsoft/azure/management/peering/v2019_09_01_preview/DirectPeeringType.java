/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DirectPeeringType.
 */
public final class DirectPeeringType extends ExpandableStringEnum<DirectPeeringType> {
    /** Static value Edge for DirectPeeringType. */
    public static final DirectPeeringType EDGE = fromString("Edge");

    /** Static value Transit for DirectPeeringType. */
    public static final DirectPeeringType TRANSIT = fromString("Transit");

    /** Static value Cdn for DirectPeeringType. */
    public static final DirectPeeringType CDN = fromString("Cdn");

    /** Static value Internal for DirectPeeringType. */
    public static final DirectPeeringType INTERNAL = fromString("Internal");

    /**
     * Creates or finds a DirectPeeringType from its string representation.
     * @param name a name to look for
     * @return the corresponding DirectPeeringType
     */
    @JsonCreator
    public static DirectPeeringType fromString(String name) {
        return fromString(name, DirectPeeringType.class);
    }

    /**
     * @return known DirectPeeringType values
     */
    public static Collection<DirectPeeringType> values() {
        return values(DirectPeeringType.class);
    }
}
