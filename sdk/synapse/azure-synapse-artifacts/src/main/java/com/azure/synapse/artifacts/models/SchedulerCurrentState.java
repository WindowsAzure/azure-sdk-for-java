// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SchedulerCurrentState. */
public final class SchedulerCurrentState extends ExpandableStringEnum<SchedulerCurrentState> {
    /** Static value Queued for SchedulerCurrentState. */
    public static final SchedulerCurrentState QUEUED = fromString("Queued");

    /** Static value Scheduled for SchedulerCurrentState. */
    public static final SchedulerCurrentState SCHEDULED = fromString("Scheduled");

    /** Static value Ended for SchedulerCurrentState. */
    public static final SchedulerCurrentState ENDED = fromString("Ended");

    /**
     * Creates or finds a SchedulerCurrentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SchedulerCurrentState.
     */
    @JsonCreator
    public static SchedulerCurrentState fromString(String name) {
        return fromString(name, SchedulerCurrentState.class);
    }

    /** @return known SchedulerCurrentState values. */
    public static Collection<SchedulerCurrentState> values() {
        return values(SchedulerCurrentState.class);
    }
}
