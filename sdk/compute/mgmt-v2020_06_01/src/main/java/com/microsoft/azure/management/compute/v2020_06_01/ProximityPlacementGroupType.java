/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProximityPlacementGroupType.
 */
public final class ProximityPlacementGroupType extends ExpandableStringEnum<ProximityPlacementGroupType> {
    /** Static value Standard for ProximityPlacementGroupType. */
    public static final ProximityPlacementGroupType STANDARD = fromString("Standard");

    /** Static value Ultra for ProximityPlacementGroupType. */
    public static final ProximityPlacementGroupType ULTRA = fromString("Ultra");

    /**
     * Creates or finds a ProximityPlacementGroupType from its string representation.
     * @param name a name to look for
     * @return the corresponding ProximityPlacementGroupType
     */
    @JsonCreator
    public static ProximityPlacementGroupType fromString(String name) {
        return fromString(name, ProximityPlacementGroupType.class);
    }

    /**
     * @return known ProximityPlacementGroupType values
     */
    public static Collection<ProximityPlacementGroupType> values() {
        return values(ProximityPlacementGroupType.class);
    }
}
