// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RouteType. */
public final class RouteType extends ExpandableStringEnum<RouteType> {
    /** Static value DEFAULT for RouteType. */
    public static final RouteType DEFAULT = fromString("DEFAULT");

    /** Static value INHERITED for RouteType. */
    public static final RouteType INHERITED = fromString("INHERITED");

    /** Static value STATIC for RouteType. */
    public static final RouteType STATIC = fromString("STATIC");

    /**
     * Creates or finds a RouteType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouteType.
     */
    @JsonCreator
    public static RouteType fromString(String name) {
        return fromString(name, RouteType.class);
    }

    /** @return known RouteType values. */
    public static Collection<RouteType> values() {
        return values(RouteType.class);
    }
}
