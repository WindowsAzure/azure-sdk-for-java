/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TimeGrain.
 */
public final class TimeGrain extends ExpandableStringEnum<TimeGrain> {
    /** Static value PT1M for TimeGrain. */
    public static final TimeGrain PT1M = fromString("PT1M");

    /** Static value PT5M for TimeGrain. */
    public static final TimeGrain PT5M = fromString("PT5M");

    /** Static value PT15M for TimeGrain. */
    public static final TimeGrain PT15M = fromString("PT15M");

    /** Static value PT30M for TimeGrain. */
    public static final TimeGrain PT30M = fromString("PT30M");

    /** Static value PT1H for TimeGrain. */
    public static final TimeGrain PT1H = fromString("PT1H");

    /** Static value PT6H for TimeGrain. */
    public static final TimeGrain PT6H = fromString("PT6H");

    /** Static value PT12H for TimeGrain. */
    public static final TimeGrain PT12H = fromString("PT12H");

    /** Static value PT1D for TimeGrain. */
    public static final TimeGrain PT1D = fromString("PT1D");

    /**
     * Creates or finds a TimeGrain from its string representation.
     * @param name a name to look for
     * @return the corresponding TimeGrain
     */
    @JsonCreator
    public static TimeGrain fromString(String name) {
        return fromString(name, TimeGrain.class);
    }

    /**
     * @return known TimeGrain values
     */
    public static Collection<TimeGrain> values() {
        return values(TimeGrain.class);
    }
}
