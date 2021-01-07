// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphRecurrencePatternType. */
public final class MicrosoftGraphRecurrencePatternType
    extends ExpandableStringEnum<MicrosoftGraphRecurrencePatternType> {
    /** Static value daily for MicrosoftGraphRecurrencePatternType. */
    public static final MicrosoftGraphRecurrencePatternType DAILY = fromString("daily");

    /** Static value weekly for MicrosoftGraphRecurrencePatternType. */
    public static final MicrosoftGraphRecurrencePatternType WEEKLY = fromString("weekly");

    /** Static value absoluteMonthly for MicrosoftGraphRecurrencePatternType. */
    public static final MicrosoftGraphRecurrencePatternType ABSOLUTE_MONTHLY = fromString("absoluteMonthly");

    /** Static value relativeMonthly for MicrosoftGraphRecurrencePatternType. */
    public static final MicrosoftGraphRecurrencePatternType RELATIVE_MONTHLY = fromString("relativeMonthly");

    /** Static value absoluteYearly for MicrosoftGraphRecurrencePatternType. */
    public static final MicrosoftGraphRecurrencePatternType ABSOLUTE_YEARLY = fromString("absoluteYearly");

    /** Static value relativeYearly for MicrosoftGraphRecurrencePatternType. */
    public static final MicrosoftGraphRecurrencePatternType RELATIVE_YEARLY = fromString("relativeYearly");

    /**
     * Creates or finds a MicrosoftGraphRecurrencePatternType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphRecurrencePatternType.
     */
    @JsonCreator
    public static MicrosoftGraphRecurrencePatternType fromString(String name) {
        return fromString(name, MicrosoftGraphRecurrencePatternType.class);
    }

    /** @return known MicrosoftGraphRecurrencePatternType values. */
    public static Collection<MicrosoftGraphRecurrencePatternType> values() {
        return values(MicrosoftGraphRecurrencePatternType.class);
    }
}
