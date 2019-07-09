/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TeradataPartitionOption.
 */
public final class TeradataPartitionOption extends ExpandableStringEnum<TeradataPartitionOption> {
    /** Static value None for TeradataPartitionOption. */
    public static final TeradataPartitionOption NONE = fromString("None");

    /** Static value Hash for TeradataPartitionOption. */
    public static final TeradataPartitionOption HASH = fromString("Hash");

    /** Static value DynamicRange for TeradataPartitionOption. */
    public static final TeradataPartitionOption DYNAMIC_RANGE = fromString("DynamicRange");

    /**
     * Creates or finds a TeradataPartitionOption from its string representation.
     * @param name a name to look for
     * @return the corresponding TeradataPartitionOption
     */
    @JsonCreator
    public static TeradataPartitionOption fromString(String name) {
        return fromString(name, TeradataPartitionOption.class);
    }

    /**
     * @return known TeradataPartitionOption values
     */
    public static Collection<TeradataPartitionOption> values() {
        return values(TeradataPartitionOption.class);
    }
}
