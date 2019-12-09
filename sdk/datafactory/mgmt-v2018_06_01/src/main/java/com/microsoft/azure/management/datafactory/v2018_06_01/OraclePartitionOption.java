/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OraclePartitionOption.
 */
public final class OraclePartitionOption extends ExpandableStringEnum<OraclePartitionOption> {
    /** Static value None for OraclePartitionOption. */
    public static final OraclePartitionOption NONE = fromString("None");

    /** Static value PhysicalPartitionsOfTable for OraclePartitionOption. */
    public static final OraclePartitionOption PHYSICAL_PARTITIONS_OF_TABLE = fromString("PhysicalPartitionsOfTable");

    /** Static value DynamicRange for OraclePartitionOption. */
    public static final OraclePartitionOption DYNAMIC_RANGE = fromString("DynamicRange");

    /**
     * Creates or finds a OraclePartitionOption from its string representation.
     * @param name a name to look for
     * @return the corresponding OraclePartitionOption
     */
    @JsonCreator
    public static OraclePartitionOption fromString(String name) {
        return fromString(name, OraclePartitionOption.class);
    }

    /**
     * @return known OraclePartitionOption values
     */
    public static Collection<OraclePartitionOption> values() {
        return values(OraclePartitionOption.class);
    }
}
