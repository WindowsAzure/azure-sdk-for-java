// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LegType. */
public final class LegType extends ExpandableStringEnum<LegType> {
    /** Static value Walk for LegType. */
    public static final LegType WALK = fromString("Walk");

    /** Static value Bicycle for LegType. */
    public static final LegType BICYCLE = fromString("Bicycle");

    /** Static value Tram for LegType. */
    public static final LegType TRAM = fromString("Tram");

    /** Static value Subway for LegType. */
    public static final LegType SUBWAY = fromString("Subway");

    /** Static value Rail for LegType. */
    public static final LegType RAIL = fromString("Rail");

    /** Static value Bus for LegType. */
    public static final LegType BUS = fromString("Bus");

    /** Static value Ferry for LegType. */
    public static final LegType FERRY = fromString("Ferry");

    /** Static value Cable for LegType. */
    public static final LegType CABLE = fromString("Cable");

    /** Static value Gondola for LegType. */
    public static final LegType GONDOLA = fromString("Gondola");

    /** Static value Funicular for LegType. */
    public static final LegType FUNICULAR = fromString("Funicular");

    /** Static value PathWayWalk for LegType. */
    public static final LegType PATH_WAY_WALK = fromString("PathWayWalk");

    /** Static value Wait for LegType. */
    public static final LegType WAIT = fromString("Wait");

    /** Static value WaitOnVehicle for LegType. */
    public static final LegType WAIT_ON_VEHICLE = fromString("WaitOnVehicle");

    /**
     * Creates or finds a LegType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LegType.
     */
    @JsonCreator
    public static LegType fromString(String name) {
        return fromString(name, LegType.class);
    }

    /** @return known LegType values. */
    public static Collection<LegType> values() {
        return values(LegType.class);
    }
}
