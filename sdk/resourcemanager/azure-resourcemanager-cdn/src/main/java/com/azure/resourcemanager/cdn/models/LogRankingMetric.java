// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LogRankingMetric. */
public final class LogRankingMetric extends ExpandableStringEnum<LogRankingMetric> {
    /** Static value clientRequestCount for LogRankingMetric. */
    public static final LogRankingMetric CLIENT_REQUEST_COUNT = fromString("clientRequestCount");

    /** Static value clientRequestTraffic for LogRankingMetric. */
    public static final LogRankingMetric CLIENT_REQUEST_TRAFFIC = fromString("clientRequestTraffic");

    /** Static value hitCount for LogRankingMetric. */
    public static final LogRankingMetric HIT_COUNT = fromString("hitCount");

    /** Static value missCount for LogRankingMetric. */
    public static final LogRankingMetric MISS_COUNT = fromString("missCount");

    /** Static value userErrorCount for LogRankingMetric. */
    public static final LogRankingMetric USER_ERROR_COUNT = fromString("userErrorCount");

    /** Static value errorCount for LogRankingMetric. */
    public static final LogRankingMetric ERROR_COUNT = fromString("errorCount");

    /**
     * Creates or finds a LogRankingMetric from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LogRankingMetric.
     */
    @JsonCreator
    public static LogRankingMetric fromString(String name) {
        return fromString(name, LogRankingMetric.class);
    }

    /** @return known LogRankingMetric values. */
    public static Collection<LogRankingMetric> values() {
        return values(LogRankingMetric.class);
    }
}
