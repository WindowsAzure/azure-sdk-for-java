// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VehicleLoadType. */
public final class VehicleLoadType extends ExpandableStringEnum<VehicleLoadType> {
    /** Static value USHazmatClass1 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS1 = fromString("USHazmatClass1");

    /** Static value USHazmatClass2 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS2 = fromString("USHazmatClass2");

    /** Static value USHazmatClass3 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS3 = fromString("USHazmatClass3");

    /** Static value USHazmatClass4 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS4 = fromString("USHazmatClass4");

    /** Static value USHazmatClass5 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS5 = fromString("USHazmatClass5");

    /** Static value USHazmatClass6 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS6 = fromString("USHazmatClass6");

    /** Static value USHazmatClass7 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS7 = fromString("USHazmatClass7");

    /** Static value USHazmatClass8 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS8 = fromString("USHazmatClass8");

    /** Static value USHazmatClass9 for VehicleLoadType. */
    public static final VehicleLoadType USHAZMAT_CLASS9 = fromString("USHazmatClass9");

    /** Static value otherHazmatExplosive for VehicleLoadType. */
    public static final VehicleLoadType OTHER_HAZMAT_EXPLOSIVE = fromString("otherHazmatExplosive");

    /** Static value otherHazmatGeneral for VehicleLoadType. */
    public static final VehicleLoadType OTHER_HAZMAT_GENERAL = fromString("otherHazmatGeneral");

    /** Static value otherHazmatHarmfulToWater for VehicleLoadType. */
    public static final VehicleLoadType OTHER_HAZMAT_HARMFUL_TO_WATER = fromString("otherHazmatHarmfulToWater");

    /**
     * Creates or finds a VehicleLoadType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VehicleLoadType.
     */
    @JsonCreator
    public static VehicleLoadType fromString(String name) {
        return fromString(name, VehicleLoadType.class);
    }

    /** @return known VehicleLoadType values. */
    public static Collection<VehicleLoadType> values() {
        return values(VehicleLoadType.class);
    }
}
