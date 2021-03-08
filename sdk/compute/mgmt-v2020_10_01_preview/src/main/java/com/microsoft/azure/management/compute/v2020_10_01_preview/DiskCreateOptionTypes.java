/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DiskCreateOptionTypes.
 */
public final class DiskCreateOptionTypes extends ExpandableStringEnum<DiskCreateOptionTypes> {
    /** Static value FromImage for DiskCreateOptionTypes. */
    public static final DiskCreateOptionTypes FROM_IMAGE = fromString("FromImage");

    /** Static value Empty for DiskCreateOptionTypes. */
    public static final DiskCreateOptionTypes EMPTY = fromString("Empty");

    /** Static value Attach for DiskCreateOptionTypes. */
    public static final DiskCreateOptionTypes ATTACH = fromString("Attach");

    /**
     * Creates or finds a DiskCreateOptionTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding DiskCreateOptionTypes
     */
    @JsonCreator
    public static DiskCreateOptionTypes fromString(String name) {
        return fromString(name, DiskCreateOptionTypes.class);
    }

    /**
     * @return known DiskCreateOptionTypes values
     */
    public static Collection<DiskCreateOptionTypes> values() {
        return values(DiskCreateOptionTypes.class);
    }
}
