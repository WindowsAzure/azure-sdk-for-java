// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TagAction. */
public final class TagAction extends ExpandableStringEnum<TagAction> {
    /** Static value Include for TagAction. */
    public static final TagAction INCLUDE = fromString("Include");

    /** Static value Exclude for TagAction. */
    public static final TagAction EXCLUDE = fromString("Exclude");

    /**
     * Creates or finds a TagAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TagAction.
     */
    @JsonCreator
    public static TagAction fromString(String name) {
        return fromString(name, TagAction.class);
    }

    /** @return known TagAction values. */
    public static Collection<TagAction> values() {
        return values(TagAction.class);
    }
}
