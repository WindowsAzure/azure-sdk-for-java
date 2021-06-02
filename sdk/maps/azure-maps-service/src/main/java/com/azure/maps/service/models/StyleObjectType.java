// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StyleObjectType. */
public final class StyleObjectType extends ExpandableStringEnum<StyleObjectType> {
    /** Static value boolean for StyleObjectType. */
    public static final StyleObjectType BOOLEAN_TYPE_STYLE_RULE = fromString("boolean");

    /** Static value number for StyleObjectType. */
    public static final StyleObjectType NUMBER_TYPE_STYLE_RULE = fromString("number");

    /** Static value string for StyleObjectType. */
    public static final StyleObjectType STRING_TYPE_STYLE_RULE = fromString("string");

    /**
     * Creates or finds a StyleObjectType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StyleObjectType.
     */
    @JsonCreator
    public static StyleObjectType fromString(String name) {
        return fromString(name, StyleObjectType.class);
    }

    /** @return known StyleObjectType values. */
    public static Collection<StyleObjectType> values() {
        return values(StyleObjectType.class);
    }
}
