// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Level. */
public final class Level extends ExpandableStringEnum<Level> {
    /** Static value Noisy for Level. */
    public static final Level NOISY = fromString("Noisy");

    /** Static value Normal for Level. */
    public static final Level NORMAL = fromString("Normal");

    /** Static value Important for Level. */
    public static final Level IMPORTANT = fromString("Important");

    /**
     * Creates or finds a Level from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Level.
     */
    @JsonCreator
    public static Level fromString(String name) {
        return fromString(name, Level.class);
    }

    /** @return known Level values. */
    public static Collection<Level> values() {
        return values(Level.class);
    }
}
