// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PropertyType. */
public final class PropertyType extends ExpandableStringEnum<PropertyType> {
    /** Static value String for PropertyType. */
    public static final PropertyType STRING = fromString("String");

    /**
     * Creates or finds a PropertyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PropertyType.
     */
    @JsonCreator
    public static PropertyType fromString(String name) {
        return fromString(name, PropertyType.class);
    }

    /** @return known PropertyType values. */
    public static Collection<PropertyType> values() {
        return values(PropertyType.class);
    }
}
