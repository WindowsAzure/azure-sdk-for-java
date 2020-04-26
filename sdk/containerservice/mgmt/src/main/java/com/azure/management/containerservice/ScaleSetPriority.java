// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScaleSetPriority. */
public final class ScaleSetPriority extends ExpandableStringEnum<ScaleSetPriority> {
    /** Static value Low for ScaleSetPriority. */
    public static final ScaleSetPriority LOW = fromString("Low");

    /** Static value Regular for ScaleSetPriority. */
    public static final ScaleSetPriority REGULAR = fromString("Regular");

    /**
     * Creates or finds a ScaleSetPriority from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScaleSetPriority.
     */
    @JsonCreator
    public static ScaleSetPriority fromString(String name) {
        return fromString(name, ScaleSetPriority.class);
    }

    /** @return known ScaleSetPriority values. */
    public static Collection<ScaleSetPriority> values() {
        return values(ScaleSetPriority.class);
    }
}
