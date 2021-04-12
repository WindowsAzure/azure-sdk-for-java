// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ZoneRedundant. */
public final class ZoneRedundant extends ExpandableStringEnum<ZoneRedundant> {
    /** Static value Enable for ZoneRedundant. */
    public static final ZoneRedundant ENABLE = fromString("Enable");

    /** Static value Disable for ZoneRedundant. */
    public static final ZoneRedundant DISABLE = fromString("Disable");

    /**
     * Creates or finds a ZoneRedundant from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ZoneRedundant.
     */
    @JsonCreator
    public static ZoneRedundant fromString(String name) {
        return fromString(name, ZoneRedundant.class);
    }

    /** @return known ZoneRedundant values. */
    public static Collection<ZoneRedundant> values() {
        return values(ZoneRedundant.class);
    }
}
