/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RecurrenceType.
 */
public final class RecurrenceType extends ExpandableStringEnum<RecurrenceType> {
    /** Static value Daily for RecurrenceType. */
    public static final RecurrenceType DAILY = fromString("Daily");

    /** Static value Weekly for RecurrenceType. */
    public static final RecurrenceType WEEKLY = fromString("Weekly");

    /** Static value Monthly for RecurrenceType. */
    public static final RecurrenceType MONTHLY = fromString("Monthly");

    /** Static value Annually for RecurrenceType. */
    public static final RecurrenceType ANNUALLY = fromString("Annually");

    /**
     * Creates or finds a RecurrenceType from its string representation.
     * @param name a name to look for
     * @return the corresponding RecurrenceType
     */
    @JsonCreator
    public static RecurrenceType fromString(String name) {
        return fromString(name, RecurrenceType.class);
    }

    /**
     * @return known RecurrenceType values
     */
    public static Collection<RecurrenceType> values() {
        return values(RecurrenceType.class);
    }
}
