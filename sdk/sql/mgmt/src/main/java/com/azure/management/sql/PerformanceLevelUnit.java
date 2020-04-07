// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for PerformanceLevelUnit.
 */
public final class PerformanceLevelUnit extends ExpandableStringEnum<PerformanceLevelUnit> {
    /**
     * Static value DTU for PerformanceLevelUnit.
     */
    public static final PerformanceLevelUnit DTU = fromString("DTU");

    /**
     * Static value VCores for PerformanceLevelUnit.
     */
    public static final PerformanceLevelUnit VCORES = fromString("VCores");

    /**
     * Creates or finds a PerformanceLevelUnit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PerformanceLevelUnit.
     */
    @JsonCreator
    public static PerformanceLevelUnit fromString(String name) {
        return fromString(name, PerformanceLevelUnit.class);
    }

    /**
     * @return known PerformanceLevelUnit values.
     */
    public static Collection<PerformanceLevelUnit> values() {
        return values(PerformanceLevelUnit.class);
    }
}
