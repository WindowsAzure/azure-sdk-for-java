/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RouteType.
 */
public final class RouteType extends ExpandableStringEnum<RouteType> {
    /** Static value DEFAULT for RouteType. */
    public static final RouteType DEFAULT = fromString("DEFAULT");

    /** Static value INHERITED for RouteType. */
    public static final RouteType INHERITED = fromString("INHERITED");

    /** Static value STATIC for RouteType. */
    public static final RouteType STATIC = fromString("STATIC");

    /**
     * Creates or finds a RouteType from its string representation.
     * @param name a name to look for
     * @return the corresponding RouteType
     */
    @JsonCreator
    public static RouteType fromString(String name) {
        return fromString(name, RouteType.class);
    }

    /**
     * @return known RouteType values
     */
    public static Collection<RouteType> values() {
        return values(RouteType.class);
    }
}
