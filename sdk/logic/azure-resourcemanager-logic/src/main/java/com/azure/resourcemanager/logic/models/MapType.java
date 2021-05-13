// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MapType. */
public final class MapType extends ExpandableStringEnum<MapType> {
    /** Static value NotSpecified for MapType. */
    public static final MapType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Xslt for MapType. */
    public static final MapType XSLT = fromString("Xslt");

    /** Static value Xslt20 for MapType. */
    public static final MapType XSLT20 = fromString("Xslt20");

    /** Static value Xslt30 for MapType. */
    public static final MapType XSLT30 = fromString("Xslt30");

    /** Static value Liquid for MapType. */
    public static final MapType LIQUID = fromString("Liquid");

    /**
     * Creates or finds a MapType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MapType.
     */
    @JsonCreator
    public static MapType fromString(String name) {
        return fromString(name, MapType.class);
    }

    /** @return known MapType values. */
    public static Collection<MapType> values() {
        return values(MapType.class);
    }
}
