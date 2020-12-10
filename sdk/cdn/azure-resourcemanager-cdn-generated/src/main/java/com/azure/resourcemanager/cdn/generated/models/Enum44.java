// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum44. */
public final class Enum44 extends ExpandableStringEnum<Enum44> {
    /** Static value managed for Enum44. */
    public static final Enum44 MANAGED = fromString("managed");

    /** Static value custom for Enum44. */
    public static final Enum44 CUSTOM = fromString("custom");

    /** Static value bot for Enum44. */
    public static final Enum44 BOT = fromString("bot");

    /**
     * Creates or finds a Enum44 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum44.
     */
    @JsonCreator
    public static Enum44 fromString(String name) {
        return fromString(name, Enum44.class);
    }

    /** @return known Enum44 values. */
    public static Collection<Enum44> values() {
        return values(Enum44.class);
    }
}
