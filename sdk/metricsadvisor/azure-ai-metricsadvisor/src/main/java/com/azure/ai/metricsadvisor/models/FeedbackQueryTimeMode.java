// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FeedbackQueryTimeMode. */
public final class FeedbackQueryTimeMode extends ExpandableStringEnum<FeedbackQueryTimeMode> {
    /** Static value MetricTimestamp for FeedbackQueryTimeMode. */
    public static final FeedbackQueryTimeMode METRIC_TIMESTAMP = fromString("MetricTimestamp");

    /** Static value FeedbackCreatedTime for FeedbackQueryTimeMode. */
    public static final FeedbackQueryTimeMode FEEDBACK_CREATED_TIME = fromString("FeedbackCreatedTime");

    /**
     * Creates or finds a FeedbackQueryTimeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FeedbackQueryTimeMode.
     */
    @JsonCreator
    public static FeedbackQueryTimeMode fromString(String name) {
        return fromString(name, FeedbackQueryTimeMode.class);
    }

    /** @return known FeedbackQueryTimeMode values. */
    public static Collection<FeedbackQueryTimeMode> values() {
        return values(FeedbackQueryTimeMode.class);
    }
}
