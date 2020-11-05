/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TimeseriesType.
 */
public final class TimeseriesType extends ExpandableStringEnum<TimeseriesType> {
    /** Static value MeasurementCounts for TimeseriesType. */
    public static final TimeseriesType MEASUREMENT_COUNTS = fromString("MeasurementCounts");

    /** Static value LatencyP50 for TimeseriesType. */
    public static final TimeseriesType LATENCY_P50 = fromString("LatencyP50");

    /** Static value LatencyP75 for TimeseriesType. */
    public static final TimeseriesType LATENCY_P75 = fromString("LatencyP75");

    /** Static value LatencyP95 for TimeseriesType. */
    public static final TimeseriesType LATENCY_P95 = fromString("LatencyP95");

    /**
     * Creates or finds a TimeseriesType from its string representation.
     * @param name a name to look for
     * @return the corresponding TimeseriesType
     */
    @JsonCreator
    public static TimeseriesType fromString(String name) {
        return fromString(name, TimeseriesType.class);
    }

    /**
     * @return known TimeseriesType values
     */
    public static Collection<TimeseriesType> values() {
        return values(TimeseriesType.class);
    }
}
