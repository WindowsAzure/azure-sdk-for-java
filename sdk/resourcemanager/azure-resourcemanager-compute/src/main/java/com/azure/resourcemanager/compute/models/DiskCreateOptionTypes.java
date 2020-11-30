// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DiskCreateOptionTypes. */
public final class DiskCreateOptionTypes extends ExpandableStringEnum<DiskCreateOptionTypes> {
    /** Static value FromImage for DiskCreateOptionTypes. */
    public static final DiskCreateOptionTypes FROM_IMAGE = fromString("FromImage");

    /** Static value Empty for DiskCreateOptionTypes. */
    public static final DiskCreateOptionTypes EMPTY = fromString("Empty");

    /** Static value Attach for DiskCreateOptionTypes. */
    public static final DiskCreateOptionTypes ATTACH = fromString("Attach");

    /**
     * Creates or finds a DiskCreateOptionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskCreateOptionTypes.
     */
    @JsonCreator
    public static DiskCreateOptionTypes fromString(String name) {
        return fromString(name, DiskCreateOptionTypes.class);
    }

    /** @return known DiskCreateOptionTypes values. */
    public static Collection<DiskCreateOptionTypes> values() {
        return values(DiskCreateOptionTypes.class);
    }
}
