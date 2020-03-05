/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_05_31;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ChargeType.
 */
public final class ChargeType extends ExpandableStringEnum<ChargeType> {
    /** Static value Actual for ChargeType. */
    public static final ChargeType ACTUAL = fromString("Actual");

    /** Static value Forecast for ChargeType. */
    public static final ChargeType FORECAST = fromString("Forecast");

    /**
     * Creates or finds a ChargeType from its string representation.
     * @param name a name to look for
     * @return the corresponding ChargeType
     */
    @JsonCreator
    public static ChargeType fromString(String name) {
        return fromString(name, ChargeType.class);
    }

    /**
     * @return known ChargeType values
     */
    public static Collection<ChargeType> values() {
        return values(ChargeType.class);
    }
}
