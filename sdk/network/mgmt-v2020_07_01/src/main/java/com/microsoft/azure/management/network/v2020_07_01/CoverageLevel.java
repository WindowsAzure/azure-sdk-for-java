/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CoverageLevel.
 */
public final class CoverageLevel extends ExpandableStringEnum<CoverageLevel> {
    /** Static value Default for CoverageLevel. */
    public static final CoverageLevel DEFAULT = fromString("Default");

    /** Static value Low for CoverageLevel. */
    public static final CoverageLevel LOW = fromString("Low");

    /** Static value BelowAverage for CoverageLevel. */
    public static final CoverageLevel BELOW_AVERAGE = fromString("BelowAverage");

    /** Static value Average for CoverageLevel. */
    public static final CoverageLevel AVERAGE = fromString("Average");

    /** Static value AboveAverage for CoverageLevel. */
    public static final CoverageLevel ABOVE_AVERAGE = fromString("AboveAverage");

    /** Static value Full for CoverageLevel. */
    public static final CoverageLevel FULL = fromString("Full");

    /**
     * Creates or finds a CoverageLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding CoverageLevel
     */
    @JsonCreator
    public static CoverageLevel fromString(String name) {
        return fromString(name, CoverageLevel.class);
    }

    /**
     * @return known CoverageLevel values
     */
    public static Collection<CoverageLevel> values() {
        return values(CoverageLevel.class);
    }
}
