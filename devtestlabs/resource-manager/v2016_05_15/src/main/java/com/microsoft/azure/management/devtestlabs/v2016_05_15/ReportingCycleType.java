/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ReportingCycleType.
 */
public final class ReportingCycleType extends ExpandableStringEnum<ReportingCycleType> {
    /** Static value CalendarMonth for ReportingCycleType. */
    public static final ReportingCycleType CALENDAR_MONTH = fromString("CalendarMonth");

    /** Static value Custom for ReportingCycleType. */
    public static final ReportingCycleType CUSTOM = fromString("Custom");

    /**
     * Creates or finds a ReportingCycleType from its string representation.
     * @param name a name to look for
     * @return the corresponding ReportingCycleType
     */
    @JsonCreator
    public static ReportingCycleType fromString(String name) {
        return fromString(name, ReportingCycleType.class);
    }

    /**
     * @return known ReportingCycleType values
     */
    public static Collection<ReportingCycleType> values() {
        return values(ReportingCycleType.class);
    }
}
