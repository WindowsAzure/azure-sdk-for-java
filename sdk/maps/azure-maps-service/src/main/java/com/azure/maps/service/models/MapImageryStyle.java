// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MapImageryStyle. */
public final class MapImageryStyle extends ExpandableStringEnum<MapImageryStyle> {
    /** Static value satellite for MapImageryStyle. */
    public static final MapImageryStyle SATELLITE = fromString("satellite");

    /**
     * Creates or finds a MapImageryStyle from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MapImageryStyle.
     */
    @JsonCreator
    public static MapImageryStyle fromString(String name) {
        return fromString(name, MapImageryStyle.class);
    }

    /** @return known MapImageryStyle values. */
    public static Collection<MapImageryStyle> values() {
        return values(MapImageryStyle.class);
    }
}
